package srv;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.swing.JTextArea;

public class Handler80 extends Handler {
   private int[] field_8 = new int[1024];
   private int field_1128 = 0;
   Formatter field_1171 = new Formatter101(this);
   private JTextArea field_700;

   public Handler80(JTextArea var1) {
      this.setFormatter(this.field_1171);
      this.field_700 = var1;
   }

   @Override
   public void close() {
   }

   @Override
   public void flush() {
   }

   @Override
   public void publish(LogRecord var1) {
      int var2 = this.field_700.getDocument().getLength();
      this.field_700.append(this.field_1171.format(var1));
      this.field_700.setCaretPosition(this.field_700.getDocument().getLength());
      int var3 = this.field_700.getDocument().getLength() - var2;
      if (this.field_8[this.field_1128] != 0) {
         this.field_700.replaceRange("", 0, this.field_8[this.field_1128]);
      }

      this.field_8[this.field_1128] = var3;
      this.field_1128 = (this.field_1128 + 1) % 1024;
   }
}
