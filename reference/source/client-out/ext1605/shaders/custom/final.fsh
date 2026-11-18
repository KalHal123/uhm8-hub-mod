// Based on a shader set by blackops7799. If you're reading this, hope you're not mad.

//  SSR and MotionBlur written by our internal team.

/*
------------------------------------------------
Note:
        - DOF doesn't seem work well with the other
          shaders. The blur overrides all other shaders

        - Bloom seems to reduce the effect of
          the SSAO shader

Credits:
        - azraeil ( DOF Shader )
        - Dilla/snowcrash ( Bloom Shader )
        - Leadwerks ( SSAO Shader )
        - .jhn ( pseudo-AA Shader )

        - 3EMJ (SSR, MotionBlur)
------------------------------------------------
*/

// These are defined by the game code

//#define DOF_ENABLED
//#define BLOOM_ENABLED
//#define AA_ENABLED
//#define SSR_ENABLED
//#define MOTIONBLUR_ENABLED 2

//#define SSAO_ENABLED //DOES NOT WORK
//#define CEL_SHADING //DOES NOT WORK

#ifdef CEL_SHADING
const float CEL_EDGE_THRESHOLD = 0.02;
const float CEL_EDGE_THICKNESS = 0.02;
#endif
#ifdef BLOOM_ENABLED
const float BLOOM_STRENGTH = 0.2;
#endif
#ifdef DOF_ENABLED
const float HYPERFOCAL = 4.0;
#endif

const float SSRMaxY = 16.0;

/*
-------------------------------------------------------
 The standard user should not mess with anything below
-------------------------------------------------------
*/

uniform sampler2D sampler0;
uniform sampler2D sampler1;
uniform sampler2D sampler2;
uniform sampler2D bgl_RenderedTexture;

uniform float displayWidth;
uniform float displayHeight;
uniform float aspectRatio;
uniform float near;
uniform float far;
uniform float rand;
uniform float lastMouseDist;
uniform float lastMouseX;
uniform float lastMouseY;
uniform float playerPitchRot;
uniform float fovMod;

const float INFINITY = 100000.0;

float getDepth( vec2 coord ) {
    float depth = texture2D( sampler1, coord ).x;
    float depth2 = texture2D( sampler2, coord ).x;
    if ( depth2 < 1.0 ) {
        depth = depth2;
    }
    if ( depth == 1.0 ) {
        return INFINITY;
    }
    return 2.0 * near * far / ( far + near - ( 2.0 * depth - 1.0 ) * ( far - near ) );
}

#ifdef SSAO_ENABLED // Stuff only SSAO uses
float compareDepths( in float depth1, in float depth2 ) {
    float aoCap = 1.0;
    float aoMultiplier = 5000.0;
    float depthTolerance = 0.0;
    float aorange = 512.0; // units in space the AO effect extends to (this gets divided by the camera far range
    float diff = sqrt( clamp( 1.0 - ( depth1 - depth2 ) / ( aorange / ( far - near ) ), 0.0, 1.0 ) );
    float ao = min( aoCap, max( 0.0, depth1 - depth2 - depthTolerance ) * aoMultiplier ) * diff;
    return ao;
}

vec4 getSSAO() {
    float depth = getDepth( gl_TexCoord[0].st );
    float d;

    float pw = 1.0 / displayWidth;
    float ph = 1.0 / displayHeight;
    float aoCap = 1.0;
    float ao = 0.0;
    float aoMultiplier = 5000.0;
    float depthTolerance = 0.0;
    float aoscale=1.0;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    pw*=2.0;
    ph*=2.0;
    aoMultiplier/=2.0;
    aoscale*=1.2;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    pw*=2.0;
    ph*=2.0;
    aoMultiplier/=2.0;
    aoscale*=1.2;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    pw*=2.0;
    ph*=2.0;
    aoMultiplier/=2.0;
    aoscale*=1.2;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y+ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x+pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    d=getDepth( vec2(gl_TexCoord[0].x-pw,gl_TexCoord[0].y-ph));
    ao+=compareDepths(depth,d)/aoscale;

    ao/=16.0;

    return vec4(1.1-ao);
}
#endif

#ifdef AA_ENABLED // Stuff only AA uses
float expDepth2linearDepth( vec2 coord ) {
    float depth = texture2D( sampler1, coord ).x;
    float depth2 = texture2D( sampler2, coord ).x;
    if ( depth2 < 1.0 ) {
        depth = depth2;
    }
    if ( depth == 1.0 ) {
        return INFINITY;
    }
    return ( 2.0 * near ) / ( far + near - depth * ( far - near ) );
}

vec4 getAA() {
    vec4 newColor = vec4(0.0);

    float depth = expDepth2linearDepth(gl_TexCoord[0].xy);
    vec2 aspectCorrection = vec2(1.0, aspectRatio) * 0.005;
    float offsetx = 0.12 * aspectCorrection.x;
    float offsety = 0.12 * aspectCorrection.y;
    float depthThreshold=0.01;

    if ( abs( depth - expDepth2linearDepth( gl_TexCoord[0].xy + vec2( offsetx, 0 ) ) ) > depthThreshold || abs( depth - expDepth2linearDepth( gl_TexCoord[0].xy + vec2( -offsetx, 0 ) ) ) > depthThreshold || abs( depth - expDepth2linearDepth( gl_TexCoord[0].xy + vec2( 0, offsety ) ) ) > depthThreshold || abs( depth - expDepth2linearDepth( gl_TexCoord[0].xy + vec2( 0, -offsety ) ) ) > depthThreshold ) {
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-offsetx, offsety));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(0, offsety));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(offsetx, offsety));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-offsetx, 0));
        newColor += texture2D(sampler0, gl_TexCoord[0].st);
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(offsetx, 0));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-offsetx, -offsety));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(0, -offsety));
        newColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(offsetx, -offsety));
        newColor /= 9.0;
    } else
    newColor=texture2D(sampler0, gl_TexCoord[0].st);

    return newColor;
}
#endif

#ifdef BLOOM_ENABLED // Stuff only bloom uses
vec4 getBloom() {
    vec4 sum = vec4(0);
    vec2 texcoord = vec2(gl_TexCoord[0]);
    for( int i = -3; i < 3; i++) { // Lower loop count for performance
        for ( int j = -3; j < 3; j++ ) {
            sum += texture2D( bgl_RenderedTexture, texcoord + vec2( j, i ) * 0.004 ) * BLOOM_STRENGTH;
        }
    }
    if (texture2D(bgl_RenderedTexture, texcoord).r < 0.3) {
        sum = sum*sum*0.012 + texture2D(bgl_RenderedTexture, texcoord);
    } else {
        if (texture2D(bgl_RenderedTexture, texcoord).r < 0.5) {
            sum = sum*sum*0.009 + texture2D(bgl_RenderedTexture, texcoord);
        } else {
            sum = sum*sum*0.0075 + texture2D(bgl_RenderedTexture, texcoord);
        }
    }
    return sum;
}
#endif

#ifdef DOF_ENABLED // Stuff only DOF uses

float samples = float( 0 );
vec2 space;

float getCursorDepth( vec2 coord ) {
    return 2.0 * near * far / ( far + near - ( 2.0 * texture2D( sampler1, coord ).x - 1.0 ) * ( far - near ) );
}

vec4 getSampleWithBoundsCheck(vec2 offset) {
    vec2 coord = gl_TexCoord[0].st + offset;
    if (coord.s <= 1.0 && coord.s >= 0.0 && coord.t <= 1.0 && coord.t >= 0.0) {
        samples += 1.0;
        return texture2D(sampler0, coord);
    } else {
        return vec4(0.0);
    }
}

vec4 getBlurredColor() {
    vec4 blurredColor = vec4( 0.0 );
    float depth = getDepth( gl_TexCoord[0].xy );
    vec2 aspectCorrection = vec2( 1.0, aspectRatio ) * 0.005;

    vec2 ac0_4 = 0.4 * aspectCorrection;    // 0.4
    vec2 ac0_29 = 0.29 * aspectCorrection;  // 0.29
    vec2 ac0_15 = 0.15 * aspectCorrection;  // 0.15
    vec2 ac0_37 = 0.37 * aspectCorrection;  // 0.37    

    vec2 lowSpace = gl_TexCoord[0].st;
    vec2 highSpace = 1.0 - lowSpace;
    space = vec2( min( lowSpace.s, highSpace.s ), min( lowSpace.t, highSpace.t ) );

    if (space.s >= ac0_4.s && space.t >= ac0_4.t) {

        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(0.0, ac0_4.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_4.s, 0.0));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(0.0, -ac0_4.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_4.s, 0.0));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_29.s, -ac0_29.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_29.s, ac0_29.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_29.s, ac0_29.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_29.s, -ac0_29.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_15.s, ac0_37.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_37.s, ac0_15.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_37.s, -ac0_15.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_15.s, -ac0_37.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_15.s, ac0_37.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_37.s, ac0_15.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(-ac0_37.s, -ac0_15.t));
        blurredColor += texture2D(sampler0, gl_TexCoord[0].st + vec2(ac0_15.s, -ac0_37.t));
        blurredColor /= 16.0;

    } else {

        blurredColor += getSampleWithBoundsCheck(vec2(0.0, ac0_4.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_4.s, 0.0));
        blurredColor += getSampleWithBoundsCheck(vec2(0.0, -ac0_4.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_4.s, 0.0));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_29.s, -ac0_29.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_29.s, ac0_29.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_29.s, ac0_29.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_29.s, -ac0_29.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_15.s, ac0_37.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_37.s, ac0_15.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_37.s, -ac0_15.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_15.s, -ac0_37.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_15.s, ac0_37.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_37.s, ac0_15.t));
        blurredColor += getSampleWithBoundsCheck(vec2(-ac0_37.s, -ac0_15.t));
        blurredColor += getSampleWithBoundsCheck(vec2(ac0_15.s, -ac0_37.t));
        blurredColor /= samples;

    }

    return blurredColor;
}
#endif

#ifdef CEL_SHADING
float getEdgeDepth(vec2 coord) {
    float depth = texture2D( sampler1, coord ).x;
    float depth2 = texture2D( sampler2, coord ).x;
    if ( depth2 < 1.0 ) {
        depth = depth2;
    }

    if ( depth == 1.0 ) {
        return INFINITY;
    }

    return depth * near / ( far + ( near - far ) * depth );
}

vec4 edgeDetect( vec2 coord ) {
    vec2 o11 = vec2(1.0, aspectRatio)*CEL_EDGE_THICKNESS/displayWidth;
    vec4 color = vec4(0.0);

    float depth = getEdgeDepth(coord);
    float avg = 0.0;
    float laplace = 24.0 * depth;
    float sample;
int n = 0;

if (depth < INFINITY) {
    avg += depth;
    ++n;
}

for (int i = -2; i <= 2; ++i) {
    for (int j = -2; j <= 2; ++j) {
        if (i != 0 || j != 0) {
            sample = getEdgeDepth(coord + vec2(float( i ) * o11.s, float( j ) * o11.t));
        laplace -= sample;
    if (sample < INFINITY) {
++n;
avg += sample;
}
}
}
}

avg = clamp( avg/ float( n ), 0.0, 1.0);

if ( laplace > avg * CEL_EDGE_THRESHOLD ) {
    color.rgb = mix( vec3( 0.0 ), gl_Fog.color.rgb, 0.75 * avg * avg);
    color.a = 1.0;
}

return color;
}
#endif

float genrng(vec2 co){
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5453);
}


vec4 filmgrain( vec4 col_input, vec2 coord ){
	float rr = genrng(vec2(coord.x * col_input.x * rand, coord.y * col_input.y * rand));
	return mix(col_input, vec4(rr,rr,rr,1.0), 0.2);
}

vec4 trySSR( vec4 col, vec2 coord ) {
    if (coord.y < 0.5){
        float cy = displayHeight - coord.y;
        vec4 reflected = texture2D( sampler0, vec2(coord.x, cy) );
        return reflected;
    }
    return col;
}

vec4 blur(float amount) {
    vec2 vrender = gl_TexCoord[0].xy + vec2(amount - genrng(gl_TexCoord[0].xy * rand) * (amount*2.0), 0.0);
    return texture2D(sampler0, vrender);
}

vec4 sblur(vec2 coord, float amount){
    float samples = 0.0;
    vec4 currentOut = vec4(0.0,0.0,0.0,1.0);
    float blurRadius = 0.002 * amount;
    int sampleR = 5;
    for (int x = 0; x < sampleR; x++){
        currentOut += texture2D(sampler0, coord + vec2(float(x) * blurRadius, 0.0));
        currentOut += texture2D(sampler0, coord - vec2(float(x) * blurRadius, 0.0));
        samples += 2.0;
    }
    currentOut /= samples;
    currentOut.w = 1.0;
    return currentOut;
}

float getBrightness(vec4 color) {
    return (color.x + color.y + color.z) / 3.0;
}

vec4 contrast(vec4 color){
    float initialBrightness = (color.x + color.y + color.z) / 3.0 - 0.5;
    float brightness = initialBrightness / 0.5;
    if (brightness < 0.0){
        brightness *= 1.5;
    }
    brightness += 1.0;
    color.xyz *= brightness;
    color.x = clamp(color.x, 0.0, 1.0);
    color.y = clamp(color.y, 0.0, 1.0);
    color.z = clamp(color.z, 0.0, 1.0);
    color.w = initialBrightness + 0.5;
    return color;
}

vec4 dynamicLightingKindofThing(vec4 color, vec2 coord){
    float maxDepth = 3.0;
    float depthAt = getDepth(coord);
    float depthAlpha = depthAt / maxDepth;
    depthAlpha = clamp(1.0 - depthAlpha, 0.0, 1.0) * (1.0 - getBrightness(color)) * 0.2;
    color = mix(color, vec4(1.0,0.99,0.92,1.0), depthAlpha);
    //color.w = depthAlpha;
    return color;
}

void main() {
    vec4 baseColor;

    #ifdef AA_ENABLED
    baseColor = getAA();
    #else
    baseColor = texture2D( sampler0, gl_TexCoord[0].st );
    #endif

    #ifdef SSAO_ENABLED
    baseColor *= getSSAO();
    #endif

    #ifdef BLOOM_ENABLED
    baseColor = mix( baseColor, getBloom(), 0.5 );
    #endif

    #ifdef CEL_SHADING
    vec4 outlineColor = edgeDetect( gl_TexCoord[0].st );
    if (outlineColor.a != 0.0) {
        baseColor.rgb = outlineColor.rgb;
    }
    #endif

    #ifdef DOF_ENABLED
    float depth = getDepth( gl_TexCoord[0].st );

    float cursorDepth = getCursorDepth( vec2( 0.5, 0.5 ) );
    if ( depth < cursorDepth )
    baseColor = mix( baseColor, getBlurredColor(), clamp(2.0 * ((clamp(cursorDepth, 0.0, HYPERFOCAL) - depth) / (clamp(cursorDepth, 0.0, HYPERFOCAL))), 0.0, 1.0));
    else
    baseColor = mix( baseColor, getBlurredColor(), 1.0 - clamp( ( ( ( cursorDepth * HYPERFOCAL ) / ( HYPERFOCAL - cursorDepth ) ) - ( depth - cursorDepth ) ) / ((cursorDepth * HYPERFOCAL) / (HYPERFOCAL - cursorDepth)), 0.0, 1.0));
    #endif

#if MOTIONBLUR_ENABLED == 2
    float mouseDist = clamp(lastMouseDist/ 60.0, 0.0, 1.0);
    baseColor = mix(baseColor, sblur(gl_TexCoord[0].xy, mouseDist*1.5), 0.3 + mouseDist * 0.7);
#elif MOTIONBLUR_ENABLED == 1
    float mouseDist = clamp(lastMouseDist/ 60.0, 0.0, 1.0);
    baseColor = mix(baseColor, blur(0.03 * mouseDist), 0.2 + mouseDist * 0.4);
#endif

#ifdef SSR_ENABLED
    float plus40Point = 0.22;
    float zeroPoint = 0.40;
    float minus40Point = 0.79;

    float pixelsOffset = zeroPoint;
    if (fovMod > 0.5){
        pixelsOffset -= (zeroPoint - plus40Point) * ((fovMod - 0.5) / 0.5);
    }
    if (fovMod < 0.5){
        pixelsOffset += (minus40Point - zeroPoint) * pow((1.0-(fovMod / 0.5)), 4.0);
    }

    float offsetY = playerPitchRot / SSRMaxY * pixelsOffset;
    if (baseColor.z > baseColor.x && baseColor.z > baseColor.y){
        //baseColor = mix(baseColor, filmgrain(trySSR(baseColor, gl_TexCoord[0].xy - vec2(0.0, offsetY)), gl_TexCoord[0].xy), clamp(baseColor.z*baseColor.z, 0.0, 0.1)/0.1 * 0.4 * (1.0 - clamp(abs(playerPitchRot/SSRMaxY), 0.0, 1.0)) );
        vec2 drawVec = gl_TexCoord[0].xy - vec2(0.001 - genrng(gl_TexCoord[0].xy * rand) * 0.002, offsetY);
        float a = 1.0;
        if (gl_TexCoord[0].y > 0.5){
            float diff = abs(gl_TexCoord[0].y - 0.5);
            a = diff / offsetY;
            a = 1.0 - a;
            //a = clamp(abs( - drawVec.y), 0.0, 0.5) / 0.5;
        } /*else if (playerPitchRot < 0.0) {
            //float diff = abs(gl_TexCoord[0].y - 0.5);
            float diff = clamp((0.5 + (0.5 - gl_TexCoord[0].y)) / ((0.5 - gl_TexCoord[0].y)/offsetY), 0.0, 1.0);
            a = diff;
        }*/
        baseColor = mix(baseColor, trySSR(baseColor, drawVec), clamp(baseColor.z*baseColor.z, 0.0, 0.1)/0.1 * 0.4 * (1.0 - clamp(abs(playerPitchRot/SSRMaxY), 0.0, 1.0)) * a );
    }
#endif

    //baseColor = dynamicLightingKindofThing(baseColor, gl_TexCoord[0].xy);
    //baseColor = filmgrain(baseColor, gl_TexCoord[0].st);
    //baseColor = mix(baseColor, blur(0.03), 1.0);
    
    //baseColor = mix(baseColor, contrast(sblur(gl_TexCoord[0].xy), 1.0), 0.5);
    //baseColor = mix(baseColor, contrast(baseColor), 1.0);
    gl_FragColor = baseColor;
}