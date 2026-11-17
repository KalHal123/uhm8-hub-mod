package ext;

public class Class167<T extends Class359> extends Class340<T> {
   public static final Class130 field_1207 = new Class130(new Class52("modid", "observer"), "main");
   private final Class210 field_2131;

   public Class167(Class210 var1) {
      this.field_2131 = var1.method_218("bb_main");
   }

   public static Class124 createBodyLayer() {
      Class675 var0 = new Class675();
      Class21 var1 = var0.method_753();
      Class21 var2 = var1.method_874(
         "bb_main",
         Class578.method_208()
            .method_496(0, 0)
            .method_1186(-4.0F, -37.0F, -5.0F, 8.0F, 8.0F, 8.0F, new Class140(0.0F))
            .method_496(0, 16)
            .method_1186(-4.0F, -29.0F, -3.0F, 8.0F, 12.0F, 6.0F, new Class140(0.0F))
            .method_496(28, 12)
            .method_1186(-4.0F, -17.0F, -2.0F, 3.0F, 17.0F, 4.0F, new Class140(0.0F))
            .method_496(28, 12)
            .method_71()
            .method_1186(1.0F, -17.0F, -2.0F, 3.0F, 17.0F, 4.0F, new Class140(0.0F))
            .method_1454(false),
         Class489.method_273(0.0F, 24.0F, 0.0F)
      );
      return Class124.method_728(var0, 64, 64);
   }

   public void method_1138(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void method_1260(Class242 var1, Class361 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_2131.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
