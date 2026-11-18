package net.minecraft.isom;

import java.applet.Applet;
import java.awt.BorderLayout;

public class IsomPreviewApplet extends Applet {
   private ab a = new ab();

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
