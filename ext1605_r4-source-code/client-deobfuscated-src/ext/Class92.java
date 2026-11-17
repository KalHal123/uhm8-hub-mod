package ext;

import org.lwjgl.opengl.GLContext;

public class Class92 {
   private static boolean field_1713 = false;

   public boolean method_450() {
      return field_1713 && GLContext.getCapabilities().GL_ARB_occlusion_query;
   }
}
