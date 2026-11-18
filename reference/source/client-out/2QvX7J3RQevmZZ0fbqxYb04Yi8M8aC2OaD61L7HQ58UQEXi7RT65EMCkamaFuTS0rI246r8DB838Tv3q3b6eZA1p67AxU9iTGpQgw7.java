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

public class 2QvX7J3RQevmZZ0fbqxYb04Yi8M8aC2OaD61L7HQ58UQEXi7RT65EMCkamaFuTS0rI246r8DB838Tv3q3b6eZA1p67AxU9iTGpQgw7 {
   public static void _mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb/* $VF was: 8mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb */(
      JPanel var0, Component[] var1
   ) {
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
         JLabel var3 = new JLabel(
            new ImageIcon(
               ImageIO.read(
                     1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN._P3TY758VM8951Z7q70WD5qYdKqLdB22jUqQNi8u6rFBU4uZnFfpCw0XU82v/* $VF was: 9P3TY758VM8951Z7q70WD5qYdKqLdB22jUqQNi8u6rFBU4uZnFfpCw0XU82v */(
                        "/dirt.png"
                     )
                  )
                  .getScaledInstance(50, 50, 2)
            )
         );
         var3.setText("Launcher");
         var3.setForeground(Color.WHITE);
         var3.setFont(new Font("Arial", 0, 30));
         _mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb/* $VF was: 8mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb */(
            var2, new Component[]{var3}
         );
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
      _mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb/* $VF was: 8mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb */(
         var2, new Component[]{var5, var4}
      );
      JTextField var6 = new JTextField();
      var6.setPreferredSize(new Dimension(200, 20));
      JLabel var7 = new JLabel("Launch options");
      var7.setForeground(Color.WHITE);
      _mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb/* $VF was: 8mrizGWQ0Mh6Pp4tb49FU0IZkwN1499r0Sqo62o9pWcK97N2T9z24ygg2kGb */(
         var2, new Component[]{var7, var6}
      );
      JButton var8 = new JButton();
      var8.setText("Start");
      var2.add(var8);
      var1.setVisible(true);
   }
}
