import java.io.IOException;
import java.net.Socket;
import net.minecraft.server.MinecraftServer;

class 8LqhhUky6snO3286U556Y06V1Fw6g77j0dfB085n9478w67A138jn6Vpv0FaxxDV00L915wW5rL16801tHKycnD1541d0d4L8G extends Thread {
   final MinecraftServer 4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k;
   final 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L 3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT;

   _LqhhUky6snO3286U556Y06V1Fw6g77j0dfB085n9478w67A138jn6Vpv0FaxxDV00L915wW5rL16801tHKycnD1541d0d4L8G/* $VF was: 8LqhhUky6snO3286U556Y06V1Fw6g77j0dfB085n9478w67A138jn6Vpv0FaxxDV00L915wW5rL16801tHKycnD1541d0d4L8G */(
      5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L var1, String var2, MinecraftServer var3
   ) {
      super(var2);
      this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT = var1;
      this.4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k = var3;
   }

   @Override
   public void run() {
      while (this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT.843obqINT447jg1wxMKoAK4DlUHsD21kGHsI944Ba7Z09Z287L1Jh80gjPJ2) {
         try {
            Socket var1 = 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L._1voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb/* $VF was: 41voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb */(
                  this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT
               )
               .accept();
            if (var1 != null) {
               22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a var2 = new 22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a(
                  this.4QM3FN895jWNAsTp3y3N4HY07dR34UThATxKRgxvDM540rD7e0n8Vp6n847k,
                  var1,
                  "Connection #"
                     + 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L._g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17/* $VF was: 5g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17 */(
                        this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT
                     )
               );
               5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L._2ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U/* $VF was: 72ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U */(
                  this.3C2jjt13v6NX91NOIf0idUu2016l36PO126fYkdOJKm9zDtj24LjKB6zN1JT, var2
               );
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }
}
