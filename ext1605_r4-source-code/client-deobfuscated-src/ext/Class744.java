package ext;

import java.io.File;
import net.minecraft.client.Minecraft;

public class Class744 extends Class265 {
   protected Class265 field_155;
   protected String field_1237 = "Select world";
   private boolean field_2300 = false;
   public int field_465 = 0;

   public Class744(Class265 var1) {
      this.field_155 = var1;
   }

   public void method_1654() {
      while (this.field_577.size() > 2) {
         this.field_577.remove(2);
      }

      this.field_577.add(new Class279(-3, this.field_2345 / 2 - 160, this.field_562 / 6 + 80, "<"));
      int var1 = this.field_577.size() - 1;
      this.field_577.add(new Class279(-4, this.field_2345 / 2 + 110, this.field_562 / 6 + 80, ">"));
      if (this.field_465 == 0) {
         this.field_577.get(var1).field_143 = false;
      }

      File var2 = Minecraft.method_1379();

      for (int var3 = this.field_465; var3 < this.field_465 + 5; var3++) {
         Class686 var4 = Class454.method_763(var2, "World" + (var3 + 1));
         int var5 = var3 - this.field_465;
         if (var4 == null) {
            this.field_577.add(new Class423(var3, this.field_2345 / 2 - 100, this.field_562 / 6 + 24 * var5, "- empty [World " + (var3 + 1) + "] -"));
         } else {
            File var6 = new File(var2, "/saves/World" + (var3 + 1) + "/excl_frail");
            boolean var7 = var6.exists();
            String var8 = "World " + (var3 + 1) + (var7 ? "¬" : "");
            long var9 = var4.method_328("SizeOnDisk");
            var8 = var8 + " (" + (float)(var9 / 1024L * 100L / 1024L) / 100.0F + " MB)";
            this.field_577
               .add(
                  new Class423(var3, this.field_2345 / 2 - 100, this.field_562 / 6 + 24 * var5, var8)
                     .method_1437(var7 ? 16728128 : 16777120, var7 ? 16552080 : 14737632)
               );
         }
      }
   }

   @Override
   public void method_836() {
      this.field_577.clear();
      this.method_641();
      this.method_1654();
   }

   protected String method_475(int var1) {
      File var2 = Minecraft.method_1379();
      return Class454.method_763(var2, "World" + var1) != null ? "World" + var1 : null;
   }

   public void method_641() {
      this.field_577.add(new Class423(-1, this.field_2345 / 2 - 100, this.field_562 / 6 + 120 + 12, "Delete world..."));
      this.field_577.add(new Class423(-2, this.field_2345 / 2 - 100, this.field_562 / 6 + 168, "Cancel"));
   }

   @Override
   protected void method_1445(Class423 var1) {
      if (var1.field_143) {
         if (var1.field_2254 > -1) {
            this.method_1144(var1.field_2254 + 1);
         } else if (var1.field_2254 == -1) {
            this.field_3013.method_1290(new Class671(this));
         } else if (var1.field_2254 == -2) {
            this.field_3013.method_1290(this.field_155);
         } else if (var1.field_2254 == -3) {
            if (this.field_465 != 0) {
               this.field_465 -= 5;
               this.method_1654();
            }
         } else if (var1.field_2254 == -4) {
            this.field_465 += 5;
            this.method_1654();
         }
      }
   }

   public void method_1144(int var1) {
      this.field_3013.method_1290((Class265)null);
      if (!this.field_2300) {
         this.field_2300 = true;
         this.field_3013.field_3103 = new Class420(this.field_3013);
         this.field_3013.method_715("World" + var1);
         this.field_3013.method_1290((Class265)null);
      }
   }

   @Override
   public void method_1938(int var1, int var2, float var3) {
      this.method_1076();
      this.method_1491(this.field_1683, this.field_1237, this.field_2345 / 2, 20, 16777215);
      super.method_1938(var1, var2, var3);
   }
}
