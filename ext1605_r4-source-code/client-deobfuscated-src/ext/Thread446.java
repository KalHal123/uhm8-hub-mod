package ext;

public class Thread446 extends Thread {
   public Class197 field_2484 = new Class197();
   public boolean field_1412 = false;
   public Class113 field_1303 = new Class113();
   public Class113 field_939 = new Class113();
   public Class113 field_451 = new Class113();
   public Class113 field_2776 = new Class113();
   public long field_1157 = 0L;
   public int field_1242 = -1;

   public void method_417() {
      this.field_1303.method_923(new Class745(0, 0, 0, 255));
      this.field_1303.method_923(new Class1(0, false, false, true, false, false));
      this.field_1303.method_923(new Class77(0, Class77.Inner467.field_1724, Class77.Inner78.field_2877, 0));
      this.field_1303.method_923(new Class77(0, Class77.Inner467.field_668, Class77.Inner78.field_2877, 0));
      this.field_939.method_923(new Class745(0, 0, 0, 0));
      this.field_939.method_923(new Class1(0, false, false, true, false, false));
      this.field_939.method_923(new Class77(0, Class77.Inner467.field_1724, Class77.Inner78.field_309, 3));
      this.field_939.method_923(new Class77(0, Class77.Inner467.field_668, Class77.Inner78.field_355, 4, 8, 5));
      this.field_451.method_923(new Class745(0, 0, 0, 0));
      this.field_451.method_923(new Class1(0, false, false, true, false, false));
      this.field_451.method_923(new Class77(0, Class77.Inner467.field_1724, Class77.Inner78.field_2877, 0));
      this.field_451.method_923(new Class77(0, Class77.Inner467.field_668, Class77.Inner78.field_333, 3, 6, 1, 1));
      this.field_2776.method_923(new Class745(0, 0, 0, 0));
      this.field_2776.method_923(new Class1(0, false, false, true, false, false));
      this.field_2776.method_923(new Class77(0, Class77.Inner467.field_1724, Class77.Inner78.field_2877, 0));
      this.field_2776.method_923(new Class77(0, Class77.Inner467.field_668, Class77.Inner78.field_2877, 0));
   }

   public void method_984(Class113 var1) {
      Class1 var7 = (Class1)var1.field_50.get(1);
      boolean var2;
      boolean var3;
      boolean var4;
      boolean var5;
      boolean var6;
      switch (Class119.field_1519.field_1754.field_2564) {
         case 0:
            var6 = false;
            var5 = false;
            var4 = false;
            var3 = false;
            var2 = true;
            break;
         case 1:
            var6 = false;
            var2 = false;
            var3 = false;
            var5 = true;
            var4 = true;
            break;
         case 2:
            var5 = false;
            var4 = false;
            var6 = true;
            var2 = true;
            var3 = true;
            break;
         case 3:
            var2 = false;
            var6 = true;
            var5 = true;
            var4 = true;
            var3 = true;
            break;
         case 4:
            var6 = true;
            var5 = true;
            var2 = true;
            var4 = true;
            var3 = true;
            break;
         default:
            var6 = false;
            var5 = false;
            var2 = false;
            var4 = false;
            var3 = false;
      }

      var7.field_994 = var3;
      var7.field_2973 = var4;
      var7.field_808 = var2;
      var7.field_2316 = var5;
      var7.field_2674 = var6;
   }

   public void method_425(Class113 var1) {
      Class745 var2 = (Class745)var1.field_50.get(0);
      this.method_984(var1);
      if (Class119.field_1519.field_1754.field_2564 == 4 && Class119.field_1519.field_2787.field_2572 != 0.0F) {
         float var5 = (float)(System.currentTimeMillis() % 2000L) / 1000.0F;
         float var4 = 0.5F + (var5 <= 1.0F ? 0.5F * var5 : (1.0F - (var5 - 1.0F)) * 0.5F);
         var2.field_1871 = var2.field_2820 = var2.field_1749 = (int)(255.0F * var4);
      } else if (Class119.field_1519.field_2787.field_2572 <= 4.0F && System.currentTimeMillis() % 2000L >= 1000L) {
         var2.field_1749 = 0;
         var2.field_2820 = 0;
         var2.field_1871 = 0;
      } else {
         float[] var3 = Class100.method_1493(Class119.field_1519.field_2787.field_2572 / 20.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
         var2.field_1871 = (int)(var3[0] * 255.0F);
         var2.field_2820 = (int)(var3[1] * 255.0F);
         var2.field_1749 = (int)(var3[2] * 255.0F);
      }
   }

   public void method_435() {
      if (System.currentTimeMillis() - this.field_1157 > 16L) {
         this.field_1157 = System.currentTimeMillis();
         if ((Class119.field_1519 == null || Class119.field_1519.field_2787 == null) && this.field_1242 != 0) {
            this.field_2484.method_301(this.field_1303);
            this.field_1242 = 0;
         } else if (Class119.field_1519.field_2787 != null) {
            this.field_1242 = 1;
            Class113 var1 = null;
            if (Class119.field_1519.field_864 != null) {
               switch (Class119.field_1519.field_864.field_1786) {
                  case 0:
                     var1 = this.field_939;
                     break;
                  case 1:
                     var1 = this.field_451;
               }
            } else {
               var1 = this.field_2776;
            }

            this.method_425(var1);
            this.field_2484.method_301(var1);
         }
      }
   }

   public Thread446() {
      this.method_417();
   }

   @Override
   public void run() {
      System.out.println("");
      if (this.field_2484.method_898()) {
         while (true) {
            this.method_435();

            try {
               Thread.sleep(64L);
            } catch (InterruptedException var2) {
            }
         }
      }
   }
}
