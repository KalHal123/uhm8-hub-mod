package ext;

public class Class691<T extends Class359> extends Class340<T> {
   public static final Class130 field_1145 = new Class130(new Class52("modid", "catbomb"), "main");
   private final Class210 field_733;

   public Class691(Class210 var1) {
      this.field_733 = var1.method_218("bb_main");
   }

   public static Class124 createBodyLayer() {
      Class675 var0 = new Class675();
      Class21 var1 = var0.method_753();
      Class21 var2 = var1.method_874(
         "bb_main",
         Class578.method_208()
            .method_496(0, 10)
            .method_1186(1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Class140(0.0F))
            .method_496(0, 0)
            .method_1186(-2.0F, -5.0F, -1.0F, 4.0F, 5.0F, 2.0F, new Class140(0.0F))
            .method_496(6, 7)
            .method_1186(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Class140(0.0F))
            .method_496(0, 7)
            .method_1186(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, new Class140(0.0F))
            .method_496(10, 7)
            .method_1186(1.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Class140(0.0F))
            .method_496(4, 10)
            .method_1186(-2.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Class140(0.0F))
            .method_496(10, 0)
            .method_1186(-2.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Class140(0.0F))
            .method_496(4, 7)
            .method_1186(1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Class140(0.0F)),
         Class489.method_273(0.0F, 24.0F, 0.0F)
      );
      return Class124.method_728(var0, 16, 16);
   }

   public void method_52(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void method_1260(Class242 var1, Class361 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_733.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
