package ext;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import paulscode.sound.codecs.CodecJOrbis;

public class CodecJOrbis587 extends CodecJOrbis {
   @Override
   protected InputStream openInputStream() {
      try {
         URL var1 = (URL)Class141.method_568(this, "url", URL.class);
         URLConnection var2 = (URLConnection)Class141.method_568(this, "urlConnection", URLConnection.class);
         return new InputStream427(this, var1, var2.getInputStream());
      } catch (IOException var3) {
         return null;
      }
   }
}
