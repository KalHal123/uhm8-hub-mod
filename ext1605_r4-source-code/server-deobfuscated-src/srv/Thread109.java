package srv;

class Thread109 extends Thread {
   final Class363 field_234;

   Thread109(Class363 var1, String var2) {
      super(var2);
      this.field_234 = var1;
   }

   @Override
   public void run() {
      Object var2 = Class363.field_923;
      synchronized (Class363.field_923) {
         Class363.field_366++;
      }

      while (true) {
         var2 = false;
         var2 = true;
         if (!Class363.method_490(this.field_234)) {
            var2 = false;
            var2 = Class363.field_923;
            synchronized (Class363.field_923) {
               Class363.field_366--;
               return;
            }
         }

         Class363.method_401(this.field_234);
      }
   }
}
