package x;

import java.io.DataInput;
import java.io.DataOutput;
import java.util.HashMap;
import java.util.Map;

public class Class0193 extends Class0115 {
   private Map a = new HashMap();

   @Override
   void a(DataOutput var1) {
      for (Class0115 var3 : this.a.values()) {
         Class0115.a(var3, var1);
      }

      var1.writeByte(0);
   }

   @Override
   void a(DataInput var1) {
      this.a.clear();

      Class0115 var2;
      while ((var2 = Class0115.b(var1)).a() != 0) {
         this.a.put(var2.b(), var2);
      }
   }

   @Override
   public byte a() {
      return 10;
   }

   public void a(String var1, Class0115 var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, new Class0231(var2).a(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, new Class0306(var2).a(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, new Class0222(var2).a(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, new Class0168(var2).a(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, new Class0136(var2).a(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, new Class0278(var2).a(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, new Class0343(var2).a(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, new Class0101(var2).a(var1));
   }

   public void a(String var1, Class0193 var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2 ? 1 : 0));
   }

   public boolean b(String var1) {
      return this.a.containsKey(var1);
   }

   public byte c(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((Class0231)this.a.get(var1)).a;
   }

   public short d(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((Class0306)this.a.get(var1)).a;
   }

   public int e(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((Class0222)this.a.get(var1)).a;
   }

   public long f(String var1) {
      return !this.a.containsKey(var1) ? 0L : ((Class0168)this.a.get(var1)).a;
   }

   public float g(String var1) {
      return !this.a.containsKey(var1) ? 0.0F : ((Class0136)this.a.get(var1)).a;
   }

   public double h(String var1) {
      return !this.a.containsKey(var1) ? 0.0 : ((Class0278)this.a.get(var1)).a;
   }

   public String i(String var1) {
      return !this.a.containsKey(var1) ? "" : ((Class0343)this.a.get(var1)).a;
   }

   public byte[] j(String var1) {
      return !this.a.containsKey(var1) ? new byte[0] : ((Class0101)this.a.get(var1)).a;
   }

   public Class0193 k(String var1) {
      return !this.a.containsKey(var1) ? new Class0193() : (Class0193)this.a.get(var1);
   }

   public Class0269 l(String var1) {
      return !this.a.containsKey(var1) ? new Class0269() : (Class0269)this.a.get(var1);
   }

   public boolean m(String var1) {
      return this.c(var1) != 0;
   }

   @Override
   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
