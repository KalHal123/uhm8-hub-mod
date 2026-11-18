package x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.minecraft.server.MinecraftServer;

public class Class0314 extends Thread {
   final MinecraftServer 8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X;

   public Class0314(MinecraftServer var1) {
      this.8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X = var1;
   }

   @Override
   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
      String var2 = null;

      try {
         while (
            !this.8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X.4e9doDH1KSK02j5KiH971S3q4D0KACFejPc4c839KoX5457iW3Fv7hK8vFiw
               && MinecraftServer._Xp71NCetA9Tks82L0o281iF44M0bpN30QWv32Ar1b1SZFseoAyRlIHI1T5B/* $VF was: 3Xp71NCetA9Tks82L0o281iF44M0bpN30QWv32Ar1b1SZFseoAyRlIHI1T5B */(
                  this.8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X
               )
               && (var2 = var1.readLine()) != null
         ) {
            this.8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X
               ._0n4JGs731KDGijo2uzzGl0CXlVIf3m89409b60FUk4mSp46Iyi27A9j746M/* $VF was: 00n4JGs731KDGijo2uzzGl0CXlVIf3m89409b60FUk4mSp46Iyi27A9j746M */(
                  var2, this.8oslPAMn5706ckWelXQjeJu136V64KAx98OlO72Ns1p9m4rEwpJOmcnoUL7X
               );
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }
}
