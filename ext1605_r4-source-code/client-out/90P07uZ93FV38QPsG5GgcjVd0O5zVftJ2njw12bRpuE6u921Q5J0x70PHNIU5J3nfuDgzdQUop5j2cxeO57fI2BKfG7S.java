import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class 90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S {
   private static final String[] 2009868sA84t1qE7xT1JaAu9M56733JAdRH11t5o1I7PMb9E5yXOCB0q32Jp = new String[]{
      "HORIZON", "FAR", "NORMAL", "SHORT", "TINY", "DUALITY"
   };
   private static final String[] 7W4FCn7Clp5FPwjP1PiK6t0x8OQH337gA9s6V0LG7j78tcwizO0c2dytg3Ox = new String[]{"Peaceful", "Easy", "Normal", "Hard", "Frail"};
   private static final String[] 0601s25AwsXK8YAli4bSnf611cz09m3nihe6Wcjm69saa6xnYY1LDN3wqX7Q = new String[]{"FAST", "FANCY", "MAX PERF."};
   public float 5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN = 1.0F;
   public float 0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9 = 1.0F;
   public float 40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp = 0.5F;
   public boolean 04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP = false;
   public int 8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU = 1;
   public boolean 12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K = true;
   public boolean 10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8 = false;
   public boolean 41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z = false;
   public int 21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb = 1;
   public boolean 00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq = true;
   public float 0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR = 0.5F;
   public String 5cq9PhUp8LROyS1A2CPi3fyxFgmWABb66h72hAC97w32G831S582rHP9QCBn = "Default";
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 7a0W1RU6Q8EbOS4A4lKs1uS0aGxdk63RpdvD08587ZlFAcxUAvMiu1kKm8pW = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Forward", 17
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 4WO3zvF2VJSJrydLjBu8Z2NY6rB4Yi5rkCoVAh3g1rSfaVFqR4WL0aI926u5 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Left", 30
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 3c8SpV9K1ddvX9lx4h2hOD9G9m5o1dGknq2J8f296yrV8gFD43Hhtf2353fH = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Back", 31
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 813LRkk7pVtE7Ko1lsl5pqeor841vBVm8sAWN9bz76DwrQR9odtq5d2RnS7S = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Right", 32
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 2om4e4AYodl0O6AznpiYzPI1t109zUzPwqE02SJ4dXm7Q2ksR1N1fo08NmC7 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Jump", 57
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 400nmSgqkmWs4T9j7Z2Rtse46ME5W3lmkz88JuE91nRGK1LJ0n3MnjdVQG14 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Inventory", 18
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 2Ykx4GZjpFlzho5iH00m9ZV3lKWAK1V1i7l8IwksoId2p1z5nv077OnTHG22 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Drop", 16
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 8sz2228sPity2FLj12vTITSeMt2C39BWEPskZ82JvrV6LDsFrv9g18uH23L1 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Chat", 20
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 8nj81Ha0z6kkA82L191Z2XuGhV8Ad5073HJWD34egOjVN9Y397KLC1a5ATH4 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Toggle fog", 33
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 46vj9daTh0uJGzMJGq9U4y3lwd639qggdWifULDkKxYX586STsGYvVa6Nbc6 = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Sneak", 29
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 8zR7w7M0dCz141EgrKPTyPG0x4be73DnUpm3v39wugYiB00oRfG9xEdOaiDU = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Dash", 42
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5 0y3J835DcYjJCi69MHQUHF4jrOLdQx1Z31fkAA08625s5FJMK989j345coLD = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5(
      "Open console", 41
   );
   public 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5[] 34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj = new 7Ex3Y0PhEloSzH2mCL20Eo2WWd2MO5JwWJC1RXanE9fpjFtFayN8O5J28yC51v4YjZ30cDqt3a3bFcbfG4B7uywbD0L5E5[]{
      this.7a0W1RU6Q8EbOS4A4lKs1uS0aGxdk63RpdvD08587ZlFAcxUAvMiu1kKm8pW,
      this.4WO3zvF2VJSJrydLjBu8Z2NY6rB4Yi5rkCoVAh3g1rSfaVFqR4WL0aI926u5,
      this.3c8SpV9K1ddvX9lx4h2hOD9G9m5o1dGknq2J8f296yrV8gFD43Hhtf2353fH,
      this.813LRkk7pVtE7Ko1lsl5pqeor841vBVm8sAWN9bz76DwrQR9odtq5d2RnS7S,
      this.2om4e4AYodl0O6AznpiYzPI1t109zUzPwqE02SJ4dXm7Q2ksR1N1fo08NmC7,
      this.46vj9daTh0uJGzMJGq9U4y3lwd639qggdWifULDkKxYX586STsGYvVa6Nbc6,
      this.2Ykx4GZjpFlzho5iH00m9ZV3lKWAK1V1i7l8IwksoId2p1z5nv077OnTHG22,
      this.400nmSgqkmWs4T9j7Z2Rtse46ME5W3lmkz88JuE91nRGK1LJ0n3MnjdVQG14,
      this.8sz2228sPity2FLj12vTITSeMt2C39BWEPskZ82JvrV6LDsFrv9g18uH23L1,
      this.8nj81Ha0z6kkA82L191Z2XuGhV8Ad5073HJWD34egOjVN9Y397KLC1a5ATH4,
      this.8zR7w7M0dCz141EgrKPTyPG0x4be73DnUpm3v39wugYiB00oRfG9xEdOaiDU,
      this.0y3J835DcYjJCi69MHQUHF4jrOLdQx1Z31fkAA08625s5FJMK989j345coLD
   };
   protected Minecraft 2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242;
   private File 6I9CVwZE7S0FSi23yC45NoWL4vfGfuUn53W87SzCc741j2iob0KNR78kH295;
   public int 3x5HH0y4BeBhSApYdP36VY2fTO1Z0eTtVpWXhv1r5vH0wZgGhPH24D3y22Fa = 12;
   public int 83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89 = 2;
   public boolean 62p9oNt3fL95Z2GQCrZ6mc1ALIkgs35mKZ9ozwF97QlZmhcw5pU7GVl135uP = false;
   public boolean 25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV = false;
   public int 169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq = 2;
   public boolean 9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6 = true;
   public boolean 2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa = true;
   public boolean 4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl = true;
   public boolean 9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G = true;

   public _0P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S/* $VF was: 90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S */(
      Minecraft var1, File var2
   ) {
      if (var1._E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD/* $VF was: 2E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD */()
         .toLowerCase()
         .contains("nvidia")) {
         2009868sA84t1qE7xT1JaAu9M56733JAdRH11t5o1I7PMb9E5yXOCB0q32Jp[5] = "Silent Dream";
      }

      this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242 = var1;
      this.6I9CVwZE7S0FSi23yC45NoWL4vfGfuUn53W87SzCc741j2iob0KNR78kH295 = new File(var2, "options.txt");
      this._l728J30UZxliSdA6uw526rj0wzRB9k8iKuKXp2He8caNFtMCv74LlHQ4282/* $VF was: 0l728J30UZxliSdA6uw526rj0wzRB9k8iKuKXp2He8caNFtMCv74LlHQ4282 */();
   }

   public _0P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S/* $VF was: 90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S */() {
   }

   public String _4WQ90yx219We269UyJB97L5INdDSA81vIwtA33L9W4FQ2cUDyY6pOFkeHiW/* $VF was: 84WQ90yx219We269UyJB97L5INdDSA81vIwtA33L9W4FQ2cUDyY6pOFkeHiW */(
      int var1
   ) {
      return this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var1].08YVi0miV0NCq8kgQVB3s086gcHnyy5wG3nCl3UVTdfLPyRbaq0dC2rfhcmD
         + ": "
         + Keyboard.getKeyName(
            this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var1].7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
         );
   }

   public void _3j9jV0unWNuT98kVCwtq2029meeD9248265E9EM8Vx3j4UkDI2XbPT5W0RD/* $VF was: 43j9jV0unWNuT98kVCwtq2029meeD9248265E9EM8Vx3j4UkDI2XbPT5W0RD */(
      int var1, int var2
   ) {
      this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var1].7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN = var2;
      this._9328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41/* $VF was: 59328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41 */();
   }

   public void _1q83du4HaW59MJ9dbgIw283tnp9FTGdKAIaz3G2fKFS8kiLN47ib74Ajr5A/* $VF was: 41q83du4HaW59MJ9dbgIw283tnp9FTGdKAIaz3G2fKFS8kiLN47ib74Ajr5A */(
      int var1, float var2
   ) {
      if (var1 == 0) {
         this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN = var2;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
            ._gErgdJ1s3Q9XvRI4j6W8TDm44V8LZbFaVOFC0f800gRAh9bmn3RlL91y9lw/* $VF was: 3gErgdJ1s3Q9XvRI4j6W8TDm44V8LZbFaVOFC0f800gRAh9bmn3RlL91y9lw */();
      }

      if (var1 == 1) {
         this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9 = var2;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
            ._gErgdJ1s3Q9XvRI4j6W8TDm44V8LZbFaVOFC0f800gRAh9bmn3RlL91y9lw/* $VF was: 3gErgdJ1s3Q9XvRI4j6W8TDm44V8LZbFaVOFC0f800gRAh9bmn3RlL91y9lw */();
      }

      if (var1 == 3) {
         this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp = var2;
      }

      if (var1 == 11) {
         this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR = var2;
      }
   }

   public void _90874nZdx634bxSyP8662vVZm4CCxF145OGW0Ndz0kdVV9MnO7T5G6Oy3t9/* $VF was: 990874nZdx634bxSyP8662vVZm4CCxF145OGW0Ndz0kdVV9MnO7T5G6Oy3t9 */(
      int var1, int var2
   ) {
      if (var1 == 2) {
         this.04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP = !this.04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP;
      }

      if (var1 == 4) {
         this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU = (this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU + var2) % 6;
         if (this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU < 0) {
            this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU = !GL11.glGetString(7937).toLowerCase().contains("graphics media")
                  && !GL11.glGetString(7937).toLowerCase().contains("4 series express")
               ? 5
               : 4;
         }
      }

      if (var1 == 5) {
         this.12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K = !this.12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K;
      }

      if (var1 == 6) {
         this.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8 = !this.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._006A260FinF65160yy1tRxZa08HEJ1MIT4yk9xYNQlGL4i3Akg8kfUiiEwB/* $VF was: 9006A260FinF65160yy1tRxZa08HEJ1MIT4yk9xYNQlGL4i3Akg8kfUiiEwB */();
      }

      if (var1 == 7) {
         this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z = !this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z;
         Display.setVSyncEnabled(this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z);
      }

      if (var1 == 8) {
         this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89 = (this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89 + var2) % 5;
         System.out.println("Difficulty is now " + this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89);
      }

      if (var1 == 9) {
         this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb--;
         if (this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb < 0) {
            this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb = 2;
         }

         if (this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
            this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
               .3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi
               ._qx7Cqo2hpoilsXLjli1zoEaWnL7dCCCjdA503Iyu70x5N2RrXC9qZ98XD5o/* $VF was: 4qx7Cqo2hpoilsXLjli1zoEaWnL7dCCCjdA503Iyu70x5N2RrXC9qZ98XD5o */();
         }
      }

      if (var1 == 10) {
         this.00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq = !this.00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq;
      }

      if (var1 == 12) {
         this.25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV = !this.25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV;
      }

      if (var1 == 20) {
         this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq++;
         this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq %= 3;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo
            ._r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9/* $VF was: 9r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9 */();
      }

      if (var1 == 21) {
         this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6 = !this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo
            ._r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9/* $VF was: 9r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9 */();
      }

      if (var1 == 22) {
         this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G = !this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo
            ._r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9/* $VF was: 9r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9 */();
      }

      if (var1 == 23) {
         this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl = !this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo
            ._r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9/* $VF was: 9r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9 */();
      }

      if (var1 == 24) {
         this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa = !this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa;
         this.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242
            .0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo
            ._r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9/* $VF was: 9r1511Jp0jE144f4MQc4NK82XBZn9UtKQ9T0m3371572UnC4jS4YM9eJUhB9 */();
      }

      this._9328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41/* $VF was: 59328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41 */();
   }

   public int _yR0tLTb2b5Alv4vG4j3iy7Mh4tpbj3GRKxVH6u9Uz6IrG6l9F5B96couwIg/* $VF was: 3yR0tLTb2b5Alv4vG4j3iy7Mh4tpbj3GRKxVH6u9Uz6IrG6l9F5B96couwIg */(int var1) {
      return var1 == 0 ? 1 : (var1 == 1 ? 1 : (var1 == 3 ? 1 : (var1 == 11 ? 1 : 0)));
   }

   public float _SJH266G4522Pw4gF4Mtv8cbSQpgw1N82bK41W0Kjqj7gshy90H7eU1JW3F4/* $VF was: 4SJH266G4522Pw4gF4Mtv8cbSQpgw1N82bK41W0Kjqj7gshy90H7eU1JW3F4 */(
      int var1
   ) {
      return var1 == 0
         ? this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN
         : (
            var1 == 1
               ? this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9
               : (
                  var1 == 3
                     ? this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp
                     : (var1 == 11 ? this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR : 0.0F)
               )
         );
   }

   public String _akE4ycpP29ZNPe8U7TtIq1VzWnfb0Dy8d0ME93EebGs00PCtIc26x387brx/* $VF was: 8akE4ycpP29ZNPe8U7TtIq1VzWnfb0Dy8d0ME93EebGs00PCtIc26x387brx */(
      int var1
   ) {
      return var1 == 0
         ? "Music: "
            + (
               this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN > 0.0F
                  ? (int)(this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN * 100.0F) + "%"
                  : "OFF"
            )
         : (
            var1 == 1
               ? "Sound: "
                  + (
                     this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9 > 0.0F
                        ? (int)(this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9 * 100.0F) + "%"
                        : "OFF"
                  )
               : (
                  var1 == 2
                     ? "Invert mouse: " + (this.04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP ? "ON" : "OFF")
                     : (
                        var1 == 3
                           ? (
                              this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp == 0.0F
                                 ? "Sensitivity: *yawn*"
                                 : (
                                    this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp == 1.0F
                                       ? "Sensitivity: HYPERSPEED!!!"
                                       : "Sensitivity: " + (int)(this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp * 200.0F) + "%"
                                 )
                           )
                           : (
                              var1 == 4
                                 ? "Render distance: "
                                    + 2009868sA84t1qE7xT1JaAu9M56733JAdRH11t5o1I7PMb9E5yXOCB0q32Jp[this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU]
                                 : (
                                    var1 == 5
                                       ? "View bobbing: " + (this.12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K ? "ON" : "OFF")
                                       : (
                                          var1 == 6
                                             ? "3d anaglyph: " + (this.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8 ? "ON" : "OFF")
                                             : (
                                                var1 == 7
                                                   ? "Vertical sync: " + (this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z ? "ON" : "OFF")
                                                   : (
                                                      var1 == 8
                                                         ? "Difficulty: "
                                                            + 7W4FCn7Clp5FPwjP1PiK6t0x8OQH337gA9s6V0LG7j78tcwizO0c2dytg3Ox[this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89]
                                                         : (
                                                            var1 == 9
                                                               ? "Graphics: "
                                                                  + 0601s25AwsXK8YAli4bSnf611cz09m3nihe6Wcjm69saa6xnYY1LDN3wqX7Q[this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb]
                                                               : (
                                                                  var1 == 10
                                                                     ? "Pause on unfocus: "
                                                                        + (this.00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq ? "ON" : "OFF")
                                                                     : (
                                                                        var1 == 11
                                                                           ? "FOV: "
                                                                              + (
                                                                                 this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR > 0.5
                                                                                    ? "+"
                                                                                    : ""
                                                                              )
                                                                              + (int)(
                                                                                 (this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR - 0.5)
                                                                                    * 80.0
                                                                              )
                                                                           : (
                                                                              var1 == 12
                                                                                 ? "Shaders: "
                                                                                    + (
                                                                                       this.25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV
                                                                                          ? "ON"
                                                                                          : "OFF"
                                                                                    )
                                                                                 : (
                                                                                    var1 == 100
                                                                                       ? "Edit controls..."
                                                                                       : (
                                                                                          var1 == 101
                                                                                             ? "Set Visuals..."
                                                                                             : (
                                                                                                var1 == 20
                                                                                                   ? "Sh. Motion Blur: "
                                                                                                      + (
                                                                                                         this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq
                                                                                                               == 2
                                                                                                            ? "QUALITY"
                                                                                                            : (
                                                                                                               this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq
                                                                                                                     == 1
                                                                                                                  ? "PERF."
                                                                                                                  : "OFF"
                                                                                                            )
                                                                                                      )
                                                                                                   : (
                                                                                                      var1 == 21
                                                                                                         ? "Sh. Depth of Field: "
                                                                                                            + (
                                                                                                               this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6
                                                                                                                  ? "ON"
                                                                                                                  : "OFF"
                                                                                                            )
                                                                                                         : (
                                                                                                            var1 == 22
                                                                                                               ? "Sh. Anti Aliasing: "
                                                                                                                  + (
                                                                                                                     this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G
                                                                                                                        ? "ON"
                                                                                                                        : "OFF"
                                                                                                                  )
                                                                                                               : (
                                                                                                                  var1 == 23
                                                                                                                     ? "Sh. Bloom: "
                                                                                                                        + (
                                                                                                                           this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl
                                                                                                                              ? "ON"
                                                                                                                              : "OFF"
                                                                                                                        )
                                                                                                                     : (
                                                                                                                        var1 == 24
                                                                                                                           ? "Sh. SSR (BROKEN): "
                                                                                                                              + (
                                                                                                                                 this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa
                                                                                                                                    ? "ON"
                                                                                                                                    : "OFF"
                                                                                                                              )
                                                                                                                           : ""
                                                                                                                     )
                                                                                                               )
                                                                                                         )
                                                                                                   )
                                                                                             )
                                                                                       )
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   public void _l728J30UZxliSdA6uw526rj0wzRB9k8iKuKXp2He8caNFtMCv74LlHQ4282/* $VF was: 0l728J30UZxliSdA6uw526rj0wzRB9k8iKuKXp2He8caNFtMCv74LlHQ4282 */() {
      try {
         if (!this.6I9CVwZE7S0FSi23yC45NoWL4vfGfuUn53W87SzCc741j2iob0KNR78kH295.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.6I9CVwZE7S0FSi23yC45NoWL4vfGfuUn53W87SzCc741j2iob0KNR78kH295));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(":");
            if (var3[0].equals("music")) {
               this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN = this._3AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M/* $VF was: 73AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M */(
                  var3[1]
               );
            }

            if (var3[0].equals("sound")) {
               this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9 = this._3AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M/* $VF was: 73AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M */(
                  var3[1]
               );
            }

            if (var3[0].equals("mouseSensitivity")) {
               this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp = this._3AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M/* $VF was: 73AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M */(
                  var3[1]
               );
            }

            if (var3[0].equals("invertYMouse")) {
               this.04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP = var3[1].equals("true");
            }

            if (var3[0].equals("viewDistance")) {
               this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("bobView")) {
               this.12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K = var3[1].equals("true");
            }

            if (var3[0].equals("anaglyph3d")) {
               this.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8 = var3[1].equals("true");
            }

            if (var3[0].equals("limitFramerate")) {
               this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z = var3[1].equals("true");
            }

            if (var3[0].equals("difficulty")) {
               this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89 = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("gxMode")) {
               this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb = Integer.parseInt(var3[1]);
            }

            if (var3[0].equals("pauseOnUnfocus")) {
               this.00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq = var3[1].equals("true");
            }

            if (var3[0].equals("fovMod")) {
               this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR = this._3AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M/* $VF was: 73AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M */(
                  var3[1]
               );
            }

            if (var3[0].equals("skin")) {
               this.5cq9PhUp8LROyS1A2CPi3fyxFgmWABb66h72hAC97w32G831S582rHP9QCBn = var3[1];
            }

            if (var3[0].equals("shadersOn")) {
               this.25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV = var3[1].equals("true");
            }

            if (var3[0].equals("shadersDOF")) {
               this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6 = var3[1].equals("true");
            }

            if (var3[0].equals("shadersAA")) {
               this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G = var3[1].equals("true");
            }

            if (var3[0].equals("shadersBloom")) {
               this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl = var3[1].equals("true");
            }

            if (var3[0].equals("shadersSSR")) {
               this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa = var3[1].equals("true");
            }

            if (var3[0].equals("shadersMotionBlur")) {
               this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq = Integer.parseInt(var3[1]);
            }

            for (int var4 = 0; var4 < this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj.length; var4++) {
               if (var3[0]
                  .equals(
                     "key_"
                        + this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var4].08YVi0miV0NCq8kgQVB3s086gcHnyy5wG3nCl3UVTdfLPyRbaq0dC2rfhcmD
                  )) {
                  this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var4].7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN = Integer.parseInt(
                     var3[1]
                  );
               }
            }
         }

         var1.close();
      } catch (Exception var5) {
         System.out.println("Failed to load options");
         var5.printStackTrace();
      }
   }

   private float _3AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M/* $VF was: 73AXnU4fnKkF2FTVX236c26sjot95wyLtMHPOwkcTA7x6Fgu0Ec0cQhe5X2M */(
      String var1
   ) {
      return var1.equals("true") ? 1.0F : (var1.equals("false") ? 0.0F : Float.parseFloat(var1));
   }

   public void _9328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41/* $VF was: 59328E75k38QTT7paHT5VB40Aa0vmAQcn30V2a2I2ojvg5kQe46yLLSd0h41 */() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.6I9CVwZE7S0FSi23yC45NoWL4vfGfuUn53W87SzCc741j2iob0KNR78kH295));
         var1.println("music:" + this.5zVh6As0u9k00iHSIIoh6zDv0onD74k519o6f2ih8xc0KCy6K6rx2u3Gr1yN);
         var1.println("sound:" + this.0mEbE9q0w35M2d45vY0a4001t84W4p6pXah4cFiG6zT4q39Sh9a38knll5I9);
         var1.println("invertYMouse:" + this.04Kzn3g6jm44oXRhg42vgkhSp3y920BFeTuo1x44P0u66uRxc3Jy00C58cNP);
         var1.println("mouseSensitivity:" + this.40a7qx48qSa5U2x4LWl66TG6WTJtp89151v05JrdY06P49LaD6Vk2xbUfoJp);
         var1.println("viewDistance:" + this.8ZkMyUYHsrY76OZw5LJ00YOwex92AgW51WVJMaCWc622fCAz2PGpx9498DuU);
         var1.println("bobView:" + this.12dOAZ6rdsoK466LNB5P9c3VTerNRQez6YZYpOMxF3OkQWAlV7lvWtX9u73K);
         var1.println("anaglyph3d:" + this.10iD31fC4Dyj31q37QyatM61p3w770PmS1ab3DF69GDMkU6z9rOWos13CZo8);
         var1.println("limitFramerate:" + this.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z);
         var1.println("difficulty:" + this.83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89);
         var1.println("gxMode:" + this.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb);
         var1.println("pauseOnUnfocus:" + this.00qzl4RT8l54y85wLI9tvI4Xq4v7B79spk9kgviaaRc40ZHM7a192U43PTTq);
         var1.println("fovMod:" + this.0C4EtBfBCuT3y3UEjMQa70c4g8B7aHSysEqc87yvqIaoA7Vw61YIpz5Fe8dR);
         var1.println("skin:" + this.5cq9PhUp8LROyS1A2CPi3fyxFgmWABb66h72hAC97w32G831S582rHP9QCBn);
         var1.println("shadersOn:" + this.25y1pfK8198W9Tm66cfxM95C77y782yiFE2iJ841XnrF5E5HedVA6X11kaDV);
         var1.println("shadersSSR:" + this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa);
         var1.println("shadersDOF:" + this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6);
         var1.println("shadersAA:" + this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G);
         var1.println("shadersBloom:" + this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl);
         var1.println("shadersMotionBlur:" + this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq);

         for (int var2 = 0; var2 < this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj.length; var2++) {
            var1.println(
               "key_"
                  + this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var2].08YVi0miV0NCq8kgQVB3s086gcHnyy5wG3nCl3UVTdfLPyRbaq0dC2rfhcmD
                  + ":"
                  + this.34tRXH1CjOpAZDme2Q7tU3890o06SsFaei066N64qBqWR0rGbHkXkRF09UTj[var2].7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
            );
         }

         var1.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }
   }

   public String _ZBw6818NpyygSj15g0tevwT2VRNee9iyV3HNltCy7o20mr67D74Di6czF41/* $VF was: 4ZBw6818NpyygSj15g0tevwT2VRNee9iyV3HNltCy7o20mr67D74Di6czF41 */() {
      String var1 = "";
      var1 = var1 + (this.9UX0ZD1i0y7zcXk28p5XF7G1IawPyo5D04YmR388eC1Hn9D60kx7ZdzLF5D6 ? "#define DOF_ENABLED\n" : "");
      var1 = var1 + (this.2PZeKU2XX6DVQr0PddO0LpfaoOdt40powdd99RK1luEfC8ZBvPLza3Nz4hOa ? "#define SSR_ENABLED\n" : "");
      var1 = var1 + (this.9G35Lw0l42u913RwsiJ8b4oED565ckF66eprV7iUb2pWWs1p6q28aT020T9G ? "#define AA_ENABLED\n" : "");
      var1 = var1 + (this.4o1uNoQSrg2YCL3639xyKEbxEX25zI2006R4TI63uHnqbhPYmAy503KepkPl ? "#define BLOOM_ENABLED\n" : "");
      return var1 + "#define MOTIONBLUR_ENABLED " + this.169bjUeR039ZE547KDzev4W9h7Y3Gek7cJSjnnkGJUJ5aJI775p1a4lDV0kq + "\n";
   }
}
