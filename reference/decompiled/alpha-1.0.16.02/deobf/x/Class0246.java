package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0246 extends Class0140 {
   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;

   public Class0246() {
   }

   public Class0246(Class0268 var1) {
      this.a = var1.Z;
      this.b = Class0118.b(var1.ah * 32.0);
      this.c = Class0118.b(var1.ai * 32.0);
      this.d = Class0118.b(var1.aj * 32.0);
      this.e = (byte)(var1.an * 256.0F / 360.0F);
      this.f = (byte)(var1.ao * 256.0F / 360.0F);
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = (byte)var1.read();
      this.f = (byte)var1.read();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
      var1.write(this.f);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 34;
   }
}
