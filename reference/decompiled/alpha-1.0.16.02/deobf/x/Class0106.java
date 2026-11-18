package x;

public class Class0106 {
   public Class0009 a;
   public float b;
   public float c;

   public Class0106(float var1, float var2, float var3, float var4, float var5) {
      this(Class0009.a(var1, var2, var3), var4, var5);
   }

   public Class0106 a(float var1, float var2) {
      return new Class0106(this, var1, var2);
   }

   public Class0106(Class0106 var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public Class0106(Class0009 var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
