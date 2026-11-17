package ext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Class192 extends Class454 {
   private LinkedList<Class47> field_3009 = new LinkedList<>();
   private Class348 field_1894;
   private Class389 field_1856;
   private boolean field_1013 = false;
   private Class738 field_555 = new Class738();
   private Set<Class359> field_277 = new HashSet<>();
   private Set<Class359> field_2815 = new HashSet<>();
   public List<Class723> field_2586 = new ArrayList<>();

   public Class477 method_1483() {
      return (Class477)this.field_453;
   }

   public Class192(Class348 var1) {
      super("MpServer");
      this.field_453 = new Class477();
      this.field_1894 = var1;
      this.field_18 = 8;
      this.field_934 = 64;
      this.field_1361 = 8;
   }

   @Override
   public void method_1832() {
      this.field_2075++;
      int var1 = this.method_235(1.0F);
      if (var1 != this.field_2704) {
         this.field_2704 = var1;

         for (int var2 = 0; var2 < this.field_1339.size(); var2++) {
            this.field_1339.get(var2).method_1693();
         }
      }

      this.method_505();
      Class119.field_139.method_1533();

      for (int var4 = 0; var4 < 10 && !this.field_2815.isEmpty(); var4++) {
         Class359 var3 = this.field_2815.iterator().next();
         this.method_1447(var3);
      }

      this.field_1894.method_458();

      for (int var5 = 0; var5 < this.field_3009.size(); var5++) {
         Class47 var6 = this.field_3009.get(var5);
         if (--var6.field_552 == 0) {
            super.method_307(var6.field_1920, var6.field_1418, var6.field_75, var6.field_779, var6.field_852);
            super.method_892(var6.field_1920, var6.field_1418, var6.field_75);
            this.field_3009.remove(var5--);
         }
      }
   }

   public void method_560(Class723 var1) {
   }

   public void method_1925(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = 0; var7 < this.field_3009.size(); var7++) {
         Class47 var8 = this.field_3009.get(var7);
         if (var8.field_1920 >= var1
            && var8.field_1418 >= var2
            && var8.field_75 >= var3
            && var8.field_1920 <= var4
            && var8.field_1418 <= var5
            && var8.field_75 <= var6) {
            this.field_3009.remove(var7--);
         }
      }
   }

   @Override
   protected Interface752 method_1226(File var1) {
      this.field_1856 = new Class389(this);
      return this.field_1856;
   }

   @Override
   public void method_1657() {
      this.field_18 = 8;
      this.field_934 = 64;
      this.field_1361 = 8;
   }

   @Override
   protected void method_478() {
   }

   @Override
   public void method_600(int var1, int var2, int var3, int var4) {
   }

   @Override
   public boolean method_742(boolean var1) {
      return false;
   }

   public void method_1613(int var1, int var2, boolean var3, float[] var4) {
      if (var3) {
         this.field_1856.method_1465(var1, var2);
         this.method_1483().method_1546(new Class475(var1, var2), var4);
      } else {
         this.field_1856.method_1346(var1, var2);
         this.method_1483().method_664(new Class475(var1, var2));
      }

      if (!var3) {
         this.method_1678(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 128, var2 * 16 + 15);
      }
   }

   @Override
   public boolean method_1447(Class359 var1) {
      boolean var2 = super.method_1447(var1);
      if (var1 instanceof Class563) {
         this.field_277.add(var1);
      }

      return var2;
   }

   @Override
   public void method_623(Class359 var1) {
      super.method_623(var1);
      if (var1 instanceof Class563) {
         this.field_277.remove(var1);
      }
   }

   @Override
   protected void method_1503(Class359 var1) {
      super.method_1503(var1);
      if (this.field_2815.contains(var1)) {
         this.field_2815.remove(var1);
      }
   }

   @Override
   protected void method_1432(Class359 var1) {
      super.method_1432(var1);
      if (this.field_277.contains(var1)) {
         this.field_2815.add(var1);
      }
   }

   public void method_264(int var1, Class359 var2) {
      this.field_277.add(var2);
      if (!this.method_1447(var2)) {
         this.field_2815.add(var2);
      }

      this.field_555.method_1539(var1, var2);
   }

   public Class359 method_1094(int var1) {
      return (Class359)this.field_555.method_911(var1);
   }

   public Class359 method_484(int var1) {
      Class359 var2 = (Class359)this.field_555.method_797(var1);
      if (var2 != null) {
         this.field_277.remove(var2);
         this.method_623(var2);
      }

      return var2;
   }

   @Override
   public boolean method_1342(int var1, int var2, int var3, int var4) {
      int var5 = this.method_197(var1, var2, var3);
      int var6 = this.method_1110(var1, var2, var3);
      if (super.method_1342(var1, var2, var3, var4)) {
         this.field_3009.add(new Class47(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_307(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.method_197(var1, var2, var3);
      int var7 = this.method_1110(var1, var2, var3);
      if (super.method_307(var1, var2, var3, var4, var5)) {
         this.field_3009.add(new Class47(this, var1, var2, var3, var6, var7));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_470(int var1, int var2, int var3, int var4) {
      int var5 = this.method_197(var1, var2, var3);
      int var6 = this.method_1110(var1, var2, var3);
      if (super.method_470(var1, var2, var3, var4)) {
         this.field_3009.add(new Class47(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean method_733(int var1, int var2, int var3, int var4, int var5) {
      this.method_1925(var1, var2, var3, var1, var2, var3);
      if (super.method_307(var1, var2, var3, var4, var5)) {
         this.method_1890(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_299(int var1, int var2, int var3, Class186 var4) {
      if (!this.field_1013) {
         this.field_1894.method_1519(new Class152(var1, var2, var3, var4));
      }
   }

   @Override
   public void method_1133() {
      this.field_1894.method_1519(new Class300("Quitting"));
   }
}
