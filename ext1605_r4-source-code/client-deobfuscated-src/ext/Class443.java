package ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class Class443 {
   protected Class454 field_2786;
   private List<Class45>[] field_2196 = new List[4];
   private Class432 field_1738;
   private Random field_83 = new Random();

   public Class443(Class454 var1, Class432 var2) {
      if (var1 != null) {
         this.field_2786 = var1;
      }

      this.field_1738 = var2;

      for (int var3 = 0; var3 < 4; var3++) {
         this.field_2196[var3] = new ArrayList<>();
      }
   }

   public void method_206(Class45 var1) {
      int var2 = var1.method_1506();
      this.field_2196[var2].add(var1);
   }

   public void method_107() {
      for (int var1 = 0; var1 < 4; var1++) {
         for (int var2 = 0; var2 < this.field_2196[var1].size(); var2++) {
            Class45 var3 = this.field_2196[var1].get(var2);
            var3.method_46();
            if (var3.field_2642) {
               this.field_2196[var1].remove(var2--);
            }
         }
      }
   }

   public void method_42(Class359 var1, float var2) {
      float var3 = Class469.method_255(var1.field_1661 * (float) Math.PI / 180.0F);
      float var4 = Class469.method_1667(var1.field_1661 * (float) Math.PI / 180.0F);
      float var5 = -var4 * Class469.method_1667(var1.field_2866 * (float) Math.PI / 180.0F);
      float var6 = var3 * Class469.method_1667(var1.field_2866 * (float) Math.PI / 180.0F);
      float var7 = Class469.method_255(var1.field_2866 * (float) Math.PI / 180.0F);
      Class45.field_2725 = var1.field_2173 + (var1.field_1417 - var1.field_2173) * var2;
      Class45.field_1939 = var1.field_2270 + (var1.field_2654 - var1.field_2270) * var2;
      Class45.field_1993 = var1.field_1907 + (var1.field_2013 - var1.field_1907) * var2;

      for (int var8 = 0; var8 < 3; var8++) {
         if (this.field_2196[var8].size() != 0) {
            int var9 = 0;
            if (var8 == 0) {
               var9 = this.field_1738.method_1545("/particles.png");
            }

            if (var8 == 1) {
               var9 = this.field_1738.method_1545(Class614.method_1576(Class614.field_1949));
            }

            if (var8 == 2) {
               var9 = this.field_1738.method_1545("/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            Class368 var10 = Class368.field_2696;
            var10.method_186();

            for (int var11 = 0; var11 < this.field_2196[var8].size(); var11++) {
               Class45 var12 = this.field_2196[var8].get(var11);
               var12.method_813(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.method_406();
         }
      }
   }

   public void method_710(Class359 var1, float var2) {
      byte var3 = 3;
      if (this.field_2196[var3].size() != 0) {
         Class368 var4 = Class368.field_2696;

         for (int var5 = 0; var5 < this.field_2196[var3].size(); var5++) {
            Class45 var6 = this.field_2196[var3].get(var5);
            var6.method_813(var4, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         }
      }
   }

   public void method_141(Class454 var1) {
      this.field_2786 = var1;

      for (int var2 = 0; var2 < 4; var2++) {
         this.field_2196[var2].clear();
      }
   }

   public void method_940(int var1, int var2, int var3) {
      int var4 = this.field_2786.method_197(var1, var2, var3);
      if (var4 != 0) {
         Class108 var5 = Class108.field_1221[var4];
         byte var6 = 4;

         for (int var7 = 0; var7 < var6; var7++) {
            for (int var8 = 0; var8 < var6; var8++) {
               for (int var9 = 0; var9 < var6; var9++) {
                  double var10 = var1 + (var7 + 0.5) / var6;
                  double var12 = var2 + (var8 + 0.5) / var6;
                  double var14 = var3 + (var9 + 0.5) / var6;
                  this.method_206(new Class718(this.field_2786, var10, var12, var14, var10 - var1 - 0.5, var12 - var2 - 0.5, var14 - var3 - 0.5, var5));
               }
            }
         }
      }
   }

   public void method_134(int var1, int var2, int var3, int var4) {
      int var5 = this.field_2786.method_197(var1, var2, var3);
      if (var5 != 0) {
         Class108 var6 = Class108.field_1221[var5];
         float var7 = 0.1F;
         double var8 = var1 + this.field_83.nextDouble() * (var6.field_1078 - var6.field_1757 - var7 * 2.0F) + var7 + var6.field_1757;
         double var10 = var2 + this.field_83.nextDouble() * (var6.field_84 - var6.field_2905 - var7 * 2.0F) + var7 + var6.field_2905;
         double var12 = var3 + this.field_83.nextDouble() * (var6.field_1426 - var6.field_1459 - var7 * 2.0F) + var7 + var6.field_1459;
         if (var4 == 0) {
            var10 = var2 + var6.field_2905 - var7;
         }

         if (var4 == 1) {
            var10 = var2 + var6.field_84 + var7;
         }

         if (var4 == 2) {
            var12 = var3 + var6.field_1459 - var7;
         }

         if (var4 == 3) {
            var12 = var3 + var6.field_1426 + var7;
         }

         if (var4 == 4) {
            var8 = var1 + var6.field_1757 - var7;
         }

         if (var4 == 5) {
            var8 = var1 + var6.field_1078 + var7;
         }

         this.method_206(new Class718(this.field_2786, var8, var10, var12, 0.0, 0.0, 0.0, var6).method_1580(0.2F).method_1297(0.6F));
      }
   }

   public String method_1237() {
      return "" + (this.field_2196[0].size() + this.field_2196[1].size() + this.field_2196[2].size());
   }
}
