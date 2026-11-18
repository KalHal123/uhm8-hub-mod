package srv;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class Class188 extends Class41 {
   public Class124 field_1439;
   public MinecraftServer field_1262;
   public Class368 field_1279;
   public double field_1445;
   public double field_548;
   public List field_1490 = new LinkedList();
   public Set field_336 = new HashSet();
   public double field_718;
   protected int field_261 = 0;
   protected int field_1110 = 0;

   public Class188(MinecraftServer var1, Class317 var2, String var3, Class368 var4) {
      super(var2);
      int var5 = var2.field_944 + this.field_697.nextInt(20) - 10;
      int var6 = var2.field_1535 + this.field_697.nextInt(20) - 10;
      int var7 = var2.method_641(var5, var6);
      this.method_885(var5 + 0.5, var7, var6 + 0.5, 0.0F, 0.0F);
      this.field_1262 = var1;
      this.field_1093 = 0.0F;
      var4.field_1188 = this;
      this.field_1477 = var3;
      this.field_1279 = var4;
      this.field_855 = 0.0F;
   }

   @Override
   public void method_439() {
   }

   @Override
   public void method_577(Class252 var1) {
   }

   @Override
   public boolean method_671(Class252 var1, int var2) {
      return false;
   }

   @Override
   public void method_228(int var1) {
   }

   public void method_874() {
      super.method_439();
      Class338 var1 = null;
      double var2 = 0.0;

      for (int var4 = 0; var4 < this.field_1490.size(); var4++) {
         Class338 var5 = (Class338)this.field_1490.get(var4);
         double var6 = var5.method_342(this);
         if (var4 == 0 || var6 < var2) {
            var1 = var5;
            var2 = var5.method_342(this);
         }
      }

      if (var1 != null) {
         boolean var8 = false;
         if (var2 < 1024.0) {
            var8 = true;
         }

         if (this.field_1439.method_313() < 2) {
            var8 = true;
         }

         if (var8) {
            this.field_1490.remove(var1);
            this.field_1439.method_571(new Class38(var1.field_572 * 16, 0, var1.field_1174 * 16, 16, 128, 16, this.field_1262.field_445));
            List var9 = this.field_1262
               .field_445
               .method_84(var1.field_572 * 16, 0, var1.field_1174 * 16, var1.field_572 * 16 + 16, 128, var1.field_1174 * 16 + 16);

            for (int var10 = 0; var10 < var9.size(); var10++) {
               Class66 var7 = (Class66)var9.get(var10);
               this.field_1439.method_571(new Class381(var7.field_720, var7.field_1400, var7.field_454, var7));
            }
         }
      }
   }

   @Override
   public void method_664() {
      this.field_607 = this.field_780 = this.field_921 = 0.0;
      this.field_63 = false;
      int var1 = (int)(this.field_1324 / 32.0);
      int var2 = (int)(this.field_1321 / 32.0);
      if (var1 != this.field_261 && var2 != this.field_1110) {
         this.field_261 = var1;
         this.field_1110 = var2;
         Class31.method_834(this, this.field_796);
      }

      super.method_664();
   }

   @Override
   public void method_648(Class252 var1, int var2) {
      if (!var1.field_120 && var1 instanceof Class39) {
         this.field_1439.method_571(new Class382(((Class39)var1).field_1199, var2));
         this.field_1262.field_1201.method_374(var1, new Class200(var1.field_331, this.field_331));
      }

      super.method_648(var1, var2);
   }

   @Override
   public void method_87() {
      if (!this.field_742) {
         this.field_575 = -1;
         this.field_742 = true;
         this.field_1262.field_1201.method_374(this, new Class97(this, 1));
      }
   }

   @Override
   protected float method_181() {
      return 1.62F;
   }
}
