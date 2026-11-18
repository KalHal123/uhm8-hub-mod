package x;

import java.io.IOException;
import java.net.Socket;
import net.minecraft.server.MinecraftServer;

class Class0333 extends Thread {
   final MinecraftServer 4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k;
   final Class0227 3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT;

   Class0333(Class0227 var1, String var2, MinecraftServer var3) {
      super(var2);
      this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT = var1;
      this.4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k = var3;
   }

   @Override
   public void run() {
      while (this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT.843obqINT447jg1wxMKoAK4DlUHsD21kGHsI944Ba7Z09Z287L1Jh80gjPJ2) {
         try {
            Socket var1 = Class0227._1voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb/* $VF was: 41voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb */(
                  this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT
               )
               .accept();
            if (var1 != null) {
               Class0073 var2 = new Class0073(
                  this.4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k,
                  var1,
                  "Connection #"
                     + Class0227._g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17/* $VF was: 5g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17 */(
                        this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT
                     )
               );
               Class0227._2ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U/* $VF was: 72ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U */(
                  this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT, var2
               );
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }
}
