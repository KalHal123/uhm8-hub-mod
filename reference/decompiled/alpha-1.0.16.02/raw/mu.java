class mu extends Thread {
   mu(hy var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(5000L);
         if (hy.e(this.a).isAlive()) {
            try {
               hy.e(this.a).stop();
            } catch (Throwable var3) {
            }
         }

         if (hy.f(this.a).isAlive()) {
            try {
               hy.f(this.a).stop();
            } catch (Throwable var2) {
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }
   }
}
