package ext;

import java.util.HashMap;
import java.util.Map;

public abstract class Class22 {
   public int field_2992;
   protected Class581 field_3061;
   public Map<Integer, Class611> field_1302;
   private int field_1420;
   private int field_2340;
   private int field_369;
   public int field_1180;
   public int field_1606;
   public int field_46;
   protected Class129 field_1732;
   protected Class129 field_565;

   public Class22(Class581 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 16, 16, 5);
   }

   public Class22(Class581 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_3061 = var1;
      this.field_1420 = var2;
      this.field_2340 = var3;
      this.field_369 = var4;
      this.field_1180 = var5;
      this.field_1606 = var6;
      this.field_46 = var7;
      this.field_2992 = 0;
      this.field_1732 = new Class129(32768);
      this.field_565 = new Class129(this.field_1732.field_932.length);
      this.field_1302 = new HashMap<>();
   }

   protected boolean method_145(int var1, int var2, int var3, int var4) {
      if (this.field_3061.method_470(this.field_1420 + var1, this.field_2340 + var2, this.field_369 + var3, var4)) {
         this.field_1732.method_829(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean method_1207(int var1, int var2, int var3, int var4, int var5) {
      if (this.method_145(var1, var2, var3, var4) && this.field_3061.method_1342(this.field_1420 + var1, this.field_2340 + var2, this.field_369 + var3, var5)) {
         this.field_565.method_829(var1, var2, var3, var5);
         return true;
      } else {
         return false;
      }
   }

   protected void method_873(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = var1; var8 <= var4; var8++) {
         for (int var9 = var2; var9 <= var5; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               this.method_145(var8, var9, var10, var7);
            }
         }
      }
   }

   public void method_1470(int var1) {
      if (this.field_2992 != var1) {
         Class129 var2 = this.field_1732;
         byte var3;
         byte var4;
         switch (Math.abs(var1 - this.field_2992)) {
            case 1:
               var3 = 1;
               var4 = 0;
               break;
            case 2:
               var3 = 0;
               var4 = -1;
               break;
            case 3:
               var3 = -1;
               var4 = 0;
               break;
            default:
               var3 = 0;
               var4 = 1;
         }

         for (int var5 = 0; var5 < this.field_1180; var5++) {
            for (int var6 = 0; var6 < this.field_46; var6++) {
               for (int var7 = 0; var7 < this.field_1606; var7++) {
                  this.field_3061.method_470(var5 * var4 - var7 * var3, var6, var5 * var3 + var7 * var4, var2.method_1259(var5, var6, var7));
               }
            }
         }

         this.field_2992 = var1;
      }
   }

   public boolean method_968() {
      for (Class611 var2 : this.field_1302.values()) {
         if (var2.method_956()) {
            return false;
         }
      }

      return true;
   }

   public void method_1452(Class22 var1, int var2) {
      if (this.method_968() && var1.method_968()) {
         if (var1.field_1302.get(Class682.method_908(var2)) != null) {
            this.field_1302.get(var2).field_168 = var1.field_1302.get(Class682.method_908(var2));
            var1.field_1302.get(Class682.method_908(var2)).field_168 = this.field_1302.get(var2);
         }
      }
   }

   public abstract void method_1802();
}
