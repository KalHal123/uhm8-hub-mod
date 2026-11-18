package x;

class Class0336 {
   final int a;
   Object b;
   Class0336 c;
   final int d;

   Class0336(int var1, int var2, Object var3, Class0336 var4) {
      this.b = var3;
      this.c = var4;
      this.a = var2;
      this.d = var1;
   }

   public final int a() {
      return this.a;
   }

   public final Object b() {
      return this.b;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof Class0336)) {
         return false;
      }

      Class0336 var2 = (Class0336)var1;
      Integer var3 = this.a();
      Integer var4 = var2.a();
      if (var3 == var4 || var3 != null && var3.equals(var4)) {
         Object var5 = this.b();
         Object var6 = var2.b();
         if (var5 == var6 || var5 != null && var5.equals(var6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public final int hashCode() {
      return Class0135.d(this.a);
   }

   @Override
   public final String toString() {
      return this.a() + "=" + this.b();
   }
}
