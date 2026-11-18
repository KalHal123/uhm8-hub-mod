package x;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class0007 {
   public static Logger 5O9qq1OQp1c2397RDS538uGYN7v59FY04998Ypv3eD5X5E2siZ1pGxFDN094 = Logger.getLogger("Minecraft");
   private Properties 1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO = new Properties();
   private File 0Tt1ysSN79s1v9X0h7ar3Rk872ZKKRa8t550H5ihR57uRso9hTY40AiPay5L;

   public Class0007(File var1) {
      this.0Tt1ysSN79s1v9X0h7ar3Rk872ZKKRa8t550H5ihR57uRso9hTY40AiPay5L = var1;
      if (var1.exists()) {
         try {
            this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.load(new FileInputStream(var1));
         } catch (Exception var3) {
            5O9qq1OQp1c2397RDS538uGYN7v59FY04998Ypv3eD5X5E2siZ1pGxFDN094.log(Level.WARNING, "Failed to load " + var1, var3);
            this._NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC/* $VF was: 4NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC */();
         }
      } else {
         5O9qq1OQp1c2397RDS538uGYN7v59FY04998Ypv3eD5X5E2siZ1pGxFDN094.log(Level.WARNING, var1 + " does not exist");
         this._NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC/* $VF was: 4NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC */();
      }
   }

   public void _NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC/* $VF was: 4NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC */() {
      5O9qq1OQp1c2397RDS538uGYN7v59FY04998Ypv3eD5X5E2siZ1pGxFDN094.log(Level.INFO, "Generating new properties file");
      this._gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g/* $VF was: 1gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g */();
   }

   public void _gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g/* $VF was: 1gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g */() {
      try {
         this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO
            .store(new FileOutputStream(this.0Tt1ysSN79s1v9X0h7ar3Rk872ZKKRa8t550H5ihR57uRso9hTY40AiPay5L), "Minecraft server properties");
      } catch (Exception var2) {
         5O9qq1OQp1c2397RDS538uGYN7v59FY04998Ypv3eD5X5E2siZ1pGxFDN094.log(
            Level.WARNING, "Failed to save " + this.0Tt1ysSN79s1v9X0h7ar3Rk872ZKKRa8t550H5ihR57uRso9hTY40AiPay5L, var2
         );
         this._NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC/* $VF was: 4NaQw7F7mYloU192673gt10HSaHo504nC9jduq10FoN6574M9FslfV5AWvwC */();
      }
   }

   public String _ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR/* $VF was: 6ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR */(
      String var1, String var2
   ) {
      if (!this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.containsKey(var1)) {
         this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.setProperty(var1, var2);
         this._gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g/* $VF was: 1gbvNjY491j6tmbyn04KhU7D35p7m8788E4zCfgKaQbzo2a4QKK5dtgfMe4g */();
      }

      return this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.getProperty(var1, var2);
   }

   public int _4WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP/* $VF was: 34WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP */(
      String var1, int var2
   ) {
      try {
         return Integer.parseInt(
            this._ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR/* $VF was: 6ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR */(
               var1, "" + var2
            )
         );
      } catch (Exception var4) {
         this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean _0lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN/* $VF was: 30lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN */(
      String var1, boolean var2
   ) {
      try {
         return Boolean.parseBoolean(
            this._ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR/* $VF was: 6ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR */(
               var1, "" + var2
            )
         );
      } catch (Exception var4) {
         this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean _H2aluO4N7CjTQJsC0FBzS1Ou41e5OvM841oqY8722SzAhw4T50U068yt7d4/* $VF was: 8H2aluO4N7CjTQJsC0FBzS1Ou41e5OvM841oqY8722SzAhw4T50U068yt7d4 */(
      String var1, boolean var2
   ) {
      try {
         return Boolean.parseBoolean(
            this._56hl3dVCdE5gDD4Xh4iWu39VyR52avyjbVp765Ln6p9JIrNFg8978B5fD8d/* $VF was: 456hl3dVCdE5gDD4Xh4iWu39VyR52avyjbVp765Ln6p9JIrNFg8978B5fD8d */(
               var1, "" + var2
            )
         );
      } catch (Exception var4) {
         return var2;
      }
   }

   public String _56hl3dVCdE5gDD4Xh4iWu39VyR52avyjbVp765Ln6p9JIrNFg8978B5fD8d/* $VF was: 456hl3dVCdE5gDD4Xh4iWu39VyR52avyjbVp765Ln6p9JIrNFg8978B5fD8d */(
      String var1, String var2
   ) {
      return this.1iZ8d7Pct747k8Mf1hD9q83uVRD053GT72TWZFcWa60T84g2z41O78ZO2jNO.getProperty(var1, var2);
   }
}
