package srv;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;

public class JComponent240 extends JComponent {
   private int[] field_591 = new int[256];
   private int field_1346 = 0;
   private String[] field_430 = new String[10];

   public JComponent240() {
      this.setPreferredSize(new Dimension(256, 196));
      this.setMinimumSize(new Dimension(256, 196));
      this.setMaximumSize(new Dimension(256, 196));
      new Timer(500, new ActionListener187(this)).start();
      this.setBackground(Color.WHITE);
   }

   private void method_592() {
      long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      System.gc();
      this.field_430[0] = "Memory use: "
         + var1 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.field_430[1] = "Threads: " + Class363.field_611 + " + " + Class363.field_366;
      this.field_591[this.field_1346++ & 0xFF] = (int)(var1 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(1315860));
      var1.fillRect(0, 0, 256, 192);

      for (int var2 = 0; var2 < 256; var2++) {
         int var3 = this.field_591[var2 + this.field_1346 & 0xFF];
         var1.setColor(new Color(16777215 - (var3 + 28 << 16)));
         var1.fillRect(var2, 100 - var3, 1, var3);
      }

      var1.setColor(Color.WHITE);

      for (int var4 = 0; var4 < this.field_430.length; var4++) {
         String var5 = this.field_430[var4];
         if (var5 != null) {
            var1.drawString(var5, 32, 116 + var4 * 16);
         }
      }
   }

   static void method_776(JComponent240 var0) {
      var0.method_592();
   }
}
