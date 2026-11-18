public final class eo {
   public int a = 0;
   public int b;
   public int c;
   public int d;

   public eo(ln var1) {
      this(var1, 1);
   }

   public eo(ln var1, int var2) {
      this(var1.ba, var2);
   }

   public eo(dd var1) {
      this(var1, 1);
   }

   public eo(dd var1, int var2) {
      this(var1.aQ, var2);
   }

   public eo(int var1) {
      this(var1, 1);
   }

   public eo(int var1, int var2) {
      this.c = var1;
      this.a = var2;
   }

   public eo(int var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public eo(hc var1) {
      this.b(var1);
   }

   public eo a(int var1) {
      this.a -= var1;
      return new eo(this.c, var1, this.d);
   }

   public dd a() {
      return dd.c[this.c];
   }

   public int b() {
      return this.a().a(this);
   }

   public boolean a(dg var1, cj var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(ln var1) {
      return this.a().a(this, var1);
   }

   public eo a(cj var1, dg var2) {
      return this.a().a(this, var1, var2);
   }

   public hc a(hc var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(hc var1) {
      this.c = var1.d("id");
      this.a = var1.c("Count");
      this.d = var1.d("Damage");
   }

   public int c() {
      return this.a().b();
   }

   public int d() {
      return dd.c[this.c].c();
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

   public void a(fv var1) {
      dd.c[this.c].a(this, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      dd.c[this.c].a(this, var1, var2, var3, var4);
   }

   public int a(jx var1) {
      return dd.c[this.c].a(var1);
   }

   public boolean b(ln var1) {
      return dd.c[this.c].a(var1);
   }

   public void a(dg var1) {
   }

   public void b(fv var1) {
      dd.c[this.c].b(this, var1);
   }
}
