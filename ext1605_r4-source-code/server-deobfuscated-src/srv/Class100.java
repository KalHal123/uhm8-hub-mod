package srv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Class100 extends Class335 {
   private Map field_913 = new HashMap();

   @Override
   void method_394(DataOutput var1) throws IOException {
      for (Class335 var3 : this.field_913.values()) {
         Class335.method_710(var3, var1);
      }

      var1.writeByte(0);
   }

   @Override
   void method_145(DataInput var1) throws IOException {
      this.field_913.clear();

      Class335 var2;
      while ((var2 = Class335.method_736(var1)).method_996() != 0) {
         this.field_913.put(var2.method_1025(), var2);
      }
   }

   public Collection<Class335> method_931() {
      return this.field_913.values();
   }

   @Override
   public byte method_996() {
      return 10;
   }

   public void method_280(String var1, Class335 var2) {
      this.field_913.put(var1, var2.method_428(var1));
   }

   public void method_1003(String var1, byte var2) {
      this.field_913.put(var1, new Class142(var2).method_428(var1));
   }

   public void method_761(String var1, short var2) {
      this.field_913.put(var1, new Class305(var2).method_428(var1));
   }

   public void method_32(String var1, int var2) {
      this.field_913.put(var1, new Class25(var2).method_428(var1));
   }

   public void method_426(String var1, long var2) {
      this.field_913.put(var1, new Class253(var2).method_428(var1));
   }

   public void method_939(String var1, float var2) {
      this.field_913.put(var1, new Class260(var2).method_428(var1));
   }

   public void method_925(String var1, double var2) {
      this.field_913.put(var1, new Class155(var2).method_428(var1));
   }

   public void method_152(String var1, String var2) {
      this.field_913.put(var1, new Class118(var2).method_428(var1));
   }

   public void method_462(String var1, byte[] var2) {
      this.field_913.put(var1, new Class218(var2).method_428(var1));
   }

   public void method_487(String var1, Class100 var2) {
      this.field_913.put(var1, var2.method_428(var1));
   }

   public void method_430(String var1, boolean var2) {
      this.method_1003(var1, (byte)(var2 ? 1 : 0));
   }

   public boolean method_717(String var1) {
      return this.field_913.containsKey(var1);
   }

   public byte method_561(String var1) {
      return !this.field_913.containsKey(var1) ? 0 : ((Class142)this.field_913.get(var1)).field_1100;
   }

   public short method_799(String var1) {
      return !this.field_913.containsKey(var1) ? 0 : ((Class305)this.field_913.get(var1)).field_618;
   }

   public int method_159(String var1) {
      return !this.field_913.containsKey(var1) ? 0 : ((Class25)this.field_913.get(var1)).field_646;
   }

   public long method_895(String var1) {
      return !this.field_913.containsKey(var1) ? 0L : ((Class253)this.field_913.get(var1)).field_1283;
   }

   public float method_510(String var1) {
      return !this.field_913.containsKey(var1) ? 0.0F : ((Class260)this.field_913.get(var1)).field_95;
   }

   public double method_1016(String var1) {
      return !this.field_913.containsKey(var1) ? 0.0 : ((Class155)this.field_913.get(var1)).field_1205;
   }

   public String method_219(String var1) {
      return !this.field_913.containsKey(var1) ? "" : ((Class118)this.field_913.get(var1)).field_1153;
   }

   public byte[] method_5(String var1) {
      return !this.field_913.containsKey(var1) ? new byte[0] : ((Class218)this.field_913.get(var1)).field_772;
   }

   public Class100 method_984(String var1) {
      return !this.field_913.containsKey(var1) ? new Class100() : (Class100)this.field_913.get(var1);
   }

   public Class310 method_836(String var1) {
      return !this.field_913.containsKey(var1) ? new Class310() : (Class310)this.field_913.get(var1);
   }

   public boolean method_1004(String var1) {
      return this.method_561(var1) != 0;
   }

   @Override
   public String toString() {
      return "" + this.field_913.size() + " entries";
   }
}
