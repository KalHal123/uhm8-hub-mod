class kw extends Thread {
   kw(ab var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      while (ab.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
         }
      }
   }
}
