package x;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;

public class Class0242 extends JComponent {
   private int[] 3hz9fI3dd9ahFrogNU11mw80u9d16i5ScA710NoB98wS8U0b3c6S1x5R85Lx = new int[256];
   private int 8L469UyNQB39IM13d5600A8W77JlY0UljAo9C2PWEConA2UePU794qNOS8l1 = 0;
   private String[] 2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4 = new String[10];

   public Class0242() {
      this.setPreferredSize(new Dimension(256, 196));
      this.setMinimumSize(new Dimension(256, 196));
      this.setMaximumSize(new Dimension(256, 196));
      new Timer(500, new Class0189(this)).start();
      this.setBackground(Color.WHITE);
   }

   private void _qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs/* $VF was: 5qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs */() {
      long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      System.gc();
      this.2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4[0] = "Memory use: "
         + var1 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4[1] = "Threads: "
         + Class0366.3rPk1hy2D3LvhQLLDOpK4790R2akAtnOY8SXoq9arqybimd70Ro5LJ1asAE2
         + " + "
         + Class0366.2EI2J3VymF7rQ7zsv83iWWfcRXAo95mM6XsHJM274GGo1u3E6mBu9clpqBcL;
      this.3hz9fI3dd9ahFrogNU11mw80u9d16i5ScA710NoB98wS8U0b3c6S1x5R85Lx[this.8L469UyNQB39IM13d5600A8W77JlY0UljAo9C2PWEConA2UePU794qNOS8l1++ & 0xFF] = (int)(
         var1 * 100L / Runtime.getRuntime().maxMemory()
      );
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(1315860));
      var1.fillRect(0, 0, 256, 192);

      for (int var2 = 0; var2 < 256; var2++) {
         int var3 = this.3hz9fI3dd9ahFrogNU11mw80u9d16i5ScA710NoB98wS8U0b3c6S1x5R85Lx[var2 + this.8L469UyNQB39IM13d5600A8W77JlY0UljAo9C2PWEConA2UePU794qNOS8l1
            & 0xFF];
         var1.setColor(new Color(16777215 - (var3 + 28 << 16)));
         var1.fillRect(var2, 100 - var3, 1, var3);
      }

      var1.setColor(Color.WHITE);

      for (int var4 = 0; var4 < this.2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4.length; var4++) {
         String var5 = this.2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4[var4];
         if (var5 != null) {
            var1.drawString(var5, 32, 116 + var4 * 16);
         }
      }
   }

   static void _Vn9PSqf0vcLtc75L59P7r938mcR2Muk507CvdiHHS8fK8i1zVoMbTbUJbQ5/* $VF was: 7Vn9PSqf0vcLtc75L59P7r938mcR2Muk507CvdiHHS8fK8i1zVoMbTbUJbQ5 */(
      Class0242 var0
   ) {
      var0._qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs/* $VF was: 5qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs */();
   }
}
