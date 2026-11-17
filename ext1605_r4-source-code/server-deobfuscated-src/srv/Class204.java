package srv;

import java.util.ArrayList;
import java.util.List;

class Class204 {
   private Class317 field_468;
   private int field_1039;
   private int field_1426;
   private int field_411;
   private int field_1016;
   private List field_1466;
   final Class9 field_1167;

   public Class204(Class9 var1, Class317 var2, int var3, int var4, int var5) {
      this.field_1167 = var1;
      this.field_1466 = new ArrayList();
      this.field_468 = var2;
      this.field_1039 = var3;
      this.field_1426 = var4;
      this.field_411 = var5;
      this.field_1016 = var2.method_929(var3, var4, var5);
      this.method_243();
   }

   private void method_243() {
      this.field_1466.clear();
      if (this.field_1016 == 0) {
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 - 1));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 + 1));
      } else if (this.field_1016 == 1) {
         this.field_1466.add(new Class89(this.field_1039 - 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039 + 1, this.field_1426, this.field_411));
      } else if (this.field_1016 == 2) {
         this.field_1466.add(new Class89(this.field_1039 - 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039 + 1, this.field_1426 + 1, this.field_411));
      } else if (this.field_1016 == 3) {
         this.field_1466.add(new Class89(this.field_1039 - 1, this.field_1426 + 1, this.field_411));
         this.field_1466.add(new Class89(this.field_1039 + 1, this.field_1426, this.field_411));
      } else if (this.field_1016 == 4) {
         this.field_1466.add(new Class89(this.field_1039, this.field_1426 + 1, this.field_411 - 1));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 + 1));
      } else if (this.field_1016 == 5) {
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 - 1));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426 + 1, this.field_411 + 1));
      } else if (this.field_1016 == 6) {
         this.field_1466.add(new Class89(this.field_1039 + 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 + 1));
      } else if (this.field_1016 == 7) {
         this.field_1466.add(new Class89(this.field_1039 - 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 + 1));
      } else if (this.field_1016 == 8) {
         this.field_1466.add(new Class89(this.field_1039 - 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 - 1));
      } else if (this.field_1016 == 9) {
         this.field_1466.add(new Class89(this.field_1039 + 1, this.field_1426, this.field_411));
         this.field_1466.add(new Class89(this.field_1039, this.field_1426, this.field_411 - 1));
      }
   }

   private void method_994() {
      for (int var1 = 0; var1 < this.field_1466.size(); var1++) {
         Class204 var2 = this.method_295((Class89)this.field_1466.get(var1));
         if (var2 != null && var2.method_174(this)) {
            this.field_1466.set(var1, new Class89(var2.field_1039, var2.field_1426, var2.field_411));
         } else {
            this.field_1466.remove(var1--);
         }
      }
   }

   private boolean method_56(int var1, int var2, int var3) {
      return this.field_468.method_813(var1, var2, var3) == this.field_1167.field_1379
         ? true
         : (
            this.field_468.method_813(var1, var2 + 1, var3) == this.field_1167.field_1379
               ? true
               : this.field_468.method_813(var1, var2 - 1, var3) == this.field_1167.field_1379
         );
   }

   private Class204 method_295(Class89 var1) {
      return this.field_468.method_813(var1.field_339, var1.field_613, var1.field_1218) == this.field_1167.field_1379
         ? new Class204(this.field_1167, this.field_468, var1.field_339, var1.field_613, var1.field_1218)
         : (
            this.field_468.method_813(var1.field_339, var1.field_613 + 1, var1.field_1218) == this.field_1167.field_1379
               ? new Class204(this.field_1167, this.field_468, var1.field_339, var1.field_613 + 1, var1.field_1218)
               : (
                  this.field_468.method_813(var1.field_339, var1.field_613 - 1, var1.field_1218) == this.field_1167.field_1379
                     ? new Class204(this.field_1167, this.field_468, var1.field_339, var1.field_613 - 1, var1.field_1218)
                     : null
               )
         );
   }

   private boolean method_174(Class204 var1) {
      for (int var2 = 0; var2 < this.field_1466.size(); var2++) {
         Class89 var3 = (Class89)this.field_1466.get(var2);
         if (var3.field_339 == var1.field_1039 && var3.field_1218 == var1.field_411) {
            return true;
         }
      }

      return false;
   }

   private boolean method_121(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.field_1466.size(); var4++) {
         Class89 var5 = (Class89)this.field_1466.get(var4);
         if (var5.field_339 == var1 && var5.field_1218 == var3) {
            return true;
         }
      }

      return false;
   }

   private int method_564() {
      int var1 = 0;
      if (this.method_56(this.field_1039, this.field_1426, this.field_411 - 1)) {
         var1++;
      }

      if (this.method_56(this.field_1039, this.field_1426, this.field_411 + 1)) {
         var1++;
      }

      if (this.method_56(this.field_1039 - 1, this.field_1426, this.field_411)) {
         var1++;
      }

      if (this.method_56(this.field_1039 + 1, this.field_1426, this.field_411)) {
         var1++;
      }

      return var1;
   }

   private boolean method_366(Class204 var1) {
      if (this.method_174(var1)) {
         return true;
      }

      if (this.field_1466.size() == 2) {
         return false;
      }

      if (this.field_1466.size() == 0) {
         return true;
      }

      Class89 var2 = (Class89)this.field_1466.get(0);
      return var1.field_1426 == this.field_1426 && var2.field_613 == this.field_1426 ? true : true;
   }

   private void method_454(Class204 var1) {
      this.field_1466.add(new Class89(var1.field_1039, var1.field_1426, var1.field_411));
      boolean var2 = this.method_121(this.field_1039, this.field_1426, this.field_411 - 1);
      boolean var3 = this.method_121(this.field_1039, this.field_1426, this.field_411 + 1);
      boolean var4 = this.method_121(this.field_1039 - 1, this.field_1426, this.field_411);
      boolean var5 = this.method_121(this.field_1039 + 1, this.field_1426, this.field_411);
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
         if (this.field_468.method_813(this.field_1039, this.field_1426 + 1, this.field_411 - 1) == this.field_1167.field_1379) {
            var6 = 4;
         }

         if (this.field_468.method_813(this.field_1039, this.field_1426 + 1, this.field_411 + 1) == this.field_1167.field_1379) {
            var6 = 5;
         }
      }

      if (var6 == 1) {
         if (this.field_468.method_813(this.field_1039 + 1, this.field_1426 + 1, this.field_411) == this.field_1167.field_1379) {
            var6 = 2;
         }

         if (this.field_468.method_813(this.field_1039 - 1, this.field_1426 + 1, this.field_411) == this.field_1167.field_1379) {
            var6 = 3;
         }
      }

      if (var6 < 0) {
         var6 = 0;
      }

      this.field_468.method_489(this.field_1039, this.field_1426, this.field_411, var6);
   }

   private boolean method_883(int var1, int var2, int var3) {
      Class204 var4 = this.method_295(new Class89(var1, var2, var3));
      if (var4 == null) {
         return false;
      }

      var4.method_994();
      return var4.method_366(this);
   }

   public void method_817(boolean var1) {
      boolean var2 = this.method_883(this.field_1039, this.field_1426, this.field_411 - 1);
      boolean var3 = this.method_883(this.field_1039, this.field_1426, this.field_411 + 1);
      boolean var4 = this.method_883(this.field_1039 - 1, this.field_1426, this.field_411);
      boolean var5 = this.method_883(this.field_1039 + 1, this.field_1426, this.field_411);
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
         if (this.field_468.method_813(this.field_1039, this.field_1426 + 1, this.field_411 - 1) == this.field_1167.field_1379) {
            var6 = 4;
         }

         if (this.field_468.method_813(this.field_1039, this.field_1426 + 1, this.field_411 + 1) == this.field_1167.field_1379) {
            var6 = 5;
         }
      }

      if (var6 == 1) {
         if (this.field_468.method_813(this.field_1039 + 1, this.field_1426 + 1, this.field_411) == this.field_1167.field_1379) {
            var6 = 2;
         }

         if (this.field_468.method_813(this.field_1039 - 1, this.field_1426 + 1, this.field_411) == this.field_1167.field_1379) {
            var6 = 3;
         }
      }

      if (var6 < 0) {
         var6 = 0;
      }

      this.field_1016 = var6;
      this.method_243();
      this.field_468.method_489(this.field_1039, this.field_1426, this.field_411, var6);

      for (int var7 = 0; var7 < this.field_1466.size(); var7++) {
         Class204 var8 = this.method_295((Class89)this.field_1466.get(var7));
         if (var8 != null) {
            var8.method_994();
            if (var8.method_366(this)) {
               var8.method_454(this);
            }
         }
      }
   }

   static int method_962(Class204 var0) {
      return var0.method_564();
   }
}
