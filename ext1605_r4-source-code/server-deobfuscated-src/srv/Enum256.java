package srv;

public enum Enum256 {
   field_1527("Kebab", 16, 16, 0, 0),
   field_255("Aztec", 16, 16, 16, 0),
   field_1089("Alban", 16, 16, 32, 0),
   field_1579("Aztec2", 16, 16, 48, 0),
   field_1531("Bomb", 16, 16, 64, 0),
   field_586("Plant", 16, 16, 80, 0),
   field_204("Wasteland", 16, 16, 96, 0),
   field_508("Pool", 32, 16, 0, 32),
   field_34("Courbet", 32, 16, 32, 32),
   field_156("Sea", 32, 16, 64, 32),
   field_1402("Sunset", 32, 16, 96, 32),
   field_1446("Creebet", 32, 16, 128, 32),
   field_1320("Wanderer", 16, 32, 0, 64),
   field_1411("Graham", 16, 32, 16, 64),
   field_1106("Match", 32, 32, 0, 128),
   field_538("Bust", 32, 32, 32, 128),
   field_258("Stage", 32, 32, 64, 128),
   field_812("Void", 32, 32, 96, 128),
   field_1013("SkullAndRoses", 32, 32, 128, 128),
   field_534("Fighters", 64, 32, 0, 96),
   field_354("Pointer", 64, 64, 0, 192),
   field_404("Pigscene", 64, 64, 64, 192),
   field_1384("Skeleton", 64, 48, 192, 64),
   field_490("DonkeyKong", 64, 48, 192, 112);

   public final String field_35;
   public final int field_1143;
   public final int field_736;
   public final int field_800;
   public final int field_1561;

   public static Enum256[] method_457() {
      return (Enum256[])field_476.clone();
   }

   public static Enum256 method_521(String var0) {
      return Enum.valueOf(Enum256.class, var0);
   }

   Enum256(String var3, int var4, int var5, int var6, int var7) {
      this.field_35 = var3;
      this.field_1143 = var4;
      this.field_736 = var5;
      this.field_800 = var6;
      this.field_1561 = var7;
   }
}
