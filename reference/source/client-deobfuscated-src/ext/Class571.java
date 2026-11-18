package ext;

import java.util.ArrayList;
import java.util.List;

public class Class571 implements Interface295 {
   @Override
   public List<Class326> method_1188(Class454 var1, Class326 var2) {
      ArrayList var3 = new ArrayList();
      Class100.method_1009(var1, var2, var2.method_113(new Class326(5L, 0L, 5L).method_1590(var2.field_1952)), Class390.field_2539.field_2151);
      Class456 var4 = new Class456();
      if (var2.field_1952 != Enum37.field_1604) {
         var3.add(var4.method_1188(var1, var2.method_891(-6L, 0L, 0L).method_1068(Enum37.field_889)).get(0));
      }

      if (var2.field_1952 != Enum37.field_889) {
         var3.add(var4.method_1188(var1, var2.method_891(6L, 0L, 0L).method_1068(Enum37.field_1604)).get(0));
      }

      if (var2.field_1952 != Enum37.field_2401) {
         var3.add(var4.method_1188(var1, var2.method_891(0L, 0L, 6L).method_1068(Enum37.field_1904)).get(0));
      }

      if (var2.field_1952 != Enum37.field_1904) {
         var3.add(var4.method_1188(var1, var2.method_113(new Class326(5L, 0L, -1L).method_1590(var2.field_1952)).method_1068(Enum37.field_2401)).get(0));
      }

      Class100.method_1009(var1, var2, var2, Class390.field_781.field_2151);
      return var3;
   }

   @Override
   public boolean method_80(Class454 var1, Class326 var2) {
      return Class100.method_1509(var1, var2.method_891(0L, 1L, 0L), var2.field_1952, 6);
   }
}
