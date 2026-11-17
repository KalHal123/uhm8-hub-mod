package ext;

class Thread474 extends Thread {
   final Class126 field_1390;

   Thread474(Class126 var1) {
      this.field_1390 = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(5000L);
         if (Class126.method_1216(this.field_1390).isAlive()) {
            try {
               Class126.method_1216(this.field_1390).stop();
            } catch (Throwable var3) {
            }
         }

         if (Class126.method_994(this.field_1390).isAlive()) {
            try {
               Class126.method_994(this.field_1390).stop();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }
   }
}
