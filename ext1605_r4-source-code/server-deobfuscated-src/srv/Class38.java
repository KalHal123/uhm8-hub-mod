package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Class38 extends Class318 {
   public int field_438;
   public int field_1386;
   public int field_806;
   public int field_617;
   public int field_23;
   public int field_365;
   public byte[] field_890;
   private int field_551;

   public Class38() {
      this.field_198 = true;
   }

   public Class38(int var1, int var2, int var3, int var4, int var5, int var6, Class317 var7) {
      this.field_198 = true;
      this.field_438 = var1;
      this.field_1386 = var2;
      this.field_806 = var3;
      this.field_617 = var4;
      this.field_23 = var5;
      this.field_365 = var6;
      byte[] var8 = var7.method_376(var1, var2, var3, var4, var5, var6);
      Deflater var9 = new Deflater(1);

      try {
         var9.setInput(var8);
         var9.finish();
         this.field_890 = new byte[var4 * var5 * var6 * 5 / 2];
         this.field_551 = var9.deflate(this.field_890);
      } finally {
         var9.end();
      }
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_438 = var1.readInt();
      this.field_1386 = var1.readShort();
      this.field_806 = var1.readInt();
      this.field_617 = var1.read() + 1;
      this.field_23 = var1.read() + 1;
      this.field_365 = var1.read() + 1;
      int var2 = var1.readInt();
      byte[] var3 = new byte[var2];
      var1.readFully(var3);
      this.field_890 = new byte[this.field_617 * this.field_23 * this.field_365 * 5 / 2];
      Inflater var4 = new Inflater();
      var4.setInput(var3);

      try {
         var4.inflate(this.field_890);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_438);
      var1.writeShort(this.field_1386);
      var1.writeInt(this.field_806);
      var1.write(this.field_617 - 1);
      var1.write(this.field_23 - 1);
      var1.write(this.field_365 - 1);
      var1.writeInt(this.field_551);
      var1.write(this.field_890, 0, this.field_551);
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_946(this);
   }

   @Override
   public int method_116() {
      return 17 + this.field_551;
   }
}
