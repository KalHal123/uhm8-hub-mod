package srv;

class Thread138 extends Thread {
   final Class363 field_245;

   Thread138(Class363 var1) {
      this.field_245 = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(5000L);
         if (Class363.method_113(this.field_245).isAlive()) {
            try {
               Class363.method_113(this.field_245).stop();
            } catch (Throwable var3) {
            }
         }

         if (Class363.method_1002(this.field_245).isAlive()) {
            try {
               Class363.method_1002(this.field_245).stop();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }
   }
}
