import java.io.IOException;
import java.io.InputStream;

class 6Nii55CbtD9w3zYKF2Yfsbqbbtuz18Q13gjoHCCe28j3vY7I84Mn41s28njx32dPbEZw48vUkpjC8oRZ4j41mGgW81WH8 extends InputStream {
   private final InputStream 3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58;
   private final boolean 94aS93PObDm16VBVV33OtkGC0878104iI9Xxx4lIt9Y203T6TWzSLrH0494n;
   private final int[] 1gHxDx6V7cFP3NtRutwLdTTJ5HEZB4FCVeU5NzT9m8KDla8kj8qV7d8ei9bp;
   private int 292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 = 0;
   private int 3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 = 18;
   private int 0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az = -8;
   private boolean 1wRuAi27T0IfYeX17Nn8LuH7O3THY1RWGg9A4FUqMhcI5WC0WuFj60pxZ88O = false;
   private boolean 37n2WuU2ty7841Ir32ZW07Si5Ju3EM3Aq85uYk15vi3FMdF9wThq63b6t2j7 = false;
   private byte[] 2Zq8x3jLG7r94DcJ21EY2q395J11cjCuCqS0xU0DQlTB71g91215kJ7Nz3RF = new byte[1];

   _Nii55CbtD9w3zYKF2Yfsbqbbtuz18Q13gjoHCCe28j3vY7I84Mn41s28njx32dPbEZw48vUkpjC8oRZ4j41mGgW81WH8/* $VF was: 6Nii55CbtD9w3zYKF2Yfsbqbbtuz18Q13gjoHCCe28j3vY7I84Mn41s28njx32dPbEZw48vUkpjC8oRZ4j41mGgW81WH8 */(
      InputStream var1, int[] var2, boolean var3
   ) {
      this.3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58 = var1;
      this.1gHxDx6V7cFP3NtRutwLdTTJ5HEZB4FCVeU5NzT9m8KDla8kj8qV7d8ei9bp = var2;
      this.94aS93PObDm16VBVV33OtkGC0878104iI9Xxx4lIt9Y203T6TWzSLrH0494n = var3;
   }

   @Override
   public int read() throws IOException {
      return this.read(this.2Zq8x3jLG7r94DcJ21EY2q395J11cjCuCqS0xU0DQlTB71g91215kJ7Nz3RF, 0, 1) == -1
         ? -1
         : this.2Zq8x3jLG7r94DcJ21EY2q395J11cjCuCqS0xU0DQlTB71g91215kJ7Nz3RF[0] & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      if (this.37n2WuU2ty7841Ir32ZW07Si5Ju3EM3Aq85uYk15vi3FMdF9wThq63b6t2j7) {
         throw new IOException("Stream is closed");
      }

      if (this.1wRuAi27T0IfYeX17Nn8LuH7O3THY1RWGg9A4FUqMhcI5WC0WuFj60pxZ88O && this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az < 0) {
         return -1;
      }

      if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
         int var4 = var2;
         if (this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az >= 0) {
            do {
               if (var3 == 0) {
                  return var2 - var4;
               }

               var1[var2++] = (byte)(
                  this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az
               );
               var3--;
               this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az -= 8;
            } while (this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az >= 0);

            this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 = 0;
         }

         while (var3 > 0) {
            int var5 = this.3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58.read();
            if (var5 == -1) {
               this.1wRuAi27T0IfYeX17Nn8LuH7O3THY1RWGg9A4FUqMhcI5WC0WuFj60pxZ88O = true;
               if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 != 18) {
                  if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 12) {
                     throw new IOException("Base64 stream has one un-decoded dangling byte.");
                  }

                  var1[var2++] = (byte)(this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> 16);
                  var3--;
                  if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 0) {
                     if (var3 == 0) {
                        this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >>= 8;
                        this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az = 0;
                     } else {
                        var1[var2++] = (byte)(this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> 8);
                     }
                  }
               }

               if (var2 == var4) {
                  return -1;
               }

               return var2 - var4;
            }

            if (var5 == 61) {
               if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 18
                  || this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 12
                  || this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 6
                     && this.3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58.read() != 61) {
                  throw new IOException("Illegal base64 ending sequence:" + this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419);
               }

               var1[var2++] = (byte)(this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> 16);
               var3--;
               if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 == 0) {
                  if (var3 == 0) {
                     this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >>= 8;
                     this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az = 0;
                  } else {
                     var1[var2++] = (byte)(this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> 8);
                  }
               }

               this.1wRuAi27T0IfYeX17Nn8LuH7O3THY1RWGg9A4FUqMhcI5WC0WuFj60pxZ88O = true;
               break;
            }

            if ((var5 = this.1gHxDx6V7cFP3NtRutwLdTTJ5HEZB4FCVeU5NzT9m8KDla8kj8qV7d8ei9bp[var5]) == -1) {
               if (!this.94aS93PObDm16VBVV33OtkGC0878104iI9Xxx4lIt9Y203T6TWzSLrH0494n) {
                  throw new IOException("Illegal base64 character " + Integer.toString(var5, 16));
               }
            } else {
               this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 = this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9
                  | var5 << this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419;
               if (this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 != 0) {
                  this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 -= 6;
               } else {
                  this.3iZtVa48Sq976u7C69C6l4qnSvEfA28Zc08I5K1E5GwT7j07NOy9jGPKU419 = 18;
                  this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az = 16;

                  while (this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az >= 0) {
                     var1[var2++] = (byte)(
                        this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 >> this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az
                     );
                     var3--;
                     this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az -= 8;
                     if (var3 == 0 && this.0KxBLH6Qw4J29jIDbGdH5zRVQ0vrWW1K27MCgh6mGo9A5qyJxr6dKYOcN9Az >= 0) {
                        return var2 - var4;
                     }
                  }

                  this.292y58JwwgZy8L68LVOM87RY1Inmy82jX3ASWnso4sPad7wOsZidK70828J9 = 0;
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
      if (this.37n2WuU2ty7841Ir32ZW07Si5Ju3EM3Aq85uYk15vi3FMdF9wThq63b6t2j7) {
         throw new IOException("Stream is closed");
      } else {
         return this.3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58.available();
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.37n2WuU2ty7841Ir32ZW07Si5Ju3EM3Aq85uYk15vi3FMdF9wThq63b6t2j7) {
         this.37n2WuU2ty7841Ir32ZW07Si5Ju3EM3Aq85uYk15vi3FMdF9wThq63b6t2j7 = true;
         this.3Y1Xpu90M2IwRfqHbT8CcF0mO6D8unBu5QSdv8m248LF11FY4V049pTyIc58.close();
      }
   }
}
