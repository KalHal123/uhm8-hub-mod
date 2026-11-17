import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class 0c3jmfXUW1zv5QffJ62896e1CMEGPF0t2dQ143GIrcnOmWR614mBovfQ0v3kE4qNl412asWUM3Cx9IL6ACoh0K0l907ju extends Thread {
   String 7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4;
   final 1yvTo5vLKhtZ8Jdf75TPzqWv5K5FAzIHa4r19RT64mMh13Pj2aH0VKS6mi433493GrZdkE65w9B85LU6qAlbS6G55i1q0 460059BO1xohQqWQG5kZNVm3h935GdA6Wjvqlk6CGHJeUU30H8bR7JRo6u7Y;
   final 2rCv0397007kD89EPcxiQ2JDAAi25AKiBd86823WZdJ9ug1NT497P2D5759oQ92r2Eq99Z1fP1UD4zvzHiLal32tpd3fcXlwIIm2m 8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8;

   _c3jmfXUW1zv5QffJ62896e1CMEGPF0t2dQ143GIrcnOmWR614mBovfQ0v3kE4qNl412asWUM3Cx9IL6ACoh0K0l907ju/* $VF was: 0c3jmfXUW1zv5QffJ62896e1CMEGPF0t2dQ143GIrcnOmWR614mBovfQ0v3kE4qNl412asWUM3Cx9IL6ACoh0K0l907ju */(
      2rCv0397007kD89EPcxiQ2JDAAi25AKiBd86823WZdJ9ug1NT497P2D5759oQ92r2Eq99Z1fP1UD4zvzHiLal32tpd3fcXlwIIm2m var1,
      String var2,
      1yvTo5vLKhtZ8Jdf75TPzqWv5K5FAzIHa4r19RT64mMh13Pj2aH0VKS6mi433493GrZdkE65w9B85LU6qAlbS6G55i1q0 var3
   ) {
      this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8 = var1;
      this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4 = var2;
      this.460059BO1xohQqWQG5kZNVm3h935GdA6Wjvqlk6CGHJeUU30H8bR7JRo6u7Y = var3;
   }

   @Override
   public void run() {
      while (
         this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4.charAt(0) == 1
            || this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4.charAt(0) == 2
      ) {
         this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4 = this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4.substring(1);
      }

      if (this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4 == "@@") {
         this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt = new BufferedImage(
            32, 16, 2
         );
         Graphics2D var13 = this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8
            .7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt
            .createGraphics();
         var13.setColor(new Color(0, 0, 0));
         var13.fillRect(0, 0, 32, 16);
         var13.dispose();
      } else {
         for (String var2 : 1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN.4eUW14lHuQQy8iFT1uuVUHSXayw7HV4qbsNu1cOVGoECe4jmtsJ7i6H944Fv) {
            String var3 = var2 + this.7G8MDI7VYp30dKyX2tiFoRO3j4Xnr561n9w23ze4OXgYN7Dg8O0jxpf4QNF4 + ".png";
            if (var2.startsWith("file://")) {
               try {
                  this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt = ImageIO.read(
                     new File(var3.substring(7))
                  );
               } catch (IOException var10) {
                  System.out.println("Failed to load skin from " + var3);
               }
            } else {
               HttpURLConnection var4 = null;

               try {
                  URL var5 = new URL(var3);
                  var4 = (HttpURLConnection)var5.openConnection();
                  var4.setDoInput(true);
                  var4.setDoOutput(false);
                  var4.connect();
                  if (var4.getResponseCode() == 404) {
                     return;
                  }

                  if (this.460059BO1xohQqWQG5kZNVm3h935GdA6Wjvqlk6CGHJeUU30H8bR7JRo6u7Y == null) {
                     this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt = ImageIO.read(
                        var4.getInputStream()
                     );
                  } else {
                     this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt = this.460059BO1xohQqWQG5kZNVm3h935GdA6Wjvqlk6CGHJeUU30H8bR7JRo6u7Y
                        ._zpderewV3x1X6sDa6TS2B2RfCzwfHSc6W7OdKR4j9EtS2r2WS940VAdQvh0/* $VF was: 5zpderewV3x1X6sDa6TS2B2RfCzwfHSc6W7OdKR4j9EtS2r2WS940VAdQvh0 */(
                           ImageIO.read(var4.getInputStream())
                        );
                  }
               } catch (Exception var11) {
                  var11.printStackTrace();
               } finally {
                  var4.disconnect();
               }
            }

            if (this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt != null) {
               break;
            }
         }

         if (this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8.7q9ZI9Cq1X1WBs2pVjUilNUMeIsX6fDe1rx1tFnzfDwr720WVe92w5ezHImt == null) {
            System.out.println("Failed to load skin.");
         } else {
            this.8g672chQdfoGcFkz3u9VOTJgs4zPWrsar6mDV29AK91PKK074BR25PY3L8s8
               ._ecQ0QRfuWiJg3dl3ngZPlnby904839D118bEm61FJpDYFoe4QAl1g0XmO2t/* $VF was: 5ecQ0QRfuWiJg3dl3ngZPlnby904839D118bEm61FJpDYFoe4QAl1g0XmO2t */();
         }
      }
   }
}
