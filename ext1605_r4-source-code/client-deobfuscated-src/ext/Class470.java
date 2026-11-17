package ext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Class470 extends Class471 {
   public String field_2780;

   public Class470() {
   }

   public Class470(String var1) {
      this.field_2780 = var1;
   }

   @Override
   public void method_1135(DataInputStream var1) throws IOException {
      this.field_2780 = var1.readUTF();
   }

   @Override
   public void method_805(DataOutputStream var1) throws IOException {
      var1.writeUTF(this.field_2780);
   }

   @Override
   public void method_1876(Class8 var1) {
      Class473 var2;
      try {
         byte[] var3 = Files.readAllBytes(Paths.get("/skins/" + this.field_2780 + ".png"));
         var2 = new Class473(this.field_2780, var3);
      } catch (IOException var4) {
         var2 = new Class473(this.field_2780, null);
      }

      if (var1 instanceof Class348) {
         ((Class348)var1).method_1519(var2);
      }
   }

   @Override
   public int method_1597() {
      return 2 + this.field_2780.length();
   }
}
