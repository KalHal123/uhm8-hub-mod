import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class kt implements ad {
   private File a;
   private boolean b;

   public kt(File var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   private File a(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.a, var4);
      if (!var6.exists()) {
         if (!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if (!var6.exists()) {
         if (!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.b ? null : var6;
   }

   @Override
   public fr a(cj var1, int var2, int var3) {
      File var4 = this.a(var2, var3);
      if (var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            hc var6 = w.a(var5);
            if (!var6.b("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if (!var6.k("Level").b("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            fr var7 = a(var1, var6.k("Level"));
            if (!var7.a(var2, var3)) {
               System.out
                  .println(
                     "Chunk file at "
                        + var2
                        + ","
                        + var3
                        + " is in the wrong location; relocating. (Expected "
                        + var2
                        + ", "
                        + var3
                        + ", got "
                        + var7.j
                        + ", "
                        + var7.k
                        + ")"
                  );
               var6.a("xPos", var2);
               var6.a("zPos", var3);
               var7 = a(var1, var6.k("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void a(cj var1, fr var2) {
      var1.l();
      File var3 = this.a(var2.j, var2.k);
      if (var3.exists()) {
         var1.s = var1.s - var3.length();
      }

      try {
         File var4 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         hc var6 = new hc();
         hc var7 = new hc();
         var6.a("Level", (ef)var7);
         this.a(var2, var1, var7);
         w.a(var6, var5);
         var5.close();
         if (var3.exists()) {
            var3.delete();
         }

         var4.renameTo(var3);
         var1.s = var1.s + var3.length();
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   public void a(fr var1, cj var2, hc var3) {
      var2.l();
      var3.a("xPos", var1.j);
      var3.a("zPos", var1.k);
      var3.a("LastUpdate", var2.c);
      var3.a("Blocks", var1.b);
      var3.a("Data", var1.e.a);
      var3.a("SkyLight", var1.f.a);
      var3.a("BlockLight", var1.g.a);
      var3.a("HeightMap", var1.h);
      var3.a("TerrainPopulated", var1.n);
      var1.r = false;
      jy var4 = new jy();

      for (int var5 = 0; var5 < var1.m.length; var5++) {
         for (jx var7 : var1.m[var5]) {
            var1.r = true;
            hc var8 = new hc();
            if (var7.c(var8)) {
               var4.a(var8);
            }
         }
      }

      var3.a("Entities", var4);
      jy var9 = new jy();

      for (ht var11 : var1.l.values()) {
         hc var12 = new hc();
         var11.b(var12);
         var9.a(var12);
      }

      var3.a("TileEntities", var9);
   }

   public static fr a(cj var0, hc var1) {
      int var2 = var1.e("xPos");
      int var3 = var1.e("zPos");
      fr var4 = new fr(var0, var2, var3);
      var4.b = var1.j("Blocks");
      var4.e = new mi(var1.j("Data"));
      var4.f = new mi(var1.j("SkyLight"));
      var4.g = new mi(var1.j("BlockLight"));
      var4.h = var1.j("HeightMap");
      var4.n = var1.m("TerrainPopulated");
      if (!var4.e.a()) {
         var4.e = new mi(var4.b.length);
      }

      if (var4.h == null || !var4.f.a()) {
         var4.h = new byte[256];
         var4.f = new mi(var4.b.length);
         var4.c();
      }

      if (!var4.g.a()) {
         var4.g = new mi(var4.b.length);
         var4.a();
      }

      jy var5 = var1.l("Entities");
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.c(); var6++) {
            hc var7 = (hc)var5.a(var6);
            jx var8 = ep.a(var7, var0);
            var4.r = true;
            if (var8 != null) {
               var4.a(var8);
            }
         }
      }

      jy var10 = var1.l("TileEntities");
      if (var10 != null) {
         for (int var11 = 0; var11 < var10.c(); var11++) {
            hc var12 = (hc)var10.a(var11);
            ht var9 = ht.c(var12);
            if (var9 != null) {
               var4.a(var9);
            }
         }
      }

      return var4;
   }

   @Override
   public void a() {
   }

   @Override
   public void b() {
   }

   @Override
   public void b(cj var1, fr var2) {
   }
}
