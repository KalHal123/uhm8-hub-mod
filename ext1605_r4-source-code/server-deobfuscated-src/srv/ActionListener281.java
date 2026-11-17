package srv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class ActionListener281 implements ActionListener {
   final JTextField field_938;
   final JComponent140 field_1047;

   ActionListener281(JComponent140 var1, JTextField var2) {
      this.field_1047 = var1;
      this.field_938 = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = this.field_938.getText().trim();
      if (var2.length() > 0) {
         JComponent140.method_7(this.field_1047).method_3(var2, this.field_1047);
      }

      this.field_938.setText("");
   }
}
