package ext;

import java.io.File;

public class Class24 extends Class46 {
   public boolean field_1119 = false;
   public boolean field_865 = true;
   Class54 field_2929 = new Class54(null);
   Class239 field_3092;

   @Override
   public Class326 method_63() {
      return new Class326(-102L, 73L, -56L);
   }

   @Override
   public int method_854() {
      return 21000;
   }

   @Override
   public void method_799(Class354 var1) {
      if ((int)var1.field_1417 == -98 && (int)var1.field_2654 == 76) {
         int var2 = (int)var1.field_2013;
         if (var2 <= -66 && var2 >= -68 && !this.field_1119) {
            if (this.field_2150.nextInt(100) <= 5 || this.field_865) {
               this.method_1447(new Class299(this, this.field_3092));
               this.field_865 = false;
            }

            this.field_1119 = true;
         }
      } else {
         this.field_1119 = false;
      }
   }

   public Class24(File var1, String var2) {
      super(var1, var2);
      this.field_2197.add(new Class654(new Class422(-105, 71, -66, "b1_left"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-103, 71, -70, "b1_center"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-101, 71, -64, "b1_right"), new Class326(0L, -1L, 0L)));
      this.method_1350(new Class326(-107L, 70L, -74L), new Class326(-107L, 73L, -74L));
      this.method_1350(new Class326(-101L, 75L, -66L), new Class326(-106L, 76L, -66L));
      Class100.method_522(this, -99L, 75L, -66L, Class390.field_1505.field_2151);
      Class100.method_522(this, -99L, 76L, -66L, Class390.field_1505.field_2151);
      Class100.method_522(this, -101L, 78L, -61L, Class390.field_1849.field_2151);
      this.field_3092 = Class239.method_1906(new File(var1, var2 + "/zd1.b").getPath());
      this.field_3092.field_198 = "\u0002three";
   }

   @Override
   public void method_330(Class326 var1, int var2) {
      if (var1.field_809 == -101L && var1.field_805 == 78L && var1.field_3039 == -61L) {
         Class100.method_522(this, -99L, 75L, -66L, 0);
         Class100.method_522(this, -99L, 76L, -66L, 0);
         Class100.method_522(this, -101L, 78L, -61L, 0);
         this.method_861(-99.0, 75.0, -66.0, "random.glass", 1.0F, 0.0F);
      }
   }
}
