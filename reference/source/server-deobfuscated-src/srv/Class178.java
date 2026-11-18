package srv;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class178 extends Class318 {
   public int field_677;
   public int field_405;
   public boolean field_803;
   public float[] field_444;

   public Class178() {
   }

   public Class178(int var1, int var2, float[] var3) {
      this.field_677 = var1;
      this.field_405 = var2;
      this.field_444 = var3;
      this.field_803 = var3.length != 0;
   }

   @Override
   public void method_912(DataInputStream var1) throws IOException {
      this.field_677 = var1.readInt();
      this.field_405 = var1.readInt();
      this.field_803 = var1.read() != 0;
      if (this.field_803) {
         float var2 = var1.readFloat();
         float var3 = var1.readFloat();
         float var4 = var3 - var2;
         byte[] var5 = new byte[1536];
         var1.readFully(var5);
         this.field_444 = new float[1536];

         for (int var6 = 0; var6 < var5.length; var6++) {
            this.field_444[var6] = var2 + (var5[var6] & 0xFF) / 255.0F * var4;
         }
      }
   }

   @Override
   public void method_405(DataOutputStream var1) throws IOException {
      var1.writeInt(this.field_677);
      var1.writeInt(this.field_405);
      var1.write(this.field_803 ? 1 : 0);
      if (this.field_803) {
         float var2 = Float.MAX_VALUE;
         float var3 = Float.MIN_NORMAL;

         for (float var7 : this.field_444) {
            if (var2 > var7) {
               var2 = var7;
            }

            if (var3 < var7) {
               var3 = var7;
            }
         }

         float var8 = var3 - var2;
         byte[] var9 = new byte[1536];

         for (int var10 = 0; var10 < var9.length; var10++) {
            var9[var10] = (byte)((this.field_444[var10] + var2) / var8 * 255.0F);
         }

         var1.writeFloat(var2);
         var1.writeFloat(var3);
         var1.write(var9);
      }
   }

   @Override
   public void method_1020(Class191 var1) {
      var1.method_558(this);
   }

   @Override
   public int method_116() {
      return 9;
   }
}
