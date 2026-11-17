package srv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class Class15 {
   private Set<Class173> field_1522 = new HashSet<>();
   private Class326 field_984 = new Class326();
   private MinecraftServer field_232;
   private int field_1532;

   public Class15(MinecraftServer var1) {
      this.field_232 = var1;
      this.field_1532 = var1.field_1096.method_200();
   }

   public void method_327(Class252 var1) {
      if (var1 instanceof Class188) {
         this.method_819(var1, 512, 2);
         Class188 var2 = (Class188)var1;

         for (Class173 var4 : this.field_1522) {
            if (var4.field_574 != var2) {
               var4.method_100(var2);
            }
         }
      } else if (var1 instanceof Class39) {
         this.method_819(var1, 64, 20);
      } else if (var1 instanceof Class194) {
         this.method_819(var1, 160, 4);
      } else if (var1 instanceof Interface293) {
         this.method_819(var1, 160, 2);
      }
   }

   public void method_819(Class252 var1, int var2, int var3) {
      if (var2 > this.field_1532) {
         var2 = this.field_1532;
      }

      if (this.field_984.method_402(var1.field_331)) {
         throw new IllegalStateException("Entity is already tracked!");
      }

      Class173 var4 = new Class173(var1, var2, var3);
      this.field_1522.add(var4);
      this.field_984.method_120(var1.field_331, var4);
      var4.method_704(this.field_232.field_445.field_469);
   }

   public void method_437(Class252 var1) {
      Class173 var2 = (Class173)this.field_984.method_523(var1.field_331);
      if (var2 != null) {
         this.field_1522.remove(var2);
         var2.method_771();
      }
   }

   public void method_861() {
      ArrayList var1 = new ArrayList();

      for (Class173 var3 : this.field_1522) {
         var3.method_631(this.field_232.field_445.field_469);
         if (var3.field_1144 && var3.field_574 instanceof Class188) {
            var1.add((Class188)var3.field_574);
         }
      }

      for (int var7 = 0; var7 < var1.size(); var7++) {
         Class188 var4 = (Class188)var1.get(var7);

         for (Class173 var6 : this.field_1522) {
            if (var6.field_574 != var4) {
               var6.method_100(var4);
            }
         }
      }
   }

   public void method_374(Class252 var1, Class318 var2) {
      Class173 var3 = (Class173)this.field_984.method_17(var1.field_331);
      if (var3 != null) {
         var3.method_364(var2);
      }
   }
}
