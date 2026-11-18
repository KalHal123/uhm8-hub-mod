package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Class0180 extends Class0140 {
   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;
   public byte g;
   public int h;
   public int i;

   public Class0180() {
   }

   public Class0180(Class0100 var1) {
      this.a = var1.Z;
      this.h = var1.a.c;
      this.i = var1.a.a;
      this.b = Class0118.b(var1.ah * 32.0);
      this.c = Class0118.b(var1.ai * 32.0);
      this.d = Class0118.b(var1.aj * 32.0);
      this.e = (byte)(var1.ak * 128.0);
      this.f = (byte)(var1.al * 128.0);
      this.g = (byte)(var1.am * 128.0);
   }

   @Override
   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.h = var1.readShort();
      this.i = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   @Override
   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.h);
      var1.writeByte(this.i);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   @Override
   public void a(Class0288 var1) {
      var1.a(this);
   }

   @Override
   public int a() {
      return 22;
   }
}
