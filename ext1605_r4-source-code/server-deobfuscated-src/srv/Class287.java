package srv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Class287 implements Interface264 {
   private File field_322;
   private boolean field_1551;

   public Class287(File var1, boolean var2) {
      this.field_322 = var1;
      this.field_1551 = var2;
   }

   private File method_404(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.field_322, var4);
      if (!var6.exists()) {
         if (!this.field_1551) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if (!var6.exists()) {
         if (!this.field_1551) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.field_1551 ? null : var6;
   }

   @Override
   public Class166 method_978(Class317 var1, int var2, int var3) {
      File var4 = this.method_404(var2, var3);
      if (var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            Class100 var6 = Class165.method_562(var5);
            if (!var6.method_717("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if (!var6.method_984("Level").method_717("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            Class166 var7 = method_460(var1, var6.method_984("Level"));
            if (!var7.method_103(var2, var3)) {
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
                        + var7.field_21
                        + ", "
                        + var7.field_393
                        + ")"
                  );
               var6.method_32("xPos", var2);
               var6.method_32("zPos", var3);
               var7 = method_460(var1, var6.method_984("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   @Override
   public void method_527(Class317 var1, Class166 var2) {
      var1.method_73();
      File var3 = this.method_404(var2.field_21, var2.field_393);
      if (var3.exists()) {
         var1.field_1275 = var1.field_1275 - var3.length();
      }

      try {
         File var4 = new File(this.field_322, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         Class100 var6 = new Class100();
         Class100 var7 = new Class100();
         var6.method_280("Level", var7);
         this.method_672(var2, var1, var7);
         Class165.method_734(var6, var5);
         var5.close();
         if (var3.exists()) {
            var3.delete();
         }

         var4.renameTo(var3);
         var1.field_1275 = var1.field_1275 + var3.length();
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   public void method_672(Class166 var1, Class317 var2, Class100 var3) {
      var2.method_73();
      var3.method_32("xPos", var1.field_21);
      var3.method_32("zPos", var1.field_393);
      var3.method_426("LastUpdate", var2.field_301);
      var3.method_462("Blocks", var1.field_663);
      var3.method_462("Data", var1.field_1004.field_223);
      var3.method_462("SkyLight", var1.field_869.field_223);
      var3.method_462("BlockLight", var1.field_776.field_223);
      var3.method_462("HeightMap", var1.field_474);
      var3.method_430("TerrainPopulated", var1.field_559);
      var1.field_1259 = false;
      Class310 var4 = new Class310();

      for (int var7 = 0; var7 < var1.field_540.length; var7++) {
         for (Class252 var8 : var1.field_540[var7]) {
            var1.field_1259 = true;
            Class100 var6 = new Class100();
            if (var8.method_107(var6)) {
               var4.method_162(var6);
            }
         }
      }

      var3.method_280("Entities", var4);
      Class310 var11 = new Class310();

      for (Class66 var12 : var1.field_1060.values()) {
         Class100 var10 = new Class100();
         var12.method_878(var10);
         var11.method_162(var10);
      }

      var3.method_280("TileEntities", var11);
   }

   public static Class166 method_460(Class317 var0, Class100 var1) {
      int var2 = var1.method_159("xPos");
      int var3 = var1.method_159("zPos");
      Class166 var4 = new Class166(var0, var2, var3);
      var4.field_663 = var1.method_5("Blocks");
      var4.field_1004 = new Class245(var1.method_5("Data"));
      var4.field_869 = new Class245(var1.method_5("SkyLight"));
      var4.field_776 = new Class245(var1.method_5("BlockLight"));
      var4.field_474 = var1.method_5("HeightMap");
      var4.field_559 = var1.method_1004("TerrainPopulated");
      if (!var4.field_1004.method_146()) {
         var4.field_1004 = new Class245(var4.field_663.length);
      }

      if (var4.field_474 == null || !var4.field_869.method_146()) {
         var4.field_474 = new byte[256];
         var4.field_869 = new Class245(var4.field_663.length);
         var4.method_297();
      }

      if (!var4.field_776.method_146()) {
         var4.field_776 = new Class245(var4.field_663.length);
         var4.method_1005();
      }

      Class310 var5 = var1.method_836("Entities");
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.method_622(); var6++) {
            Class100 var7 = (Class100)var5.method_542(var6);
            Class252 var8 = Class227.method_603(var7, var0);
            var4.field_1259 = true;
            if (var8 != null) {
               var4.method_155(var8);
            }
         }
      }

      Class310 var10 = var1.method_836("TileEntities");
      if (var10 != null) {
         for (int var11 = 0; var11 < var10.method_622(); var11++) {
            Class100 var12 = (Class100)var10.method_542(var11);
            Class66 var9 = Class66.method_383(var12);
            if (var9 != null) {
               var4.method_72(var9);
            }
         }
      }

      return var4;
   }

   @Override
   public void method_810() {
   }

   @Override
   public void method_798() {
   }

   @Override
   public void method_737(Class317 var1, Class166 var2) {
   }
}
