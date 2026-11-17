package ext;

import java.util.ArrayList;
import java.util.List;

public class Class54 {
   public Class354 field_3022;
   boolean field_1252 = false;
   long field_2912 = -1L;
   public List<Class677> field_586 = new ArrayList<>();
   public List<Class570> field_789 = new ArrayList<>();

   public Class54(Class354 var1) {
      this.field_3022 = var1;
   }

   public void method_252(Class354 var1) {
      this.field_586.clear();
      this.field_789.clear();
      this.field_3022 = var1;
      this.field_2912 = var1.field_1468.field_2075;
      this.field_1252 = true;
   }

   public void method_1740() {
      this.field_1252 = false;
   }

   public Class239 method_1869() {
      return new Class239(new ArrayList<>(this.field_586), new ArrayList<>(this.field_789));
   }

   public void method_115(String var1) {
      new Class239(this.field_586, this.field_789).method_856(var1);
   }

   public void method_1672(String var1) {
      if (this.field_1252) {
         this.field_789.add(new Class570(this.field_3022.field_1468.field_2075 - this.field_2912, var1));
      }
   }

   public void method_1533() {
      if (this.field_1252) {
         this.field_586
            .add(
               new Class677(
                  this.field_3022.field_1468.field_2075 - this.field_2912,
                  this.field_3022.field_1417,
                  this.field_3022.field_2654,
                  this.field_3022.field_2013,
                  this.field_3022.field_2866,
                  this.field_3022.field_1661,
                  0.0,
                  this.field_3022.field_1747,
                  this.field_3022.field_937
               )
            );
         if (this.field_586.size() == 72000) {
            this.method_1740();
         }
      }
   }

   public void method_593() {
      this.field_3022
         .field_1468
         .method_1447(new Class136(this.field_3022.field_1468, new Class239(this.field_586, this.field_789, Class119.field_1519.field_2935.field_382)));
   }

   public void method_272(Class239 var1) {
      this.field_3022.field_1468.method_1447(new Class136(this.field_3022.field_1468, var1));
   }

   public void method_1045(Class454 var1) {
      for (int var2 = 0; var2 < var1.field_70.size(); var2++) {
         if (var1.field_70.get(var2) instanceof Class136) {
            ((Class136)var1.field_70.get(var2)).method_382();
         }
      }
   }

   public void method_1279(String var1) {
      Class239 var2 = Class239.method_1906(var1);
      if (var2 != null) {
         Class119.field_1519.field_2648.method_1447(new Class136(Class119.field_1519.field_2787.field_1468, var2));
      }
   }
}
