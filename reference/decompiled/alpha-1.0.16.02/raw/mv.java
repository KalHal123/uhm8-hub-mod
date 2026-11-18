class mv extends Thread {
   mv(hy var1, String var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void run() {
      synchronized (hy.a) {
         hy.b++;
      }

      try {
         while (hy.a(this.a) && !hy.b(this.a)) {
            hy.c(this.a);
         }
      } finally {
         synchronized (hy.a) {
            hy.b--;
         }
      }
   }
}
