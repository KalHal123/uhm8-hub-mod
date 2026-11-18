package srv;

public class Class245 {
   public final byte[] field_223;

   public Class245(int var1) {
      this.field_223 = new byte[var1 >> 1];
   }

   public Class245(byte[] var1) {
      this.field_223 = var1;
   }

   public int method_526(int var1, int var2, int var3) {
      int var4 = var1 << 11 | var3 << 7 | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0 ? this.field_223[var5] & 15 : this.field_223[var5] >> 4 & 15;
   }

   public void method_429(int var1, int var2, int var3, int var4) {
      int var5 = var1 << 11 | var3 << 7 | var2;
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      if (var7 == 0) {
         this.field_223[var6] = (byte)(this.field_223[var6] & 240 | var4 & 15);
      } else {
         this.field_223[var6] = (byte)(this.field_223[var6] & 15 | (var4 & 15) << 4);
      }
   }

   public boolean method_146() {
      return this.field_223 != null;
   }
}
