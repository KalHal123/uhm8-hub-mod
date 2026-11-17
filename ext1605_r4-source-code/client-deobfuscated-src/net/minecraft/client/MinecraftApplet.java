package net.minecraft.client;

import ext.Canvas526;
import ext.Class277;
import ext.Minecraft84;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;

public class MinecraftApplet extends Applet {
   private Canvas field_1612;
   private Minecraft field_715;
   private Thread field_474 = null;

   @Override
   public void init() {
      this.field_1612 = new Canvas526(this);
      boolean var1 = false;
      if (this.getParameter("fullscreen") != null) {
         var1 = this.getParameter("fullscreen").equalsIgnoreCase("true");
      }

      this.field_715 = new Minecraft84(this, this, this.field_1612, this, this.getWidth(), this.getHeight(), var1);
      this.field_715.field_571 = this.getDocumentBase().getHost();
      if (this.getDocumentBase().getPort() > 0) {
         this.field_715.field_571 = this.field_715.field_571 + ":" + this.getDocumentBase().getPort();
      }

      if (this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.field_715.field_2935 = new Class277(this.getParameter("username"), this.getParameter("sessionid"));
         System.out.println("Setting user: " + this.field_715.field_2935.field_382 + ", " + this.field_715.field_2935.field_740);
         if (this.getParameter("mppass") != null) {
            this.field_715.field_2935.field_1649 = this.getParameter("mppass");
         }
      } else {
         this.field_715.field_2935 = new Class277("Player", "");
      }

      if (this.getParameter("loadmap_user") != null && this.getParameter("loadmap_id") != null) {
         this.field_715.field_79 = this.getParameter("loadmap_user");
         this.field_715.field_1331 = Integer.parseInt(this.getParameter("loadmap_id"));
      } else if (this.getParameter("server") != null && this.getParameter("port") != null) {
         this.field_715.method_1871(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
      }

      this.field_715.field_3131 = true;
      this.setLayout(new BorderLayout());
      this.add(this.field_1612, "Center");
      this.field_1612.setFocusable(true);
      this.validate();
   }

   public void method_1555() {
      if (this.field_474 == null) {
         this.field_474 = new Thread(this.field_715, "Minecraft main thread");
         this.field_474.start();
      }
   }

   @Override
   public void start() {
      if (this.field_715 != null) {
         this.field_715.field_1465 = false;
      }
   }

   @Override
   public void stop() {
      if (this.field_715 != null) {
         this.field_715.field_1465 = true;
      }
   }

   @Override
   public void destroy() {
      this.method_419();
   }

   public void method_419() {
      if (this.field_474 != null) {
         this.field_715.method_459();

         try {
            this.field_474.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.field_715.method_1859();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         this.field_474 = null;
      }
   }

   public void method_1008() {
      this.field_1612 = null;
      this.field_715 = null;
      this.field_474 = null;

      try {
         this.removeAll();
         this.validate();
      } catch (Exception var2) {
      }
   }
}
