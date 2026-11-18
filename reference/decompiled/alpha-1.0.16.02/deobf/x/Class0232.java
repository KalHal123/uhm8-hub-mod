package x;

class Class0232 extends Class0094 {
   private final Class0161 e;

   public Class0232(Class0107 var1, Class0161 var2, Class0161 var3, int var4, int var5, int var6) {
      super(var1, var3, var4, var5, var6);
      this.e = var2;
   }

   @Override
   public boolean a(Class0124 var1) {
      return false;
   }

   @Override
   public void a() {
      for (int var1 = 0; var1 < this.e.a(); var1++) {
         if (this.e.a_(var1) != null) {
            this.e.a(var1, 1);
         }
      }
   }
}
