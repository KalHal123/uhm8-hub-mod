package ext;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

public class Class158 {
   private Class158() {
   }

   public static Class158.Inner676 method_196() {
      return Class158.Inner676.field_1440;
   }

   public static Class158.Inner676 method_1636() {
      return Class158.Inner676.field_210;
   }

   public static Class158.Inner676 method_216() {
      return Class158.Inner676.field_1149;
   }

   public static Class158.Inner676 method_859(int var0, byte[] var1) {
      Objects.requireNonNull(var1);
      int[] var2 = Class158.Inner240.field_298;

      for (byte var6 : var1) {
         if (var2[var6 & 0xFF] != -1) {
            throw new IllegalArgumentException("Illegal base64 line separator character 0x" + Integer.toString(var6, 16));
         }
      }

      return var0 <= 0 ? Class158.Inner676.field_1440 : new Class158.Inner676(false, var1, var0 >> 2 << 2, true);
   }

   public static Class158.Inner240 method_546() {
      return Class158.Inner240.field_696;
   }

   public static Class158.Inner240 method_1600() {
      return Class158.Inner240.field_613;
   }

   public static Class158.Inner240 method_1525() {
      return Class158.Inner240.field_4;
   }

   public static class Inner240 {
      private final boolean field_462;
      private final boolean field_2032;
      private static final int[] field_298 = new int[256];
      private static final int[] field_258;
      static final Class158.Inner240 field_696;
      static final Class158.Inner240 field_613;
      static final Class158.Inner240 field_4;

      private Inner240(boolean var1, boolean var2) {
         this.field_462 = var1;
         this.field_2032 = var2;
      }

      public byte[] method_989(byte[] var1) {
         byte[] var2 = new byte[this.method_26(var1, 0, var1.length)];
         int var3 = this.method_1652(var1, 0, var1.length, var2);
         if (var3 != var2.length) {
            var2 = Arrays.copyOf(var2, var3);
         }

         return var2;
      }

      public byte[] method_1213(String var1) {
         return this.method_989(var1.getBytes(StandardCharsets.ISO_8859_1));
      }

      public int method_529(byte[] var1, byte[] var2) {
         int var3 = this.method_26(var1, 0, var1.length);
         if (var2.length < var3) {
            throw new IllegalArgumentException("Output byte array is too small for decoding all input bytes");
         } else {
            return this.method_1652(var1, 0, var1.length, var2);
         }
      }

      public ByteBuffer method_1270(ByteBuffer var1) {
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

            byte[] var6 = new byte[this.method_26(var3, var4, var5)];
            return ByteBuffer.wrap(var6, 0, this.method_1652(var3, var4, var5, var6));
         } catch (IllegalArgumentException var7) {
            ((Buffer)var1).position(var2);
            throw var7;
         }
      }

      public InputStream method_342(InputStream var1) {
         return new Class158.Inner506(var1, this.field_462 ? field_258 : field_298, this.field_2032);
      }

      private int method_26(byte[] var1, int var2, int var3) {
         int[] var4 = this.field_462 ? field_258 : field_298;
         int var5 = 0;
         int var6 = var3 - var2;
         if (var6 == 0) {
            return 0;
         }

         if (var6 < 2) {
            if (this.field_2032 && var4[0] == -1) {
               return 0;
            } else {
               throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
         } else {
            if (this.field_2032) {
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

      private int method_1652(byte[] var1, int var2, int var3, byte[] var4) {
         int[] var5 = this.field_462 ? field_258 : field_298;
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

               if (!this.field_2032) {
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
            if (!this.field_2032 || var5[var1[var2++] & 0xFF] >= 0) {
               throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + var2);
            }
         }

         return var6;
      }

      static {
         Arrays.fill(field_298, -1);
         int var0 = 0;

         while (var0 < Class158.Inner676.field_2673.length) {
            field_298[Class158.Inner676.field_2673[var0]] = var0++;
         }

         field_298[61] = -2;
         field_258 = new int[256];
         Arrays.fill(field_258, -1);
         var0 = 0;

         while (var0 < Class158.Inner676.field_3016.length) {
            field_258[Class158.Inner676.field_3016[var0]] = var0++;
         }

         field_258[61] = -2;
         field_696 = new Class158.Inner240(false, false);
         field_613 = new Class158.Inner240(true, false);
         field_4 = new Class158.Inner240(false, true);
      }
   }

   private static class Inner444 extends FilterOutputStream {
      private int field_389 = 0;
      private int field_603;
      private int field_2605;
      private int field_2825;
      private boolean field_135 = false;
      private final char[] field_919;
      private final byte[] field_2272;
      private final int field_2884;
      private final boolean field_2009;
      private int field_175 = 0;

      Inner444(OutputStream var1, char[] var2, byte[] var3, int var4, boolean var5) {
         super(var1);
         this.field_919 = var2;
         this.field_2272 = var3;
         this.field_2884 = var4;
         this.field_2009 = var5;
      }

      @Override
      public void write(int var1) throws IOException {
         byte[] var2 = new byte[]{(byte)(var1 & 0xFF)};
         this.write(var2, 0, 1);
      }

      private void method_1210() throws IOException {
         if (this.field_175 == this.field_2884) {
            this.out.write(this.field_2272);
            this.field_175 = 0;
         }
      }

      @Override
      public void write(byte[] var1, int var2, int var3) throws IOException {
         if (this.field_135) {
            throw new IOException("Stream is closed");
         }

         if (var2 < 0 || var3 < 0 || var3 > var1.length - var2) {
            throw new ArrayIndexOutOfBoundsException();
         }

         if (var3 != 0) {
            if (this.field_389 != 0) {
               if (this.field_389 == 1) {
                  this.field_2605 = var1[var2++] & 255;
                  if (--var3 == 0) {
                     this.field_389++;
                     return;
                  }
               }

               this.field_2825 = var1[var2++] & 255;
               var3--;
               this.method_1210();
               this.out.write(this.field_919[this.field_603 >> 2]);
               this.out.write(this.field_919[this.field_603 << 4 & 63 | this.field_2605 >> 4]);
               this.out.write(this.field_919[this.field_2605 << 2 & 63 | this.field_2825 >> 6]);
               this.out.write(this.field_919[this.field_2825 & 63]);
               this.field_175 += 4;
            }

            int var4 = var3 / 3;

            for (this.field_389 = var3 - var4 * 3; var4-- > 0; this.field_175 += 4) {
               this.method_1210();
               int var5 = (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
               this.out.write(this.field_919[var5 >>> 18 & 63]);
               this.out.write(this.field_919[var5 >>> 12 & 63]);
               this.out.write(this.field_919[var5 >>> 6 & 63]);
               this.out.write(this.field_919[var5 & 63]);
            }

            if (this.field_389 == 1) {
               this.field_603 = var1[var2++] & 255;
            } else if (this.field_389 == 2) {
               this.field_603 = var1[var2++] & 255;
               this.field_2605 = var1[var2++] & 255;
            }
         }
      }

      @Override
      public void close() throws IOException {
         if (!this.field_135) {
            this.field_135 = true;
            if (this.field_389 == 1) {
               this.method_1210();
               this.out.write(this.field_919[this.field_603 >> 2]);
               this.out.write(this.field_919[this.field_603 << 4 & 63]);
               if (this.field_2009) {
                  this.out.write(61);
                  this.out.write(61);
               }
            } else if (this.field_389 == 2) {
               this.method_1210();
               this.out.write(this.field_919[this.field_603 >> 2]);
               this.out.write(this.field_919[this.field_603 << 4 & 63 | this.field_2605 >> 4]);
               this.out.write(this.field_919[this.field_2605 << 2 & 63]);
               if (this.field_2009) {
                  this.out.write(61);
               }
            }

            this.field_389 = 0;
            this.out.close();
         }
      }
   }

   private static class Inner506 extends InputStream {
      private final InputStream field_1185;
      private final boolean field_2879;
      private final int[] field_587;
      private int field_746 = 0;
      private int field_1233 = 18;
      private int field_181 = -8;
      private boolean field_640 = false;
      private boolean field_1066 = false;
      private byte[] field_862 = new byte[1];

      Inner506(InputStream var1, int[] var2, boolean var3) {
         this.field_1185 = var1;
         this.field_587 = var2;
         this.field_2879 = var3;
      }

      @Override
      public int read() throws IOException {
         return this.read(this.field_862, 0, 1) == -1 ? -1 : this.field_862[0] & 0xFF;
      }

      @Override
      public int read(byte[] var1, int var2, int var3) throws IOException {
         if (this.field_1066) {
            throw new IOException("Stream is closed");
         }

         if (this.field_640 && this.field_181 < 0) {
            return -1;
         }

         if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
            int var4 = var2;
            if (this.field_181 >= 0) {
               do {
                  if (var3 == 0) {
                     return var2 - var4;
                  }

                  var1[var2++] = (byte)(this.field_746 >> this.field_181);
                  var3--;
                  this.field_181 -= 8;
               } while (this.field_181 >= 0);

               this.field_746 = 0;
            }

            while (var3 > 0) {
               int var5 = this.field_1185.read();
               if (var5 == -1) {
                  this.field_640 = true;
                  if (this.field_1233 != 18) {
                     if (this.field_1233 == 12) {
                        throw new IOException("Base64 stream has one un-decoded dangling byte.");
                     }

                     var1[var2++] = (byte)(this.field_746 >> 16);
                     var3--;
                     if (this.field_1233 == 0) {
                        if (var3 == 0) {
                           this.field_746 >>= 8;
                           this.field_181 = 0;
                        } else {
                           var1[var2++] = (byte)(this.field_746 >> 8);
                        }
                     }
                  }

                  if (var2 == var4) {
                     return -1;
                  }

                  return var2 - var4;
               }

               if (var5 == 61) {
                  if (this.field_1233 == 18 || this.field_1233 == 12 || this.field_1233 == 6 && this.field_1185.read() != 61) {
                     throw new IOException("Illegal base64 ending sequence:" + this.field_1233);
                  }

                  var1[var2++] = (byte)(this.field_746 >> 16);
                  var3--;
                  if (this.field_1233 == 0) {
                     if (var3 == 0) {
                        this.field_746 >>= 8;
                        this.field_181 = 0;
                     } else {
                        var1[var2++] = (byte)(this.field_746 >> 8);
                     }
                  }

                  this.field_640 = true;
                  break;
               }

               if ((var5 = this.field_587[var5]) == -1) {
                  if (!this.field_2879) {
                     throw new IOException("Illegal base64 character " + Integer.toString(var5, 16));
                  }
               } else {
                  this.field_746 = this.field_746 | var5 << this.field_1233;
                  if (this.field_1233 != 0) {
                     this.field_1233 -= 6;
                  } else {
                     this.field_1233 = 18;
                     this.field_181 = 16;

                     while (this.field_181 >= 0) {
                        var1[var2++] = (byte)(this.field_746 >> this.field_181);
                        var3--;
                        this.field_181 -= 8;
                        if (var3 == 0 && this.field_181 >= 0) {
                           return var2 - var4;
                        }
                     }

                     this.field_746 = 0;
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
         if (this.field_1066) {
            throw new IOException("Stream is closed");
         } else {
            return this.field_1185.available();
         }
      }

      @Override
      public void close() throws IOException {
         if (!this.field_1066) {
            this.field_1066 = true;
            this.field_1185.close();
         }
      }
   }

   public static class Inner676 {
      private final byte[] field_2122;
      private final int field_9;
      private final boolean field_2537;
      private final boolean field_1613;
      private static final char[] field_2673 = new char[]{
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
      private static final char[] field_3016 = new char[]{
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
      private static final int field_1916 = 76;
      private static final byte[] field_1453 = new byte[]{13, 10};
      static final Class158.Inner676 field_1440 = new Class158.Inner676(false, null, -1, true);
      static final Class158.Inner676 field_210 = new Class158.Inner676(true, null, -1, true);
      static final Class158.Inner676 field_1149 = new Class158.Inner676(false, field_1453, 76, true);

      private Inner676(boolean var1, byte[] var2, int var3, boolean var4) {
         this.field_2537 = var1;
         this.field_2122 = var2;
         this.field_9 = var3;
         this.field_1613 = var4;
      }

      private final int method_1187(int var1) {
         int var2 = 0;
         if (this.field_1613) {
            var2 = 4 * ((var1 + 2) / 3);
         } else {
            int var3 = var1 % 3;
            var2 = 4 * (var1 / 3) + (var3 == 0 ? 0 : var3 + 1);
         }

         if (this.field_9 > 0) {
            var2 += (var2 - 1) / this.field_9 * this.field_2122.length;
         }

         return var2;
      }

      public byte[] method_1077(byte[] var1) {
         int var2 = this.method_1187(var1.length);
         byte[] var3 = new byte[var2];
         int var4 = this.method_1264(var1, 0, var1.length, var3);
         return var4 != var3.length ? Arrays.copyOf(var3, var4) : var3;
      }

      public int method_1185(byte[] var1, byte[] var2) {
         int var3 = this.method_1187(var1.length);
         if (var2.length < var3) {
            throw new IllegalArgumentException("Output byte array is too small for encoding all input bytes");
         } else {
            return this.method_1264(var1, 0, var1.length, var2);
         }
      }

      public String method_1822(byte[] var1) {
         byte[] var2 = this.method_1077(var1);
         return new String(var2, 0, 0, var2.length);
      }

      public ByteBuffer method_1019(ByteBuffer var1) {
         int var2 = this.method_1187(var1.remaining());
         byte[] var3 = new byte[var2];
         int var4 = 0;
         if (var1.hasArray()) {
            var4 = this.method_1264(var1.array(), var1.arrayOffset() + var1.position(), var1.arrayOffset() + var1.limit(), var3);
            ((Buffer)var1).position(var1.limit());
         } else {
            byte[] var5 = new byte[var1.remaining()];
            var1.get(var5);
            var4 = this.method_1264(var5, 0, var5.length, var3);
         }

         if (var4 != var3.length) {
            var3 = Arrays.copyOf(var3, var4);
         }

         return ByteBuffer.wrap(var3);
      }

      public OutputStream method_179(OutputStream var1) {
         return new Class158.Inner444(var1, this.field_2537 ? field_3016 : field_2673, this.field_2122, this.field_9, this.field_1613);
      }

      public Class158.Inner676 method_890() {
         return !this.field_1613 ? this : new Class158.Inner676(this.field_2537, this.field_2122, this.field_9, false);
      }

      private int method_1264(byte[] var1, int var2, int var3, byte[] var4) {
         char[] var5 = this.field_2537 ? field_3016 : field_2673;
         int var6 = var2;
         int var7 = (var3 - var2) / 3 * 3;
         int var8 = var2 + var7;
         if (this.field_9 > 0 && var7 > this.field_9 / 4 * 3) {
            var7 = this.field_9 / 4 * 3;
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
            if (var11 == this.field_9 && var6 < var3) {
               for (byte var15 : this.field_2122) {
                  var4[var9++] = var15;
               }
            }
         }

         if (var6 < var3) {
            int var21 = var1[var6++] & 255;
            var4[var9++] = (byte)var5[var21 >> 2];
            if (var6 == var3) {
               var4[var9++] = (byte)var5[var21 << 4 & 63];
               if (this.field_1613) {
                  var4[var9++] = 61;
                  var4[var9++] = 61;
               }
            } else {
               int var25 = var1[var6++] & 255;
               var4[var9++] = (byte)var5[var21 << 4 & 63 | var25 >> 4];
               var4[var9++] = (byte)var5[var25 << 2 & 63];
               if (this.field_1613) {
                  var4[var9++] = 61;
               }
            }
         }

         return var9;
      }
   }
}
