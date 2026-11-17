package ext;

import java.util.ArrayList;
import java.util.List;

public class Class578 {
   public List<Class139> field_1656 = new ArrayList<>();

   public static Class578 method_208() {
      return new Class578();
   }

   public Class578 method_496(int var1, int var2) {
      this.field_1656.add(new Class139(var1, var2));
      return this;
   }

   public Class578 method_1186(float var1, float var2, float var3, float var4, float var5, float var6, Class140 var7) {
      Class139 var8 = this.field_1656.get(this.field_1656.size() - 1);
      var8.field_2561 = var1;
      var8.field_1358 = var2;
      var8.field_2105 = var3;
      var8.field_2303 = (int)var4;
      var8.field_1978 = (int)var5;
      var8.field_797 = (int)var6;
      return this;
   }

   public Class578 method_71() {
      this.field_1656.get(this.field_1656.size() - 1).field_843 = true;
      return this;
   }

   public Class578 method_1454(boolean var1) {
      this.field_1656.get(this.field_1656.size() - 1).field_843 = var1;
      return this;
   }
}
