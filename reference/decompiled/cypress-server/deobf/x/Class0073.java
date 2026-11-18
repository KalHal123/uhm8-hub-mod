package x;

import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class0073 extends Class0193 {
   public static Logger 45bF8jb7RB7t88e1y1eM5poj27PhZyeeX6aeK0K80Ar4v9I4gRl7sW7X531m = Logger.getLogger("Minecraft");
   private static Random 0Y2FKVy2X69CRVqtHsXbDPZ0M6M18w4G7sn65r4l1zWGJTek674e1Fkt4dW0 = new Random();
   public Class0366 4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1;
   public boolean 0cPsupKbbeKHzkR25H11G5saFrJ50p3y74RaWMn9xC22kFosJxZTG57G87ET = false;
   private MinecraftServer 8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj;
   private int 633Iu239t80rGiRe0y3rT4V49dc1oMJMRmYIOCt6i3KVzfwty56x8AA57P0S = 0;
   private String 53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt = null;
   private Class0203 98zBogPW69La9Vs6f59CkAA4ChW752H3nk4k9bgo8AOtIGsAqU0j1W357DHF = null;
   private String 36s95HRQ5A07kS57ELibmzA2dNdD1tZk9lQiWDM3jKA5Ba3MUV99F7Vbh88V = "";

   public Class0073(MinecraftServer var1, Socket var2, String var3) throws IOException {
      this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj = var1;
      this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1 = new Class0366(var2, var3, this);
   }

   public void _ugSrPcTwNmTckI57ci0V4MH0x53wIJo735JEeW59ZTjYuyx2Ovv4XKrgQq5/* $VF was: 3ugSrPcTwNmTckI57ci0V4MH0x53wIJo735JEeW59ZTjYuyx2Ovv4XKrgQq5 */() throws IOException {
      if (this.98zBogPW69La9Vs6f59CkAA4ChW752H3nk4k9bgo8AOtIGsAqU0j1W357DHF != null) {
         this._gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN/* $VF was: 8gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN */(
            this.98zBogPW69La9Vs6f59CkAA4ChW752H3nk4k9bgo8AOtIGsAqU0j1W357DHF
         );
         this.98zBogPW69La9Vs6f59CkAA4ChW752H3nk4k9bgo8AOtIGsAqU0j1W357DHF = null;
      }

      if (this.633Iu239t80rGiRe0y3rT4V49dc1oMJMRmYIOCt6i3KVzfwty56x8AA57P0S++ == 100) {
         this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
            "Took too long to log in"
         );
      } else {
         this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
            ._0dBA7OKcXTpd7j9k146T2jOo12fnJN6p76S0V155de51HR68fMXS3CR1181/* $VF was: 00dBA7OKcXTpd7j9k146T2jOo12fnJN6p76S0V155de51HR68fMXS3CR1181 */();
      }
   }

   public void _EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
      String var1
   ) {
      45bF8jb7RB7t88e1y1eM5poj27PhZyeeX6aeK0K80Ar4v9I4gRl7sW7X531m.info(
         "Disconnecting "
            + this._C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2/* $VF was: 3C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2 */()
            + ": "
            + var1
      );
      this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
         ._1aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4/* $VF was: 31aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4 */(
            new Class0004(var1)
         );
      this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
         ._21OCAf8i8OS41zYcTM59dxL4K7TY99010779bHMoqW8cRsVqh0Qui91emr0/* $VF was: 921OCAf8i8OS41zYcTM59dxL4K7TY99010779bHMoqW8cRsVqh0Qui91emr0 */();
      this.0cPsupKbbeKHzkR25H11G5saFrJ50p3y74RaWMn9xC22kFosJxZTG57G87ET = true;
   }

   @Override
   public void _3iNAS43ic3U4G9yw6n6W6Ss3X00amUCC699oHP4B5K9vyoEBuQK8j35m9Bi/* $VF was: 33iNAS43ic3U4G9yw6n6W6Ss3X00amUCC699oHP4B5K9vyoEBuQK8j35m9Bi */(
      Class0147 var1
   ) {
      if (this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.7VMttey14aGT8m8YVK5QJwk2093vVTpP54Pq8L4rS7gEa4FQR7M2714eYt12) {
         this.36s95HRQ5A07kS57ELibmzA2dNdD1tZk9lQiWDM3jKA5Ba3MUV99F7Vbh88V = Long.toHexString(
            0Y2FKVy2X69CRVqtHsXbDPZ0M6M18w4G7sn65r4l1zWGJTek674e1Fkt4dW0.nextLong()
         );
         this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
            ._1aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4/* $VF was: 31aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4 */(
               new Class0147(this.36s95HRQ5A07kS57ELibmzA2dNdD1tZk9lQiWDM3jKA5Ba3MUV99F7Vbh88V)
            );
      } else {
         this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
            ._1aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4/* $VF was: 31aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4 */(
               new Class0147("-")
            );
      }
   }

   @Override
   public void _PFDI0g1Y2wDG6PqMWRTNB7IMmiI7aB3xiGy4Mwtr9uTtY7Jzn1yv7lKUlSp/* $VF was: 1PFDI0g1Y2wDG6PqMWRTNB7IMmiI7aB3xiGy4Mwtr9uTtY7Jzn1yv7lKUlSp */(
      Class0203 var1
   ) {
      if (var1 instanceof Class0032) {
         this._f5JlU72eH8h3z6JYbEAo6956xwyNLg0D6Ni3kd04uhsNO6Q9m695a4O8z2G/* $VF was: 9f5JlU72eH8h3z6JYbEAo6956xwyNLg0D6Ni3kd04uhsNO6Q9m695a4O8z2G */(
            (Class0032)var1
         );
      } else {
         this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt = var1.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc;
         if (!this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("/")
            && !this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("\\")
            && !this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("..")) {
            if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.startsWith("@@")
               || this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.trim().startsWith("dev")
                  && (
                     this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.length() < 4
                        || !Character.isAlphabetic(this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.codePointAt(3))
                  )
               || this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.startsWith("\u0001")
               || this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.startsWith("\u0002")) {
               45bF8jb7RB7t88e1y1eM5poj27PhZyeeX6aeK0K80Ar4v9I4gRl7sW7X531m.info("Invalid developer signature. Kicking.");
               if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev0")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## Nice going, shitlord."
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev1")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## No. Bad."
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev2")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## You better bugger off, pal."
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev3")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## That's not your account now, is it?"
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev4")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## pwned"
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev5")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## This is mine :)"
                  );
               } else if (this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.equals("dev6")) {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "## \"Never gonna give you up, never gonna let you down\""
                  );
               } else {
                  this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                     "[SecureLogin] Please log in with development keys."
                  );
               }
            } else if (var1.2pxp4xa6gtAW893i43pV1QFN11AKUl31C527IAI34PafR4MR5oq7p8hwOL4N != 2) {
               this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                  "Outdated client!"
               );
            } else if (!this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.7VMttey14aGT8m8YVK5QJwk2093vVTpP54Pq8L4rS7gEa4FQR7M2714eYt12) {
               this._gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN/* $VF was: 8gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN */(
                  var1
               );
            } else {
               new Class0086(this, var1).start();
            }
         } else {
            this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
               "Invalid characters in name."
            );
         }
      }
   }

   @Override
   public void _f5JlU72eH8h3z6JYbEAo6956xwyNLg0D6Ni3kd04uhsNO6Q9m695a4O8z2G/* $VF was: 9f5JlU72eH8h3z6JYbEAo6956xwyNLg0D6Ni3kd04uhsNO6Q9m695a4O8z2G */(
      Class0032 var1
   ) {
      this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt = var1.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc;
      if (!this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("/")
         && !this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("\\")
         && !this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt.contains("..")) {
         if (var1.8H5Q96l1uc0zbB54hy7M6TQrMy2CRKoPmhXWmulTB0yb5YdMCF56WNAcsMvf != 0) {
            this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt = (char)var1.8H5Q96l1uc0zbB54hy7M6TQrMy2CRKoPmhXWmulTB0yb5YdMCF56WNAcsMvf
               + this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt;
         }

         var1.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc = this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt;
         if (!var1.27606wBI1l8C7R4BpB2g51APTu20KwqSXb88UjZOH3EoQd5NZU0S0ekP5nyi) {
            this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
               "seclogin::verify RESPONSE"
            );
         } else if (var1.56H94y2h40e8KinM8jY06Tz5S05cU68iPFAQ4ARd28joiW0y28i4qGqNxE8v != 2) {
            this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
               "Outdated client!"
            );
         } else {
            this._gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN/* $VF was: 8gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN */(var1);
         }
      } else {
         this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
            "Invalid characters in name."
         );
      }
   }

   public void _gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN/* $VF was: 8gjNy12GF7Gyv6MBg35kJ8B520BN82fGM0h0039aVQ1lri08lsKNqZs5rKuN */(
      Class0203 var1
   ) {
      Class0190 var2 = this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj
         .6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
         ._Rnp5hVT9HCgcuTt9b3uu7K9ky6RkkBxUTx87bT4LF1u41mIJp4BVvrgoQ1w/* $VF was: 9Rnp5hVT9HCgcuTt9b3uu7K9ky6RkkBxUTx87bT4LF1u41mIJp4BVvrgoQ1w */(
            this, var1.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc, var1.8Lt01nKf27ZYA0nfNVRLFge6raR5A2VF7ZPjI0w7426JGeM2O5xmq10ob4Wg
         );
      if (var2 != null) {
         if (var1.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc.charAt(0) != 2) {
            45bF8jb7RB7t88e1y1eM5poj27PhZyeeX6aeK0K80Ar4v9I4gRl7sW7X531m.info(
               this._C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2/* $VF was: 3C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2 */()
                  + " logged in "
                  + (var1 instanceof Class0032 ? "[verified]" : "")
            );
         }

         Class0126 var3 = new Class0126(
            this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj, this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1, var2
         );
         if (var1 instanceof Class0032) {
            var3.1rle0xO34vUA8Vp6C11E974IzTYR6r2xC1d72yD17sv14H0BSVP2F5c1Y8iO = 0Y2FKVy2X69CRVqtHsXbDPZ0M6M18w4G7sn65r4l1zWGJTek674e1Fkt4dW0.nextInt(10000000)
               + 30;
         }

         var3._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
            new Class0203("", var3.1rle0xO34vUA8Vp6C11E974IzTYR6r2xC1d72yD17sv14H0BSVP2F5c1Y8iO + "", 0)
         );
         var3._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
            new Class0370(
               this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.5q3TSudd3JAEUd3hC0rlkaBka660Sh6x5R2tI2n52g0eE0J6HWavR5123BY5,
               this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.423rat5QIGRb6meqjn9c36zK71NpI3xLmun2sMng33L64f7Uw2CieGFm22l5,
               this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.9U9Nz3112ZP49CHVF49wPBC9Ck19wGqfZc5Co3lm06JNWCS12C4e89SjNsCa,
               this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.0I1d62cDt27eX5XR4dH3ENv3Gx50msU4F2b6CTMh2E7v1r34XKKA6YmTFjcA
            )
         );
         this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj
            .6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
            ._XvnU5qWZq05i82hE08A8iuxgXDx89P0Pe18Mcm3FU391kbo1M7SH7PO0nJU/* $VF was: 6XvnU5qWZq05i82hE08A8iuxgXDx89P0Pe18Mcm3FU391kbo1M7SH7PO0nJU */(var2);
         var3._pCc4ZW1MFt7Wf2AjWls9cd83Ra4Qqkd9kGoPd1qSQ5YZJjTCQQ6YccmdSDA/* $VF was: 0pCc4ZW1MFt7Wf2AjWls9cd83Ra4Qqkd9kGoPd1qSQ5YZJjTCQQ6YccmdSDA */(
            var2.8BKn5O693h7F1gA8181SGlf7Scz51qLsKq7174s22o5TY09247melakNLfD3,
            var2.3zvsz8gL3ub8LDNct7Hj1xie72SaOqi5iYxVlxSkCXxxxWBwHP9cs22s95ED,
            var2.89Z2Hn6coWE24275g54RXJPI8ghNqC3562O1sHVFWWu2ce45JPiMZ4EIiUqw,
            var2.5bjP62l3un7D1T2Cbc00YUO3RxrWoQU2Ja2vSqBCgLp5Gr2zl21wGy4JLSXk,
            var2.2gA93w044SoC300q47Y50SIbwV5nFWBB3u9PgB8bBoPkoJ91c6X65YeGk160
         );
         var3._1W0nAQ8W326o8Z594R1tBmmTBV981jl0mu1bi5qn8j80m05zjs1IVNHq1Eq/* $VF was: 81W0nAQ8W326o8Z594R1tBmmTBV981jl0mu1bi5qn8j80m05zjs1IVNHq1Eq */();
         this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj
            .4VTH9nXSH3iW6f0o8121U3I2KPb85we7cqHlCq475Nln8L8ObCE40WgdHZ43
            ._Mr365gZZn95id5yxIlYcXvm7QK86V813XA4tdLV541p83xiR22Tk91GnKs6/* $VF was: 5Mr365gZZn95id5yxIlYcXvm7QK86V813XA4tdLV541p83xiR22Tk91GnKs6 */(var3);
         var3._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
            new Class0099(
               this.8b44JuHk8jt7voyAoQ4eP6ohM2L0s0A4D2a9wmWxPPL5opH654EL73hxFUoj.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.1yQ1oWQad4gDAonvCHt0w671JAYDVJ6X41XarEO15r8KUeKkI11y3IRbfK8K
            )
         );
      }

      this.0cPsupKbbeKHzkR25H11G5saFrJ50p3y74RaWMn9xC22kFosJxZTG57G87ET = true;
   }

   @Override
   public void _QMm4XgN8SE3b2P88hWTauf4I0x8127wD5x6SE34LXO2hnW42Gol63Q5NloW/* $VF was: 0QMm4XgN8SE3b2P88hWTauf4I0x8127wD5x6SE34LXO2hnW42Gol63Q5NloW */(
      String var1
   ) {
      45bF8jb7RB7t88e1y1eM5poj27PhZyeeX6aeK0K80Ar4v9I4gRl7sW7X531m.info(
         this._C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2/* $VF was: 3C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2 */()
            + " lost connection"
      );
      this.0cPsupKbbeKHzkR25H11G5saFrJ50p3y74RaWMn9xC22kFosJxZTG57G87ET = true;
   }

   @Override
   public void _hs2g88uk8ry2v2bXeYbiRG944A0ENq1fR83RpL0uNSV0Z60Zmenj5Ak98G8/* $VF was: 5hs2g88uk8ry2v2bXeYbiRG944A0ENq1fR83RpL0uNSV0Z60Zmenj5Ak98G8 */(
      Class0321 var1
   ) {
      this._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
         "Protocol error"
      );
   }

   public String _C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2/* $VF was: 3C87W6k48dL7n1n6O6dX4bRv37yS8SUaXiJ7411lYVQIZc1ToJhr012JSHv2 */() {
      return this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt != null
         ? this.53Xn3959UtfGf55nfs4FI0F6ydJ11uNJWO3yQgtA3d668988Li766LniiSAt
            + " ["
            + this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
               ._X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu/* $VF was: 7X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu */()
               .toString()
            + "]"
         : this.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
            ._X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu/* $VF was: 7X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu */()
            .toString();
   }

   static String _S9880rVMBqgE8ZCZxVbL5O53Buyfuf47CU20A25Ls8OV9JjM19w1b2EAHJq/* $VF was: 2S9880rVMBqgE8ZCZxVbL5O53Buyfuf47CU20A25Ls8OV9JjM19w1b2EAHJq */(
      Class0073 var0
   ) {
      return var0.36s95HRQ5A07kS57ELibmzA2dNdD1tZk9lQiWDM3jKA5Ba3MUV99F7Vbh88V;
   }

   static Class0203 _8u247rbnuTRlqQM4qpSYjkPx7MLO17qKLI8j0aKE5Ama7WUzYtC92WThCaJ/* $VF was: 48u247rbnuTRlqQM4qpSYjkPx7MLO17qKLI8j0aKE5Ama7WUzYtC92WThCaJ */(
      Class0073 var0, Class0203 var1
   ) {
      return var0.98zBogPW69La9Vs6f59CkAA4ChW752H3nk4k9bgo8AOtIGsAqU0j1W357DHF = var1;
   }
}
