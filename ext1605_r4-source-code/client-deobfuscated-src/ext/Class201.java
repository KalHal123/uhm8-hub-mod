package ext;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Class201 {
   public static void method_1729(JPanel var0, Component[] var1) {
      JPanel var2 = new JPanel(new FlowLayout(0));
      var2.setBackground(new Color(30, 30, 30));

      for (Component var6 : var1) {
         var2.add(var6);
      }

      var0.add(var2);
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("â—†1.0.16.05");
      var1.setSize(330, 210);
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 1));
      var2.setAlignmentX(0.0F);
      var2.setMaximumSize(var2.getPreferredSize());
      var2.setBackground(new Color(30, 30, 30));
      var1.add(var2);

      try {
         JLabel var3 = new JLabel(new ImageIcon(ImageIO.read(Class100.method_1854("/dirt.png")).getScaledInstance(50, 50, 2)));
         var3.setText("Launcher");
         var3.setForeground(Color.WHITE);
         var3.setFont(new Font("Arial", 0, 30));
         method_1729(var2, new Component[]{var3});
      } catch (IOException var9) {
         var9.printStackTrace();
      }

      Box var10 = Box.createHorizontalBox();
      var10.setSize(new Dimension(300, 3));
      var2.add(var10);
      JTextField var4 = new JTextField();
      var4.setPreferredSize(new Dimension(200, 20));
      JLabel var5 = new JLabel("Player name");
      var5.setForeground(Color.WHITE);
      method_1729(var2, new Component[]{var5, var4});
      JTextField var6 = new JTextField();
      var6.setPreferredSize(new Dimension(200, 20));
      JLabel var7 = new JLabel("Launch options");
      var7.setForeground(Color.WHITE);
      method_1729(var2, new Component[]{var7, var6});
      JButton var8 = new JButton();
      var8.setText("Start");
      var2.add(var8);
      var1.setVisible(true);
   }
}
