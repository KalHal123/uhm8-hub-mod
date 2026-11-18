package x;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class0120 extends Class0338 {
   public String 76zpWu53N4S8U2s0Iz5FlQMr8q8EJyDvlDn3q45Eo3OZJ2QYVpX2nln2XXoi;

   public Class0120() {
   }

   public Class0120(String var1) {
      this.76zpWu53N4S8U2s0Iz5FlQMr8q8EJyDvlDn3q45Eo3OZJ2QYVpX2nln2XXoi = var1;
      if (var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   @Override
   void _u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c/* $VF was: 3u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c */(DataOutput var1) throws IOException {
      var1.writeUTF(this.76zpWu53N4S8U2s0Iz5FlQMr8q8EJyDvlDn3q45Eo3OZJ2QYVpX2nln2XXoi);
   }

   @Override
   void _M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2/* $VF was: 1M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2 */(DataInput var1) throws IOException {
      this.76zpWu53N4S8U2s0Iz5FlQMr8q8EJyDvlDn3q45Eo3OZJ2QYVpX2nln2XXoi = var1.readUTF();
   }

   @Override
   public byte _a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T/* $VF was: 9a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T */() {
      return 8;
   }

   @Override
   public String toString() {
      return "" + this.76zpWu53N4S8U2s0Iz5FlQMr8q8EJyDvlDn3q45Eo3OZJ2QYVpX2nln2XXoi;
   }
}
