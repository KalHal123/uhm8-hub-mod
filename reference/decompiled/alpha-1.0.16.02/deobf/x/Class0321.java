package x;

import java.util.Random;

public class Class0321 extends Class0312 {
   protected Class0321(int var1) {
      super(var1, Class0155.c);
      this.aZ = 20;
   }

   @Override
   public int a(Random var1) {
      return 1;
   }

   @Override
   public int a(int var1, Random var2) {
      return Class0312.J.ba;
   }

   @Override
   public int a(int var1) {
      if (var1 == 1) {
         return 21;
      } else {
         return var1 == 0 ? 21 : 20;
      }
   }
}
