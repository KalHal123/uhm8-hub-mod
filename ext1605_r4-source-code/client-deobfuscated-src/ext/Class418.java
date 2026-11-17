package ext;

import java.util.List;
import net.minecraft.client.Minecraft;

public class Class418 {
   private Minecraft field_3127;
   public Class31 field_1646 = new Class31();

   public Class418(Minecraft var1) {
      this.field_3127 = var1;
   }

   public void method_370(int var1, int var2) {
      Class254.method_421(1, 1, var1 - 1, 13, -266724838, -1608902118);
      Class254.method_421(2, 2, var1 - 2, 12, -265080013, -1607257293);
      int var3 = this.field_3127.field_1541.method_962("3emj MC16.05 >");
      Class254.method_773(this.field_3127.field_1541, "3emj MC16.05 >", 3, 3, 16187136);
      Class254.method_773(this.field_3127.field_1541, this.field_1646.field_1717 + "_", 8 + var3, 3, 16777215);
      String[] var4 = this.field_1646.field_1717.split(" ");
      if (var4.length > 0) {
         int var5 = 0;
         Class306 var6 = this.field_1646.method_45(var4[0]);
         if (var6 != null) {
            var5 = (byte)30;
            Class254.method_421(1, 14, var1 - 1, 14 + var5 + 8, -1608902118, -266724838);
            Class254.method_421(2, 15, var1 - 2, 15 + var5 + 6, -1607257293, -265080013);

            String var7;
            try {
               var7 = var6.field_1521.method_867();
            } catch (Exception var10) {
               var7 = "(error getting value)";
            }

            Class254.method_773(this.field_3127.field_1541, var7.equals("~exec") ? "executable command" : "current value", 4, 16, 11579568);
            if (!var7.equals("~exec")) {
               Class254.method_773(this.field_3127.field_1541, var7, 80, 16, 16777215);
            }

            String var8 = var6.field_2822.length == 0 ? "" : "domain is ";

            for (int var9 = 0; var9 != var6.field_2822.length; var9++) {
               var8 = var8 + "any " + var6.field_2822[var9].getSimpleName().toLowerCase();
               if (var9 != var6.field_2822.length - 1) {
                  var8 = var8 + ", ";
               }
            }

            Class254.method_773(this.field_3127.field_1541, var8, 16, 36, 11579568);
         } else {
            List var13 = this.field_1646.method_1355(var4[0]);
            if (var13.size() != 0) {
               var5 = var13.size() * 10;
               Class254.method_421(1, 14, var1 - 1, 14 + var5 + 8, -1608902118, -266724838);
               Class254.method_421(2, 15, var1 - 2, 15 + var5 + 6, -1607257293, -265080013);

               for (int var14 = 0; var14 != var13.size(); var14++) {
                  Class254.method_773(this.field_3127.field_1541, ((Class306)var13.get(var14)).field_626, 16, 16 + var14 * 10, 11579568);
               }
            }
         }
      }
   }
}
