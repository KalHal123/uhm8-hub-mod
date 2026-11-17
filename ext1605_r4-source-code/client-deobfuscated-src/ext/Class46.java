package ext;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class46 extends Class454 {
   public boolean field_348 = true;
   public Class334[] field_1041 = new Class334[]{new Class334(Class50.field_41, 1), new Class334(Class755.field_542)};
   public List<Class654> field_2197 = new ArrayList<>();
   public long field_2910 = 0L;
   public int field_2530 = 1;
   public long field_250 = 0L;
   public int field_1152 = 12;
   public int field_3069 = 0;
   public int field_120 = 0;
   public int field_1370 = 80;
   public List<Class191> field_2027 = new ArrayList<>();

   public Class46(File var1, String var2) {
      super(var1, var2);
   }

   public Class326 method_63() {
      return new Class326(-173L, 66L, 123L);
   }

   public int method_854() {
      return 22500;
   }

   @Override
   public void method_345(boolean var1, Interface608 var2) {
   }

   public void method_135() {
   }

   @Override
   public void method_1832() {
      super.method_1832();
      this.field_2075 = this.method_854();
      this.field_2910++;
      ArrayList var1 = new ArrayList<>(this.field_582);

      for (int var2 = 0; var2 != var1.size(); var2++) {
         Class359 var3 = (Class359)var1.get(var2);
         if (var3 instanceof Class377 && !(var3 instanceof Class354) && !this.field_2027.contains(var3)) {
            ((Class377)var3).method_1594();
         }
      }

      if (this.field_2910 - this.field_250 > 80L && this.field_3069 < this.field_1152 && this.field_3069 - this.field_120 < this.field_1370) {
         this.method_1232();
      }

      if (this.field_1152 == this.field_120) {
         this.field_120 = 0;
         this.field_3069 = 0;
         this.field_1152 = (int)(this.field_1152 * (1.2F * this.field_2530));
         this.field_250 = this.field_2910;
         Class119.field_1519.field_813.field_2520.method_872(this, this.field_2530);
         this.field_2530++;
      }

      for (int var4 = 0; var4 != this.field_2027.size(); var4++) {
         Class191 var5 = this.field_2027.get(var4);
         if (var5.field_2642 && !var5.field_480) {
            this.field_2027.remove(var4);
            var4--;
            this.method_1232();
            this.field_3069--;
         }
      }
   }

   @Override
   public boolean method_1131() {
      return false;
   }

   public Class654 method_1919(boolean var1) {
      ArrayList var2 = new ArrayList();
      Class563 var3 = Class119.field_1519.field_2787;
      final Class447 var4 = new Class447(var3.field_1417, var3.field_2654, var3.field_2013);

      for (Class654 var6 : this.field_2197) {
         Class447 var7 = var6.field_1991.method_566();
         double var8 = var4.method_1402(var7.field_74, var7.field_2370);
         if (var8 < 48.0 || var1) {
            var2.add(var6);
         }
      }

      Collections.sort(var2, new Comparator<Class654>() {
         public int method_1190(Class654 var1, Class654 var2x) {
            Class447 var3x = var1.field_1991.method_566();
            Class447 var4x = var2x.field_1991.method_566();
            return Double.valueOf(var4.method_1402(var3x.field_74, var3x.field_2370)).compareTo(var4.method_1402(var4x.field_74, var4x.field_2370));
         }
      });
      return var2.size() == 0 ? null : (var2.size() == 1 ? (Class654)var2.get(0) : (Class654)var2.get(this.field_2150.nextInt(Math.min(var2.size(), 3))));
   }

   public boolean method_87(Class191 var1) {
      Class654 var2 = this.method_1919(true);
      if (var2 != null) {
         var1.field_1591 = var2.field_1991.method_566();
         var1.method_172(var2.field_1991.field_1944, var2.field_1991.field_2246 + 1.0, var2.field_1991.field_479);
         var1.field_1213 = var2.field_2580;
         return true;
      } else {
         return false;
      }
   }

   public void method_1232() {
      Class654 var1 = this.method_1919(false);
      if (var1 != null) {
         Class191 var2 = new Class191(this, var1.field_1991.method_566());
         var2.method_172(var1.field_1991.field_1944, var1.field_1991.field_2246 + 0.5, var1.field_1991.field_479);
         this.method_1447(var2);
         var2.field_1487 = this.field_70.get(0);
         this.field_3069++;
         this.field_2027.add(var2);
      }
   }

   public int method_280(Enum90 var1) {
      switch (var1) {
         case field_791:
            return 1500;
         case field_1800:
            return 7500;
         case field_2125:
            return 2500;
         case field_396:
            return 600;
         default:
            return 1;
      }
   }

   public void method_28(Class191 var1) {
      this.field_120++;
      this.field_2027.remove(var1);
   }

   public int method_1549(Class326 var1) {
      Class326 var2 = this.method_63();
      return Math.max((int)(var1.method_503().method_1402(var2.field_809, var2.field_3039) / 10.0) * 250, 250);
   }

   public void method_1350(Class326 var1, Class326 var2) {
      Class100.method_838(this, var1, var2, 0, Class390.field_2413.field_2151);
   }

   public void method_330(Class326 var1, int var2) {
   }

   public void method_799(Class354 var1) {
   }
}
