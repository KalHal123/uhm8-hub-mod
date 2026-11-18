package x;

class Class0294 extends Thread {
   Class0294(Class0003 var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      while (Class0003.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
         }
      }
   }
}
