import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.minecraft.client.Minecraft;

public class 2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll {
   public boolean 99q16b50kyIAY3WydyIly32wBpFBLxi4p3yRL4x1J0O0Z0CR3wEHi9t1G3x9 = true;
   public boolean 0yRCEAwFDV9mBOu59M849721TnV6ElT7DXzAWHz5Qor4Anx7W5pTGD808ZYq = false;
   public boolean 1Q9p51ztMeH5L0oO28iX56xn49Eh9t0ZhEW6Gtn003jXgry844hmYr9985XV = false;
   public int 9E67d5X2srrjQ8fe493f7ub1P59cMh50f2G1a453y7P5UP6YgaLpUO1EN9yR = 8961023;
   public int 4252ptxk91utqUzwxJFw0j8CTrWMs6A4327D4QmrdAsD6mV695v861Puc7f3 = 0;

   public static 2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll _qG6SCyQHhAB3Z4dLMG6530SnOk4ZY0WE2d12Vzgf77VgolUcGMS3afod9NS/* $VF was: 4qG6SCyQHhAB3Z4dLMG6530SnOk4ZY0WE2d12Vzgf77VgolUcGMS3afod9NS */(
      InputStream var0
   ) {
      2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll var1 = new 2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll();
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var0));

      try {
         for (String var3 = var2.readLine(); var3 != null; var3 = var2.readLine()) {
            if (var3.startsWith("+ext1605.update-fx-textures=")) {
               var1.99q16b50kyIAY3WydyIly32wBpFBLxi4p3yRL4x1J0O0Z0CR3wEHi9t1G3x9 = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.no-biomes=")) {
               var1.0yRCEAwFDV9mBOu59M849721TnV6ElT7DXzAWHz5Qor4Anx7W5pTGD808ZYq = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.bilinear=")) {
               var1.1Q9p51ztMeH5L0oO28iX56xn49Eh9t0ZhEW6Gtn003jXgry844hmYr9985XV = var3.substring(var3.indexOf(61) + 1).equals("1");
            } else if (var3.startsWith("+ext1605.color-sky-day=#")) {
               try {
                  var1.9E67d5X2srrjQ8fe493f7ub1P59cMh50f2G1a453y7P5UP6YgaLpUO1EN9yR = Integer.parseInt(var3.substring(var3.indexOf(61) + 2), 16);
               } catch (NumberFormatException var6) {
                  7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._00zpjGx871CfQ97LIlXB4L1a18kKl6sZ3OLerqmn87iT5wYRd5Zq70vJ0m3/* $VF was: 100zpjGx871CfQ97LIlXB4L1a18kKl6sZ3OLerqmn87iT5wYRd5Zq70vJ0m3 */(
                     "[TexPack] '+ext1605.color-sky-day' invalid color argument (not #RRGGBB)"
                  );
               }
            } else if (var3.startsWith("+ext1605.color-sky-night=#")) {
               try {
                  var1.4252ptxk91utqUzwxJFw0j8CTrWMs6A4327D4QmrdAsD6mV695v861Puc7f3 = Integer.parseInt(var3.substring(var3.indexOf(61) + 2), 16);
               } catch (NumberFormatException var5) {
                  7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._00zpjGx871CfQ97LIlXB4L1a18kKl6sZ3OLerqmn87iT5wYRd5Zq70vJ0m3/* $VF was: 100zpjGx871CfQ97LIlXB4L1a18kKl6sZ3OLerqmn87iT5wYRd5Zq70vJ0m3 */(
                     "[TexPack] '+ext1605.color-sky-night' invalid color argument (not #RRGGBB)"
                  );
               }
            }
         }

         var2.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return var1;
   }

   public void _e16037zP017Ybyhw4klyCwOs24S8Nh9OzRYIDt7732Nr83dqO5Otm7FIbRq/* $VF was: 4e16037zP017Ybyhw4klyCwOs24S8Nh9OzRYIDt7732Nr83dqO5Otm7FIbRq */(
      Minecraft var1
   ) {
      Minecraft.8AX67fsnsj54328J9e6FiY9333555Xj726t2182u3TBB948QMZsZX2iz02iv = this.99q16b50kyIAY3WydyIly32wBpFBLxi4p3yRL4x1J0O0Z0CR3wEHi9t1G3x9;
      3p9u95CB1CP0y3UiTUZMGY05o15X75Oi03v43rZTG0wGCHvXqU15Kt1Q8k8Op87au5qr4U1GCvu00LTfk2w3YhwqE0it1tw2g11k.8G80Kimsj2t150ZuEHxk97V3fSV455qzurOOVWgX8oTDDCEH9YV34z9vRAoC = this.0yRCEAwFDV9mBOu59M849721TnV6ElT7DXzAWHz5Qor4Anx7W5pTGD808ZYq;
      3p9u95CB1CP0y3UiTUZMGY05o15X75Oi03v43rZTG0wGCHvXqU15Kt1Q8k8Op87au5qr4U1GCvu00LTfk2w3YhwqE0it1tw2g11k.48H3fYB8k2jE5s5HC81S9Sm600nFD73Lb4N90Pl1F0LSIx70mF1gldgvzgRz = this.1Q9p51ztMeH5L0oO28iX56xn49Eh9t0ZhEW6Gtn003jXgry844hmYr9985XV;
      if (var1.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
         var1.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.2ttHj7fU7c84nf6OIEC396puz5FVh0G0E4K2tH561Ng3vtfV20qYArfeS6hv = this.9E67d5X2srrjQ8fe493f7ub1P59cMh50f2G1a453y7P5UP6YgaLpUO1EN9yR;
         var1.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.6aGUO2jbVGtoxoGHcgMRUkCmunA4cxQ7hz8a29V2I7fc5UVeqFCM92Z8HJnU = this.4252ptxk91utqUzwxJFw0j8CTrWMs6A4327D4QmrdAsD6mV695v861Puc7f3;
      }
   }
}
