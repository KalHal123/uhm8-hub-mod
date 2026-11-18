package x;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import net.minecraft.server.MinecraftServer;

public class Class0142 extends JComponent implements Class0289 {
   public static Logger 77tA0V87c4oS3u3EFbPr3Hhtru3201o44MKWFH8o2y3Jmg6iuDR44oaFSjuw = Logger.getLogger("Minecraft");
   private MinecraftServer 1y9lbOC74IAAxbxIB9qii56K1Q21Vc0A57WsSJMIn8kpBCJWDDO4ywB1B8Xi;
   private Font 4GJDwM6wdTG9u7cpwMVJGahK88a2YKjN9zSQT3N7t3fZ9fZxgaZ1UEb1jJ0r = null;
   private Font 4L5u7zyAz1z5z5r0Ptnn8yxV43C39s9AfvwKjoY1ZtK7J7207yh79034s0Q3 = null;

   public static void _p9Qx9hFIjzdm0d2B8c6W1z5H1PMME22GU84cHxnJ0Rjb66Mj43aGdA3n415/* $VF was: 6p9Qx9hFIjzdm0d2B8c6W1z5H1PMME22GU84cHxnJ0Rjb66Mj43aGdA3n415 */(
      MinecraftServer var0
   ) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var3) {
      }

      Class0142 var1 = new Class0142(var0);
      JFrame var2 = new JFrame("Minecraft server");
      var2.add(var1);
      var2.pack();
      var2.setLocationRelativeTo((Component)null);
      var2.setVisible(true);
      var2.addWindowListener(new Class0055(var0));
   }

   public Class0142(MinecraftServer var1) {
      this.1y9lbOC74IAAxbxIB9qii56K1Q21Vc0A57WsSJMIn8kpBCJWDDO4ywB1B8Xi = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());
      this.4GJDwM6wdTG9u7cpwMVJGahK88a2YKjN9zSQT3N7t3fZ9fZxgaZ1UEb1jJ0r = Font.getFont("Arial");
      this.4L5u7zyAz1z5z5r0Ptnn8yxV43C39s9AfvwKjoY1ZtK7J7207yh79034s0Q3 = new Font("Consolas", 0, 12);

      try {
         this.add(
            this._E69FzD02O95Iv537E4N0T6v2aDWNz74KXNl5b2znJ0QYy24VWHMb2g4w4fz/* $VF was: 4E69FzD02O95Iv537E4N0T6v2aDWNz74KXNl5b2znJ0QYy24VWHMb2g4w4fz */(),
            "Center"
         );
         this.add(
            this._Um5yvEM2Ut0KGdJ7WxP9828aIK4r6vt2paB5cTO88HUl8rbWK1cI0HCU5XC/* $VF was: 9Um5yvEM2Ut0KGdJ7WxP9828aIK4r6vt2paB5cTO88HUl8rbWK1cI0HCU5XC */(),
            "West"
         );
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private JComponent _Um5yvEM2Ut0KGdJ7WxP9828aIK4r6vt2paB5cTO88HUl8rbWK1cI0HCU5XC/* $VF was: 9Um5yvEM2Ut0KGdJ7WxP9828aIK4r6vt2paB5cTO88HUl8rbWK1cI0HCU5XC */() {
      JPanel var1 = new JPanel(new BorderLayout());
      var1.add(new Class0242(), "North");
      var1.add(
         this._1Lz0FWacdNoylR31JK416siK6l4Z822r56eM7ygnC4xOemdFP8k3453h90A/* $VF was: 11Lz0FWacdNoylR31JK416siK6l4Z822r56eM7ygnC4xOemdFP8k3453h90A */(),
         "Center"
      );
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var1;
   }

   private JComponent _1Lz0FWacdNoylR31JK416siK6l4Z822r56eM7ygnC4xOemdFP8k3453h90A/* $VF was: 11Lz0FWacdNoylR31JK416siK6l4Z822r56eM7ygnC4xOemdFP8k3453h90A */() {
      Class0232 var1 = new Class0232(this.1y9lbOC74IAAxbxIB9qii56K1Q21Vc0A57WsSJMIn8kpBCJWDDO4ywB1B8Xi);
      JScrollPane var2 = new JScrollPane(var1, 22, 30);
      TitledBorder var3 = new TitledBorder(new EtchedBorder(), "Players");
      var2.setBorder(var3);
      var1.setBackground(new Color(1315860));
      var1.setForeground(Color.WHITE);
      return var2;
   }

   private JComponent _E69FzD02O95Iv537E4N0T6v2aDWNz74KXNl5b2znJ0QYy24VWHMb2g4w4fz/* $VF was: 4E69FzD02O95Iv537E4N0T6v2aDWNz74KXNl5b2znJ0QYy24VWHMb2g4w4fz */() {
      JPanel var1 = new JPanel(new BorderLayout());
      JTextArea var2 = new JTextArea();
      77tA0V87c4oS3u3EFbPr3Hhtru3201o44MKWFH8o2y3Jmg6iuDR44oaFSjuw.addHandler(new Class0078(var2));
      JScrollPane var3 = new JScrollPane(var2, 22, 30);
      var2.setEditable(false);
      if (this.4L5u7zyAz1z5z5r0Ptnn8yxV43C39s9AfvwKjoY1ZtK7J7207yh79034s0Q3 != null) {
         var2.setFont(this.4L5u7zyAz1z5z5r0Ptnn8yxV43C39s9AfvwKjoY1ZtK7J7207yh79034s0Q3);
      }

      var2.setBackground(new Color(20, 20, 20, 255));
      var2.setForeground(new Color(255, 255, 255, 255));
      JTextField var4 = new JTextField();
      var4.addActionListener(new Class0284(this, var4));
      var2.addFocusListener(new Class0077(this));
      var1.add(var3, "Center");
      var1.add(var4, "South");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      return var1;
   }

   @Override
   public void _LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
      String var1
   ) {
      77tA0V87c4oS3u3EFbPr3Hhtru3201o44MKWFH8o2y3Jmg6iuDR44oaFSjuw.info(var1);
   }

   @Override
   public String _KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2/* $VF was: 3KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2 */() {
      return "CONSOLE";
   }

   static MinecraftServer _1v3X1VDA7jEz2CWqke40sSQ50VsZo1DeEXLC5tt262yT3em849RxSjfbBu8/* $VF was: 01v3X1VDA7jEz2CWqke40sSQ50VsZo1DeEXLC5tt262yT3em849RxSjfbBu8 */(
      Class0142 var0
   ) {
      return var0.1y9lbOC74IAAxbxIB9qii56K1Q21Vc0A57WsSJMIn8kpBCJWDDO4ywB1B8Xi;
   }
}
