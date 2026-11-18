package ext;

import java.util.ArrayList;
import org.lwjgl.input.Keyboard;

public class Class202 extends Class708 implements Interface612 {
   public Class202(int var1, int var2, Class160 var3) {
      super(var1, var2, var3, false);
   }

   public void method_1403(Class46 var1, Class326 var2) {
      var1.method_470((int)var2.field_809, (int)var2.field_805, (int)var2.field_3039, 0);

      for (byte var3 = -1; var3 <= 1; var3 += 2) {
         if (var1.method_197((int)var2.field_809 + var3, (int)var2.field_805, (int)var2.field_3039) == this.field_2151) {
            this.method_1403(var1, var2.method_891(var3, 0L, 0L));
         }
      }

      for (byte var4 = -1; var4 <= 1; var4 += 2) {
         if (var1.method_197((int)var2.field_809, (int)var2.field_805 + var4, (int)var2.field_3039) == this.field_2151) {
            this.method_1403(var1, var2.method_891(0L, var4, 0L));
         }
      }

      for (byte var5 = -1; var5 <= 1; var5 += 2) {
         if (var1.method_197((int)var2.field_809, (int)var2.field_805, (int)var2.field_3039 + var5) == this.field_2151) {
            this.method_1403(var1, var2.method_891(0L, 0L, var5));
         }
      }
   }

   @Override
   public void method_527(Class404 var1, Class326 var2) {
      int var3 = var1.field_979.method_1549(var2);
      if (var1.field_2805.method_726() >= var3) {
         var1.field_2805.method_1230(-var3);
         var1.field_2587 = null;
         this.method_1403(var1.field_979, var2);
      } else {
         Class119.field_1519.field_964.method_967("Not enough points!");
      }
   }

   @Override
   public String method_752(Class404 var1, Class326 var2) {
      String var3 = Keyboard.getKeyName(Class119.field_1519.field_1754.field_1301.field_2381);
      return "[" + var3 + "] Open [" + var1.field_979.method_1549(var2) + " points]";
   }

   @Override
   public int method_1809() {
      return 11;
   }

   @Override
   public void method_1368(Class454 var1, int var2, int var3, int var4, Class630 var5, ArrayList<Class630> var6, Class359 var7) {
      if (!(var1 instanceof Class46) || !(var7 instanceof Class191) && !(var7 instanceof Class345)) {
         super.method_1368(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   @Override
   public void method_1332(Class454 var1, int var2, int var3, int var4, Class359 var5, Class214 var6) {
      if (var1 instanceof Class46 && var5 instanceof Class191) {
         var6.field_882 = var6.field_882 + var5.field_2549 * 2.0;
         var6.field_3045 = var6.field_3045 + var5.field_489 * 2.0;
      }
   }
}
