package x;

import java.io.InputStream;
import paulscode.sound.codecs.CodecJOrbis;

public class Class0119 extends CodecJOrbis {
   @Override
   protected InputStream openInputStream() {
      return new Class0191(this, this.url, this.urlConnection.getInputStream());
   }
}
