package x;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class0220 extends Class0338 {
   public byte[] 4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE;

   public Class0220() {
   }

   public Class0220(byte[] var1) {
      this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE = var1;
   }

   @Override
   void _u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c/* $VF was: 3u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c */(DataOutput var1) throws IOException {
      var1.writeInt(this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE.length);
      var1.write(this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE);
   }

   @Override
   void _M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2/* $VF was: 1M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2 */(DataInput var1) throws IOException {
      int var2 = var1.readInt();
      this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE = new byte[var2];
      var1.readFully(this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE);
   }

   @Override
   public byte _a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T/* $VF was: 9a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T */() {
      return 7;
   }

   @Override
   public String toString() {
      return "[" + this.4s9ApwXvCj1pKxZ8g66vs80xLqPsv41W91d348XOBg136G3x1zojyW9b9QDE.length + " bytes]";
   }
}
