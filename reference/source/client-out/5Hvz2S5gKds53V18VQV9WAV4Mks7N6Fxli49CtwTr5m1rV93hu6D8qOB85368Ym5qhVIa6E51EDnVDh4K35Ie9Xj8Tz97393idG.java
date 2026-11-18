import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class 5Hvz2S5gKds53V18VQV9WAV4Mks7N6Fxli49CtwTr5m1rV93hu6D8qOB85368Ym5qhVIa6E51EDnVDh4K35Ie9Xj8Tz97393idG extends InputStream {
   private int 0yR3a43UOrMrmqka2mUoF398RN6nK69Wd1YTz30M1X9KTV9mCp5c0Nw5JsQX;
   private InputStream 2Dh3Y82UW1FyNyOJMZA0hGb3ms9ID86YGM43gw8Y2b683tO6OR7tqZ43ObdM;
   byte[] 2R2D4UzGbEE03Q9komdqDbvMU5A507XDo8lYL65JeEX5NsInSn76QZnFWZ21;
   final 7dP2vi1T63816FfxGqTHS81I3Kr5VocblgWkuP7lnDQKt2b1v2CCe97IwUG27cv75ARM8TKYXioPy41gl3m233hhJq3AK3 3MO7SJpIgf76do84b9HMj1Q3Y4cYRCtuCOkJXKXgz4Q151A8Tp4oqa7R37ee;

   public _Hvz2S5gKds53V18VQV9WAV4Mks7N6Fxli49CtwTr5m1rV93hu6D8qOB85368Ym5qhVIa6E51EDnVDh4K35Ie9Xj8Tz97393idG/* $VF was: 5Hvz2S5gKds53V18VQV9WAV4Mks7N6Fxli49CtwTr5m1rV93hu6D8qOB85368Ym5qhVIa6E51EDnVDh4K35Ie9Xj8Tz97393idG */(
      7dP2vi1T63816FfxGqTHS81I3Kr5VocblgWkuP7lnDQKt2b1v2CCe97IwUG27cv75ARM8TKYXioPy41gl3m233hhJq3AK3 var1, URL var2, InputStream var3
   ) {
      this.3MO7SJpIgf76do84b9HMj1Q3Y4cYRCtuCOkJXKXgz4Q151A8Tp4oqa7R37ee = var1;
      this.2R2D4UzGbEE03Q9komdqDbvMU5A507XDo8lYL65JeEX5NsInSn76QZnFWZ21 = new byte[1];
      this.2Dh3Y82UW1FyNyOJMZA0hGb3ms9ID86YGM43gw8Y2b683tO6OR7tqZ43ObdM = var3;
      String var4 = var2.getPath();
      var4 = var4.substring(var4.lastIndexOf("/") + 1);
      this.0yR3a43UOrMrmqka2mUoF398RN6nK69Wd1YTz30M1X9KTV9mCp5c0Nw5JsQX = var4.hashCode();
   }

   @Override
   public int read() throws IOException {
      int var1 = this.read(this.2R2D4UzGbEE03Q9komdqDbvMU5A507XDo8lYL65JeEX5NsInSn76QZnFWZ21, 0, 1);
      return var1 < 0 ? var1 : this.2R2D4UzGbEE03Q9komdqDbvMU5A507XDo8lYL65JeEX5NsInSn76QZnFWZ21[0];
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      var3 = this.2Dh3Y82UW1FyNyOJMZA0hGb3ms9ID86YGM43gw8Y2b683tO6OR7tqZ43ObdM.read(var1, var2, var3);

      for (int var4 = 0; var4 < var3; var4++) {
         byte var5 = var1[var2 + var4] = (byte)(var1[var2 + var4] ^ this.0yR3a43UOrMrmqka2mUoF398RN6nK69Wd1YTz30M1X9KTV9mCp5c0Nw5JsQX >> 8);
         this.0yR3a43UOrMrmqka2mUoF398RN6nK69Wd1YTz30M1X9KTV9mCp5c0Nw5JsQX = this.0yR3a43UOrMrmqka2mUoF398RN6nK69Wd1YTz30M1X9KTV9mCp5c0Nw5JsQX * 498729871
            + 85731 * var5;
      }

      return var3;
   }
}
