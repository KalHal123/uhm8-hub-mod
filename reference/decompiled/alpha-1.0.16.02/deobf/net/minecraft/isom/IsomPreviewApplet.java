package net.minecraft.isom;

import java.applet.Applet;
import java.awt.BorderLayout;
import x.Class0003;

public class IsomPreviewApplet extends Applet {
   private Class0003 a = new Class0003();

   public IsomPreviewApplet() {
      this.setLayout(new BorderLayout());
      this.add(this.a, "Center");
   }

   @Override
   public void start() {
      this.a.b();
   }

   @Override
   public void stop() {
      this.a.c();
   }
}
