package ext;

public class Class343<T extends Class359> extends Class340<T> {
   public static final Class130 field_3046 = new Class130(new Class52("modid", "custom_model"), "main");
   private final Class210 field_82;
   private final Class210 field_437;
   private final Class210 field_1466;
   private final Class210 field_1470;
   private final Class210 field_1650;
   private final Class210 field_628;

   public Class343(Class210 var1) {
      this.field_82 = var1.method_218("Head");
      this.field_437 = var1.method_218("Body");
      this.field_1466 = var1.method_218("RightArm");
      this.field_1470 = var1.method_218("LeftArm");
      this.field_1650 = var1.method_218("RightLeg");
      this.field_628 = var1.method_218("LeftLeg");
   }

   public static Class124 createBodyLayer() {
      Class675 var0 = new Class675();
      Class21 var1 = var0.method_753();
      Class21 var2 = var1.method_874(
         "Head",
         Class578.method_208()
            .method_496(0, 0)
            .method_1186(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new Class140(0.0F))
            .method_496(0, 30)
            .method_1186(-3.0F, -15.0F, -3.0F, 6.0F, 9.0F, 6.0F, new Class140(0.0F))
            .method_496(24, 30)
            .method_1186(-2.0F, -28.0F, -2.0F, 4.0F, 13.0F, 4.0F, new Class140(0.0F))
            .method_496(24, 0)
            .method_1186(-6.0F, -33.0F, -1.0F, 12.0F, 5.0F, 2.0F, new Class140(0.0F))
            .method_496(32, 7)
            .method_1186(-8.0F, -26.0F, -1.0F, 6.0F, 5.0F, 2.0F, new Class140(0.0F))
            .method_496(32, 7)
            .method_71()
            .method_1186(2.0F, -26.0F, -1.0F, 6.0F, 5.0F, 2.0F, new Class140(0.0F))
            .method_1454(false),
         Class489.method_273(0.0F, 0.0F, -1.0F)
      );
      Class21 var3 = var1.method_874(
         "Body",
         Class578.method_208()
            .method_496(24, 14)
            .method_1186(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Class140(0.0F))
            .method_496(0, 14)
            .method_1186(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Class140(0.25F)),
         Class489.method_273(0.0F, 0.0F, 0.0F)
      );
      Class21 var4 = var1.method_874(
         "RightArm",
         Class578.method_208()
            .method_496(52, 42)
            .method_1186(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Class140(0.0F))
            .method_496(48, 3)
            .method_1186(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Class140(0.25F)),
         Class489.method_273(-5.0F, 2.0F, 0.0F)
      );
      Class21 var5 = var1.method_874(
         "LeftArm",
         Class578.method_208()
            .method_496(16, 47)
            .method_1186(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Class140(0.0F))
            .method_496(36, 46)
            .method_1186(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Class140(0.25F)),
         Class489.method_273(5.0F, 2.0F, 0.0F)
      );
      Class21 var6 = var1.method_874(
         "RightLeg",
         Class578.method_208().method_496(0, 45).method_1186(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Class140(0.0F)),
         Class489.method_273(-1.9F, 12.0F, 0.0F)
      );
      Class21 var7 = var1.method_874(
         "LeftLeg",
         Class578.method_208().method_496(40, 30).method_1186(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Class140(0.0F)),
         Class489.method_273(1.9F, 12.0F, 0.0F)
      );
      return Class124.method_728(var0, 128, 128);
   }

   public void method_250(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void method_1260(Class242 var1, Class361 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_82.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_437.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_1466.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_1470.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_1650.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_628.method_1873(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
