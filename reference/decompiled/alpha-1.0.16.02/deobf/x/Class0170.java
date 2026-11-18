package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0170 extends Class0140 {
   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;

   public Class0170() {
   }

   public Class0170(Class0089 var1) {
      this.a = var1.Z;
      this.b = var1.i;
      this.c = Class0118.b(var1.ah * 32.0);
      this.d = Class0118.b(var1.ai * 32.0);
      this.e = Class0118.b(var1.aj * 32.0);
      this.f = (byte)(var1.an * 256.0F / 360.0F);
      this.g = (byte)(var1.ao * 256.0F / 360.0F);
      Class0124 var2 = var1.b.e();
      this.h = var2 == null ? 0 : var2.c;
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 28;
   }
}
