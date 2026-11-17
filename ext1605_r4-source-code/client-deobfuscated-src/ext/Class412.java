package ext;

import java.io.File;

public class Class412 extends Class46 {
   Class326[] field_276 = new Class326[]{
      new Class326(-299L, 86L, 155L),
      new Class326(-233L, 73L, 122L),
      new Class326(-234L, 87L, 57L),
      new Class326(-174L, 76L, 62L),
      new Class326(-177L, 83L, 99L),
      new Class326(-186L, 68L, 140L)
   };
   private boolean field_2101 = false;
   private int field_1035 = 0;

   @Override
   public Class326 method_63() {
      return new Class326(-173L, 66L, 123L);
   }

   public Class412(File var1, String var2) {
      super(var1, var2);
      this.field_2197.add(new Class654(new Class422(-188, 66, 141, "house_1"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-188, 66, 151, "house_2"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-187, 67, 92, "c_1"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-162, 66, 109, "c_2"), new Class326(0L, -1L, 0L)));
      this.field_2197.add(new Class654(new Class422(-172, 66, 178, "other_1"), null));
      this.field_2197.add(new Class654(new Class422(-248, 78, 158, "fountainspawn"), null));
      this.method_1350(new Class326(-181L, 65L, 144L), new Class326(-170L, 68L, 144L));
      this.method_1350(new Class326(-181L, 65L, 130L), new Class326(-181L, 68L, 117L));
      this.method_1350(new Class326(-213L, 64L, 123L), new Class326(-213L, 68L, 120L));
      this.method_1350(new Class326(-191L, 65L, 165L), new Class326(-191L, 68L, 160L));
      this.method_1350(new Class326(-187L, 65L, 168L), new Class326(-170L, 68L, 168L));
      this.method_1350(new Class326(-172L, 65L, 115L), new Class326(-181L, 68L, 115L));
      this.method_1350(new Class326(-181L, 66L, 87L), new Class326(-174L, 69L, 87L));
      this.method_1350(new Class326(-252L, 75L, 150L), new Class326(-248L, 82L, 148L));
      this.method_1350(new Class326(-268L, 75L, 158L), new Class326(-270L, 82L, 156L));
      this.method_1350(new Class326(-217L, 76L, 156L), new Class326(-218L, 79L, 159L));
      this.method_1350(new Class326(-235L, 79L, 107L), new Class326(-230L, 85L, 104L));
      this.method_1481(-314, 71, 159, Class390.field_1849.field_2151);
      this.method_1481(-314, 71, 157, 167);
      Class100.method_838(this, new Class326(-340L, 60L, 159L), new Class326(-340L, 67L, 172L), 0, Class390.field_2495.field_2151);

      for (Class326 var6 : this.field_276) {
         this.method_1481((int)var6.field_809, (int)var6.field_805, (int)var6.field_3039, 0);
      }
   }

   @Override
   public void method_330(Class326 var1, int var2) {
      if (var1.method_878(new Class326(-314L, 71L, 159L))) {
         this.field_2101 = true;
         this.method_1481(-314, 71, 159, 0);
         Class119.field_1519.field_485.method_1511("ext.notif", 1.0F, 0.0F);
         Class119.field_1519.field_964.field_936.method_1305("0/6", 2000);

         for (Class326 var6 : this.field_276) {
            this.method_1481((int)var6.field_809, (int)var6.field_805, (int)var6.field_3039, Class390.field_1849.field_2151);
         }
      } else if (this.field_2101) {
         Class119.field_1519.field_964.field_936.method_1305(++this.field_1035 + "/6", 2000);
         this.method_1481((int)var1.field_809, (int)var1.field_805, (int)var1.field_3039, 0);
         Class119.field_1519.field_485.method_1511("ext.notif", 1.0F, 0.0F);
         this.method_861(var1.field_809, var1.field_805, var1.field_3039, "random.glass", 1.0F, 0.0F);
         if (this.field_1035 == 6) {
            this.method_1481(-314, 71, 157, 0);
            this.method_861(-314.0, 71.0, 157.0, "random.glass", 1.0F, 0.0F);
            Class119.field_1519.field_813.field_2838.method_872(this, this.field_1035);
         }
      }

      Class597.method_883(var1.toString());
   }
}
