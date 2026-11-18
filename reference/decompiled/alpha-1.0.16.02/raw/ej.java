import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class ej extends CodecJOrbis {
   @Override
   protected InputStream openInputStream() {
      return new ha(this, this.url, this.urlConnection.getInputStream());
   }
}
