import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jb extends fd {
   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;

   public jb() {
   }

   public jb(jx var1) {
      this.a = var1.Z;
      this.b = ei.b(var1.ah * 32.0);
      this.c = ei.b(var1.ai * 32.0);
      this.d = ei.b(var1.aj * 32.0);
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
   public void a(kq var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 34;
   }
}
