package x;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class0313 extends Class0338 {
   private List 91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE = new ArrayList();
   private byte 780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf;

   @Override
   void _u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c/* $VF was: 3u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c */(DataOutput var1) throws IOException {
      if (this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.size() > 0) {
         this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf = ((Class0338)this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE
               .get(0))
            ._a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T/* $VF was: 9a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T */();
      } else {
         this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf = 1;
      }

      var1.writeByte(this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf);
      var1.writeInt(this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.size());

      for (int var2 = 0; var2 < this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.size(); var2++) {
         ((Class0338)this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.get(var2))
            ._u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c/* $VF was: 3u9gjZ7i3d2YubF0su74PKnGss0cvso81RK0Y8jKWp0ek32Qdu4w49mP442c */(var1);
      }
   }

   @Override
   void _M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2/* $VF was: 1M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2 */(DataInput var1) throws IOException {
      this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf = var1.readByte();
      int var2 = var1.readInt();
      this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE = new ArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         Class0338 var4 = Class0338._912oSJm07e8u9443q4206128Ot0caiwYct4KXz5QqPCtWi7Yw3tun8e866R/* $VF was: 9912oSJm07e8u9443q4206128Ot0caiwYct4KXz5QqPCtWi7Yw3tun8e866R */(
            this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf
         );
         var4._M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2/* $VF was: 1M2U11L30wA10L300J6LzwvXA1DA9c3e565E02WQfTJCL72gaMGVKZF08Rw2 */(var1);
         this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.add(var4);
      }
   }

   @Override
   public byte _a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T/* $VF was: 9a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T */() {
      return 9;
   }

   @Override
   public String toString() {
      return ""
         + this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.size()
         + " entries of type "
         + Class0338._Roae8nL4340p72O014qe527flCETbZU17atn6T1rJulLHoYOBY7qUA4s780/* $VF was: 5Roae8nL4340p72O014qe527flCETbZU17atn6T1rJulLHoYOBY7qUA4s780 */(
            this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf
         );
   }

   public void _a6oR0Geon49O2586GRaR4th53gGLcM3vSs68Y1k9N9NQDTE20arTTK8h7iO/* $VF was: 1a6oR0Geon49O2586GRaR4th53gGLcM3vSs68Y1k9N9NQDTE20arTTK8h7iO */(
      Class0338 var1
   ) {
      this.780ItbmxHrij0Y0KJ3IDvhY384Y5lQf1sfuT524bxteQjPqSa920u43wJWqf = var1._a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T/* $VF was: 9a6gv1z8Lq9d4t67thFnU3X9WGNyO6QoTPdtZ76hL54d77on32gZ5FdBdb4T */();
      this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.add(var1);
   }

   public Class0338 _I4f56w2CgmfIo3P83VU7eoEB0f2EsDjpE345F75F82RTER3D4jwvCGvI2t3/* $VF was: 5I4f56w2CgmfIo3P83VU7eoEB0f2EsDjpE345F75F82RTER3D4jwvCGvI2t3 */(
      int var1
   ) {
      return (Class0338)this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.get(var1);
   }

   public int _557Hyc1Ad5MY6xd4f8I80782621rvXD5nZk8t765lKBQHsKFUfGLX1xENm8/* $VF was: 6557Hyc1Ad5MY6xd4f8I80782621rvXD5nZk8t765lKBQHsKFUfGLX1xENm8 */() {
      return this.91vA8WxJoNXvq5F3uYiv80KhjE3b12fSs2y3lCSXvGL4aEzPPG6u5L44ZIuE.size();
   }
}
