package srv;

class Thread168 extends Thread {
   final Class363 field_439;

   Thread168(Class363 var1) {
      this.field_439 = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(2000L);
         if (Class363.method_490(this.field_439)) {
            Class363.method_1002(this.field_439).interrupt();
            this.field_439.method_807("Connection closed");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
