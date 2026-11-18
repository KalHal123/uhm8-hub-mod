package ext;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Class686 extends Class16 {
   private Map<String, Class16> field_1416 = new HashMap<>();

   @Override
   void method_1446(DataOutput var1) throws IOException {
      for (Class16 var3 : this.field_1416.values()) {
         Class16.method_1408(var3, var1);
      }

      var1.writeByte(0);
   }

   @Override
   void method_1800(DataInput var1) throws IOException {
      this.field_1416.clear();

      Class16 var2;
      while ((var2 = Class16.method_1064(var1)).method_758() != 0) {
         this.field_1416.put(var2.method_352(), var2);
      }
   }

   public Collection<Class16> method_1442() {
      return this.field_1416.values();
   }

   @Override
   public byte method_758() {
      return 10;
   }

   public void method_936(String var1, Class16 var2) {
      this.field_1416.put(var1, var2.method_1280(var1));
   }

   public void method_1567(String var1, byte var2) {
      this.field_1416.put(var1, new Class588(var2).method_1280(var1));
   }

   public void method_777(String var1, short var2) {
      this.field_1416.put(var1, new Class539(var2).method_1280(var1));
   }

   public void method_1310(String var1, int var2) {
      this.field_1416.put(var1, new Class472(var2).method_1280(var1));
   }

   public void method_1647(String var1, long var2) {
      this.field_1416.put(var1, new Class461(var2).method_1280(var1));
   }

   public void method_1598(String var1, float var2) {
      this.field_1416.put(var1, new Class27(var2).method_1280(var1));
   }

   public void method_760(String var1, double var2) {
      this.field_1416.put(var1, new Class153(var2).method_1280(var1));
   }

   public void method_375(String var1, String var2) {
      this.field_1416.put(var1, new Class403(var2).method_1280(var1));
   }

   public void method_1602(String var1, byte[] var2) {
      this.field_1416.put(var1, new Class303(var2).method_1280(var1));
   }

   public void method_257(String var1, Class686 var2) {
      this.field_1416.put(var1, var2.method_1280(var1));
   }

   public void method_698(String var1, boolean var2) {
      this.method_1567(var1, (byte)(var2 ? 1 : 0));
   }

   public boolean method_1838(String var1) {
      return this.field_1416.containsKey(var1);
   }

   public byte method_1913(String var1) {
      return !this.field_1416.containsKey(var1) ? 0 : ((Class588)this.field_1416.get(var1)).field_193;
   }

   public short method_1321(String var1) {
      return !this.field_1416.containsKey(var1) ? 0 : ((Class539)this.field_1416.get(var1)).field_1485;
   }

   public int method_1747(String var1) {
      return !this.field_1416.containsKey(var1) ? 0 : ((Class472)this.field_1416.get(var1)).field_2493;
   }

   public long method_328(String var1) {
      return !this.field_1416.containsKey(var1) ? 0L : ((Class461)this.field_1416.get(var1)).field_2399;
   }

   public float method_124(String var1) {
      return !this.field_1416.containsKey(var1) ? 0.0F : ((Class27)this.field_1416.get(var1)).field_2440;
   }

   public double method_1417(String var1) {
      return !this.field_1416.containsKey(var1) ? 0.0 : ((Class153)this.field_1416.get(var1)).field_818;
   }

   public String method_1087(String var1) {
      return !this.field_1416.containsKey(var1) ? "" : ((Class403)this.field_1416.get(var1)).field_549;
   }

   public byte[] method_1699(String var1) {
      return !this.field_1416.containsKey(var1) ? new byte[0] : ((Class303)this.field_1416.get(var1)).field_2145;
   }

   public Class686 method_508(String var1) {
      return !this.field_1416.containsKey(var1) ? new Class686() : (Class686)this.field_1416.get(var1);
   }

   public Class378 method_1609(String var1) {
      return !this.field_1416.containsKey(var1) ? new Class378() : (Class378)this.field_1416.get(var1);
   }

   public boolean method_1336(String var1) {
      return this.method_1913(var1) != 0;
   }

   @Override
   public String toString() {
      return "" + this.field_1416.size() + " entries";
   }
}
