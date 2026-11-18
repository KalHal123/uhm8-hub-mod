import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

public class jy extends ef {
   private List a = new ArrayList();
   private byte b;

   @Override
   void a(DataOutput var1) {
      if (this.a.size() > 0) {
         this.b = ((ef)this.a.get(0)).a();
      } else {
         this.b = 1;
      }

      var1.writeByte(this.b);
      var1.writeInt(this.a.size());

      for (int var2 = 0; var2 < this.a.size(); var2++) {
         ((ef)this.a.get(var2)).a(var1);
      }
   }

   @Override
   void a(DataInput var1) {
      this.b = var1.readByte();
      int var2 = var1.readInt();
      this.a = new ArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         ef var4 = ef.a(this.b);
         var4.a(var1);
         this.a.add(var4);
      }
   }

   @Override
   public byte a() {
      return 9;
   }

   @Override
   public String toString() {
      return "" + this.a.size() + " entries of type " + ef.b(this.b);
   }

   public void a(ef var1) {
      this.b = var1.a();
      this.a.add(var1);
   }

   public ef a(int var1) {
      return (ef)this.a.get(var1);
   }

   public int c() {
      return this.a.size();
   }
}
