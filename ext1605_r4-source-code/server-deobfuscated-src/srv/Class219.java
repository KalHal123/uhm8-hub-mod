package srv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class219 implements Interface103 {
   private Set field_1245 = new HashSet();
   private Class166 field_1361;
   private Interface103 field_1002;
   private Interface264 field_1377;
   private Map field_1352 = new HashMap();
   private List field_1311 = new ArrayList();
   private Class325 field_43;

   public Class219(Class325 var1, Interface264 var2, Interface103 var3) {
      this.field_1361 = new Class166(var1, new byte[32768], 0, 0);
      this.field_1361.field_1123 = true;
      this.field_1361.field_1145 = true;
      this.field_43 = var1;
      this.field_1377 = var2;
      this.field_1002 = var3;
   }

   @Override
   public boolean method_161(int var1, int var2) {
      Class17 var3 = new Class17(var1, var2);
      return this.field_1352.containsKey(var3);
   }

   public void method_412(int var1, int var2) {
      int var3 = var1 * 16 + 8 - this.field_43.field_944;
      int var4 = var2 * 16 + 8 - this.field_43.field_1535;
      byte var5 = 20;
      if (var3 < -var5 || var3 > var5 || var4 < -var5 || var4 > var5) {
         this.field_1245.add(new Class17(var1, var2));
      }
   }

   public Class166 method_783(int var1, int var2) {
      Class17 var3 = new Class17(var1, var2);
      this.field_1245.remove(new Class17(var1, var2));
      Class166 var4 = (Class166)this.field_1352.get(var3);
      if (var4 == null) {
         var4 = this.method_532(var1, var2);
         if (var4 == null) {
            if (this.field_1002 == null) {
               var4 = this.field_1361;
            } else {
               var4 = this.field_1002.method_986(var1, var2);
            }
         }

         this.field_1352.put(var3, var4);
         this.field_1311.add(var4);
         if (var4 != null) {
            var4.method_46();
         }

         if (!var4.field_559 && this.method_161(var1 + 1, var2 + 1) && this.method_161(var1, var2 + 1) && this.method_161(var1 + 1, var2)) {
            this.method_321(this, var1, var2);
         }

         if (this.method_161(var1 - 1, var2)
            && !this.method_986(var1 - 1, var2).field_559
            && this.method_161(var1 - 1, var2 + 1)
            && this.method_161(var1, var2 + 1)
            && this.method_161(var1 - 1, var2)) {
            this.method_321(this, var1 - 1, var2);
         }

         if (this.method_161(var1, var2 - 1)
            && !this.method_986(var1, var2 - 1).field_559
            && this.method_161(var1 + 1, var2 - 1)
            && this.method_161(var1, var2 - 1)
            && this.method_161(var1 + 1, var2)) {
            this.method_321(this, var1, var2 - 1);
         }

         if (this.method_161(var1 - 1, var2 - 1)
            && !this.method_986(var1 - 1, var2 - 1).field_559
            && this.method_161(var1 - 1, var2 - 1)
            && this.method_161(var1, var2 - 1)
            && this.method_161(var1 - 1, var2)) {
            this.method_321(this, var1 - 1, var2 - 1);
         }
      }

      return var4;
   }

   @Override
   public Class166 method_986(int var1, int var2) {
      Class17 var3 = new Class17(var1, var2);
      Class166 var4 = (Class166)this.field_1352.get(var3);
      return var4 == null ? (this.field_43.field_1006 ? this.method_783(var1, var2) : this.field_1361) : var4;
   }

   private Class166 method_532(int var1, int var2) {
      if (this.field_1377 == null) {
         return null;
      }

      try {
         Class166 var3 = this.field_1377.method_978(this.field_43, var1, var2);
         if (var3 != null) {
            var3.field_27 = this.field_43.field_301;
         }

         return var3;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void method_854(Class166 var1) {
      if (this.field_1377 != null) {
         try {
            this.field_1377.method_737(this.field_43, var1);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }

   private void method_322(Class166 var1) {
      if (this.field_1377 != null) {
         try {
            var1.field_27 = this.field_43.field_301;
            this.field_1377.method_527(this.field_43, var1);
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   @Override
   public void method_321(Interface103 var1, int var2, int var3) {
      Class166 var4 = this.method_986(var2, var3);
      if (!var4.field_559) {
         var4.field_559 = true;
         if (this.field_1002 != null) {
            this.field_1002.method_321(var1, var2, var3);
            var4.method_745();
         }
      }
   }

   @Override
   public boolean method_541(boolean var1, Interface282 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < this.field_1311.size(); var4++) {
         Class166 var5 = (Class166)this.field_1311.get(var4);
         if (var1 && !var5.field_1145) {
            this.method_854(var5);
         }

         if (var5.method_605(var1)) {
            this.method_322(var5);
            var5.field_619 = false;
            if (++var3 == 2 && !var1) {
               return false;
            }
         }
      }

      if (var1) {
         if (this.field_1377 == null) {
            return true;
         }

         this.field_1377.method_798();
      }

      return true;
   }

   @Override
   public boolean method_756() {
      if (!this.field_43.field_1150) {
         for (int var1 = 0; var1 < 16; var1++) {
            if (!this.field_1245.isEmpty()) {
               Class17 var2 = (Class17)this.field_1245.iterator().next();
               Class166 var3 = this.method_986(var2.field_674, var2.field_212);
               var3.method_515();
               this.method_322(var3);
               this.method_854(var3);
               this.field_1245.remove(var2);
               this.field_1352.remove(var2);
               this.field_1311.remove(var3);
            }
         }

         if (this.field_1377 != null) {
            this.field_1377.method_810();
         }
      }

      return this.field_1002.method_756();
   }

   @Override
   public boolean method_845() {
      return !this.field_43.field_1150;
   }
}
