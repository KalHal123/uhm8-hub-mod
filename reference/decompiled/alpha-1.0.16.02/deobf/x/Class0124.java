package x;

public final class Class0124 {
   public int a = 0;
   public int b;
   public int c;
   public int d;

   public Class0124(Class0312 var1) {
      this(var1, 1);
   }

   public Class0124(Class0312 var1, int var2) {
      this(var1.ba, var2);
   }

   public Class0124(Class0086 var1) {
      this(var1, 1);
   }

   public Class0124(Class0086 var1, int var2) {
      this(var1.aQ, var2);
   }

   public Class0124(int var1) {
      this(var1, 1);
   }

   public Class0124(int var1, int var2) {
      this.c = var1;
      this.a = var2;
   }

   public Class0124(int var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public Class0124(Class0193 var1) {
      this.b(var1);
   }

   public Class0124 a(int var1) {
      this.a -= var1;
      return new Class0124(this.c, var1, this.d);
   }

   public Class0086 a() {
      return Class0086.c[this.c];
   }

   public int b() {
      return this.a().a(this);
   }

   public boolean a(Class0089 var1, Class0065 var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(Class0312 var1) {
      return this.a().a(this, var1);
   }

   public Class0124 a(Class0065 var1, Class0089 var2) {
      return this.a().a(this, var1, var2);
   }

   public Class0193 a(Class0193 var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(Class0193 var1) {
      this.c = var1.d("id");
      this.a = var1.c("Count");
      this.d = var1.d("Damage");
   }

   public int c() {
      return this.a().b();
   }

   public int d() {
      return Class0086.c[this.c].c();
   }

   public void b(int var1) {
      this.d += var1;
      if (this.d > this.d()) {
         this.a--;
         if (this.a < 0) {
            this.a = 0;
         }

         this.d = 0;
      }
   }

   public void a(Class0158 var1) {
      Class0086.c[this.c].a(this, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      Class0086.c[this.c].a(this, var1, var2, var3, var4);
   }

   public int a(Class0268 var1) {
      return Class0086.c[this.c].a(var1);
   }

   public boolean b(Class0312 var1) {
      return Class0086.c[this.c].a(var1);
   }

   public void a(Class0089 var1) {
   }

   public void b(Class0158 var1) {
      Class0086.c[this.c].b(this, var1);
   }
}
