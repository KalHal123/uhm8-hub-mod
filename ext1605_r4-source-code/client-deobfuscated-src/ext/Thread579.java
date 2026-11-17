package ext;

public class Thread579 extends Thread {
   final Canvas247 field_1669;

   public Thread579(Canvas247 var1) {
      this.field_1669 = var1;
   }

   @Override
   public void run() {
      while (Canvas247.method_1715(this.field_1669)) {
         this.field_1669.method_932();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
         }
      }
   }
}
