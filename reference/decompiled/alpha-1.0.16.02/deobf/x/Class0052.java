package x;

public class Class0052 extends Class0069 {
   @Override
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = Class0118.a(this.j * (float) Math.PI);
      float var8 = Class0118.a((1.0F - (1.0F - this.j) * (1.0F - this.j)) * (float) Math.PI);
      this.d.f = 0.0F;
      this.e.f = 0.0F;
      this.d.e = -(0.1F - var7 * 0.6F);
      this.e.e = 0.1F - var7 * 0.6F;
      this.d.d = (float) (-Math.PI / 2);
      this.e.d = (float) (-Math.PI / 2);
      this.d.d -= var7 * 1.2F - var8 * 0.4F;
      this.e.d -= var7 * 1.2F - var8 * 0.4F;
      this.d.f = this.d.f + (Class0118.b(var3 * 0.09F) * 0.05F + 0.05F);
      this.e.f = this.e.f - (Class0118.b(var3 * 0.09F) * 0.05F + 0.05F);
      this.d.d = this.d.d + Class0118.a(var3 * 0.067F) * 0.05F;
      this.e.d = this.e.d - Class0118.a(var3 * 0.067F) * 0.05F;
   }
}
