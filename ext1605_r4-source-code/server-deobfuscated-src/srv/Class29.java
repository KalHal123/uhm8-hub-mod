package srv;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

public class Class29 {
   private Class29() {
   }

   public static Class29.Inner30 method_205() {
      return Class29.Inner30.field_946;
   }

   public static Class29.Inner30 method_572() {
      return Class29.Inner30.field_239;
   }

   public static Class29.Inner30 method_198() {
      return Class29.Inner30.field_1340;
   }

   public static Class29.Inner30 method_862(int var0, byte[] var1) {
      Objects.requireNonNull(var1);
      int[] var2 = Class29.Inner108.field_557;

      for (byte var6 : var1) {
         if (var2[var6 & 0xFF] != -1) {
            throw new IllegalArgumentException("Illegal base64 line separator character 0x" + Integer.toString(var6, 16));
         }
      }

      return var0 <= 0 ? Class29.Inner30.field_946 : new Class29.Inner30(false, var1, var0 >> 2 << 2, true);
   }

   public static Class29.Inner108 method_998() {
      return Class29.Inner108.field_729;
   }

   public static Class29.Inner108 method_77() {
      return Class29.Inner108.field_797;
   }

   public static Class29.Inner108 method_271() {
      return Class29.Inner108.field_360;
   }

   public static class Inner108 {
      private final boolean field_757;
      private final boolean field_1041;
      private static final int[] field_557 = new int[256];
      private static final int[] field_814;
      static final Class29.Inner108 field_729;
      static final Class29.Inner108 field_797;
      static final Class29.Inner108 field_360;

      private Inner108(boolean var1, boolean var2) {
         this.field_757 = var1;
         this.field_1041 = var2;
      }

      public byte[] method_716(byte[] var1) {
         byte[] var2 = new byte[this.method_503(var1, 0, var1.length)];
         int var3 = this.method_182(var1, 0, var1.length, var2);
         if (var3 != var2.length) {
            var2 = Arrays.copyOf(var2, var3);
         }

         return var2;
      }

      public byte[] method_528(String var1) {
         return this.method_716(var1.getBytes(StandardCharsets.ISO_8859_1));
      }

      public int method_21(byte[] var1, byte[] var2) {
         int var3 = this.method_503(var1, 0, var1.length);
         if (var2.length < var3) {
            throw new IllegalArgumentException("Output byte array is too small for decoding all input bytes");
         } else {
            return this.method_182(var1, 0, var1.length, var2);
         }
      }

      public ByteBuffer method_995(ByteBuffer var1) {
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

            byte[] var6 = new byte[this.method_503(var3, var4, var5)];
            return ByteBuffer.wrap(var6, 0, this.method_182(var3, var4, var5, var6));
         } catch (IllegalArgumentException var7) {
            ((Buffer)var1).position(var2);
            throw var7;
         }
      }

      public InputStream method_400(InputStream var1) {
         return new Class29.Inner189(var1, this.field_757 ? field_814 : field_557, this.field_1041);
      }

      private int method_503(byte[] var1, int var2, int var3) {
         int[] var4 = this.field_757 ? field_814 : field_557;
         int var5 = 0;
         int var6 = var3 - var2;
         if (var6 == 0) {
            return 0;
         }

         if (var6 < 2) {
            if (this.field_1041 && var4[0] == -1) {
               return 0;
            } else {
               throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
         } else {
            if (this.field_1041) {
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

      private int method_182(byte[] var1, int var2, int var3, byte[] var4) {
         int[] var5 = this.field_757 ? field_814 : field_557;
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

               if (!this.field_1041) {
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
            if (!this.field_1041 || var5[var1[var2++] & 0xFF] >= 0) {
               throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + var2);
            }
         }

         return var6;
      }

      static {
         Arrays.fill(field_557, -1);
         int var0 = 0;

         while (var0 < Class29.Inner30.field_10.length) {
            field_557[Class29.Inner30.field_10[var0]] = var0++;
         }

         field_557[61] = -2;
         field_814 = new int[256];
         Arrays.fill(field_814, -1);
         var0 = 0;

         while (var0 < Class29.Inner30.field_195.length) {
            field_814[Class29.Inner30.field_195[var0]] = var0++;
         }

         field_814[61] = -2;
         field_729 = new Class29.Inner108(false, false);
         field_797 = new Class29.Inner108(true, false);
         field_360 = new Class29.Inner108(false, true);
      }
   }

   private static class Inner189 extends InputStream {
      private final InputStream field_672;
      private final boolean field_309;
      private final int[] field_424;
      private int field_1557 = 0;
      private int field_1126 = 18;
      private int field_859 = -8;
      private boolean field_391 = false;
      private boolean field_254 = false;
      private byte[] field_1437 = new byte[1];

      Inner189(InputStream var1, int[] var2, boolean var3) {
         this.field_672 = var1;
         this.field_424 = var2;
         this.field_309 = var3;
      }

      @Override
      public int read() throws IOException {
         return this.read(this.field_1437, 0, 1) == -1 ? -1 : this.field_1437[0] & 0xFF;
      }

      @Override
      public int read(byte[] var1, int var2, int var3) throws IOException {
         if (this.field_254) {
            throw new IOException("Stream is closed");
         }

         if (this.field_391 && this.field_859 < 0) {
            return -1;
         }

         if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
            int var4 = var2;
            if (this.field_859 >= 0) {
               do {
                  if (var3 == 0) {
                     return var2 - var4;
                  }

                  var1[var2++] = (byte)(this.field_1557 >> this.field_859);
                  var3--;
                  this.field_859 -= 8;
               } while (this.field_859 >= 0);

               this.field_1557 = 0;
            }

            while (var3 > 0) {
               int var5 = this.field_672.read();
               if (var5 == -1) {
                  this.field_391 = true;
                  if (this.field_1126 != 18) {
                     if (this.field_1126 == 12) {
                        throw new IOException("Base64 stream has one un-decoded dangling byte.");
                     }

                     var1[var2++] = (byte)(this.field_1557 >> 16);
                     var3--;
                     if (this.field_1126 == 0) {
                        if (var3 == 0) {
                           this.field_1557 >>= 8;
                           this.field_859 = 0;
                        } else {
                           var1[var2++] = (byte)(this.field_1557 >> 8);
                        }
                     }
                  }

                  if (var2 == var4) {
                     return -1;
                  }

                  return var2 - var4;
               }

               if (var5 == 61) {
                  if (this.field_1126 == 18 || this.field_1126 == 12 || this.field_1126 == 6 && this.field_672.read() != 61) {
                     throw new IOException("Illegal base64 ending sequence:" + this.field_1126);
                  }

                  var1[var2++] = (byte)(this.field_1557 >> 16);
                  var3--;
                  if (this.field_1126 == 0) {
                     if (var3 == 0) {
                        this.field_1557 >>= 8;
                        this.field_859 = 0;
                     } else {
                        var1[var2++] = (byte)(this.field_1557 >> 8);
                     }
                  }

                  this.field_391 = true;
                  break;
               }

               if ((var5 = this.field_424[var5]) == -1) {
                  if (!this.field_309) {
                     throw new IOException("Illegal base64 character " + Integer.toString(var5, 16));
                  }
               } else {
                  this.field_1557 = this.field_1557 | var5 << this.field_1126;
                  if (this.field_1126 != 0) {
                     this.field_1126 -= 6;
                  } else {
                     this.field_1126 = 18;
                     this.field_859 = 16;

                     while (this.field_859 >= 0) {
                        var1[var2++] = (byte)(this.field_1557 >> this.field_859);
                        var3--;
                        this.field_859 -= 8;
                        if (var3 == 0 && this.field_859 >= 0) {
                           return var2 - var4;
                        }
                     }

                     this.field_1557 = 0;
                  }
               }
            }

            return var2 - var4;
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      @Override
      public int available() throws IOException {
         if (this.field_254) {
            throw new IOException("Stream is closed");
         } else {
            return this.field_672.available();
         }
      }

      @Override
      public void close() throws IOException {
         if (!this.field_254) {
            this.field_254 = true;
            this.field_672.close();
         }
      }
   }

   public static class Inner30 {
      private final byte[] field_108;
      private final int field_744;
      private final boolean field_1101;
      private final boolean field_1193;
      private static final char[] field_10 = new char[]{
         'A',
         'B',
         'C',
         'D',
         'E',
         'F',
         'G',
         'H',
         'I',
         'J',
         'K',
         'L',
         'M',
         'N',
         'O',
         'P',
         'Q',
         'R',
         'S',
         'T',
         'U',
         'V',
         'W',
         'X',
         'Y',
         'Z',
         'a',
         'b',
         'c',
         'd',
         'e',
         'f',
         'g',
         'h',
         'i',
         'j',
         'k',
         'l',
         'm',
         'n',
         'o',
         'p',
         'q',
         'r',
         's',
         't',
         'u',
         'v',
         'w',
         'x',
         'y',
         'z',
         '0',
         '1',
         '2',
         '3',
         '4',
         '5',
         '6',
         '7',
         '8',
         '9',
         '+',
         '/'
      };
      private static final char[] field_195 = new char[]{
         'A',
         'B',
         'C',
         'D',
         'E',
         'F',
         'G',
         'H',
         'I',
         'J',
         'K',
         'L',
         'M',
         'N',
         'O',
         'P',
         'Q',
         'R',
         'S',
         'T',
         'U',
         'V',
         'W',
         'X',
         'Y',
         'Z',
         'a',
         'b',
         'c',
         'd',
         'e',
         'f',
         'g',
         'h',
         'i',
         'j',
         'k',
         'l',
         'm',
         'n',
         'o',
         'p',
         'q',
         'r',
         's',
         't',
         'u',
         'v',
         'w',
         'x',
         'y',
         'z',
         '0',
         '1',
         '2',
         '3',
         '4',
         '5',
         '6',
         '7',
         '8',
         '9',
         '-',
         '_'
      };
      private static final int field_121 = 76;
      private static final byte[] field_1173 = new byte[]{13, 10};
      static final Class29.Inner30 field_946 = new Class29.Inner30(false, null, -1, true);
      static final Class29.Inner30 field_239 = new Class29.Inner30(true, null, -1, true);
      static final Class29.Inner30 field_1340 = new Class29.Inner30(false, field_1173, 76, true);

      private Inner30(boolean var1, byte[] var2, int var3, boolean var4) {
         this.field_1101 = var1;
         this.field_108 = var2;
         this.field_744 = var3;
         this.field_1193 = var4;
      }

      private final int method_469(int var1) {
         int var2 = 0;
         if (this.field_1193) {
            var2 = 4 * ((var1 + 2) / 3);
         } else {
            int var3 = var1 % 3;
            var2 = 4 * (var1 / 3) + (var3 == 0 ? 0 : var3 + 1);
         }

         if (this.field_744 > 0) {
            var2 += (var2 - 1) / this.field_744 * this.field_108.length;
         }

         return var2;
      }

      public byte[] method_839(byte[] var1) {
         int var2 = this.method_469(var1.length);
         byte[] var3 = new byte[var2];
         int var4 = this.method_189(var1, 0, var1.length, var3);
         return var4 != var3.length ? Arrays.copyOf(var3, var4) : var3;
      }

      public int method_1021(byte[] var1, byte[] var2) {
         int var3 = this.method_469(var1.length);
         if (var2.length < var3) {
            throw new IllegalArgumentException("Output byte array is too small for encoding all input bytes");
         } else {
            return this.method_189(var1, 0, var1.length, var2);
         }
      }

      public String method_553(byte[] var1) {
         byte[] var2 = this.method_839(var1);
         return new String(var2, 0, 0, var2.length);
      }

      public ByteBuffer method_137(ByteBuffer var1) {
         int var2 = this.method_469(var1.remaining());
         byte[] var3 = new byte[var2];
         int var4 = 0;
         if (var1.hasArray()) {
            var4 = this.method_189(var1.array(), var1.arrayOffset() + var1.position(), var1.arrayOffset() + var1.limit(), var3);
            ((Buffer)var1).position(var1.limit());
         } else {
            byte[] var5 = new byte[var1.remaining()];
            var1.get(var5);
            var4 = this.method_189(var5, 0, var5.length, var3);
         }

         if (var4 != var3.length) {
            var3 = Arrays.copyOf(var3, var4);
         }

         return ByteBuffer.wrap(var3);
      }

      public OutputStream method_499(OutputStream var1) {
         return new Class29.Inner373(var1, this.field_1101 ? field_195 : field_10, this.field_108, this.field_744, this.field_1193);
      }

      public Class29.Inner30 method_314() {
         return !this.field_1193 ? this : new Class29.Inner30(this.field_1101, this.field_108, this.field_744, false);
      }

      private int method_189(byte[] var1, int var2, int var3, byte[] var4) {
         char[] var5 = this.field_1101 ? field_195 : field_10;
         int var6 = var2;
         int var7 = (var3 - var2) / 3 * 3;
         int var8 = var2 + var7;
         if (this.field_744 > 0 && var7 > this.field_744 / 4 * 3) {
            var7 = this.field_744 / 4 * 3;
         }

         int var9 = 0;

         while (var6 < var8) {
            int var10 = Math.min(var6 + var7, var8);
            int var11 = var6;
            int var12 = var9;

            while (var11 < var10) {
               int var13 = (var1[var11++] & 255) << 16 | (var1[var11++] & 255) << 8 | var1[var11++] & 255;
               var4[var12++] = (byte)var5[var13 >>> 18 & 63];
               var4[var12++] = (byte)var5[var13 >>> 12 & 63];
               var4[var12++] = (byte)var5[var13 >>> 6 & 63];
               var4[var12++] = (byte)var5[var13 & 63];
            }

            var11 = (var10 - var6) / 3 * 4;
            var9 += var11;
            var6 = var10;
            if (var11 == this.field_744 && var6 < var3) {
               for (byte var15 : this.field_108) {
                  var4[var9++] = var15;
               }
            }
         }

         if (var6 < var3) {
            int var21 = var1[var6++] & 255;
            var4[var9++] = (byte)var5[var21 >> 2];
            if (var6 == var3) {
               var4[var9++] = (byte)var5[var21 << 4 & 63];
               if (this.field_1193) {
                  var4[var9++] = 61;
                  var4[var9++] = 61;
               }
            } else {
               int var25 = var1[var6++] & 255;
               var4[var9++] = (byte)var5[var21 << 4 & 63 | var25 >> 4];
               var4[var9++] = (byte)var5[var25 << 2 & 63];
               if (this.field_1193) {
                  var4[var9++] = 61;
               }
            }
         }

         return var9;
      }
   }

   private static class Inner373 extends FilterOutputStream {
      private int field_655 = 0;
      private int field_115;
      private int field_233;
      private int field_1175;
      private boolean field_478 = false;
      private final char[] field_539;
      private final byte[] field_333;
      private final int field_1343;
      private final boolean field_648;
      private int field_1314 = 0;

      Inner373(OutputStream var1, char[] var2, byte[] var3, int var4, boolean var5) {
         super(var1);
         this.field_539 = var2;
         this.field_333 = var3;
         this.field_1343 = var4;
         this.field_648 = var5;
      }

      @Override
      public void write(int var1) throws IOException {
         byte[] var2 = new byte[]{(byte)(var1 & 0xFF)};
         this.write(var2, 0, 1);
      }

      private void method_780() throws IOException {
         if (this.field_1314 == this.field_1343) {
            this.out.write(this.field_333);
            this.field_1314 = 0;
         }
      }

      @Override
      public void write(byte[] var1, int var2, int var3) throws IOException {
         if (this.field_478) {
            throw new IOException("Stream is closed");
         }

         if (var2 < 0 || var3 < 0 || var3 > var1.length - var2) {
            throw new ArrayIndexOutOfBoundsException();
         }

         if (var3 != 0) {
            if (this.field_655 != 0) {
               if (this.field_655 == 1) {
                  this.field_233 = var1[var2++] & 255;
                  if (--var3 == 0) {
                     this.field_655++;
                     return;
                  }
               }

               this.field_1175 = var1[var2++] & 255;
               var3--;
               this.method_780();
               this.out.write(this.field_539[this.field_115 >> 2]);
               this.out.write(this.field_539[this.field_115 << 4 & 63 | this.field_233 >> 4]);
               this.out.write(this.field_539[this.field_233 << 2 & 63 | this.field_1175 >> 6]);
               this.out.write(this.field_539[this.field_1175 & 63]);
               this.field_1314 += 4;
            }

            int var4 = var3 / 3;

            for (this.field_655 = var3 - var4 * 3; var4-- > 0; this.field_1314 += 4) {
               this.method_780();
               int var5 = (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
               this.out.write(this.field_539[var5 >>> 18 & 63]);
               this.out.write(this.field_539[var5 >>> 12 & 63]);
               this.out.write(this.field_539[var5 >>> 6 & 63]);
               this.out.write(this.field_539[var5 & 63]);
            }

            if (this.field_655 == 1) {
               this.field_115 = var1[var2++] & 255;
            } else if (this.field_655 == 2) {
               this.field_115 = var1[var2++] & 255;
               this.field_233 = var1[var2++] & 255;
            }
         }
      }

      @Override
      public void close() throws IOException {
         if (!this.field_478) {
            this.field_478 = true;
            if (this.field_655 == 1) {
               this.method_780();
               this.out.write(this.field_539[this.field_115 >> 2]);
               this.out.write(this.field_539[this.field_115 << 4 & 63]);
               if (this.field_648) {
                  this.out.write(61);
                  this.out.write(61);
               }
            } else if (this.field_655 == 2) {
               this.method_780();
               this.out.write(this.field_539[this.field_115 >> 2]);
               this.out.write(this.field_539[this.field_115 << 4 & 63 | this.field_233 >> 4]);
               this.out.write(this.field_539[this.field_233 << 2 & 63]);
               if (this.field_648) {
                  this.out.write(61);
               }
            }

            this.field_655 = 0;
            this.out.close();
         }
      }
   }
}
