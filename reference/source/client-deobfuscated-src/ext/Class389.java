package ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class389 implements Interface752 {
   private Class741 field_3018;
   private Map<Class619, Class741> field_1654 = new HashMap<>();
   private List<Class741> field_2412 = new ArrayList<>();
   private Class454 field_1072;

   public Class389(Class454 var1) {
      this.field_3018 = new Class741(var1, new byte[32768], 0, 0);
      this.field_3018.field_347 = true;
      this.field_3018.field_109 = true;
      this.field_1072 = var1;
   }

   @Override
   public boolean method_972(int var1, int var2) {
      Class619 var3 = new Class619(var1, var2);
      return this.field_1654.containsKey(var3);
   }

   public void method_1346(int var1, int var2) {
      Class741 var3 = this.method_1337(var1, var2);
      if (!var3.field_347) {
         var3.method_1400();
      }

      this.field_1654.remove(new Class619(var1, var2));
      this.field_2412.remove(var3);
   }

   public Class741 method_1465(int var1, int var2) {
      Class619 var3 = new Class619(var1, var2);
      byte[] var4 = new byte[32768];
      Class741 var5 = new Class741(this.field_1072, var4, var1, var2);
      Arrays.fill(var5.field_1427.field_932, (byte)-1);
      this.field_1654.put(var3, var5);
      var5.field_1851 = true;
      return var5;
   }

   @Override
   public Class741 method_1337(int var1, int var2) {
      Class619 var3 = new Class619(var1, var2);
      Class741 var4 = this.field_1654.get(var3);
      return var4 == null ? this.field_3018 : var4;
   }

   @Override
   public boolean method_762(boolean var1, Interface608 var2) {
      return true;
   }

   @Override
   public boolean method_1225() {
      return false;
   }

   @Override
   public boolean method_1354() {
      return false;
   }

   @Override
   public void method_1834(Interface752 var1, int var2, int var3) {
   }
}
