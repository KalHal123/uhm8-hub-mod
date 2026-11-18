package ext;

class Thread376 extends Thread {
   final Class126 field_1407;

   Thread376(Class126 var1, String var2) {
      super(var2);
      this.field_1407 = var1;
   }

   @Override
   public void run() {
      Object var2 = Class126.field_693;
      synchronized (Class126.field_693) {
         Class126.field_792++;
      }

      while (true) {
         var2 = false;

         try {
            var2 = true;
            if (Class126.method_1046(this.field_1407)) {
               if (!Class126.method_1327(this.field_1407)) {
                  Class126.method_992(this.field_1407);
                  continue;
               }

               var2 = false;
               break;
            }

            var2 = false;
            break;
         } finally {
            if (var2) {
               Object var10 = Class126.field_693;
               synchronized (Class126.field_693) {
                  Class126.field_792--;
               }
            }
         }
      }

      var2 = Class126.field_693;
      synchronized (Class126.field_693) {
         Class126.field_792--;
      }
   }
}
