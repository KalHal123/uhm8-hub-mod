import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;

public class 66vV0DmzJt23om5o241l6rV1u2hO0ABptTaq9aDL8DExPnLwj54s5uLSIDx2nNg144831c1z81YWFWiuywQBGeg8F8pRl extends JComponent {
   private int[] 3hz9fI3dd9ahFrogNU11mw80u9d16i5ScA710NoB98wS8U0b3c6S1x5R85Lx = new int[256];
   private int 8L469UyNQB39IM13d5600A8W77JlY0UljAo9C2PWEConA2UePU794qNOS8l1 = 0;
   private String[] 2hR3K9EQdVhC73jWJxjcv7D9qqQavFQrCzRz9w2P0LYU3M9mbmZJ0tnq2Jo4 = new String[10];

   public _6vV0DmzJt23om5o241l6rV1u2hO0ABptTaq9aDL8DExPnLwj54s5uLSIDx2nNg144831c1z81YWFWiuywQBGeg8F8pRl/* $VF was: 66vV0DmzJt23om5o241l6rV1u2hO0ABptTaq9aDL8DExPnLwj54s5uLSIDx2nNg144831c1z81YWFWiuywQBGeg8F8pRl */() {
      this.setPreferredSize(new Dimension(256, 196));
      this.setMinimumSize(new Dimension(256, 196));
      this.setMaximumSize(new Dimension(256, 196));
      new Timer(500, new 4XbiBz6AFojxu10UNeuvREMDctBxc99KfY089NcK6km8enKcnj767qYH287A0F32j65m7825a788cR5rx1joYjxQ2bgsC69A4(this)).start();
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
         + 9D5UxDf5CAUF8j9j9ZIa4vqUSV3P9C73t02c81nLq4Q3An4PEqtqdz0HFMrjES28WQ0R6gXOJ67AQLEQLGA8A5hT0CxljY.3rPk1hy2D3LvhQLLDOpK4790R2akAtnOY8SXoq9arqybimd70Ro5LJ1asAE2
         + " + "
         + 9D5UxDf5CAUF8j9j9ZIa4vqUSV3P9C73t02c81nLq4Q3An4PEqtqdz0HFMrjES28WQ0R6gXOJ67AQLEQLGA8A5hT0CxljY.2EI2J3VymF7rQ7zsv83iWWfcRXAo95mM6XsHJM274GGo1u3E6mBu9clpqBcL;
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
      66vV0DmzJt23om5o241l6rV1u2hO0ABptTaq9aDL8DExPnLwj54s5uLSIDx2nNg144831c1z81YWFWiuywQBGeg8F8pRl var0
   ) {
      var0._qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs/* $VF was: 5qf6M5yI46QHVgYCYpZQIEYJUwA15C8rydbli166x5P9IsrodG1aiq3f5vWs */();
   }
}
