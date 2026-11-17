import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

public class 27XxM6OK1K21FLb25G1x9GlG9Je52AJ6r5o7NEEMSUyFDpC0bIp3sR7alZT165Q8h8dj54jrc5n36U587mdQlWg77J3sf extends Handler {
   private int[] 01dq55kB1D6j8pCuVktZY46dD19xPf1uPBDx1yH27P3jGqP573U6805qjdvR = new int[1024];
   private int 70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr = 0;
   Formatter 79i1pe6FxbU28lYyRlruZC6dt0Zr447mfeMyivk4f3E8GS7S4afeuvH84aj8 = new 2d61e7PWSxEOeNERbNAWtLNy8zzAW0kMZAyzhHQ0qvjP8415QZtdYYYr4D36UHwG0ok53lZ2w9H74Qq7agbafcaJ9q36P(
      this
   );
   private JTextArea 4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf;

   public _7XxM6OK1K21FLb25G1x9GlG9Je52AJ6r5o7NEEMSUyFDpC0bIp3sR7alZT165Q8h8dj54jrc5n36U587mdQlWg77J3sf/* $VF was: 27XxM6OK1K21FLb25G1x9GlG9Je52AJ6r5o7NEEMSUyFDpC0bIp3sR7alZT165Q8h8dj54jrc5n36U587mdQlWg77J3sf */(
      JTextArea var1
   ) {
      this.setFormatter(this.79i1pe6FxbU28lYyRlruZC6dt0Zr447mfeMyivk4f3E8GS7S4afeuvH84aj8);
      this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf = var1;
   }

   @Override
   public void close() {
   }

   @Override
   public void flush() {
   }

   @Override
   public void publish(LogRecord var1) {
      int var2 = this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf.getDocument().getLength();
      this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf.append(this.79i1pe6FxbU28lYyRlruZC6dt0Zr447mfeMyivk4f3E8GS7S4afeuvH84aj8.format(var1));
      this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf
         .setCaretPosition(this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf.getDocument().getLength());
      int var3 = this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf.getDocument().getLength() - var2;
      if (this.01dq55kB1D6j8pCuVktZY46dD19xPf1uPBDx1yH27P3jGqP573U6805qjdvR[this.70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr] != 0) {
         this.4Ko8x7f91mo4YqMz70Y69k1eZEU2346ge2TP82dO83E4ZGfD8D7xmcv5qfgf
            .replaceRange(
               "", 0, this.01dq55kB1D6j8pCuVktZY46dD19xPf1uPBDx1yH27P3jGqP573U6805qjdvR[this.70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr]
            );
      }

      this.01dq55kB1D6j8pCuVktZY46dD19xPf1uPBDx1yH27P3jGqP573U6805qjdvR[this.70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr] = var3;
      this.70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr = (this.70pCvWZmvpD69oB0FUL81ZJj35iOakiMh356N3CFF81pkwE6hE6h71M5GZSr + 1) % 1024;
   }
}
