package x;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.server.MinecraftServer;

final class Class0055 extends WindowAdapter {
   final MinecraftServer 5voU3aIs07Mu9CRowHA328qgc4prFpDNvY1kS5p3b4QRpPj5x1jm9QGnqp1o;

   Class0055(MinecraftServer var1) {
      this.5voU3aIs07Mu9CRowHA328qgc4prFpDNvY1kS5p3b4QRpPj5x1jm9QGnqp1o = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.5voU3aIs07Mu9CRowHA328qgc4prFpDNvY1kS5p3b4QRpPj5x1jm9QGnqp1o
         ._pO91HnWrjrjOOo585691SJZP3mKk46Pv3JCgQ4GqleQEx8rKsKRpH61r9c5/* $VF was: 8pO91HnWrjrjOOo585691SJZP3mKk46Pv3JCgQ4GqleQEx8rKsKRpH61r9c5 */();

      while (!this.5voU3aIs07Mu9CRowHA328qgc4prFpDNvY1kS5p3b4QRpPj5x1jm9QGnqp1o.4e9doDH1KSK02j5KiH971S3q4D0KACFejPc4c839KoX5457iW3Fv7hK8vFiw) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      System.exit(0);
   }
}
