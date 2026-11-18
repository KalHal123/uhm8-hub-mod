package x;

import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

public class Class0109 {
   private final boolean 4m9cIzIXyrIfs5hp6E404TfW6gcQem3G47FNK6glDoIPi8tRX3o33xuXGW9S;
   private final boolean 6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k;
   private static final int[] 3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ = new int[256];
   private static final int[] 54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV;
   static final Class0109 4XYg51KTiht8RBrAbkvJ5f83Z4q88Vcnx7nWGFfKd6a5EjK2LB7wqI590YEC;
   static final Class0109 5189HHJYJZIG70a49fhLM6yJUholcKk0jNOQW457Yes0RRQ74CJ93G9i3ivb;
   static final Class0109 2Cdf6fN3S2r0bpxOfjHEj99G6q8m0mLvH7X32Qw1m7y6GUyKgUN4tp1Wrwrr;

   private Class0109(boolean var1, boolean var2) {
      this.4m9cIzIXyrIfs5hp6E404TfW6gcQem3G47FNK6glDoIPi8tRX3o33xuXGW9S = var1;
      this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k = var2;
   }

   public byte[] _0A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z/* $VF was: 70A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z */(
      byte[] var1
   ) {
      byte[] var2 = new byte[this._275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7/* $VF was: 5275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7 */(
         var1, 0, var1.length
      )];
      int var3 = this._w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG/* $VF was: 1w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG */(
         var1, 0, var1.length, var2
      );
      if (var3 != var2.length) {
         var2 = Arrays.copyOf(var2, var3);
      }

      return var2;
   }

   public byte[] _94G305vP5s5r5U6s8pchMZsC47Q3T85Z2beGGUwZ36H2j6b0oMcJjyV0f48/* $VF was: 594G305vP5s5r5U6s8pchMZsC47Q3T85Z2beGGUwZ36H2j6b0oMcJjyV0f48 */(
      String var1
   ) {
      return this._0A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z/* $VF was: 70A8eWjC390z9eTyeFzzovuu718TjGr22x9Vhgof4ztVXtRQv67DQi49a84Z */(
         var1.getBytes(StandardCharsets.ISO_8859_1)
      );
   }

   public int _5dJEAWbOk85V59DXG33h7St831pDdY5bDhxy9Fl0R6m3wIfpLCO6Mz9nwRL/* $VF was: 05dJEAWbOk85V59DXG33h7St831pDdY5bDhxy9Fl0R6m3wIfpLCO6Mz9nwRL */(
      byte[] var1, byte[] var2
   ) {
      int var3 = this._275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7/* $VF was: 5275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7 */(
         var1, 0, var1.length
      );
      if (var2.length < var3) {
         throw new IllegalArgumentException("Output byte array is too small for decoding all input bytes");
      } else {
         return this._w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG/* $VF was: 1w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG */(
            var1, 0, var1.length, var2
         );
      }
   }

   public ByteBuffer _a09U7MEhKM9C1p775gzHI6kr43q7mNepEMnidlmMzCQiVu11Yg92OR9VWRe/* $VF was: 9a09U7MEhKM9C1p775gzHI6kr43q7mNepEMnidlmMzCQiVu11Yg92OR9VWRe */(
      ByteBuffer var1
   ) {
      int var2 = var1.position();

      try {
         byte[] var3;
         int var4;
         int var5;
         if (var1.hasArray()) {
            var3 = var1.array();
            var4 = var1.arrayOffset() + var1.position();
            var5 = var1.arrayOffset() + var1.limit();
            ((Buffer)var1).position(var1.limit());
         } else {
            var3 = new byte[var1.remaining()];
            var1.get(var3);
            var4 = 0;
            var5 = var3.length;
         }

         byte[] var6 = new byte[this._275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7/* $VF was: 5275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7 */(
            var3, var4, var5
         )];
         return ByteBuffer.wrap(
            var6,
            0,
            this._w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG/* $VF was: 1w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG */(
               var3, var4, var5, var6
            )
         );
      } catch (IllegalArgumentException var7) {
         ((Buffer)var1).position(var2);
         throw var7;
      }
   }

   public InputStream _yJ4TXR94135550i5Yy14aMXV8Vbi59887n8QKnA7T897cgcEk2y68q6z5n9/* $VF was: 3yJ4TXR94135550i5Yy14aMXV8Vbi59887n8QKnA7T897cgcEk2y68q6z5n9 */(
      InputStream var1
   ) {
      Objects.requireNonNull(var1);
      return new Class0191(
         var1,
         this.4m9cIzIXyrIfs5hp6E404TfW6gcQem3G47FNK6glDoIPi8tRX3o33xuXGW9S
            ? 54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV
            : 3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ,
         this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k
      );
   }

   private int _275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7/* $VF was: 5275cx58Y1sa712v3QohzQ7JZ8K27DpVKFdY2uh55H8lyr4O1JR7MqPzDZg7 */(
      byte[] var1, int var2, int var3
   ) {
      int[] var4 = this.4m9cIzIXyrIfs5hp6E404TfW6gcQem3G47FNK6glDoIPi8tRX3o33xuXGW9S
         ? 54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV
         : 3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ;
      int var5 = 0;
      int var6 = var3 - var2;
      if (var6 == 0) {
         return 0;
      }

      if (var6 < 2) {
         if (this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k && var4[0] == -1) {
            return 0;
         } else {
            throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
         }
      } else {
         if (this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k) {
            int var7 = 0;

            while (var2 < var3) {
               int var8 = var1[var2++] & 255;
               if (var8 == 61) {
                  var6 -= var3 - var2 + 1;
                  break;
               }

               if ((var8 = var4[var8]) == -1) {
                  var7++;
               }
            }

            var6 -= var7;
         } else if (var1[var3 - 1] == 61) {
            var5++;
            if (var1[var3 - 2] == 61) {
               var5++;
            }
         }

         if (var5 == 0 && (var6 & 3) != 0) {
            var5 = 4 - (var6 & 3);
         }

         return 3 * ((var6 + 3) / 4) - var5;
      }
   }

   private int _w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG/* $VF was: 1w0iwfkXk45pnVjAH4euzGz2N48H1bB44hu1n0tUA279QFaxV7f6h752tliG */(
      byte[] var1, int var2, int var3, byte[] var4
   ) {
      int[] var5 = this.4m9cIzIXyrIfs5hp6E404TfW6gcQem3G47FNK6glDoIPi8tRX3o33xuXGW9S
         ? 54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV
         : 3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ;
      int var6 = 0;
      int var7 = 0;
      byte var8 = 18;

      while (var2 < var3) {
         int var9 = var1[var2++] & 255;
         if ((var9 = var5[var9]) >= 0) {
            var7 |= var9 << var8;
            var8 -= 6;
            if (var8 < 0) {
               var4[var6++] = (byte)(var7 >> 16);
               var4[var6++] = (byte)(var7 >> 8);
               var4[var6++] = (byte)var7;
               var8 = 18;
               var7 = 0;
            }
         } else {
            if (var9 == -2) {
               if (var8 == 6 && (var2 == var3 || var1[var2++] != 61) || var8 == 18) {
                  throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
               }
               break;
            }

            if (!this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k) {
               throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(var1[var2 - 1], 16));
            }
         }
      }

      if (var8 == 6) {
         var4[var6++] = (byte)(var7 >> 16);
      } else if (var8 == 0) {
         var4[var6++] = (byte)(var7 >> 16);
         var4[var6++] = (byte)(var7 >> 8);
      } else if (var8 == 12) {
         throw new IllegalArgumentException("Last unit does not have enough valid bits");
      }

      while (var2 < var3) {
         if (!this.6S24K7DJ9u7Wd8m9N93MtBg5yi0U9jsmRV65vR6m061rGsa9Sjfp9xVxk93k || var5[var1[var2++] & 0xFF] >= 0) {
            throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + var2);
         }
      }

      return var6;
   }

   static {
      Arrays.fill(3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ, -1);
      int var0 = 0;

      while (
         var0
            < Class0029._PgBV45sFD3sYyDGM1Vco6kkt3ZAWSg0QJ3tM8QONuKowpG8J290t538J9TU/* $VF was: 2PgBV45sFD3sYyDGM1Vco6kkt3ZAWSg0QJ3tM8QONuKowpG8J290t538J9TU */().length
      ) {
         3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ[Class0029._PgBV45sFD3sYyDGM1Vco6kkt3ZAWSg0QJ3tM8QONuKowpG8J290t538J9TU/* $VF was: 2PgBV45sFD3sYyDGM1Vco6kkt3ZAWSg0QJ3tM8QONuKowpG8J290t538J9TU */()[var0]] = var0++;
      }

      3PCyo23geYFWux4v43939wou54Eq66E3v9601Lt238sRrm98ZxLWzu430VXJ[61] = -2;
      54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV = new int[256];
      Arrays.fill(54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV, -1);
      var0 = 0;

      while (
         var0
            < Class0029._5cCacq74i1m40SUw69dBv804Ncx8I8328Ne2aEfKyWWg7Xooj43pSgb66FX/* $VF was: 05cCacq74i1m40SUw69dBv804Ncx8I8328Ne2aEfKyWWg7Xooj43pSgb66FX */().length
      ) {
         54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV[Class0029._5cCacq74i1m40SUw69dBv804Ncx8I8328Ne2aEfKyWWg7Xooj43pSgb66FX/* $VF was: 05cCacq74i1m40SUw69dBv804Ncx8I8328Ne2aEfKyWWg7Xooj43pSgb66FX */()[var0]] = var0++;
      }

      54V7lrGXLRc1rs4t4kn2A32AEt3UHLHs96hp1fu319D4Yk3Q3YU75M06d0LV[61] = -2;
      4XYg51KTiht8RBrAbkvJ5f83Z4q88Vcnx7nWGFfKd6a5EjK2LB7wqI590YEC = new Class0109(false, false);
      5189HHJYJZIG70a49fhLM6yJUholcKk0jNOQW457Yes0RRQ74CJ93G9i3ivb = new Class0109(true, false);
      2Cdf6fN3S2r0bpxOfjHEj99G6q8m0mLvH7X32Qw1m7y6GUyKgUN4tp1Wrwrr = new Class0109(false, true);
   }
}
