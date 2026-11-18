package x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

class Class0086 extends Thread {
   final Class0203 17MEQ81YUgH351RHSKYE6hVYDBdQadI9hCUTa4F9i08J6g7ZRINl5rpaky4I;
   final Class0073 7eO9E0qfEEf5sm4M4h5jEt46041sbB7RqS8C03oZ1037hE4T9i481q0t7U1U;

   Class0086(Class0073 var1, Class0203 var2) {
      this.7eO9E0qfEEf5sm4M4h5jEt46041sbB7RqS8C03oZ1037hE4T9i481q0t7U1U = var1;
      this.17MEQ81YUgH351RHSKYE6hVYDBdQadI9hCUTa4F9i08J6g7ZRINl5rpaky4I = var2;
   }

   @Override
   public void run() {
      try {
         String var1 = Class0073._S9880rVMBqgE8ZCZxVbL5O53Buyfuf47CU20A25Ls8OV9JjM19w1b2EAHJq/* $VF was: 2S9880rVMBqgE8ZCZxVbL5O53Buyfuf47CU20A25Ls8OV9JjM19w1b2EAHJq */(
            this.7eO9E0qfEEf5sm4M4h5jEt46041sbB7RqS8C03oZ1037hE4T9i481q0t7U1U
         );
         URL var2 = new URL(
            "http://www.minecraft.net/game/checkserver.jsp?user="
               + this.17MEQ81YUgH351RHSKYE6hVYDBdQadI9hCUTa4F9i08J6g7ZRINl5rpaky4I.0ng8NxZRD43AjTtMd7aUGCCadIWu0Jr8RbTPsZ3QwC20jri4SCvDZ4K2mLDc
               + "&serverId="
               + var1
         );
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = var3.readLine();
         var3.close();
         System.out.println("THE REPLY IS " + var4);
         if (var4.equals("YES")) {
            Class0073._8u247rbnuTRlqQM4qpSYjkPx7MLO17qKLI8j0aKE5Ama7WUzYtC92WThCaJ/* $VF was: 48u247rbnuTRlqQM4qpSYjkPx7MLO17qKLI8j0aKE5Ama7WUzYtC92WThCaJ */(
               this.7eO9E0qfEEf5sm4M4h5jEt46041sbB7RqS8C03oZ1037hE4T9i481q0t7U1U, this.17MEQ81YUgH351RHSKYE6hVYDBdQadI9hCUTa4F9i08J6g7ZRINl5rpaky4I
            );
         } else {
            this.7eO9E0qfEEf5sm4M4h5jEt46041sbB7RqS8C03oZ1037hE4T9i481q0t7U1U
               ._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
                  "Failed to verify username!"
               );
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }
}
