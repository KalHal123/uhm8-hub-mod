import java.util.HashSet;
import java.util.Set;

public class av {
   private int a;
   private Class b;
   private Class[] c;
   private Set d = new HashSet();

   public av(int var1, Class var2, Class[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(cj var1) {
      int var2 = var1.b(this.b);
      if (var2 < this.a) {
         for (int var3 = 0; var3 < 3; var3++) {
            this.a(var1, 1, null);
         }
      }
   }

   protected mh a(cj var1, int var2, int var3) {
      int var4 = var2 + var1.m.nextInt(16);
      int var5 = var1.m.nextInt(128);
      int var6 = var3 + var1.m.nextInt(16);
      return new mh(var4, var5, var6);
   }

   private int a(cj var1, int var2, nh var3) {
      this.d.clear();

      for (int var4 = 0; var4 < var1.j.size(); var4++) {
         dg var5 = (dg)var1.j.get(var4);
         int var6 = ei.b(var5.ah / 16.0);
         int var7 = ei.b(var5.aj / 16.0);
         byte var8 = 4;

         for (int var9 = -var8; var9 <= var8; var9++) {
            for (int var10 = -var8; var10 <= var8; var10++) {
               this.d.add(new nx(var9 + var6, var10 + var7));
            }
         }
      }

      int var26 = 0;

      for (nx var28 : this.d) {
         if (var1.m.nextInt(10) == 0) {
            int var29 = var1.m.nextInt(this.c.length);
            mh var30 = this.a(var1, var28.a * 16, var28.b * 16);
            int var31 = var30.a;
            int var32 = var30.b;
            int var11 = var30.c;
            if (var1.g(var31, var32, var11)) {
               return 0;
            }

            if (var1.f(var31, var32, var11) != fs.a) {
               return 0;
            }

            for (int var12 = 0; var12 < 3; var12++) {
               int var13 = var31;
               int var14 = var32;
               int var15 = var11;
               byte var16 = 6;

               for (int var17 = 0; var17 < 2; var17++) {
                  var13 += var1.m.nextInt(var16) - var1.m.nextInt(var16);
                  var14 += var1.m.nextInt(1) - var1.m.nextInt(1);
                  var15 += var1.m.nextInt(var16) - var1.m.nextInt(var16);
                  if (var1.g(var13, var14 - 1, var15) && !var1.g(var13, var14, var15) && !var1.f(var13, var14, var15).d() && !var1.g(var13, var14 + 1, var15)) {
                     float var18 = var13 + 0.5F;
                     float var19 = var14;
                     float var20 = var15 + 0.5F;
                     if (var1.a(var18, var19, var20, 24.0) == null) {
                        float var21 = var18 - var1.n;
                        float var22 = var19 - var1.o;
                        float var23 = var20 - var1.p;
                        float var24 = var21 * var21 + var22 * var22 + var23 * var23;
                        if (!(var24 < 576.0F)) {
                           try {
                              var33 = (fv)this.c[var29].getConstructor(cj.class).newInstance(var1);
                           } catch (Exception var25) {
                              var25.printStackTrace();
                              return var26;
                           }

                           var33.c(var18, var19, var20, var1.m.nextFloat() * 360.0F, 0.0F);
                           if (var33.a()) {
                              var26++;
                              var1.a(var33);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var26;
   }
}
