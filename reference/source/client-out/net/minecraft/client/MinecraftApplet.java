package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;

public class MinecraftApplet extends Applet {
   private Canvas 4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07;
   private Minecraft 263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS;
   private Thread 1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO = null;

   @Override
   public void init() {
      this.4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07 = new 6nWUKA35YYm09Hysy01T0GU85ShNH73Pn6J35HE07A243z61E0181BWs0Z90AA04341zkvXC95CP9yKjqJ2EC6VIBdntWrf8ow5D(
         this
      );
      boolean var1 = false;
      if (this.getParameter("fullscreen") != null) {
         var1 = this.getParameter("fullscreen").equalsIgnoreCase("true");
      }

      this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS = new 16iAzliIQsxG358i74x27J932RdOhbxxGjx07Q24UU7ed4JEs4TKS982TD2Ia5TjQ52595ar0h2aVtMW7EMA69vdSLJ3d(
         this, this, this.4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07, this, this.getWidth(), this.getHeight(), var1
      );
      this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.1bXoyKS4419C0OkBAdgHRIkQ8QoiQoI2YC0H72hV9z1z430OurUT7w57itKv = this.getDocumentBase()
         .getHost();
      if (this.getDocumentBase().getPort() > 0) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.1bXoyKS4419C0OkBAdgHRIkQ8QoiQoI2YC0H72hV9z1z430OurUT7w57itKv = this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS
               .1bXoyKS4419C0OkBAdgHRIkQ8QoiQoI2YC0H72hV9z1z430OurUT7w57itKv
            + ":"
            + this.getDocumentBase().getPort();
      }

      if (this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q = new 3T3H6Gfv8hrD7hW95opSro1Y0MDK93JEoDIHYS6GWtKb1ufJBLYA6b1xXi8Q1yB1Z8Gv1q5145WS2wVNJ9ov7q1jnLPHNlSI(
            this.getParameter("username"), this.getParameter("sessionid")
         );
         System.out
            .println(
               "Setting user: "
                  + this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb
                  + ", "
                  + this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.28JxWWng03b4hCnouYvv7EPJUV7NKrvk87696kkZ04kvVQu3XYjHd588sIT1
            );
         if (this.getParameter("mppass") != null) {
            this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.52oFiiC9PMMH72oNEV3kmV6F8s9XX9x45rA8nhV2xqylRaOUu2x9h4AOi44v = this.getParameter(
               "mppass"
            );
         }
      } else {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q = new 3T3H6Gfv8hrD7hW95opSro1Y0MDK93JEoDIHYS6GWtKb1ufJBLYA6b1xXi8Q1yB1Z8Gv1q5145WS2wVNJ9ov7q1jnLPHNlSI(
            "Player", ""
         );
      }

      if (this.getParameter("loadmap_user") != null && this.getParameter("loadmap_id") != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.0644A9bx5j197P1RNE5x89QZ8I3mizwjab1R3EvnoHl3W3T2rdBVDH09Hx54 = this.getParameter(
            "loadmap_user"
         );
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.42AJuSV4TofwjAZ6JHXLKH0K0L6STQ6yzZ86xPCfe7Sg2OlJJp9iumaqz1P5 = Integer.parseInt(
            this.getParameter("loadmap_id")
         );
      } else if (this.getParameter("server") != null && this.getParameter("port") != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS
            ._WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR/* $VF was: 9WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR */(
               this.getParameter("server"), Integer.parseInt(this.getParameter("port"))
            );
      }

      this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.9tr6D2mjhN0dCY8dp4sDT8iiVd9MA82SzzykWmgkiIvzRF53620bNvDNz5gV = true;
      this.setLayout(new BorderLayout());
      this.add(this.4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07, "Center");
      this.4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07.setFocusable(true);
      this.validate();
   }

   public void _zp3Xy0ztVi2YAJe9bzzo96t4UD7Z62c6i5dRq320LvPk94HmkAIRYtbsCcg/* $VF was: 7zp3Xy0ztVi2YAJe9bzzo96t4UD7Z62c6i5dRq320LvPk94HmkAIRYtbsCcg */() {
      if (this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO == null) {
         this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO = new Thread(
            this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS, "Minecraft main thread"
         );
         this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO.start();
      }
   }

   @Override
   public void start() {
      if (this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI = false;
      }
   }

   @Override
   public void stop() {
      if (this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI = true;
      }
   }

   @Override
   public void destroy() {
      this._3t0zW74b1E2SLqWFowrfJMDbO7l3q3P6VYYngx6fnstJ52ayiCeHmfM3x01/* $VF was: 23t0zW74b1E2SLqWFowrfJMDbO7l3q3P6VYYngx6fnstJ52ayiCeHmfM3x01 */();
   }

   public void _3t0zW74b1E2SLqWFowrfJMDbO7l3q3P6VYYngx6fnstJ52ayiCeHmfM3x01/* $VF was: 23t0zW74b1E2SLqWFowrfJMDbO7l3q3P6VYYngx6fnstJ52ayiCeHmfM3x01 */() {
      if (this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO != null) {
         this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS
            ._F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f/* $VF was: 2F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f */();

         try {
            this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS
                  ._T4tyP319hE2JojSscGq782dOrj03OgJ36X530YVJ0D1i2bPDWii9IVrSO0G/* $VF was: 9T4tyP319hE2JojSscGq782dOrj03OgJ36X530YVJ0D1i2bPDWii9IVrSO0G */();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO = null;
      }
   }

   public void _67HZu4rK018A2NGlTuk07QqCR9Oex2dxXwwR4foPmo2FK831a1w9E7hL2xG/* $VF was: 567HZu4rK018A2NGlTuk07QqCR9Oex2dxXwwR4foPmo2FK831a1w9E7hL2xG */() {
      this.4zEww6gWc7C6D28EHo1vRPb4cpxi3BHQ42P08V1rn3nc48Sr9NxqrS5TeK07 = null;
      this.263MnY3KN89zJRjMd4220u00gouyy18m7UD6W6x1e0Y2NOGgaDZ4T3L2KhWS = null;
      this.1DK74B3G7nfaHNlH7vW5ev70n4RG8570wpAeXi8iufiPh08n58B0cZ9991cO = null;

      try {
         this.removeAll();
         this.validate();
      } catch (Exception var2) {
      }
   }
}
