import java.io.DataInput;
import java.io.DataOutput;
import java.util.HashMap;
import java.util.Map;

public class hc extends ef {
   private Map a = new HashMap();

   @Override
   void a(DataOutput var1) {
      for (ef var3 : this.a.values()) {
         ef.a(var3, var1);
      }

      var1.writeByte(0);
   }

   @Override
   void a(DataInput var1) {
      this.a.clear();

      ef var2;
      while ((var2 = ef.b(var1)).a() != 0) {
         this.a.put(var2.b(), var2);
      }
   }

   @Override
   public byte a() {
      return 10;
   }

   public void a(String var1, ef var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, new in(var2).a(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, new lh(var2).a(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, new ie(var2).a(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, new ge(var2).a(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, new f(var2).a(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, new kg(var2).a(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, new mr(var2).a(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, new ds(var2).a(var1));
   }

   public void a(String var1, hc var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2 ? 1 : 0));
   }

   public boolean b(String var1) {
      return this.a.containsKey(var1);
   }

   public byte c(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((in)this.a.get(var1)).a;
   }

   public short d(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((lh)this.a.get(var1)).a;
   }

   public int e(String var1) {
      return !this.a.containsKey(var1) ? 0 : ((ie)this.a.get(var1)).a;
   }

   public long f(String var1) {
      return !this.a.containsKey(var1) ? 0L : ((ge)this.a.get(var1)).a;
   }

   public float g(String var1) {
      return !this.a.containsKey(var1) ? 0.0F : ((f)this.a.get(var1)).a;
   }

   public double h(String var1) {
      return !this.a.containsKey(var1) ? 0.0 : ((kg)this.a.get(var1)).a;
   }

   public String i(String var1) {
      return !this.a.containsKey(var1) ? "" : ((mr)this.a.get(var1)).a;
   }

   public byte[] j(String var1) {
      return !this.a.containsKey(var1) ? new byte[0] : ((ds)this.a.get(var1)).a;
   }

   public hc k(String var1) {
      return !this.a.containsKey(var1) ? new hc() : (hc)this.a.get(var1);
   }

   public jy l(String var1) {
      return !this.a.containsKey(var1) ? new jy() : (jy)this.a.get(var1);
   }

   public boolean m(String var1) {
      return this.c(var1) != 0;
   }

   @Override
   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
