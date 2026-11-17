package ext;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Class213 extends Class563 {
   public Class262 field_1809;
   private int field_2115 = 0;
   private Class422[] field_3079 = null;
   public long field_2625 = 1L;
   public boolean field_1473 = false;
   public long field_497 = 0L;
   private boolean field_49 = false;
   public Class54 field_2012 = new Class54(this);
   public Class239 field_428 = null;
   public long field_2235 = -1L;

   public Class213(Minecraft var1, Class262 var2, Class277 var3) {
      super(var1, var2, var3);
      this.field_1809 = var2;
      this.field_3079 = var2.method_1406();
   }

   @Override
   public boolean method_308(Class359 var1, int var2) {
      return true;
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

   public void method_549() {
      Class422 var1 = this.field_3079[0];
      this.method_172(var1.field_1944, var1.field_2246, var1.field_479);
      this.field_2115 = 0;
      this.field_1473 = false;
      Class119.field_1519.field_964.method_967("Reset");
      this.field_2012.method_1740();
      this.field_2012.method_1045(this.field_1809);
   }

   public void method_95() {
      this.field_1439 = 0;
      this.field_2549 = this.field_2501 = this.field_489 = 0.0;
      if (this.field_2115 > -1) {
         Class422 var1 = this.field_3079[this.field_2115];
         if (var1.field_2839) {
            this.method_172(var1.field_1944, var1.field_2246 + 1, var1.field_479);
         } else {
            this.method_172((var1.field_1944 + var1.field_1230) / 2, Math.min(var1.field_2246, var1.field_165) + 1, (var1.field_479 + var1.field_1226) / 2);
         }

         Class119.field_1519.field_964.method_967("Restarting last checkpoint");
      }
   }

   @Override
   public void method_22() {
      this.field_2012.method_1533();
      if (!this.field_49) {
         for (int var1 = 0; var1 != this.field_559.field_1518.length; var1++) {
            this.field_559.field_1518[var1] = null;
         }

         this.method_549();
         this.field_49 = true;
      }

      if (this.field_2654 < this.field_1809.method_714((long)this.field_1417, (long)this.field_2013) || this.method_1059() || this.field_1804 < 0) {
         this.field_1804 = this.field_2004;
         this.method_95();
      }

      if (this.field_3079 != null && this.field_2115 < this.field_3079.length - 1) {
         Class422 var8 = this.field_3079[this.field_2115 + 1];
         int var2 = Math.min(var8.field_1944, var8.field_1230);
         int var3 = Math.min(var8.field_2246, var8.field_165);
         int var4 = Math.min(var8.field_479, var8.field_1226);
         int var5 = Math.max(var8.field_1944, var8.field_1230);
         int var6 = Math.max(var8.field_2246, var8.field_165);
         int var7 = Math.max(var8.field_479, var8.field_1226);
         if (Keyboard.isKeyDown(54)) {
            Class597.method_883(var2 + " > " + this.field_1417 + " > " + var5);
            Class597.method_883(var3 + " > " + this.field_2654 + " > " + var6);
            Class597.method_883(var4 + " > " + this.field_2013 + " > " + var7);
         }

         if ((int)this.field_1417 >= var2
            && (int)this.field_1417 <= var5
            && (int)this.field_2654 >= var3
            && (int)this.field_2654 <= var6
            && (int)this.field_2013 >= var4
            && (int)this.field_2013 <= var7) {
            this.field_2115++;
            if (this.field_2115 != this.field_3079.length - 1) {
               Class119.field_1519.field_964.method_967("Checkpoint " + this.field_2115 + " reached");
            } else {
               Class119.field_1519.field_964.method_967("Finish! Press PAUSEBREAK to restart.");
               this.field_2012.method_1740();
               this.field_2012.method_1045(this.field_1809);
               this.field_1473 = false;
               this.field_497 = this.field_1809.field_2075 - this.field_2625;
               if (this.field_2235 == -1L || this.field_497 < this.field_2235) {
                  this.field_2235 = this.field_497;
                  this.field_428 = this.field_2012.method_1869();
                  this.field_428.field_198 = this.field_1716;
               }

               Class119.field_1519.field_813.field_2170.method_872(this.field_1809, this.field_497);
               Class119.field_1519.field_813.field_1481.method_872(this.field_1809, this.field_497);
               Class119.field_1519.field_813.field_176.method_872(this.field_1809, this.field_497);
            }

            if (this.field_2115 == 1) {
               this.field_1473 = true;
               if (this.field_428 != null) {
                  this.field_2012.method_272(this.field_428);
               }

               this.field_2012.method_252(this);
               this.field_2625 = this.field_1809.field_2075;
            }
         }
      }

      if (Class119.method_696(15)) {
         this.method_95();
      } else if (Class119.method_696(197)) {
         this.method_549();
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

   @Override
   public void method_126(Minecraft var1) {
      if (Class119.method_696(54)) {
         super.method_126(var1);
      }
   }
}
