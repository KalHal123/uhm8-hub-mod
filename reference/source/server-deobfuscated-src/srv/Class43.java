package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class43 {
   public long field_338;
   public long field_936;
   public long field_247;
   public Enum26 field_1381;

   public Class43(long var1, long var3, long var5, Enum26 var7) {
      this.field_338 = var1;
      this.field_936 = var3;
      this.field_247 = var5;
      this.field_1381 = var7;
   }

   public Class43(long var1, long var3, long var5) {
      this.field_338 = var1;
      this.field_936 = var3;
      this.field_247 = var5;
      this.field_1381 = Enum26.field_140;
   }

   public Class43 method_288(long var1, long var3, long var5) {
      return new Class43(this.field_338 + var1, this.field_936 + var3, this.field_247 + var5, this.field_1381);
   }

   public Class43 method_801(Enum26 var1) {
      return new Class43(this.field_338, this.field_936, this.field_247, var1);
   }

   public Class43 method_223(Enum26 var1) {
      switch (var1) {
         case field_140:
            return new Class43(-this.field_338, this.field_936, -this.field_247, this.field_1381);
         case field_1074:
            return new Class43(this.field_338, this.field_936, this.field_247, this.field_1381);
         case field_1291:
            return new Class43(-this.field_247, this.field_936, -this.field_338, this.field_1381);
         case field_1339:
            return new Class43(this.field_247, this.field_936, this.field_338, this.field_1381);
         default:
            return null;
      }
   }

   public Class43 method_450(Class43 var1) {
      Class43 var2 = new Class43(this.field_338, this.field_936, this.field_247, this.field_1381);
      var2.field_338 = var2.field_338 + var1.field_338;
      var2.field_936 = var2.field_936 + var1.field_936;
      var2.field_247 = var2.field_247 + var1.field_247;
      return var2;
   }

   public static Class43 method_981(Class100 var0, String var1) {
      return new Class43(var0.method_895(var1 + "_x"), var0.method_895(var1 + "_y"), var0.method_895(var1 + "_z"));
   }

   public void method_787(Class100 var1, String var2) {
      var1.method_426(var2 + "_x", this.field_338);
      var1.method_426(var2 + "_y", this.field_936);
      var1.method_426(var2 + "_z", this.field_247);
   }

   public static Class43 method_705(DataInputStream var0) {
      try {
         return new Class43(var0.readInt(), var0.readInt(), var0.readInt());
      } catch (IOException var2) {
         return null;
      }
   }

   public void method_638(DataOutputStream var1) {
      try {
         var1.writeInt((int)this.field_338);
         var1.writeInt((int)this.field_936);
         var1.writeInt((int)this.field_247);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }
}
