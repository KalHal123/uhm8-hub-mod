class mx extends Thread {
   mx(hy var1, String var2) {
      super(var2);
      this.a = var1;
   }

   @Override
   public void run() {
      synchronized (hy.a) {
         hy.c++;
      }

      try {
         while (hy.a(this.a)) {
            hy.d(this.a);
         }
      } finally {
         synchronized (hy.a) {
            hy.c--;
         }
      }
   }
}
