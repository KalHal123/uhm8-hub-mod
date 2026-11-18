package srv;

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

public class JComponent140 extends JComponent implements Interface286 {
   public static Logger field_1157 = Logger.getLogger("Minecraft");
   private MinecraftServer field_300;
   private Font field_685 = null;
   private Font field_701 = null;

   public static void method_700(MinecraftServer var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var3) {
      }

      JComponent140 var1 = new JComponent140(var0);
      JFrame var2 = new JFrame("Minecraft server");
      var2.add(var1);
      var2.pack();
      var2.setLocationRelativeTo((Component)null);
      var2.setVisible(true);
      var2.addWindowListener(new WindowAdapter56(var0));
   }

   public JComponent140(MinecraftServer var1) {
      this.field_300 = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());
      this.field_685 = Font.getFont("Arial");
      this.field_701 = new Font("Consolas", 0, 12);

      try {
         this.add(this.method_435(), "Center");
         this.add(this.method_990(), "West");
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private JComponent method_990() {
      JPanel var1 = new JPanel(new BorderLayout());
      var1.add(new JComponent240(), "North");
      var1.add(this.method_108(), "Center");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var1;
   }

   private JComponent method_108() {
      JList230 var1 = new JList230(this.field_300);
      JScrollPane var2 = new JScrollPane(var1, 22, 30);
      TitledBorder var3 = new TitledBorder(new EtchedBorder(), "Players");
      var2.setBorder(var3);
      var1.setBackground(new Color(1315860));
      var1.setForeground(Color.WHITE);
      return var2;
   }

   private JComponent method_435() {
      JPanel var1 = new JPanel(new BorderLayout());
      JTextArea var2 = new JTextArea();
      field_1157.addHandler(new Handler80(var2));
      JScrollPane var3 = new JScrollPane(var2, 22, 30);
      var2.setEditable(false);
      if (this.field_701 != null) {
         var2.setFont(this.field_701);
      }

      var2.setBackground(new Color(20, 20, 20, 255));
      var2.setForeground(new Color(255, 255, 255, 255));
      JTextField var4 = new JTextField();
      var4.addActionListener(new ActionListener281(this, var4));
      var2.addFocusListener(new FocusAdapter79(this));
      var1.add(var3, "Center");
      var1.add(var4, "South");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      return var1;
   }

   @Override
   public void method_445(String var1) {
      field_1157.info(var1);
   }

   @Override
   public String method_337() {
      return "CONSOLE";
   }

   static MinecraftServer method_7(JComponent140 var0) {
      return var0.field_300;
   }
}
