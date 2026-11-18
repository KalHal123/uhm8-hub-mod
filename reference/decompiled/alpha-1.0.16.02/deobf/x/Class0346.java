package x;

class Class0346 extends Thread {
   Class0346(Class0215 var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(5000L);
         if (Class0215.e(this.a).isAlive()) {
            try {
               Class0215.e(this.a).stop();
            } catch (Throwable var3) {
            }
         }

         if (Class0215.f(this.a).isAlive()) {
            try {
               Class0215.f(this.a).stop();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }
   }
}
