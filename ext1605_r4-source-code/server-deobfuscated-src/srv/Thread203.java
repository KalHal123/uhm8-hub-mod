package srv;

class Thread203 extends Thread {
   final Class363 field_1516;

   Thread203(Class363 var1, String var2) {
      super(var2);
      this.field_1516 = var1;
   }

   @Override
   public void run() {
      Object var2 = Class363.field_923;
      synchronized (Class363.field_923) {
         Class363.field_611++;
      }

      while (true) {
         var2 = false;
         var2 = true;
         if (Class363.method_490(this.field_1516)) {
            if (!Class363.method_191(this.field_1516)) {
               Class363.method_928(this.field_1516);
               continue;
            }

            var2 = false;
            break;
         }

         var2 = false;
         break;
      }

      var2 = Class363.field_923;
      synchronized (Class363.field_923) {
         Class363.field_611--;
      }
   }
}
