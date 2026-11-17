package net.minecraft.isom;

import ext.Canvas247;
import java.applet.Applet;
import java.awt.BorderLayout;

public class IsomPreviewApplet extends Applet {
   private Canvas247 field_461 = new Canvas247();

   public IsomPreviewApplet() {
      this.setLayout(new BorderLayout());
      this.add(this.field_461, "Center");
   }

   @Override
   public void start() {
      this.field_461.method_33();
   }

   @Override
   public void stop() {
      this.field_461.method_786();
   }
}
