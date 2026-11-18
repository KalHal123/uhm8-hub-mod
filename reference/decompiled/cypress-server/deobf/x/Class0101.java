package x;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

class Class0101 extends Formatter {
   final Class0078 33C91VlDTG14bRvSGZ63wXs191bCnz426LT5g6Q300x9Mw5vvJyYtqho4ZOp;

   Class0101(Class0078 var1) {
      this.33C91VlDTG14bRvSGZ63wXs191bCnz426LT5g6Q300x9Mw5vvJyYtqho4ZOp = var1;
   }

   @Override
   public String format(LogRecord var1) {
      StringBuilder var2 = new StringBuilder();
      Level var3 = var1.getLevel();
      if (var3 == Level.FINEST) {
         var2.append("[FINEST] ");
      } else if (var3 == Level.FINER) {
         var2.append("[FINER] ");
      } else if (var3 == Level.FINE) {
         var2.append("[FINE] ");
      } else if (var3 == Level.INFO) {
         var2.append("[INFO] ");
      } else if (var3 == Level.WARNING) {
         var2.append("[WARNING] ");
      } else if (var3 == Level.SEVERE) {
         var2.append("[SEVERE] ");
      } else if (var3 == Level.SEVERE) {
         var2.append("[" + var3.getLocalizedName() + "] ");
      }

      var2.append(var1.getMessage());
      var2.append('\n');
      Throwable var4 = var1.getThrown();
      if (var4 != null) {
         StringWriter var5 = new StringWriter();
         var4.printStackTrace(new PrintWriter(var5));
         var2.append(var5.toString());
      }

      return var2.toString();
   }
}
