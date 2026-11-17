package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Class404 extends Class563 {
   public Interface612 field_2587;
   public Class326 field_2801;
   public Class46 field_979;
   private Class422[] field_518 = null;
   public Class301 field_2805;
   public int field_2941 = 0;
   public int field_3005 = -1;
   public int field_222 = 0;

   public void method_952() {
      this.method_244(0.2F, 0.2F);
      this.field_3005 = 100;
      this.field_2572 = 1;
   }

   public Class404(Minecraft var1, Class46 var2, Class277 var3) {
      super(var1, var2, var3);
      this.field_979 = var2;
      Class326 var4 = var2.method_63();
      this.method_172(var4.field_809, var4.field_805, var4.field_3039);
      this.field_559 = this.field_2805 = new Class301(this);

      for (Class334 var8 : var2.field_1041) {
         this.field_2805.method_572(var8.method_376());
      }
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      if (var2 != 0 && this.field_2805.field_1658) {
         var2 /= 2;
         var2 = Math.max(var2, 1);
      }

      if (this.field_3005 < 0) {
         super.method_308(var1, var2);
         this.field_222 = 0;
         if (this.field_2572 <= 0 && this.field_2805.field_2806) {
            this.field_2805.field_2806 = false;
            this.field_2805.field_2134 = false;
            this.field_2805.field_3041 = false;
            this.field_2805.field_1658 = false;
            this.method_952();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_1217(Interface181 var1) {
   }

   @Override
   public void method_1083(Class243 var1) {
   }

   @Override
   public void method_1070() {
   }

   @Override
   public void method_1790(Class38 var1) {
   }

   @Override
   public void method_22() {
      if (this.field_3005 >= 0) {
         this.field_3005--;
         this.field_2549 = this.field_2501 = this.field_489 = 0.0;
         this.field_1347.field_2154 = this.field_1347.field_2082 = 0.0F;
         if (this.field_3005 == -1) {
            this.method_244(1.6F, 1.8F);
            this.field_2572 = 20;
         } else {
            this.field_838 = 0.1F;
            this.method_244(0.2F, 0.2F);
         }

         super.method_1242();
      } else {
         this.field_222++;
         if (this.field_222 > 120) {
            this.field_222 -= 30;
            this.method_1796(1);
         }

         this.field_1999 = !this.field_132;
         this.field_1347.method_534(this);
         if (this.field_1347.field_647 && this.field_663 < 0.2F) {
            this.field_663 = 0.2F;
         }

         if (this.field_1796 > 0) {
            this.field_1796--;
            if (this.field_1796 == 0) {
               this.field_2180.field_2648.method_861(this.field_1417, this.field_2654, this.field_2013, "ext.recharg", 0.6F, 1.0F);
            }
         }

         this.field_132 = Class310.field_521;
         this.method_1239();
         if (Keyboard.isKeyDown(66)) {
            this.field_979.method_135();
         }

         super.method_163();
         if (this.field_132) {
            if (Class119.method_696(Class119.field_1519.field_1754.field_922.field_2381)) {
               this.field_2501 = 1.0;
            } else if (Class119.method_696(Class119.field_1519.field_1754.field_1386.field_2381)) {
               this.field_2501 = -1.0;
            } else {
               this.field_2501 = 0.0;
            }
         }
      }
   }

   @Override
   public void method_126(Minecraft var1) {
      if (Class119.method_696(54)) {
         super.method_126(var1);
      } else {
         this.method_1840();
      }
   }

   public void method_1840() {
      if (this.field_2587 != null) {
         this.field_2587.method_527(this, this.field_2801);
      }
   }
}
