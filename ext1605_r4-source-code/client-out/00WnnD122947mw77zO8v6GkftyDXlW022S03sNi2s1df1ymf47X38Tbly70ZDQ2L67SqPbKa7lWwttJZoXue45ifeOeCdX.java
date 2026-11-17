import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class 00WnnD122947mw77zO8v6GkftyDXlW022S03sNi2s1df1ymf47X38Tbly70ZDQ2L67SqPbKa7lWwttJZoXue45ifeOeCdX {
   private static boolean 72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP = false;
   private static int 5dr5St90Oh58IImZ2u1Qa9TnH57Fm9Z3mbw7d66Rpr7pwLfzm8WwZfRXqEYa = 3000;
   private static int 0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R = 0;
   private static List<3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU> 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG = new ArrayList<>();
   private static Map<String, List<SimpleEntry<String, Integer>>> 5I3lj0DX8KZT0aZ20ID7L4lD3zwq90XX7U57i62V2t1LV4Z8YV1pRDO391cO = new HashMap<>();
   private static int 79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I = 0;
   public static boolean 3gRA1DPeME7dX0o79x6vYtmX9E56Rk4BzqeEhKyuCUjM4Jy9i689uHvsp0L5 = false;
   private static boolean[] 5y7b5152Md8Z9EHuZ025UoG0H2lRYR8C1mpjYv8TA90hyjieQphvjJJzsdg2 = new boolean[256];
   private static boolean[] 2ru92zlbWTMFil0V7u2Nqg2Cih9NEtsYQroaun656e7toIJhbs35ykvwio5C = new boolean[256];
   private static List<2UQBJP5xVBLvcOj4Zez1XaJembU13Cma9CKxz4KHBXDgtLvI3Q228ox61gusX4MQeIDyXmP4j3bUou3222GJ6BeabF38> 4Xu0V1F9kFc3WCP266SoSNwfcHhPI1la15vPfzXuH916i4b6avt2I5NwQxQ4 = new ArrayList<>();
   public static final String 36Ty520QfO20Ax3rMshqVfvF7n1CuphU809iDI7awL2ld87Yr6P6DK3kFH46 = "ExtensionLoader 16.05_20#";

   private static void _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */() {
      String var0 = "1111111111111011111111111111001111111111111110011111111111110001111111111111110011111001111000001111100110000000111110000000000011111001100000000000000100000000000000010000000000000000000000000000000000000000000000000000000000000000000000001100000000000000";
      String var1 = "1111111111111111111111111111110111111111111111011111111111111100111111111111000011111111111111111111111111000000100100111000000010000000000000000000000000000000000000000000000000000000000000000000000000000111000000000000001100000000000001111111111111000011";

      for (int var2 = 0; var2 < 256; var2++) {
         5y7b5152Md8Z9EHuZ025UoG0H2lRYR8C1mpjYv8TA90hyjieQphvjJJzsdg2[var2] = var0.charAt(var2) == '1';
         2ru92zlbWTMFil0V7u2Nqg2Cih9NEtsYQroaun656e7toIJhbs35ykvwio5C[var2] = var1.charAt(var2) == '1';
      }

      try {
         File var5 = new File(
            00WnnD122947mw77zO8v6GkftyDXlW022S03sNi2s1df1ymf47X38Tbly70ZDQ2L67SqPbKa7lWwttJZoXue45ifeOeCdX.class
               .getProtectionDomain()
               .getCodeSource()
               .getLocation()
               .toURI()
         );
         _4K2aL3fM9tPc23003GGOn5IX38EkdrnO8EKoTCZ7nINa7sxKMt7oav6TMz4/* $VF was: 74K2aL3fM9tPc23003GGOn5IX38EkdrnO8EKoTCZ7nINa7sxKMt7oav6TMz4 */(var5);

         for (int var3 = 0; var3 < 32767; var3++) {
            if (1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.3gtX9GUU6wdwzByKEps2xBmG14h5CxN4OFC2q5heb8ZC6C6z9632Rh5t94ea[var3]
                  != null
               && 9ygxPoiW4c6wxGp26X118F0yxK032lk54Et3G9z9La2P3u89472GAyR8g9qCe7Mm61D4aJdzSiABhv3paZ7eid82x1ned.8520h7KAcsf6F9feiIOsmSaFng995n36Rbw1F2Fn1Nn8r6en822LOu567Z7z[var3]
                  == null) {
               9ygxPoiW4c6wxGp26X118F0yxK032lk54Et3G9z9La2P3u89472GAyR8g9qCe7Mm61D4aJdzSiABhv3paZ7eid82x1ned.8520h7KAcsf6F9feiIOsmSaFng995n36Rbw1F2Fn1Nn8r6en822LOu567Z7z[var3] = new 0k754nZk611N9r3A4VmIWweIGe20QKHutNj7cQo6p8hUM5N10Akkkyt0OhJDMmG6mp8Ex9P7w5n9B489li4ackKhn0n5B9m(
                  var3 - 32767
               );
            }
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         throw new RuntimeException("ModLoader has failed to initialize. ", var4);
      }

      72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP = true;
   }

   public static void _zA8dG4qpPf0EuPQHO8C1m3EUO479EwCMU9VHNBg24ct5Yf07DmMa5onsYBx/* $VF was: 1zA8dG4qpPf0EuPQHO8C1m3EUO479EwCMU9VHNBg24ct5Yf07DmMa5onsYBx */() {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var1 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var1._eZtZ8JV4VFwZrVeN3w4Yrg6L2rY7dp63a7lMTV19mq79WO6W21h60q6d4WS/* $VF was: 2eZtZ8JV4VFwZrVeN3w4Yrg6L2rY7dp63a7lMTV19mq79WO6W21h60q6d4WS */();
      }
   }

   public static int _11m5IZ1B4CRa9Rd318g8v14mkj05vBGEJ1RLFzJSfW9L8gnW2tB8CPz25H5/* $VF was: 311m5IZ1B4CRa9Rd318g8v14mkj05vBGEJ1RLFzJSfW9L8gnW2tB8CPz25H5 */(
      int var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      int var1 = 0;

      for (int var2 = 0; var2 < 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.size() && var1 == 0; var2++) {
         var1 = 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.get(var2)
            ._HLg6hm1t3Z2E17z30LjP7Z5oZ195gKg36Z5026ri3B6A1dFnN6Nz5f49CWJ/* $VF was: 5HLg6hm1t3Z2E17z30LjP7Z5oZ195gKg36Z5026ri3B6A1dFnN6Nz5f49CWJ */(var0);
      }

      return var1;
   }

   public static void _QyF1nuedmVM18Y9FbnF0b3gf7IoG2J1dvkciuRvG4KthVh4nkasPv2tVWSo/* $VF was: 4QyF1nuedmVM18Y9FbnF0b3gf7IoG2J1dvkciuRvG4KthVh4nkasPv2tVWSo */(
      67v4VfoC7ZGIWm5DlM418eZsYtc11QOolEyXR6AmZWIXvM1zk8zC5AbUzL1ox3x6i0ro65mGi0lGcc18R44qj0IN1v3oFucxb var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var2 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var2._66TsZ39Dt0IR55iI3vjNtseY8DruGHf7A343s3Uu6fWWfmkLpp5bt33nDVK/* $VF was: 466TsZ39Dt0IR55iI3vjNtseY8DruGHf7A343s3Uu6fWWfmkLpp5bt33nDVK */(var0);
      }
   }

   public static void _WEf01uG0vOkrDW3AeDVkT4WTty8iX42F00PC4mIjnR9g9N887t6M967l933/* $VF was: 6WEf01uG0vOkrDW3AeDVkT4WTty8iX42F00PC4mIjnR9g9N887t6M967l933 */(
      Map<Class<? extends 4GWFbOIMR3rg69M1Tw7AsIuO5A54yNk6ixz2D7h14bcq6qKB3v03aoGd8614DGBeJF7H1Bel756g1YCxyfkR0pQsk5P6wYjVNy>, 5l565Bhd57o0w6WsbV8e0692MOw67c9yUD3TKzzsrZNvrx4R8Ale5B5YCj8ocX8b36j793Ue2v3210qRvsvBW81zq809P34> var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var2 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var2._b0zagnX85oVC7LRFhOJ88RsIfI519v16u26Jbcwr9S33s1P06N0zG52Xitb/* $VF was: 5b0zagnX85oVC7LRFhOJ88RsIfI519v16u26Jbcwr9S33s1P06N0zG52Xitb */(var0);
      }
   }

   public static int _jhB0G8F51zA9A72ejrhjmF5fQAsAi63knJb88ZvFWHfkRhLFJ06y6m40uYH/* $VF was: 4jhB0G8F51zA9A72ejrhjmF5fQAsAi63knJb88ZvFWHfkRhLFJ06y6m40uYH */(
      int var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      int var1 = -1;

      for (int var2 = 0; var2 < 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.size() && var1 == -1; var2++) {
         var1 = 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.get(var2)
            ._12pvAqF80y4d8Ieaj000vP1fao61t3W2WgdT60kdy45QrkWEXO51n3i6966/* $VF was: 812pvAqF80y4d8Ieaj000vP1fao61t3W2WgdT60kdy45QrkWEXO51n3i6966 */(var0);
      }

      return var1;
   }

   private static void _PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3/* $VF was: 7PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3 */(
      ClassLoader var0, String var1
   ) {
      try {
         String var2 = var1.substring(0, var1.length() - 6);
         var2 = var2.replace('/', '.');
         Class var3 = var0.loadClass(var2);
         if (var3.getSuperclass() != 3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU.class) {
            return;
         }

         if (9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.add(
            (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU)var3.newInstance()
         )) {
            System.out.println("Mod Loaded: " + var2);
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static void _dLwAl76YvcE8uaxk317kBdM98GuIkb9M0ObzJxad4YP6nPU6R2sxMr9WSQY/* $VF was: 9dLwAl76YvcE8uaxk317kBdM98GuIkb9M0ObzJxad4YP6nPU6R2sxMr9WSQY */(
      String var0, String var1, int var2
   ) {
      List var3 = 5I3lj0DX8KZT0aZ20ID7L4lD3zwq90XX7U57i62V2t1LV4Z8YV1pRDO391cO.get(var0);
      if (var3 == null) {
         var3 = new LinkedList();
         5I3lj0DX8KZT0aZ20ID7L4lD3zwq90XX7U57i62V2t1LV4Z8YV1pRDO391cO.put(var0, var3);
      }

      var3.add(new SimpleEntry<>(var1, var2));
   }

   public static void _amIWaRwMFh34FW4JoMnK1nnfTz2Gg50SP1aC1RCaH3BqxiQcEA1E6vOiiYl/* $VF was: 7amIWaRwMFh34FW4JoMnK1nnfTz2Gg50SP1aC1RCaH3BqxiQcEA1E6vOiiYl */(
      2UQBJP5xVBLvcOj4Zez1XaJembU13Cma9CKxz4KHBXDgtLvI3Q228ox61gusX4MQeIDyXmP4j3bUou3222GJ6BeabF38 var0
   ) {
      4Xu0V1F9kFc3WCP266SoSNwfcHhPI1la15vPfzXuH916i4b6avt2I5NwQxQ4.add(var0);
   }

   public static int _183oegZY0lx68gnspUjz5TeDj5U0T8UL5vU2k4YyMvSv62XRV1v4hfB0rrX/* $VF was: 7183oegZY0lx68gnspUjz5TeDj5U0T8UL5vU2k4YyMvSv62XRV1v4hfB0rrX */() {
      return 5dr5St90Oh58IImZ2u1Qa9TnH57Fm9Z3mbw7d66Rpr7pwLfzm8WwZfRXqEYa++;
   }

   private static int _020H9Cb0GHW3nf9O6o9GQEcLC103b9nseE49E6mmmjitPfI0GvyEmni5zQ2/* $VF was: 5020H9Cb0GHW3nf9O6o9GQEcLC103b9nseE49E6mmmjitPfI0GvyEmni5zQ2 */() {
      while (0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R < 5y7b5152Md8Z9EHuZ025UoG0H2lRYR8C1mpjYv8TA90hyjieQphvjJJzsdg2.length) {
         if (!5y7b5152Md8Z9EHuZ025UoG0H2lRYR8C1mpjYv8TA90hyjieQphvjJJzsdg2[0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R]) {
            5y7b5152Md8Z9EHuZ025UoG0H2lRYR8C1mpjYv8TA90hyjieQphvjJJzsdg2[0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R] = true;
            return 0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R++;
         }

         0UiBN5RSC9RfxrH197Fw49353XPtq7AIQ10zv76TZjJ1mdETP7B4p4Gv6u8R++;
      }

      throw new RuntimeException("No more empty item sprite indices left!");
   }

   public static int _9a4FRq83H8nAc7cAuNx7Dawz1rb78K0ca3a4yTWJ5HsAhqvM3Ut257qHk20/* $VF was: 99a4FRq83H8nAc7cAuNx7Dawz1rb78K0ca3a4yTWJ5HsAhqvM3Ut257qHk20 */(
      String var0
   ) {
      if (var0.equals("/gui/items.png")) {
         return _020H9Cb0GHW3nf9O6o9GQEcLC103b9nseE49E6mmmjitPfI0GvyEmni5zQ2/* $VF was: 5020H9Cb0GHW3nf9O6o9GQEcLC103b9nseE49E6mmmjitPfI0GvyEmni5zQ2 */();
      } else if (var0.equals("/terrain.png")) {
         return _8pBf1OMqP55wbs7m74Pxp3Sh4kbF9710wu6x4z5BSiyTZRWcla768rBTP1L/* $VF was: 98pBf1OMqP55wbs7m74Pxp3Sh4kbF9710wu6x4z5BSiyTZRWcla768rBTP1L */();
      } else {
         throw new RuntimeException("No registry for this texture: " + var0);
      }
   }

   private static int _8pBf1OMqP55wbs7m74Pxp3Sh4kbF9710wu6x4z5BSiyTZRWcla768rBTP1L/* $VF was: 98pBf1OMqP55wbs7m74Pxp3Sh4kbF9710wu6x4z5BSiyTZRWcla768rBTP1L */() {
      while (79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I < 2ru92zlbWTMFil0V7u2Nqg2Cih9NEtsYQroaun656e7toIJhbs35ykvwio5C.length) {
         if (!2ru92zlbWTMFil0V7u2Nqg2Cih9NEtsYQroaun656e7toIJhbs35ykvwio5C[79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I]) {
            2ru92zlbWTMFil0V7u2Nqg2Cih9NEtsYQroaun656e7toIJhbs35ykvwio5C[79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I] = true;
            return 79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I++;
         }

         79m4hO5D8sponYeuxHP8Ckcd4bo96538B2984S7mH4U7mBxBEZ4fx5yL5z0I++;
      }

      throw new RuntimeException("No more empty terrain sprite indices left!");
   }

   public static boolean _XN4KHl6PcbIvg873W8xh7eo0Y8F7m78b3qNkHP9fGWl0j5UO55s6vCqFT7D/* $VF was: 9XN4KHl6PcbIvg873W8xh7eo0Y8F7m78b3qNkHP9fGWl0j5UO55s6vCqFT7D */(
      String var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      Class var1 = null;

      try {
         var1 = Class.forName(var0);
      } catch (ClassNotFoundException var4) {
         return false;
      }

      if (var1 != null) {
         for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var3 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
            if (var1.isInstance(var3)) {
               return true;
            }
         }
      }

      return false;
   }

   private static BufferedImage _6A50K97ovzn670U84943wNWdB80IJXX68N729Yxd8M8BJ3o6EnUrlyLX28c/* $VF was: 46A50K97ovzn670U84943wNWdB80IJXX68N729Yxd8M8BJ3o6EnUrlyLX28c */(
      5Lml2WQU47jeFJG239AnmSQZG8A856GHcgfCWv3MQ32Se6j5ertND69E03Xxrcpd3AQ5kTI4Rh5cBQl7Opa23XEF064r9u var0, String var1
   ) {
      try {
         InputStream var2 = var0.8nB09v2wL31LD7473aXNMbJrX47AX71iPMP6yPX544heeDvxj78y5qTJYk68
            .1k4uc1i9aprs9834A7rEVW0D2zfl3BI2g00e7D4rgDYDih8Qu9WukuM46qw0
            ._5L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0/* $VF was: 35L3yK6n9jMB61q7Q57v3QnT9AbuQoT2q7ZWl0ne7W843s9HPtt8y52AD4o0 */(var1);
         if (var2 != null) {
            return ImageIO.read(var2);
         } else {
            throw new RuntimeException("Image not found: " + var1);
         }
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public static 3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D _5q5nHaDm3z7iw3d661PfoH597ablE52QxXWXhA2acdGaMK8nfXY3k0CDfN1/* $VF was: 15q5nHaDm3z7iw3d661PfoH597ablE52QxXWXhA2acdGaMK8nfXY3k0CDfN1 */(
      799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j var0, Object var1
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D var2 = null;

      for (int var3 = 0; var3 < 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.size() && var2 == null; var3++) {
         var2 = 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.get(var3)
            ._vDjyvt90B3A53eVhIye02TE5UPi4K8b3V7RO5Mz036n1j4a15Sj95h93ptY/* $VF was: 6vDjyvt90B3A53eVhIye02TE5UPi4K8b3V7RO5Mz036n1j4a15Sj95h93ptY */(var0, var1);
      }

      return var2;
   }

   public static void _JcBnXK0NLGB1T644pEz7D76TXKSh2Uyjaa68711aHHN1jk1SN3Cr2d8mLjw/* $VF was: 3JcBnXK0NLGB1T644pEz7D76TXKSh2Uyjaa68711aHHN1jk1SN3Cr2d8mLjw */(
      9w01LW7i1o0vXYp00Bl2S04v40DMez7W4759J3B7rfcZlQFVzYu9tp8T2pP1654iFNkVSafl1rNS262Luzk60c82j1fD12F19 var0,
      int var1,
      int var2,
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var3
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var5 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         if (var0 instanceof 558q23gk66Cx1OdBJBWC7VTXR0LmuO3t8y8980L1Xqn06l37dSTnn7ZXdEvDtHSEYFq2z0668ZufwKgh6MR6psGso4MRVO4i2p) {
            var5._6E0h7pfToqW9jubxYakg4609C207COWJHin8Miz3Mnafv779G3V5X6iwFZp/* $VF was: 06E0h7pfToqW9jubxYakg4609C207COWJHin8Miz3Mnafv779G3V5X6iwFZp */(
               var3, var3.6e2b2Q0bozeRSkKP7uT1ZulyTqO1Z95PKHnUf4RqJNCrz5DW87P9QB88us18, var1, var2
            );
         } else {
            var5._0fGD696E1rrnKO3zQ6ej3jllKU462gK6r1jhOj9DZ6R475673aN5KvNgDSo/* $VF was: 20fGD696E1rrnKO3zQ6ej3jllKU462gK6r1jhOj9DZ6R475673aN5KvNgDSo */(
               var3, var3.6e2b2Q0bozeRSkKP7uT1ZulyTqO1Z95PKHnUf4RqJNCrz5DW87P9QB88us18, var1, var2
            );
         }
      }
   }

   private static void _4K2aL3fM9tPc23003GGOn5IX38EkdrnO8EKoTCZ7nINa7sxKMt7oav6TMz4/* $VF was: 74K2aL3fM9tPc23003GGOn5IX38EkdrnO8EKoTCZ7nINa7sxKMt7oav6TMz4 */(
      File var0
   ) throws IOException {
      ClassLoader var1 = 00WnnD122947mw77zO8v6GkftyDXlW022S03sNi2s1df1ymf47X38Tbly70ZDQ2L67SqPbKa7lWwttJZoXue45ifeOeCdX.class.getClassLoader();
      if (var0.isFile() && (var0.getName().endsWith(".jar") || var0.getName().endsWith(".zip"))) {
         ZipInputStream var9 = new ZipInputStream(Files.newInputStream(var0.toPath()));
         ZipEntry var10 = null;

         while (true) {
            var10 = var9.getNextEntry();
            if (var10 == null) {
               break;
            }

            String var8 = var10.getName();
            if (!var10.isDirectory() && var8.contains("mod_") && var8.endsWith(".class")) {
               _PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3/* $VF was: 7PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3 */(
                  var1, var8
               );
            }
         }
      } else if (var0.isDirectory()) {
         File[] var3 = var0.listFiles();
         if (var3 != null) {
            for (File var7 : var3) {
               String var2 = var7.getName();
               if (var7.isFile() && var2.contains("mod_") && var2.endsWith(".class")) {
                  _PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3/* $VF was: 7PEIaVDp4NvSo8rPl8X60hq2SFIN10Hyul2lfkpQJHECM457hBsoMtMrJSR3 */(
                     var1, var2
                  );
               }
            }
         }
      }
   }

   public static void _gV9mY45OBWw3kXxytZ8X3DM342337Bs6562p8qX81uWz9A7Q93ZFs4Qf9dh/* $VF was: 9gV9mY45OBWw3kXxytZ8X3DM342337Bs6562p8qX81uWz9A7Q93ZFs4Qf9dh */(
      List<1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC> var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var2 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var2._X1cltfSVH6sx9fdX8FdgBUCiHe1gR9R77Wk1ZIIAtuMHHWkK1Lif13AZ93Q/* $VF was: 5X1cltfSVH6sx9fdX8FdgBUCiHe1gR9R77Wk1ZIIAtuMHHWkK1Lif13AZ93Q */(var0);
      }
   }

   public static void _V98K4dP8l9wBiOKecrVO8000djz8eeV534KchJg7PdcLjb1V0p7Im99IdB7/* $VF was: 9V98K4dP8l9wBiOKecrVO8000djz8eeV534KchJg7PdcLjb1V0p7Im99IdB7 */(
      5Lml2WQU47jeFJG239AnmSQZG8A856GHcgfCWv3MQ32Se6j5ertND69E03Xxrcpd3AQ5kTI4Rh5cBQl7Opa23XEF064r9u var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var2 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var2._ylvh6Bkf5gx3O4h0u9X0aya0I0fV245sUOG4M8NhL03LRC1gC7i8PxaGaJ2/* $VF was: 8ylvh6Bkf5gx3O4h0u9X0aya0I0fV245sUOG4M8NhL03LRC1gC7i8PxaGaJ2 */();
      }

      Minecraft var33 = var0.78OxWKhpSoq2g2GiUNej2aKIJrP7X69zer9a141qoQdboWo1BnWwfu6q2Xhc.2SHGlLXMgM3LkYu59L1i9U42BIjP5v1sLw98ez1s80429W0ZVh10BWc3E242;
      if (var33 != null) {
         for (int var34 = 0; var34 < 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.size(); var34++) {
            9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.get(var34)
               ._aDo2hz1gTEYV7a8NNfBDpoqP7GwAH0JV6oz40Bo5C1I5eN8a0I2ok1Gj7YH/* $VF was: 1aDo2hz1gTEYV7a8NNfBDpoqP7GwAH0JV6oz40Bo5C1I5eN8a0I2ok1Gj7YH */(var33);
         }
      }

      for (int var35 = 0; var35 < 4Xu0V1F9kFc3WCP266SoSNwfcHhPI1la15vPfzXuH916i4b6avt2I5NwQxQ4.size(); var35++) {
         var0._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            4Xu0V1F9kFc3WCP266SoSNwfcHhPI1la15vPfzXuH916i4b6avt2I5NwQxQ4.get(var35)
         );
      }

      for (Entry var4 : 5I3lj0DX8KZT0aZ20ID7L4lD3zwq90XX7U57i62V2t1LV4Z8YV1pRDO391cO.entrySet()) {
         String var5 = (String)var4.getKey();
         int var6 = var0._vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8/* $VF was: 7vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8 */(
            var5
         );
         IntBuffer var7 = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asIntBuffer();
         GL11.glBindTexture(3553, var6);
         GL11.glGetTexLevelParameter(3553, 0, 4097, var7);
         int var8 = var7.get(0);
         int var9 = var8 / 16;

         for (SimpleEntry var12 : (List)var4.getValue()) {
            String var13 = (String)var12.getKey();
            int var14 = (Integer)var12.getValue();
            System.out.println("Overriding " + var5 + " with " + var13 + " @ " + var14);
            BufferedImage var15 = _6A50K97ovzn670U84943wNWdB80IJXX68N729Yxd8M8BJ3o6EnUrlyLX28c/* $VF was: 46A50K97ovzn670U84943wNWdB80IJXX68N729Yxd8M8BJ3o6EnUrlyLX28c */(
               var0, var13
            );
            int var16 = var15.getHeight();
            ByteBuffer var17 = ByteBuffer.allocateDirect(4 * var9 * var9).order(ByteOrder.nativeOrder());
            int var18 = var9 / var16;
            int[] var19 = new int[var16 * var16];
            var15.getRGB(0, 0, var16, var16, var19, 0, var16);
            int var20 = var14 / 16;
            int var21 = var14 % 16;
            int var22 = var9 * var20;
            int var23 = var9 * var21;

            for (int var24 = 0; var24 < var9; var24++) {
               for (int var25 = 0; var25 < var9; var25++) {
                  int var26 = var18 != 0 ? var16 * (var24 / var18) + var25 / var18 : var16 * var24 * (var16 / var9) + var25 * (var16 / var9);
                  int var27 = var19[var26];
                  byte var28 = (byte)(var27 >> 24 & 0xFF);
                  byte var29 = (byte)(var27 >> 16 & 0xFF);
                  byte var30 = (byte)(var27 >> 8 & 0xFF);
                  byte var31 = (byte)(var27 & 0xFF);
                  var17.put(var29);
                  var17.put(var30);
                  var17.put(var31);
                  var17.put(var28);
               }
            }

            ((Buffer)var17).position(0);

            try {
               GL11.class
                  .getMethod("glTexSubImage2D", int.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, ByteBuffer.class)
                  .invoke(null, 3553, 0, var23, var22, var9, var9, 6408, 5121, var17);
            } catch (Exception var32) {
               var32.printStackTrace();
               throw new RuntimeException("Error calling glTexSubImage2D (blame xau)", var32);
            }
         }

         3gRA1DPeME7dX0o79x6vYtmX9E56Rk4BzqeEhKyuCUjM4Jy9i689uHvsp0L5 = true;
      }
   }

   public static void _DV4s925KfPwW7lOnppC2dWI2O982zWtD86jrq145Axc1uOSn1lY382GtmhK/* $VF was: 5DV4s925KfPwW7lOnppC2dWI2O982zWtD86jrq145Axc1uOSn1lY382GtmhK */() {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var1 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var1._J2c50sO2r0utzh1fv7M51XYY4zYX2J524uKx6kj77tYi1yn8888O3Xr2U4z/* $VF was: 6J2c50sO2r0utzh1fv7M51XYY4zYX2J524uKx6kj77tYi1yn8888O3Xr2U4z */();
      }
   }

   public static void _536dYBvF3Zj5I47C7Co2LY5B3T2nqx5F3ohU512CQWFQ6FQOzrlO7aIAfUY/* $VF was: 9536dYBvF3Zj5I47C7Co2LY5B3T2nqx5F3ohU512CQWFQ6FQOzrlO7aIAfUY */(
      Minecraft var0
   ) {
      if (!72Ap8D2a33D5G3C3xliX77A0g79pdP886Jma57uw8sLcEZWSETL9965GlrFP) {
         _0Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP/* $VF was: 90Z4359g5Q99Y192qds9w1x1X02iR8VpHm34IxzI4qHFP3OHBa1pTf964VDP */();
      }

      for (3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU var2 : 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG) {
         var2._Qoy3Z0g210X0E3BR229hbl5KKdL16AJmG5KBUu3l3854OJ58gdO0T397qez/* $VF was: 8Qoy3Z0g210X0E3BR229hbl5KKdL16AJmG5KBUu3l3854OJ58gdO0T397qez */(var0);
      }
   }

   public static int _FVgHb825Vh87dj7a9W610VePPyEK11H4311BN3gSLe6J6831pq3l6tzy2RP/* $VF was: 7FVgHb825Vh87dj7a9W610VePPyEK11H4311BN3gSLe6J6831pq3l6tzy2RP */(
      int var0
   ) {
      int var1 = -1;
      Iterator var2 = 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.iterator();

      while (var2.hasNext() && var1 == -1) {
         var1 = ((3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU)var2.next())
            ._4pM8s64ZMnaU952nGEh82Q57WO2N6jhc3lwdq8i55LCTqh9Z6CBI7mTN1xJ/* $VF was: 54pM8s64ZMnaU952nGEh82Q57WO2N6jhc3lwdq8i55LCTqh9Z6CBI7mTN1xJ */(var0);
      }

      return var1;
   }

   public static int _2C0KnY47qid74yQYI1zgrLooP36NM650B3JgHP47o3Od0glFmCykL7fJoj8/* $VF was: 52C0KnY47qid74yQYI1zgrLooP36NM650B3JgHP47o3Od0glFmCykL7fJoj8 */(
      int var0
   ) {
      int var1 = 0;
      Iterator var2 = 9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG.iterator();

      while (var2.hasNext() && var1 == 0) {
         var1 = ((3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU)var2.next())
            ._m6m13dn8LrG10h8c2Og50FZ5BadQ06sFis8fvT5TqNZ2cpOxQ56X340JqVC/* $VF was: 7m6m13dn8LrG10h8c2Og50FZ5BadQ06sFis8fvT5TqNZ2cpOxQ56X340JqVC */(var0);
      }

      return var1;
   }

   public static List<3QHo5aINy9U816K39rX6Or2189b9nk1cLg9347wUQ1rJXAjf1bDNx6hG52382D8hkG4GUni0o7O64CgbOben9YsmqUX52qMU> _AT2q764kBM4UAhX20130C3Jh6LT7Y5snv3wxjh9e5VP43467B37csjDd1NC/* $VF was: 7AT2q764kBM4UAhX20130C3Jh6LT7Y5snv3wxjh9e5VP43467B37csjDd1NC */() {
      return Collections.unmodifiableList(9M3Y3MMjsbAfP046dpOiSD6wo1h12o4djZ6WU86xQNZoZd0Udq9V39L05qCG);
   }
}
