package x;

class Class0347 extends Thread {
   Class0347(Class0215 var1, String var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void run() {
      synchronized (Class0215.a) {
         Class0215.b++;
      }

      try {
         while (Class0215.a(this.a) && !Class0215.b(this.a)) {
            Class0215.c(this.a);
         }
      } finally {
         synchronized (Class0215.a) {
            Class0215.b--;
         }
      }
   }
}
