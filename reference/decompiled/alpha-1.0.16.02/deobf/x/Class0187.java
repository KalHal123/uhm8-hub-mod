package x;

public class Class0187 extends Class0142 {
   Class0223 a;
   Class0223 b;
   Class0223 c;
   Class0223 d;

   public Class0187(int var1) {
      this.a = new Class0223(0, var1);
      this.a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if (var1 > 0) {
         this.a = new Class0223(0, var1);
         this.a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         this.b = new Class0223(32, 0);
         this.b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         this.c = new Class0223(32, 4);
         this.c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
         this.d = new Class0223(32, 8);
         this.d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }
   }

   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void b(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a(var1, var2, var3, var4, var5, var6);
      this.a.a(var6);
      if (this.b != null) {
         this.b.a(var6);
         this.c.a(var6);
         this.d.a(var6);
      }
   }
}
