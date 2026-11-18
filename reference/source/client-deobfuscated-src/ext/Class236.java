package ext;

import java.util.ArrayList;
import java.util.List;

public class Class236 {
   private Class454 field_661;
   private int field_472;
   private int field_116;
   private int field_1547;
   private int field_2420;
   private List<Class450> field_1297;
   final Class689 field_1745;

   public Class236(Class689 var1, Class454 var2, int var3, int var4, int var5) {
      this.field_1745 = var1;
      this.field_1297 = new ArrayList<>();
      this.field_661 = var2;
      this.field_472 = var3;
      this.field_116 = var4;
      this.field_1547 = var5;
      this.field_2420 = var2.method_1110(var3, var4, var5);
      this.method_1553();
   }

   private void method_1553() {
      this.field_1297.clear();
      if (this.field_2420 == 0) {
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 - 1));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 + 1));
      } else if (this.field_2420 == 1) {
         this.field_1297.add(new Class450(this.field_472 - 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472 + 1, this.field_116, this.field_1547));
      } else if (this.field_2420 == 2) {
         this.field_1297.add(new Class450(this.field_472 - 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472 + 1, this.field_116 + 1, this.field_1547));
      } else if (this.field_2420 == 3) {
         this.field_1297.add(new Class450(this.field_472 - 1, this.field_116 + 1, this.field_1547));
         this.field_1297.add(new Class450(this.field_472 + 1, this.field_116, this.field_1547));
      } else if (this.field_2420 == 4) {
         this.field_1297.add(new Class450(this.field_472, this.field_116 + 1, this.field_1547 - 1));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 + 1));
      } else if (this.field_2420 == 5) {
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 - 1));
         this.field_1297.add(new Class450(this.field_472, this.field_116 + 1, this.field_1547 + 1));
      } else if (this.field_2420 == 6) {
         this.field_1297.add(new Class450(this.field_472 + 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 + 1));
      } else if (this.field_2420 == 7) {
         this.field_1297.add(new Class450(this.field_472 - 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 + 1));
      } else if (this.field_2420 == 8) {
         this.field_1297.add(new Class450(this.field_472 - 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 - 1));
      } else if (this.field_2420 == 9) {
         this.field_1297.add(new Class450(this.field_472 + 1, this.field_116, this.field_1547));
         this.field_1297.add(new Class450(this.field_472, this.field_116, this.field_1547 - 1));
      }
   }

   private void method_35() {
      for (int var1 = 0; var1 < this.field_1297.size(); var1++) {
         Class236 var2 = this.method_1123(this.field_1297.get(var1));
         if (var2 != null && var2.method_200(this)) {
            this.field_1297.set(var1, new Class450(var2.field_472, var2.field_116, var2.field_1547));
         } else {
            this.field_1297.remove(var1--);
         }
      }
   }

   private boolean method_1653(int var1, int var2, int var3) {
      return this.field_661.method_197(var1, var2, var3) == this.field_1745.field_2151
         ? true
         : (
            this.field_661.method_197(var1, var2 + 1, var3) == this.field_1745.field_2151
               ? true
               : this.field_661.method_197(var1, var2 - 1, var3) == this.field_1745.field_2151
         );
   }

   private Class236 method_1123(Class450 var1) {
      return this.field_661.method_197(var1.field_1865, var1.field_322, var1.field_2359) == this.field_1745.field_2151
         ? new Class236(this.field_1745, this.field_661, var1.field_1865, var1.field_322, var1.field_2359)
         : (
            this.field_661.method_197(var1.field_1865, var1.field_322 + 1, var1.field_2359) == this.field_1745.field_2151
               ? new Class236(this.field_1745, this.field_661, var1.field_1865, var1.field_322 + 1, var1.field_2359)
               : (
                  this.field_661.method_197(var1.field_1865, var1.field_322 - 1, var1.field_2359) == this.field_1745.field_2151
                     ? new Class236(this.field_1745, this.field_661, var1.field_1865, var1.field_322 - 1, var1.field_2359)
                     : null
               )
         );
   }

   private boolean method_200(Class236 var1) {
      for (int var2 = 0; var2 < this.field_1297.size(); var2++) {
         Class450 var3 = this.field_1297.get(var2);
         if (var3.field_1865 == var1.field_472 && var3.field_2359 == var1.field_1547) {
            return true;
         }
      }

      return false;
   }

   private boolean method_920(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field_1297.size(); var4++) {
         Class450 var5 = this.field_1297.get(var4);
         if (var5.field_1865 == var1 && var5.field_2359 == var3) {
            return true;
         }
      }

      return false;
   }

   private int method_1723() {
      int var1 = 0;
      if (this.method_1653(this.field_472, this.field_116, this.field_1547 - 1)) {
         var1++;
      }

      if (this.method_1653(this.field_472, this.field_116, this.field_1547 + 1)) {
         var1++;
      }

      if (this.method_1653(this.field_472 - 1, this.field_116, this.field_1547)) {
         var1++;
      }

      if (this.method_1653(this.field_472 + 1, this.field_116, this.field_1547)) {
         var1++;
      }

      return var1;
   }

   private boolean method_297(Class236 var1) {
      if (this.method_200(var1)) {
         return true;
      }

      if (this.field_1297.size() == 2) {
         return false;
      }

      if (this.field_1297.size() == 0) {
         return true;
      }

      Class450 var2 = this.field_1297.get(0);
      return var1.field_116 == this.field_116 && var2.field_322 == this.field_116 ? true : true;
   }

   private void method_531(Class236 var1) {
      this.field_1297.add(new Class450(var1.field_472, var1.field_116, var1.field_1547));
      boolean var2 = this.method_920(this.field_472, this.field_116, this.field_1547 - 1);
      boolean var3 = this.method_920(this.field_472, this.field_116, this.field_1547 + 1);
      boolean var4 = this.method_920(this.field_472 - 1, this.field_116, this.field_1547);
      boolean var5 = this.method_920(this.field_472 + 1, this.field_116, this.field_1547);
      byte var6 = -1;
      if (var2 || var3) {
         var6 = 0;
      }

      if (var4 || var5) {
         var6 = 1;
      }

      if (var3 && var5 && !var2 && !var4) {
         var6 = 6;
      }

      if (var3 && var4 && !var2 && !var5) {
         var6 = 7;
      }

      if (var2 && var4 && !var3 && !var5) {
         var6 = 8;
      }

      if (var2 && var5 && !var3 && !var4) {
         var6 = 9;
      }

      if (var6 == 0) {
         if (this.field_661.method_197(this.field_472, this.field_116 + 1, this.field_1547 - 1) == this.field_1745.field_2151) {
            var6 = 4;
         }

         if (this.field_661.method_197(this.field_472, this.field_116 + 1, this.field_1547 + 1) == this.field_1745.field_2151) {
            var6 = 5;
         }
      }

      if (var6 == 1) {
         if (this.field_661.method_197(this.field_472 + 1, this.field_116 + 1, this.field_1547) == this.field_1745.field_2151) {
            var6 = 2;
         }

         if (this.field_661.method_197(this.field_472 - 1, this.field_116 + 1, this.field_1547) == this.field_1745.field_2151) {
            var6 = 3;
         }
      }

      if (var6 < 0) {
         var6 = 0;
      }

      this.field_661.method_518(this.field_472, this.field_116, this.field_1547, var6);
   }

   private boolean method_1510(int var1, int var2, int var3) {
      Class236 var4 = this.method_1123(new Class450(var1, var2, var3));
      if (var4 == null) {
         return false;
      }

      var4.method_35();
      return var4.method_297(this);
   }

   public void method_687(boolean var1) {
      boolean var2 = this.method_1510(this.field_472, this.field_116, this.field_1547 - 1);
      boolean var3 = this.method_1510(this.field_472, this.field_116, this.field_1547 + 1);
      boolean var4 = this.method_1510(this.field_472 - 1, this.field_116, this.field_1547);
      boolean var5 = this.method_1510(this.field_472 + 1, this.field_116, this.field_1547);
      byte var6 = -1;
      if ((var2 || var3) && !var4 && !var5) {
         var6 = 0;
      }

      if ((var4 || var5) && !var2 && !var3) {
         var6 = 1;
      }

      if (var3 && var5 && !var2 && !var4) {
         var6 = 6;
      }

      if (var3 && var4 && !var2 && !var5) {
         var6 = 7;
      }

      if (var2 && var4 && !var3 && !var5) {
         var6 = 8;
      }

      if (var2 && var5 && !var3 && !var4) {
         var6 = 9;
      }

      if (var6 == -1) {
         if (var2 || var3) {
            var6 = 0;
         }

         if (var4 || var5) {
            var6 = 1;
         }

         if (var1) {
            if (var3 && var5) {
               var6 = 6;
            }

            if (var4 && var3) {
               var6 = 7;
            }

            if (var5 && var2) {
               var6 = 9;
            }

            if (var2 && var4) {
               var6 = 8;
            }
         } else {
            if (var2 && var4) {
               var6 = 8;
            }

            if (var5 && var2) {
               var6 = 9;
            }

            if (var4 && var3) {
               var6 = 7;
            }

            if (var3 && var5) {
               var6 = 6;
            }
         }
      }

      if (var6 == 0) {
         if (this.field_661.method_197(this.field_472, this.field_116 + 1, this.field_1547 - 1) == this.field_1745.field_2151) {
            var6 = 4;
         }

         if (this.field_661.method_197(this.field_472, this.field_116 + 1, this.field_1547 + 1) == this.field_1745.field_2151) {
            var6 = 5;
         }
      }

      if (var6 == 1) {
         if (this.field_661.method_197(this.field_472 + 1, this.field_116 + 1, this.field_1547) == this.field_1745.field_2151) {
            var6 = 2;
         }

         if (this.field_661.method_197(this.field_472 - 1, this.field_116 + 1, this.field_1547) == this.field_1745.field_2151) {
            var6 = 3;
         }
      }

      if (var6 < 0) {
         var6 = 0;
      }

      this.field_2420 = var6;
      this.method_1553();
      this.field_661.method_518(this.field_472, this.field_116, this.field_1547, var6);

      for (int var7 = 0; var7 < this.field_1297.size(); var7++) {
         Class236 var8 = this.method_1123(this.field_1297.get(var7));
         if (var8 != null) {
            var8.method_35();
            if (var8.method_297(this)) {
               var8.method_531(this);
            }
         }
      }
   }

   public static int method_1658(Class236 var0) {
      return var0.method_1723();
   }
}
