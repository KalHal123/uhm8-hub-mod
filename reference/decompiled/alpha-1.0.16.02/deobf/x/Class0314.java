package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class0314 implements Class0020 {
   private Class0154 a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private Class0065 d;

   public Class0314(Class0065 var1) {
      this.a = new Class0154(var1, new byte[32768], 0, 0);
      this.a.q = true;
      this.a.p = true;
      this.d = var1;
   }

   @Override
   public boolean a(int var1, int var2) {
      Class0182 var3 = new Class0182(var1, var2);
      return this.b.containsKey(var3);
   }

   public void c(int var1, int var2) {
      Class0154 var3 = this.b(var1, var2);
      if (!var3.q) {
         var3.e();
      }

      this.b.remove(new Class0182(var1, var2));
      this.c.remove(var3);
   }

   public Class0154 d(int var1, int var2) {
      Class0182 var3 = new Class0182(var1, var2);
      byte[] var4 = new byte[32768];
      Class0154 var5 = new Class0154(this.d, var4, var1, var2);
      Arrays.fill(var5.f.a, (byte)-1);
      this.b.put(var3, var5);
      var5.c = true;
      return var5;
   }

   @Override
   public Class0154 b(int var1, int var2) {
      Class0182 var3 = new Class0182(var1, var2);
      Class0154 var4 = (Class0154)this.b.get(var3);
      return var4 == null ? this.a : var4;
   }

   @Override
   public boolean a(boolean var1, Class0360 var2) {
      return true;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public void a(Class0020 var1, int var2, int var3) {
   }
}
