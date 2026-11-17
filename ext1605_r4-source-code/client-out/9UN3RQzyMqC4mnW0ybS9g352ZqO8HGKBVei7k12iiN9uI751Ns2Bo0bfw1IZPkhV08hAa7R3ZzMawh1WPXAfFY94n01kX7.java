import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class 9UN3RQzyMqC4mnW0ybS9g352ZqO8HGKBVei7k12iiN9uI751Ns2Bo0bfw1IZPkhV08hAa7R3ZzMawh1WPXAfFY94n01kX7
   extends 3W0d28OFdXcKp4p5sJF2NY3wOKKdPb2FwuG0BLk9y18f2pN4kKKw9zLnwO3k3RS31Nz2bMsm8s5q4D0514o6bz9M7kScW8 {
   private ZipFile 571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6;
   private int 2cUT0SUjeOMs7J6RZO3UBarVwD8a0JC8U48dhuR2R9pfyIQap1sO7FF8B3ct = -1;
   private BufferedImage 2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W;
   private File 7RJ0G7RpLs64I31WE97VKAl1w2b68fgkGi6s73Jx0s1KwfPGh4l4qfINn508;

   public _UN3RQzyMqC4mnW0ybS9g352ZqO8HGKBVei7k12iiN9uI751Ns2Bo0bfw1IZPkhV08hAa7R3ZzMawh1WPXAfFY94n01kX7/* $VF was: 9UN3RQzyMqC4mnW0ybS9g352ZqO8HGKBVei7k12iiN9uI751Ns2Bo0bfw1IZPkhV08hAa7R3ZzMawh1WPXAfFY94n01kX7 */(
      File var1
   ) {
      this.0Sg7537VnLZ7du5FsLln7EYJ7tLG9LfdbFsVG53zuLLa94D21JXk6aie9tls = var1.getName();
      this.7RJ0G7RpLs64I31WE97VKAl1w2b68fgkGi6s73Jx0s1KwfPGh4l4qfINn508 = var1;
   }

   private String _7DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133/* $VF was: 27DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133 */(
      String var1
   ) {
      if (var1 != null && var1.length() > 34) {
         var1 = var1.substring(0, 34);
      }

      return var1;
   }

   @Override
   public void _Gpj8594Ufmy5e2AAxicC9QX8AZ598q48b12zV8cSfE61ZzMvANYL3Omgcv9/* $VF was: 0Gpj8594Ufmy5e2AAxicC9QX8AZ598q48b12zV8cSfE61ZzMvANYL3Omgcv9 */(
      Minecraft var1
   ) throws IOException {
      ZipFile var2 = null;
      InputStream var3 = null;

      try {
         var2 = new ZipFile(this.7RJ0G7RpLs64I31WE97VKAl1w2b68fgkGi6s73Jx0s1KwfPGh4l4qfINn508);

         try {
            var3 = var2.getInputStream(var2.getEntry("pack.txt"));
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
            this.6rK7r47m1wf6M34G2s0hL7m282kBAy4521c3axU19Y9WKmYF8gZ6ryN7JLjP = this._7DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133/* $VF was: 27DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133 */(
               var4.readLine()
            );
            this.3AzF56gtxWJ9912dPKDPOy7hH3t9Hl1HPMnVNkT671yMpR86uFp7khyzZyaR = this._7DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133/* $VF was: 27DPOA93HRGUbxXTtJ13X8a2q3wp16k5W2EI2N4AGpkaM5Ca8v0hMJXB0133 */(
               var4.readLine()
            );
            var4.close();
            var3.close();
         } catch (Exception var23) {
         }

         try {
            this.5N63dbka0na7Is07L9kMmSk6ZK28Ioxdll6JwQgybo1I69cauDA8U5rtDvBv = new 2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll();
            var3 = var2.getInputStream(var2.getEntry("packconfig.cfg"));
            this.5N63dbka0na7Is07L9kMmSk6ZK28Ioxdll6JwQgybo1I69cauDA8U5rtDvBv = 2jD07HfU76WzqP8wGz7ll2Zo5oWLoe7N9pE17R5yFKLHN01H3Ws7w4MFs3yR8iM8V033MrU1i0Jelj7NkmurBOh938rq321ll._qG6SCyQHhAB3Z4dLMG6530SnOk4ZY0WE2d12Vzgf77VgolUcGMS3afod9NS/* $VF was: 4qG6SCyQHhAB3Z4dLMG6530SnOk4ZY0WE2d12Vzgf77VgolUcGMS3afod9NS */(
               var3
            );
            var3.close();
         } catch (Exception var22) {
         }

         try {
            var3 = var2.getInputStream(var2.getEntry("pack.png"));
            this.2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W = ImageIO.read(var3);
            var3.close();
         } catch (Exception var21) {
         }

         try {
            var3 = var2.getInputStream(var2.getEntry("terrain.png"));
            BufferedImage var27 = ImageIO.read(var3);
            if (var27.getWidth() != 256 || var27.getHeight() != 512) {
               this.5N63dbka0na7Is07L9kMmSk6ZK28Ioxdll6JwQgybo1I69cauDA8U5rtDvBv.99q16b50kyIAY3WydyIly32wBpFBLxi4p3yRL4x1J0O0Z0CR3wEHi9t1G3x9 = false;
            }

            var3.close();
         } catch (Exception var24) {
         }

         var2.close();
      } catch (Exception var25) {
         var25.printStackTrace();
      } finally {
         try {
            var3.close();
         } catch (Exception var20) {
         }

         try {
            var2.close();
         } catch (Exception var19) {
         }
      }
   }

   @Override
   public void _kOi4sh8w5g34shttmoUUEDgCPE5VRiNwN076cQcxuDFXDkU0y92lK2v99vL/* $VF was: 6kOi4sh8w5g34shttmoUUEDgCPE5VRiNwN076cQcxuDFXDkU0y92lK2v99vL */(
      Minecraft var1
   ) {
      if (this.2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W != null) {
         var1.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._3swr7mqK54Yo1qph1JJ5nr7IZcL0bO0cEmdT4n3yev5424Oz6BOyfXVggMZ/* $VF was: 23swr7mqK54Yo1qph1JJ5nr7IZcL0bO0cEmdT4n3yev5424Oz6BOyfXVggMZ */(
               this.2cUT0SUjeOMs7J6RZO3UBarVwD8a0JC8U48dhuR2R9pfyIQap1sO7FF8B3ct
            );
      }

      this._I13qZ82Olr559q81461XqI7EvNeguYD7GAG7DmGJf04Fu44f4iY1Oy7WJME/* $VF was: 2I13qZ82Olr559q81461XqI7EvNeguYD7GAG7DmGJf04Fu44f4iY1Oy7WJME */();
   }

   @Override
   public void _X6Ocgi2aWrG07279w14Ok6jeWFPa9bmt1my2NA0a1ZEmdxx5QjSOn3mi5a8/* $VF was: 7X6Ocgi2aWrG07279w14Ok6jeWFPa9bmt1my2NA0a1ZEmdxx5QjSOn3mi5a8 */(
      Minecraft var1
   ) {
      if (this.2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W != null && this.2cUT0SUjeOMs7J6RZO3UBarVwD8a0JC8U48dhuR2R9pfyIQap1sO7FF8B3ct < 0) {
         this.2cUT0SUjeOMs7J6RZO3UBarVwD8a0JC8U48dhuR2R9pfyIQap1sO7FF8B3ct = var1.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._BSFEHd336lH8JfA2w35JiGWqukE049E001767W1o8r4eUhCdf1SuM948qw6/* $VF was: 1BSFEHd336lH8JfA2w35JiGWqukE049E001767W1o8r4eUhCdf1SuM948qw6 */(
               this.2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W
            );
      }

      if (this.2gve41Fd8RbvPhjqP6Qn697JjCjxn62kB6A60Dtr7TUxCo6cL9421hPZZ16W != null) {
         var1.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._FngD4U0pd65pnJ2uUkjT0MQGf5Dn69MpHQ9hHdo5NZWQWiViGc62I6GRw3J/* $VF was: 2FngD4U0pd65pnJ2uUkjT0MQGf5Dn69MpHQ9hHdo5NZWQWiViGc62I6GRw3J */(
               this.2cUT0SUjeOMs7J6RZO3UBarVwD8a0JC8U48dhuR2R9pfyIQap1sO7FF8B3ct
            );
      } else {
         GL11.glBindTexture(
            3553,
            var1.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
               ._vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8/* $VF was: 7vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8 */(
                  "/gui/unknown_pack.png"
               )
         );
      }
   }

   @Override
   public void _8ZVjfTsTKfB80BRv0MI82mIW7A5kEEVTFqM41a5Y88G06sn7n695Ml9CX4X/* $VF was: 18ZVjfTsTKfB80BRv0MI82mIW7A5kEEVTFqM41a5Y88G06sn7n695Ml9CX4X */() {
      try {
         this.571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6 = new ZipFile(this.7RJ0G7RpLs64I31WE97VKAl1w2b68fgkGi6s73Jx0s1KwfPGh4l4qfINn508);
      } catch (Exception var2) {
      }
   }

   @Override
   public void _I13qZ82Olr559q81461XqI7EvNeguYD7GAG7DmGJf04Fu44f4iY1Oy7WJME/* $VF was: 2I13qZ82Olr559q81461XqI7EvNeguYD7GAG7DmGJf04Fu44f4iY1Oy7WJME */() {
      try {
         this.571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6.close();
      } catch (Exception var2) {
      }

      this.571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6 = null;
   }

   @Override
   public InputStream _5L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0/* $VF was: 35L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0 */(
      String var1
   ) {
      try {
         ZipEntry var2 = this.571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6.getEntry(var1.substring(1));
         if (var2 != null) {
            return this.571vUI1nI9vTchTM5C9H8xdh8TeB7u53h277FkE3zjWL4WzRM124lI04eRu6.getInputStream(var2);
         }
      } catch (Exception var3) {
      }

      return 1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN._v4Cs6sI06e6Hjpg3rSI82gG008x14C2jag2OM7ADaW5U8a3DYSrf570CJm6/* $VF was: 5v4Cs6sI06e6Hjpg3rSI82gG008x14C2jag2OM7ADaW5U8a3DYSrf570CJm6 */(
         var1
      );
   }
}
