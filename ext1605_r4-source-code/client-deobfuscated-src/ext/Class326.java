package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class326 {
   public long field_809;
   public long field_805;
   public long field_3039;
   public Enum37 field_1952;

   public Class326(long var1, long var3, long var5, Enum37 var7) {
      this.field_809 = var1;
      this.field_805 = var3;
      this.field_3039 = var5;
      this.field_1952 = var7;
   }

   public Class326(long var1, long var3, long var5) {
      this.field_809 = var1;
      this.field_805 = var3;
      this.field_3039 = var5;
      this.field_1952 = Enum37.field_889;
   }

   @Override
   public String toString() {
      return "(" + this.field_809 + ", " + this.field_805 + ", " + this.field_3039 + ")";
   }

   public boolean method_878(Class326 var1) {
      return this.field_809 == var1.field_809 && this.field_805 == var1.field_805 && this.field_3039 == var1.field_3039;
   }

   public Class326 method_891(long var1, long var3, long var5) {
      return new Class326(this.field_809 + var1, this.field_805 + var3, this.field_3039 + var5, this.field_1952);
   }

   public Class326 method_1068(Enum37 var1) {
      return new Class326(this.field_809, this.field_805, this.field_3039, var1);
   }

   public Class326 method_1590(Enum37 var1) {
      switch (var1) {
         case field_889:
            return new Class326(-this.field_809, this.field_805, -this.field_3039, this.field_1952);
         case field_1604:
            return new Class326(this.field_809, this.field_805, this.field_3039, this.field_1952);
         case field_2401:
            return new Class326(-this.field_3039, this.field_805, -this.field_809, this.field_1952);
         case field_1904:
            return new Class326(this.field_3039, this.field_805, this.field_809, this.field_1952);
         default:
            return null;
      }
   }

   public Class326 method_113(Class326 var1) {
      Class326 var2 = new Class326(this.field_809, this.field_805, this.field_3039, this.field_1952);
      var2.field_809 = var2.field_809 + var1.field_809;
      var2.field_805 = var2.field_805 + var1.field_805;
      var2.field_3039 = var2.field_3039 + var1.field_3039;
      return var2;
   }

   public static Class326 method_1425(Class686 var0, String var1) {
      return new Class326(var0.method_328(var1 + "_x"), var0.method_328(var1 + "_y"), var0.method_328(var1 + "_z"));
   }

   public void method_1665(Class686 var1, String var2) {
      var1.method_1647(var2 + "_x", this.field_809);
      var1.method_1647(var2 + "_y", this.field_805);
      var1.method_1647(var2 + "_z", this.field_3039);
   }

   public static Class326 method_201(DataInputStream var0) {
      try {
         return new Class326(var0.readInt(), var0.readInt(), var0.readInt());
      } catch (IOException var2) {
         return null;
      }
   }

   public void method_81(DataOutputStream var1) {
      try {
         var1.writeInt((int)this.field_809);
         var1.writeInt((int)this.field_805);
         var1.writeInt((int)this.field_3039);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public Class447 method_503() {
      return new Class447(this.field_809, this.field_805, this.field_3039);
   }
}
