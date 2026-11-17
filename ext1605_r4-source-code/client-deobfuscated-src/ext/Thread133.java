package ext;

class Thread133 extends Thread {
   final Class126 field_725;

   Thread133(Class126 var1, String var2) {
      super(var2);
      this.field_725 = var1;
   }

   @Override
   public void run() {
      Object var2 = Class126.field_693;
      synchronized (Class126.field_693) {
         Class126.field_1281++;
      }

      while (true) {
         var2 = false;

         try {
            var2 = true;
            if (!Class126.method_1046(this.field_725)) {
               var2 = false;
               break;
            }

            Class126.method_1451(this.field_725);
         } finally {
            if (var2) {
               Object var9 = Class126.field_693;
               synchronized (Class126.field_693) {
                  Class126.field_1281--;
               }
            }
         }
      }

      var2 = Class126.field_693;
      synchronized (Class126.field_693) {
         Class126.field_1281--;
      }
   }
}
