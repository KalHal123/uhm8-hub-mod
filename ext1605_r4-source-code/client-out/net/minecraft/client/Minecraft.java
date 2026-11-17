package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {
   public 8VzuJ1p25c51qC9aGL079kOXkdkqd138ottN6O4esuDB0eRanG0cy8NPQM899nnZ7p7xj5D9MEAnLbPxH2g7G6121322w86tMim 9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8;
   public static Minecraft 5Dn33cKLDp4ugCwpD8dAC0Qb0gK4WT4AEqJf0YUJc3Hq6EO32BfTsK678CKb;
   public boolean 09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG = false;
   public int 7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA;
   public int 7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw;
   private 19585unF8H2jcj7MCsf2jcpx9se8xa5Y7m629Q3vwd1i9Ym2L8UBw87RHcILFR2e2CAgfY731q3P9c242c88kLT9Ty0Fo6t 63H5OHax2VJJ5EOiq9T213DVr7JjVByulrN67Lnh0OD5d7RqNTw4x5C3p8u9;
   private 09ku0Dip5v0fdX0NkO7dW4tQ7fkA3ctWceSSq0cueJeG9VP91ixCd37CYNMmtf3g7toUSy8t8ngN5dmP7luIAL9D712dzo44 0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs = new 09ku0Dip5v0fdX0NkO7dW4tQ7fkA3ctWceSSq0cueJeG9VP91ixCd37CYNMmtf3g7toUSy8t8ngN5dmP7luIAL9D712dzo44(
      20.0F
   );
   public 5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY 8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0;
   public 56ZSN9H7k82k9EA0A5jSTtQ2Uj3iB730iI531r3n8f48H4o9o90OU2a7Z19zwsxLH7DO25I5AQUjE78C4y63CsUfR9z3NGrHT 3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi;
   public 799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j 8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5;
   public 5WWFw704RR2X3PNH52jwd7q8hkaOb4u16586Wx6v0W25jSEjXC6yM06bE6uTi0z1R2nGYy8pcBl2Gkte9dOTw3757ZZLuF0z3iZP0xntH0 8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3;
   public 3T3H6Gfv8hrD7hW95opSro1Y0MDK93JEoDIHYS6GWtKb1ufJBLYA6b1xXi8Q1yB1Z8Gv1q5145WS2wVNJ9ov7q1jnLPHNlSI 9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q = null;
   public String 1bXoyKS4419C0OkBAdgHRIkQ8QoiQoI2YC0H72hV9z1z430OurUT7w57itKv;
   public Canvas 68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr;
   public boolean 9tr6D2mjhN0dCY8dp4sDT8iiVd9MA82SzzykWmgkiIvzRF53620bNvDNz5gV = true;
   public volatile boolean 4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI = false;
   public 5Lml2WQU47jeFJG239AnmSQZG8A856GHcgfCWv3MQ32Se6j5ertND69E03Xxrcpd3AQ5kTI4Rh5cBQl7Opa23XEF064r9u 6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO;
   public 87k6gZdUF64lRd2414n3C9YY0RqdbbURZjg76Q3wg8n1vyhOeSdCGqtgKyQUo9TtGm8AxXBADPj6456Y0svQ4I3QmXX6S4J0 4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2;
   public 3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D 5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb = null;
   public 36dil34Oo3A318ky64nU3rrSxQ08rML17zPKq7Dd4z3uRg437K73e81h1g7HD2qGDexXs0TCz816m397F1h1g8gXlMIEdQcQ 8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste = new 36dil34Oo3A318ky64nU3rrSxQ08rML17zPKq7Dd4z3uRg437K73e81h1g7HD2qGDexXs0TCz816m397F1h1g8gXlMIEdQcQ(
      this
   );
   public 4z12r8FLiMsu1os1M5Mb0TB93K3D2442Q57TehQRNAZa1kH5mMULJydn4D4jdN2546xlCPhut4EsdBDBI65N2UdkqOth52 4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x = new 4z12r8FLiMsu1os1M5Mb0TB93K3D2442Q57TehQRNAZa1kH5mMULJydn4D4jdN2546xlCPhut4EsdBDBI65N2UdkqOth52(
      this
   );
   public 0rxyG061C13735Na37QRFiS1ZL2aZfgjFSg4hUH6koh8G1W87np57Qn07I3JVPOagnZ37919Ri63Peoq8KeXGcdiR8kg271679UC0 59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m;
   private int 0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q = 0;
   private int 8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh = 0;
   private int 6Ka1oV8hj4147IJma5YhKz2436cq02qdoNEDTHdkSR7MK71PuxgEy8uxLEcI;
   private int 4Dr56FcUX71bYH8wrNc8G7S0wTL53B7v8Q5Jp4w109d686N3A8X7HeIVI5Vc;
   public String 0644A9bx5j197P1RNE5x89QZ8I3mizwjab1R3EvnoHl3W3T2rdBVDH09Hx54 = null;
   public int 42AJuSV4TofwjAZ6JHXLKH0K0L6STQ6yzZ86xPCfe7Sg2OlJJp9iumaqz1P5 = 0;
   public 3Pzi5NnN9e1F51Ca0zh52OF6Ga7JRk7XGU7nyA291BcP5y2Y5uxK3DWL5z4Rw3Fe21givXPfq9n3BhX49xr5K06yHv1806U5n0p 2w11sSa7Bs9LcLsC7934u93KQ7ddy7D30Qm40R9Tadk9wwIXYd41bvx16wT6;
   public boolean 7F7j3098q4cjP0LAm9aiyC8I1EWQjxJOBo8VqR7hoCj9gM6ZU62Bjmq5nNtB = false;
   public 7HmBMHg8SjMj94x235zZa12RiMQJ6BG6pb2549kvI7GQmSD86W0l1kJU5PYWrPx8F239ExcD9kYy68ezcOhv5mHc219B90xG13d 2NP9EVrQ0d7mSR555s1MHzkYkRZmWG1b86393S47tQ9RSJl621AQ303Ap8op = new 7HmBMHg8SjMj94x235zZa12RiMQJ6BG6pb2549kvI7GQmSD86W0l1kJU5PYWrPx8F239ExcD9kYy68ezcOhv5mHc219B90xG13d(
      0.0F
   );
   public 4NL8GPzXe9WfWA2CYDPDyDkgQ6rjxO912N1dS0cIlM59VKzfVtL13IoLugCuRJPqWdbAEJ706eE73Zu0UGQ2UZ69g6cxCj 2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN = null;
   public 90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S 5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn;
   protected MinecraftApplet 6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02;
   public 0hAIC3TYFFRBw7X27377CB8mov7mOuK3ZuV6ofmix4NppPrBNqiUSiSy41S31Fvfz9jH1tpIf87stMiKd1Sp5T9snFpPbN 1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG = new 0hAIC3TYFFRBw7X27377CB8mov7mOuK3ZuV6ofmix4NppPrBNqiUSiSy41S31Fvfz9jH1tpIf87stMiKd1Sp5T9snFpPbN();
   public 73boxG1IIXqg88A2Bru5vDZR9Cpzvc05Wj8INt1g3ogfA3St8TbCO3dS187Jv0Vl6XjRMtZNJv4wj0S35TG8Bt5yMzPH2kfl 8LX0s6aC7Ei1dCE02i1qz6h7ocx770a57s7gu0c82Wk1B0Qw261KJ124EkMp;
   public File 6MrJeC1q9zkqCcH23sU4Yg19tu2odTn7bXzye93ck4j9nTz16A11583k1759;
   public static long[] 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9 = new long[512];
   public static int 2Y9tYRU1X81zq4dJPoUz04JK76fi57cul7wM6wX062L5iSe0d750O108Zt1R = 0;
   private String 7xvy0ghzcN4XFYKK1sOZ7E3tXWNRUZumx8Vrbzo9281iQ74391d2UIY84zuD;
   private int 7X56Srj8CcC4U7l05DgX767s2PqIR50y1DNu7K34Bn5RS95uHMY8mcJw0BlP;
   private 8v21XqGBKlb5tBoXN248rU79X3Ur28kL5v5kBi86cs994juAv5Zura8oq57fB44zfSTwl5EryhT7i5HUAQe33uivs44Rv53e 2PjOX6y2Y7Up5u4S16h0C92211BaYh9l8UezfkN2Q8PXa05XpRZUDN70Sea8 = new 8v21XqGBKlb5tBoXN248rU79X3Ur28kL5v5kBi86cs994juAv5Zura8oq57fB44zfSTwl5EryhT7i5HUAQe33uivs44Rv53e();
   private 36T2H3lRzB8ieC66RDTu0dB877jDjYXprh64M0Kw0C5PBPMtZ8a3P9h1UT47u3u161S6PW7UgPo491h5x7oUFNQnD15cMpn 1Sl8X3i16n46M3ka7eB61D6LG7t2pKM7k2gXPqCjoY56QtWBI3c6okN7G66G = new 36T2H3lRzB8ieC66RDTu0dB877jDjYXprh64M0Kw0C5PBPMtZ8a3P9h1UT47u3u161S6PW7UgPo491h5x7oUFNQnD15cMpn();
   private static File 52mKba05hk3F8WK70QmXBj722EiliFna487ru2G9gwtSlJWLEVbmTbtUt1Xr = null;
   public static boolean 40G9X9sEbrNVWk1I68RpGi9486QjvBn75u9xmmmZ189amc26uqiJAf80zUYu = false;
   public volatile boolean 1z4ObCPpG0p71XzmKI5pA52oCuNeQd7W52IDk8415gt4kK2zAQcGob4V39RR = true;
   public String 05dJRxKFI7at92VB6myg2j2e70g0dxWTCkS35Sfh6qgi9FH5941nNo45q5A0 = "";
   long 8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1 = -1L;
   public boolean 4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z = false;
   private int 296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = 0;
   public boolean 40aY2q6x54NGL33tGT892HORD36EunRV6N1ze94jKW1wJV7z6rpTdOc4e54Q = false;
   long 1k2OKYBdu2G71Ba0RoibXZR60E3eoQNyP1u3o65LCmM8vXKhlJBGY0IWMCm9 = System.currentTimeMillis();
   private int 34K5LBRK0BSEpA78Lw590c9p091CQMcR47A2fgo54D27wz9gx3fvVXPfX9yl = 0;
   public Component 3qZs06Oh4T1EzvE8a1e17oHrGTbJu43kH42m78NUR12BElFxZ583A3e3PdPk;
   public 448SZjo4GXVxd41rMkuleEoypZ381txmLy4zVLMTZ9Z9NV5SoR97zQ6f1786Wu4D3xaYdDLy54g9qva737VlgKM23A9xGH1EohC 49g3Ue4B4ymyJ5yc4CXdts2UZnR4OP36zG20Omc6J6Ly1C5xR8Habk43qvGE;
   public 62fL5jCz1A00l5L8bBtAYR9aPPtIl7pJCe874i0hvzA00P5Zzw3X7Eb41gT9j92vK34l8zU3IAkMp9EAO7uJ2yHv5i1acm6Bg041 0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo;
   public boolean 28K4517FJT58jN9ucjj3zE1jE410Ltpi330vH7516f19B006E4Wco5x4Y0w5 = true;
   public long 9A23in1uqW3pg13kj4pOda0YD2W2B8toO2Xk31j7y1F2q5nDP0ompj85iXQC = System.currentTimeMillis();
   public static boolean 8AX67fsnsj54328J9e6FiY9333555Xj726t2182u3TBB948QMZsZX2iz02iv = true;
   public final String[] 19rCmxZvQ44R6d92WkH1mXthIKS3J78E3u1z0N18CN7q304gJsGOLn55X7mx = new String[]{
      "cb5c516ad379ee341929afe9b9d1498e4d82442d3d3dbb24bb3e6c082a785d75", "17f7a8e98e3b017d4bb168b57196f59a2c44f875ce8bba38086576ee3080e0a0"
   };
   public final String[] 32ThEK683E33UOnLg5jCYi6a44ej1w0cgRA8dke3o36TvwA2m1lepu5CZa4q = new String[]{
      "36d528f3eaed8d3e413c571e7eb67037", "117b71e2dbed9440a000f742a9c7636a"
   };
   public String 3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483 = "";
   public static boolean 4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo = false;
   public static String 3A3F71eia4o7hinl32z3YhX5z1YU4tLl0Pa5fhF3On0AAcu71UaBBB87kO4L = 7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
      7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.62Ccm2XAR6JqSDTgV762x61j971DNgsIrMhaXZxPs0fQnBC7ymR2l1v1V22X
   );
   private final String 3N43634U70U92133ZUaNYj909RB5DwkFoBTS6atyP5GiVktfCg90sfuoC131 = "11(NtBreak)/11-023-ship "
      + (
         0S3owDFxo1IcvKENk6RM1wCL1sk5N4S43d7zLJcMQX1MWD4kBrJ63e9C552YRwL864u4T1d7N1bb156uN5V3hnJ2Lca4Ltx5P.class.getSimpleName().contains("MinecraftImpl")
            ? "(non-obf.)"
            : (
               0S3owDFxo1IcvKENk6RM1wCL1sk5N4S43d7zLJcMQX1MWD4kBrJ63e9C552YRwL864u4T1d7N1bb156uN5V3hnJ2Lca4Ltx5P.class.getSimpleName().length() < 3
                  ? "(lv1obf.)"
                  : "(lv2obf.)"
            )
      );
   public static int 2ap75bw7uWpJs9xa2VRa8p40l51ptv8B02tkt5OcOFM8BeYBB08G54gDjTCY = 0;
   public int 1202Xh2to5K411eCdkp7924Hyz4tEuc93T8eZ9qf5D33M4HWlnu524P0Mlk2 = 0;
   public 16zXH49DfmdTL1VE0x270cy2C0qGfoLakM9nY7GwAmk6N6BRuUf1797D5Nc7qmt96SvSr6a7L32T6OvB4N003nP9UtBFm70qTX8tV 2M9bMSgxMHRwiJJVEJmZ4pFDp6UU0b6N221me0GNgln99zqYFdkpLD2Z3m5s = new 16zXH49DfmdTL1VE0x270cy2C0qGfoLakM9nY7GwAmk6N6BRuUf1797D5Nc7qmt96SvSr6a7L32T6OvB4N003nP9UtBFm70qTX8tV();
   public static boolean 2fGqlLCGz9Ni98BW95R0TU06rypdms9i1tU8g6lfnFZk9q2e9XO9ZGY8Wn05 = true;
   public static String 8WQ9B51cG08Xzvtv4872kc1791FFx6EUAi7dtOrdc533169lB1oGze3Sm1ZJ;
   public static boolean 55yB6jYtSi94r555184CYoXDQ1YhyBnoS1lJaCCAbdj3rDu1RNzU8Gp4C3g5 = false;

   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      this.6Ka1oV8hj4147IJma5YhKz2436cq02qdoNEDTHdkSR7MK71PuxgEy8uxLEcI = var4;
      this.4Dr56FcUX71bYH8wrNc8G7S0wTL53B7v8Q5Jp4w109d686N3A8X7HeIVI5Vc = var5;
      this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG = var6;
      this.6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02 = var3;
      new 2moT8juVihvba3tApU9cyOLU2bScpMbtSx55rr9L1JTp234FzHZkFhfLCq4jWMqcwl80gi56KKNA634lv1m9h3tJzyCFTGC6(this, "Timer hack thread");
      this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr = var2;
      this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = var4;
      this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = var5;
      this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG = var6;
      this.3qZs06Oh4T1EzvE8a1e17oHrGTbJu43kH42m78NUR12BElFxZ583A3e3PdPk = var1;
      1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._b59Aqg24nl353DYem4l68meK5FA8FRbq57w8qf9L81s7xR731lexD52BHt8/* $VF was: 3b59Aqg24nl353DYem4l68meK5FA8FRbq57w8qf9L81s7xR731lexD52BHt8 */(
         this
      );
      3TRs4A75rS0TtcUL36iKx34E6k4NB1XXM6i8cs9Khd3OUdqLNT1q99wqrgwtn53Nk1LerxKV5f8Dlt8MOX4uKK6df8l._hKz29573Jaa5UbdBUO62AMdK7P7QRvU7SN1pm7079Xy8LO5X92V7L75dK81/* $VF was: 7hKz29573Jaa5UbdBUO62AMdK7P7QRvU7SN1pm7079Xy8LO5X92V7L75dK81 */();
      if (!System.getProperty("os.name").contains("indows")) {
         1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN.4eUW14lHuQQy8iFT1uuVUHSXayw7HV4qbsNu1cOVGoECe4jmtsJ7i6H944Fv
            .set(
               0,
               "file://"
                  + System.getProperty(
                     7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
                        7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.1Mq8T0QNr27egvw7Ii5njC2U34iHqD9xm0XHd85K26sr2HmLXKQgJ5Uz42hp
                     ),
                     "."
                  )
                  + "/.minecraft/skincache/"
            );
      }
   }

   public abstract void _MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417/* $VF was: 4MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417 */(
      8O94wV86zi53NUGjB4bjuz07OdZ5AQMFj36j262U4havnb1rT68h61Uu6kluKGu3Zt2A50x51X06Z0VPHPWJM7ZjgEn0n32nr var1
   );

   public void _WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR/* $VF was: 9WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR */(
      String var1, int var2
   ) {
      this.7xvy0ghzcN4XFYKK1sOZ7E3tXWNRUZumx8Vrbzo9281iQ74391d2UIY84zuD = var1;
      this.7X56Srj8CcC4U7l05DgX767s2PqIR50y1DNu7K34Bn5RS95uHMY8mcJw0BlP = var2;
   }

   public void _2E7PCfeQbAyGIXk2rGQJ0L8P422OpByz4zm7rUbJ5g5VnHn3y8niBTqC8C0/* $VF was: 52E7PCfeQbAyGIXk2rGQJ0L8P422OpByz4zm7rUbJ5g5VnHn3y8niBTqC8C0 */(
      String var1, String var2
   ) {
      2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd var3 = new 2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd(
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
      );
      int var4 = var3._bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4/* $VF was: 1bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4 */();
      this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2
         ._WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
            var1, 10, var4 - 40, 16777215
         );
      this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2
         ._WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
            var2, 10, var4 - 25, 16777215
         );
   }

   public void _fW1DcOg3Y819yUa6j1jy2lJiMPR4hOFs9F2emO20dNK708Di149LF42q7Mt/* $VF was: 8fW1DcOg3Y819yUa6j1jy2lJiMPR4hOFs9F2emO20dNK708Di149LF42q7Mt */() {
      if (!new File(
            _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */()
               + "/firstlaunch"
         )
         .exists()) {
         switch (this.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb.toLowerCase()) {
            case "andrewidot":
            case "anon-alpha-afil":
            case "philalphaver":
            case "digenuine":
               Sys.alert("Why... Why are there...", "Penises?");
               break;
            case "zigzag2608":
               Sys.alert("Hey hun, it's Andrew!", "Not sure if you'll ever see this, but remember I love you very much <3\nMwah!");
               break;
            case "theobi1":
               Sys.alert(
                  "Prepare thyself!",
                  "Ahh... Free at last. O Gabriel. Now dawns thy reckoning, and thy gore shall glisten before the temples of man. Creature of steel... My gratitude upon thee for my freedom, but the crimes thy kind have committed against humanity are NOT forgotten. And thy punishment... is DEATH."
               );
               break;
            case "buj_itself":
               Sys.alert("insert creative window title here", "r4sepad when");
               break;
            case "retrogamingnow":
               Sys.alert("Hi Retro!", "AlphaVer Part 3 when?");
               break;
            case "liminalityyy":
            case "kollinkollin":
            case "illudens":
               Sys.alert("oops", "wrong arg fam");
               break;
            case "oceanharte":
            case "cntrpl":
            case "cntrpl2":
               Sys.alert("Hey.", "Sorry you had to suffer 2 years for this, but, thank you for everything.");
               break;
            case "vladg24":
               Sys.alert("woag", "alphaver wiki-ing");
               break;
            case "ossyflawol":
               Sys.alert("portal 2", "portal 2");
               break;
            case "rollnway":
               Sys.alert("uhm erm erm uh uhm", "yeah");
               break;
            case "skullkeks":
               Sys.alert("Message from the devs", "May the Haiza be with you...");
               break;
            case "bolternon":
               Sys.alert("GIVE US MORE WOMEN", "MMM I NEED WOMEN THE WOMEN YES YES WOMEN YEAH WOMEN WOOOOOOOOOOOOOOOOO");
               break;
            case "gnawmon":
               Sys.alert("hey", "thanks for that translator");
               break;
            case "dispensa":
               Sys.alert("holy shit...", "my data is gonna transmission..........");
               break;
            case "dargh":
               Sys.alert("dev6 isnt breedable", "but the true question is: can chester give decent sloppy toppy?");
               break;
            case "cheatosphere64":
               Sys.alert("uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "my stars are shimmering");
               break;
            case "unnaturalistic":
               Sys.alert("hey", "you're cool");
               break;
            case "bobbies1":
               Sys.alert("BREASTS???", "TITTIES?!?!?!");
               break;
            case "bortimer":
               Sys.alert("yo", "your textures are cool :+1:");
               break;
            case "jeffdakillax3":
               Sys.alert("hey", "you're silly :3");
               break;
            case "marina234":
               Sys.alert("hey", "herman hesse shall strike you down");
               break;
            case "gamemasterpdx":
               Sys.alert("fyi", "dev16's splash text is canon now lol");
               break;
            case "dottych":
               Sys.alert("mrrp meow :3", "dotty if you dont know what this does we dont either");
               break;
            case "vkcom":
               Sys.alert("do rap", "gun gun bullet no no bullet gun yeah");
               break;
            case "smaed":
               Sys.alert("insert creative window title here", "r4uj when");
               break;
            case "erdbeerbaerlp":
               Sys.alert("hi server guy", "we referenced your server in video 4");
               break;
            case "uncrossedpanic4":
               Sys.alert("Hey!", "I'm Watching You!");
               break;
            case "___afk":
               Sys.alert("john", "john time");
               break;
            case "shiny_emerald":
               Sys.alert("here's a riddle", "what's the opposite of dominant?");
               break;
            case "sul4":
               Sys.alert("M3554G3 FR0M D3VC0L0N :3", "1'M 1N Y0UR C0MPUT3R N0W L0LZ!!! >X3");
               break;
            case "fruitybot":
               Sys.alert("HIIII PEPPERMIN!!!!T", "AAAAAAAAAAAAAAAAAAAAAAAA");
               break;
            case "phil564":
               Sys.alert("3 mintue of alphaver when", "275 minute of alphaquest");
               break;
            case "sheer":
               Sys.alert("(we are so sorry for referencing this)", "You're not a minecrafter... you're not a person...");
               break;
            case "dycam99":
               Sys.alert("altairvega", "alternative vagina jumpscare");
               break;
            case "vivivern":
            case "orble":
            case "orbl":
            case "bug_nation":
            case "bugnation":
            case "js_sam1999":
            case "kerkan1994":
            case "xorcist6898":
            case "samurai_2001":
            case "machinerage":
               _H52lk1I5U4nYYa3DHwuO9983hXzifi7DFqUArLsQoa6s0Qlzi2ZW2wZnrkG/* $VF was: 8H52lk1I5U4nYYa3DHwuO9983hXzifi7DFqUArLsQoa6s0Qlzi2ZW2wZnrkG */(
                  "https://youtu.be/V4d0Qp9YF2I?si=o4HJG230zUUAJzIJ&t=438"
               );
               break;
            case "herobrine":
               Sys.alert("DiGenuine/Phil says:", "Why are there penises?");
               break;
            case "unfortun8":
            case "biggenux":
            case "deveightloper":
               Sys.alert("meow mrrp :3", "mew mew purr nya mrryah meow :3");
               break;
            case "philbreadkins":
            case "phil_breadkins":
            case "breadkins":
               Sys.alert("DiGenuine/Phil says:", "Seems like you got the wrong Phil. The work awaits...");
               break;
            case "watchingthing":
               Sys.alert("So, you've seen it too, have you not?", "The sky, devouring itself - burning with a fever most divine");
               break;
            case "queen":
               Sys.alert("So, how does it feel?", "Your vastness, unfurled, condemned, contained? No more broken laws.");
               break;
            case "rain":
            case "dawnbreather":
               Sys.alert("Welcome, O, One Who Cleanses Wounds.", "Even if you were inevitable, you were awaited.");
               break;
            case "clemence":
               Sys.alert("Rest, now.", "There's nowhere to hurry anymore.");
               break;
            case "brokenblade":
               Sys.alert("Oh how sonorous is the ring of steel", "Falling to the ground - in broken shards");
               break;
            case "devel0per":
            case "deve1oper":
            case "devel2per":
            case "d3veloper":
            case "develo4per":
            case "devel5er":
            case "develop6r":
            case "deve7oper":
            case "spooksthewookz57":
            case "dug_fleez":
            case "kyubey34":
            case "kyub":
            case "wyvern621":
            case "cardjitsu2005":
            case "cs_jam2000":
            case "mark101":
            case "jamieplayzmc":
            case "author":
            case "director":
            case "00071":
            case "2008score":
            case "d1":
            case "d2":
            case "d13":
            case "the father":
            case "jstar":
            case "lloyd":
            case "the mother":
            case "nguyen":
            case "thenamesbond_123":
            case "theoneandonly_hb":
            case "saw_13":
            case "seven":
            case "smith":
            case "spirethebuilder10":
            case "testtest123abc":
            case "thatkingopizza":
            case "xxmastercheef_reef2001xx":
            case "salvoil":
            case "electric9001":
            case "theblue_warrier":
            case "8ball_luck":
            case "_where_":
            case "equipmental":
            case "shrugxxl":
            case "deluxewish":
            case "frilvman":
            case "j4zzdistrict":
            case "jack_wowo":
            case "misian_de_que":
            case "qrobin42":
            case "a0":
            case "a1":
            case "a11":
            case "a67":
            case "andrewgaming67":
            case "grasswalker15":
            case "holdtheflame":
               Sys.alert("Well this is weird...", "Are you sure you're supposed to be here?");
               break;
            default:
               return;
         }

         try {
            new File(
                  _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */()
                     + "/firstlaunch"
               )
               .createNewFile();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   public static void _H52lk1I5U4nYYa3DHwuO9983hXzifi7DFqUArLsQoa6s0Qlzi2ZW2wZnrkG/* $VF was: 8H52lk1I5U4nYYa3DHwuO9983hXzifi7DFqUArLsQoa6s0Qlzi2ZW2wZnrkG */(
      String var0
   ) {
      try {
         Desktop.getDesktop().browse(new URL(var0).toURI());
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void _7DJ8a5s2U959270TtN9ypzMDKf27m9Lwtbk9SoEymd20p5I3fXzU27TbPP3/* $VF was: 17DJ8a5s2U959270TtN9ypzMDKf27m9Lwtbk9SoEymd20p5I3fXzU27TbPP3 */() throws LWJGLException {
      if (this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr != null) {
         Graphics var1 = this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr.getGraphics();
         if (var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(
               0, 0, this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
            );
            var1.dispose();
         }

         Display.setParent(this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr);
      } else if (this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG) {
         Display.setFullscreen(true);
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = Display.getDisplayMode().getWidth();
         this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = Display.getDisplayMode().getHeight();
         if (this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA <= 0) {
            this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = 1;
         }

         if (this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw <= 0) {
            this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = 1;
         }
      } else {
         Display.setDisplayMode(
            new DisplayMode(
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
            )
         );
      }

      Display.setTitle("Minecraft Minecraft Alpha v1.0.16.05");
      PixelFormat var14 = new PixelFormat();
      var14 = var14.withDepthBits(24);

      try {
         Display.create(var14);
      } catch (LWJGLException var12) {
         var12.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var11) {
         }

         Display.create(var14);
      }

      6sur56H2aV0W9Oq1kwi96EG9Y6cJ7MCttOK5h63RUhM7ra8j6iOdiI36tpcHK2193qAX2vlH8AN4zA9WpLLH2Z29X7Jea.29uq0023m9E6Vsdo2U4ki50guLe17Aq0kHTli9Hafv5iQJUHmdy4BFd0D5QC
         .7g64M8K55cRF3qs6w8c373czgU1Dp4C42nA74y0s3lI7SaGa29q152995X7H = new 95rqwajOzUG6ES8zDuARosHt6RF8h1UKNlPG0DEd6MHFGkldy9C2ZG3z2ARgkd97tkc2WHNEW48KHVM5cONmL9b1RA87nT10P620B6ts(
         this
      );
      this.6MrJeC1q9zkqCcH23sU4Yg19tu2odTn7bXzye93ck4j9nTz16A11583k1759 = _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */();
      this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn = new 90P07uZ93FV38QPsG5GgcjVd0O5zVftJ2njw12bRpuE6u921Q5J0x70PHNIU5J3nfuDgzdQUop5j2cxeO57fI2BKfG7S(
         this, this.6MrJeC1q9zkqCcH23sU4Yg19tu2odTn7bXzye93ck4j9nTz16A11583k1759
      );
      this.49g3Ue4B4ymyJ5yc4CXdts2UZnR4OP36zG20Omc6J6Ly1C5xR8Habk43qvGE = new 448SZjo4GXVxd41rMkuleEoypZ381txmLy4zVLMTZ9Z9NV5SoR97zQ6f1786Wu4D3xaYdDLy54g9qva737VlgKM23A9xGH1EohC(
         this, this.6MrJeC1q9zkqCcH23sU4Yg19tu2odTn7bXzye93ck4j9nTz16A11583k1759
      );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO = new 5Lml2WQU47jeFJG239AnmSQZG8A856GHcgfCWv3MQ32Se6j5ertND69E03Xxrcpd3AQ5kTI4Rh5cBQl7Opa23XEF064r9u(
         this.49g3Ue4B4ymyJ5yc4CXdts2UZnR4OP36zG20Omc6J6Ly1C5xR8Habk43qvGE, this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
      );
      this.49g3Ue4B4ymyJ5yc4CXdts2UZnR4OP36zG20Omc6J6Ly1C5xR8Habk43qvGE
         .1k4uc1i9aprs9834A7rEVW0D2zfl3BI2g00e7D4rgDYDih8Qu9WukuM46qw0
         .5N63dbka0na7Is07L9kMmSk6ZK28Ioxdll6JwQgybo1I69cauDA8U5rtDvBv
         ._e16037zP017Ybyhw4klyCwOs24S8Nh9OzRYIDt7732Nr83dqO5Otm7FIbRq/* $VF was: 4e16037zP017Ybyhw4klyCwOs24S8Nh9OzRYIDt7732Nr83dqO5Otm7FIbRq */(this);
      this.0ef1dw6U62P0w8bU619gHGHeA4m17T8k6bnjfEQQwhJz0UwhJ6Kx9rBRdIvo = new 62fL5jCz1A00l5L8bBtAYR9aPPtIl7pJCe874i0hvzA00P5Zzw3X7Eb41gT9j92vK34l8zU3IAkMp9EAO7uJ2yHv5i1acm6Bg041(
         this
      );
      this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2 = new 87k6gZdUF64lRd2414n3C9YY0RqdbbURZjg76Q3wg8n1vyhOeSdCGqtgKyQUo9TtGm8AxXBADPj6456Y0svQ4I3QmXX6S4J0(
         this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn, "/default.png", this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
      );
      this._o1F77IyWs4gJ0vdJ61lslNI6v5Q0mkTD7yzS16i0IN50lm73jmaSwrGwTdn/* $VF was: 9o1F77IyWs4gJ0vdJ61lslNI6v5Q0mkTD7yzS16i0IN50lm73jmaSwrGwTdn */();
      Keyboard.create();
      Mouse.create();
      this.8LX0s6aC7Ei1dCE02i1qz6h7ocx770a57s7gu0c82Wk1B0Qw261KJ124EkMp = new 73boxG1IIXqg88A2Bru5vDZR9Cpzvc05Wj8INt1g3ogfA3St8TbCO3dS187Jv0Vl6XjRMtZNJv4wj0S35TG8Bt5yMzPH2kfl(
         this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr
      );

      try {
         Controllers.create();
         1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._5pZfclRqgz0l7EVj46w15ev00pVk1deQeb909hSK1qd8glz3zbWN5Ux9E38/* $VF was: 95pZfclRqgz0l7EVj46w15ev00pVk1deQeb909hSK1qd8glz3zbWN5Ux9E38 */();
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      this._hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */(
         "Pre startup"
      );
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this._hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */("Startup");
      this.63H5OHax2VJJ5EOiq9T213DVr7JjVByulrN67Lnh0OD5d7RqNTw4x5C3p8u9 = new 19585unF8H2jcj7MCsf2jcpx9se8xa5Y7m629Q3vwd1i9Ym2L8UBw87RHcILFR2e2CAgfY731q3P9c242c88kLT9Ty0Fo6t();
      this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
         ._DyDBI9g7bkcXoYY94kLBk49TSkIjZb5HPgFSiY24s996Npy7F6T7nQlbP5i/* $VF was: 8DyDBI9g7bkcXoYY94kLBk49TSkIjZb5HPgFSiY24s996Npy7F6T7nQlbP5i */(
            this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            this.1Sl8X3i16n46M3ka7eB61D6LG7t2pKM7k2gXPqCjoY56QtWBI3c6okN7G66G
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            this.2PjOX6y2Y7Up5u4S16h0C92211BaYh9l8UezfkN2Q8PXa05XpRZUDN70Sea8
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            new 186HcA0xfWyJHy51l8zNHH6Z733323ySlcudL6KQaI2PuY822Z8wrAd60k4Q36yjnwyT43sRHr6e63IXdYtsY4qZ5ydwmz80PE6(this)
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            new 9uBXNF7QpnKP3UwOJooZ5xbNJF7L333LB2FsrPjOH6Y02WPT2idC7Onu690gK63Q735KFNUcl4cF0b131g56EeF5b2fDBrC9X3()
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            new 9Z1vqCCDX6bh6JskOY97yX0TC3qNS4W2oEyaZVUY88ToPlnl216V042852Ke9IxhJIc0de7B5MP3Bya2BdCRpHETU1WBf5XwUK()
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            new 886l72f1VXdnvoh01GoiG2sPYlP7NXAunohEA4r4Uz1X4PvZ693UV5ceVrV5cp3xhl5EsA591JjwA14z33G4FHtcBbVR(0)
         );
      this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
         ._8Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg/* $VF was: 28Z4uM6w2C9HBIK0Je3x0ZTd15BEr7HSCMfM76jj6Ncia2M0shMqtHRVj7cg */(
            new 886l72f1VXdnvoh01GoiG2sPYlP7NXAunohEA4r4Uz1X4PvZ693UV5ceVrV5cp3xhl5EsA591JjwA14z33G4FHtcBbVR(1)
         );
      this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi = new 7Xxz2JXODGC4S6R00NYAPTB25C7qxK7N81a7UW1PXz2s90iG6UlmWT3K7D7qNYwoYQD7u3K7h4M814rJ05tnS44gZ6Qwt8(
         this, this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
      );
      GL11.glViewport(
         0, 0, this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
      );
      this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3 = new 5WWFw704RR2X3PNH52jwd7q8hkaOb4u16586Wx6v0W25jSEjXC6yM06bE6uTi0z1R2nGYy8pcBl2Gkte9dOTw3757ZZLuF0z3iZP0xntH0(
         this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0, this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
      );
      new 8t9rS75g22igGMqdfHw4bakI3bn47943YArm99JKjxCT4UtzR40Gyk2ZA41MUxP0129jV4yP8Bq9AKJptnK1MuRns0ohd36DF6v(this).start();
      5ivWu5fw81lFMju719L22Mulv8zG27JoVOLR8YJ449815zjXt9yq6P1W2j4mAr7cr5vz8iYBvRPyA8oeO7yrs5U8vBW888dl._oD74IB2ktSl4rKYyq5be1pnGiKcijsDk38XO5US1yU1RgWUN9KZuVmeM2HO/* $VF was: 9oD74IB2ktSl4rKYyq5be1pnGiKcijsDk38XO5US1yU1RgWUN9KZuVmeM2HO */();

      try {
         this.59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m = new 0rxyG061C13735Na37QRFiS1ZL2aZfgjFSg4hUH6koh8G1W87np57Qn07I3JVPOagnZ37919Ri63Peoq8KeXGcdiR8kg271679UC0(
            this.6MrJeC1q9zkqCcH23sU4Yg19tu2odTn7bXzye93ck4j9nTz16A11583k1759, this
         );
         this.59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m.start();
      } catch (Exception var9) {
      }

      this._hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */(
         "Post startup"
      );
      this.2w11sSa7Bs9LcLsC7934u93KQ7ddy7D30Qm40R9Tadk9wwIXYd41bvx16wT6 = new 3Pzi5NnN9e1F51Ca0zh52OF6Ga7JRk7XGU7nyA291BcP5y2Y5uxK3DWL5z4Rw3Fe21givXPfq9n3BhX49xr5K06yHv1806U5n0p(
         this
      );
      if (this.7xvy0ghzcN4XFYKK1sOZ7E3tXWNRUZumx8Vrbzo9281iQ74391d2UIY84zuD != null) {
         this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
            new 9W4jPlrL8r95eKy06X9S6I6BNH1JHglQrX3bI6n9TF9C4oLS12OBhiUbwh7Q913f3f8PcvsgQ114Qs1qraV7aY4V011(
               this, this.7xvy0ghzcN4XFYKK1sOZ7E3tXWNRUZumx8Vrbzo9281iQ74391d2UIY84zuD, this.7X56Srj8CcC4U7l05DgX767s2PqIR50y1DNu7K34Bn5RS95uHMY8mcJw0BlP
            )
         );
      } else {
         this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
            new 4XiQ5WlIPZ272kng7qb0S6UQYG08KRySIujYWz6i1dTzm6b00r3NCEA20B8d2n4Nqn0Lk7BtgwCEOkFBHeE1S9u2J6sUgs()
         );
         if (2msfSv6XepOCRn2lQ7GWx5b74U9UNWyZxFP12RWg76nKhUqLP7XRvq4Nf9JKIYmdd778qyr53K8qWvpiDcL8JeYm987xLPxtaQiQ.9em2Ife2khemBsRa6OJA0Ri6Clvaqw931zzZ2mUAF0u2A8Ygt4H6lG9PtzG5
            )
          {
            this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
               new 4iPxfE9NobLgCV7E18vEHT1cJ6lluXA02YrGIhCL2SlE5e6tfoFs52b4cqQ2AyS509L8nqdO9h4jR24EM6huGz76JTn8Gb(
                  "Warning!", "Using async. world generation may lead to anomalies in your worlds.\nUse at your own risk!"
               )
            );
         }
      }

      this._aCQ3QUtAn82t0f1z3JQKRAg5aNB155g64AWf0ztqf7j603OA1tsJsAwlFrq/* $VF was: 0aCQ3QUtAn82t0f1z3JQKRAg5aNB155g64AWf0ztqf7j603OA1tsJsAwlFrq */();

      try {
         MessageDigest var2 = MessageDigest.getInstance("SHA-256");
         MessageDigest var3 = MessageDigest.getInstance("MD5");
         byte[] var4 = var2.digest(
            this.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb.getBytes("UTF-8")
         );
         byte[] var5 = var3.digest(
            this.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb.getBytes("UTF-8")
         );
         String var6 = 1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN._D2s54927n4DKgyG72xyN0I2571Gf1lofyGtm297rlY5SYBWi0Gc4NBMKoQD/* $VF was: 5D2s54927n4DKgyG72xyN0I2571Gf1lofyGtm297rlY5SYBWi0Gc4NBMKoQD */(
            var4
         );
         String var7 = 1C60sf2EFRm3M9sgtt9V3x6TdOM3Vz7taJT0eA1658wF2g6zejH5rqp8qCr8w0yh8W291kew4rauuaF0804w7TM2aw8JN._D2s54927n4DKgyG72xyN0I2571Gf1lofyGtm297rlY5SYBWi0Gc4NBMKoQD/* $VF was: 5D2s54927n4DKgyG72xyN0I2571Gf1lofyGtm297rlY5SYBWi0Gc4NBMKoQD */(
            var5
         );

         for (int var8 = 0; var8 != this.19rCmxZvQ44R6d92WkH1mXthIKS3J78E3u1z0N18CN7q304gJsGOLn55X7mx.length; var8++) {
            if (this.19rCmxZvQ44R6d92WkH1mXthIKS3J78E3u1z0N18CN7q304gJsGOLn55X7mx[var8].equals(var6)
               && this.32ThEK683E33UOnLg5jCYi6a44ej1w0cgRA8dke3o36TvwA2m1lepu5CZa4q[var8].equals(var7)) {
               4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo = true;
               break;
            }
         }
      } catch (NoSuchAlgorithmException | UnsupportedEncodingException var13) {
         var13.printStackTrace();
      }

      7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._YhI1BRU4sPxi9t4Dq7qvw6fWm9tegB7AY49xHW88ssOkm4y82muR7R232M1/* $VF was: 2YhI1BRU4sPxi9t4Dq7qvw6fWm9tegB7AY49xHW88ssOkm4y82muR7R232M1 */();
      if (4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo) {
         this._dMl5I34263gZ0dPe7JHpGrD7U3zw9us5Hn9tWeKJL88K9IRr93Uq13Y3bAE/* $VF was: 0dMl5I34263gZ0dPe7JHpGrD7U3zw9us5Hn9tWeKJL88K9IRr93Uq13Y3bAE */();
      }
   }

   public String _E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD/* $VF was: 2E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD */() {
      if (this.3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483.isEmpty()) {
         if (new File(
               _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */()
                  + "/perfTelemetryCache.txt"
            )
            .exists()) {
            try {
               BufferedReader var1 = new BufferedReader(
                  new FileReader(
                     _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */()
                        + "/perfTelemetryCache.txt"
                  )
               );
               this.3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483 = var1.readLine();
               var1.close();
            } catch (IOException var2) {
            }

            return this.3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483;
         }

         this.3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483 = GL11.glGetString(7937);
      }

      return this.3R5t255Q5D6KY19uD068Mkk1B6OU9sWGPdWh8cCMUgE3jA5I39fu26h80483;
   }

   public void _aCQ3QUtAn82t0f1z3JQKRAg5aNB155g64AWf0ztqf7j603OA1tsJsAwlFrq/* $VF was: 0aCQ3QUtAn82t0f1z3JQKRAg5aNB155g64AWf0ztqf7j603OA1tsJsAwlFrq */() {
      this._y5vE7Yn817r5Knu79o4Aj1C8zSXCZv983MY0Ng8eMzo5U95JWt5FIuSSHqv/* $VF was: 2y5vE7Yn817r5Knu79o4Aj1C8zSXCZv983MY0Ng8eMzo5U95JWt5FIuSSHqv */("");
   }

   public void _y5vE7Yn817r5Knu79o4Aj1C8zSXCZv983MY0Ng8eMzo5U95JWt5FIuSSHqv/* $VF was: 2y5vE7Yn817r5Knu79o4Aj1C8zSXCZv983MY0Ng8eMzo5U95JWt5FIuSSHqv */(
      String var1
   ) {
      if (this.3qZs06Oh4T1EzvE8a1e17oHrGTbJu43kH42m78NUR12BElFxZ583A3e3PdPk instanceof Frame) {
         ((Frame)this.3qZs06Oh4T1EzvE8a1e17oHrGTbJu43kH42m78NUR12BElFxZ583A3e3PdPk)
            .setTitle(
               "Minecraft - "
                  + this.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q.133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb
                  + " - OpenGL ("
                  + this._E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD/* $VF was: 2E4BZaw4wUzRdqs6H26gijBXYV2x4keaA5V5idykFk39ETvee94J18B7nBcD */()
                  + ") "
                  + var1
            );
      }
   }

   public void _dMl5I34263gZ0dPe7JHpGrD7U3zw9us5Hn9tWeKJL88K9IRr93Uq13Y3bAE/* $VF was: 0dMl5I34263gZ0dPe7JHpGrD7U3zw9us5Hn9tWeKJL88K9IRr93Uq13Y3bAE */() {
      4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo = true;
      this.2w11sSa7Bs9LcLsC7934u93KQ7ddy7D30Qm40R9Tadk9wwIXYd41bvx16wT6 = new 7W22kj3gtWkl3SgY8id4lPYc4wtp0wEH7YuICPVO15gIV1lwxfLq440d5d4sVY3wLK843ePKe1U4gJ6UXqaQ119Yx6pF5US7x50aff(
         this
      );
      3A3F71eia4o7hinl32z3YhX5z1YU4tLl0Pa5fhF3On0AAcu71UaBBB87kO4L = "/dclient_terrain.png";
      this._9qZtzs9Umn2t4Yo7zgL9jG0eGk29r7apQzgXA0F4G93V675ed5o7E7DaMF4/* $VF was: 39qZtzs9Umn2t4Yo7zgL9jG0eGk29r7apQzgXA0F4G93V675ed5o7E7DaMF4 */("detain");
   }

   private void _o1F77IyWs4gJ0vdJ61lslNI6v5Q0mkTD7yzS16i0IN50lm73jmaSwrGwTdn/* $VF was: 9o1F77IyWs4gJ0vdJ61lslNI6v5Q0mkTD7yzS16i0IN50lm73jmaSwrGwTdn */() throws LWJGLException {
      2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd var1 = new 2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd(
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
      );
      int var2 = var1._TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc/* $VF was: 4TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc */();
      int var3 = var1._bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4/* $VF was: 1bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4 */();
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0, var2, var3, 0.0, 1000.0, 3000.0);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(
         0, 0, this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
      );
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT var4 = 4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(
         3553,
         this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8/* $VF was: 7vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8 */(
               7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
                  7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.2ExF4JhJHlCqkXYSNrS98Z5269ASfuJ8zkQQ6HhI63XODUSPeL6pTXj9yxiR
               )
            )
      );
      var4._ayZ4y0DKzlBw0qR3TwrtIK08f0p5iZQu8xsah0R4i2XaEr9LQwCue6wKB06/* $VF was: 6ayZ4y0DKzlBw0qR3TwrtIK08f0p5iZQu8xsah0R4i2XaEr9LQwCue6wKB06 */(true);
      var4._v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq/* $VF was: 8v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq */(16777215);
      var4._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         0.0, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0, 0.0, 0.0
      );
      var4._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0, 0.0, 0.0
      );
      var4._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, 0.0, 0.0, 0.0, 0.0
      );
      var4._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         0.0, 0.0, 0.0, 0.0, 0.0
      );
      var4._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
      short var5 = 256;
      short var6 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4._v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq/* $VF was: 8v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq */(16777215);
      this._5K91qBinMWUHOUbx98VAffW08y1PrAdKyXA91NJxW730LGq6P00zosY9Ve6/* $VF was: 75K91qBinMWUHOUbx98VAffW08y1PrAdKyXA91NJxW730LGq6P00zosY9Ve6 */(
         (this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA / 2 - var5) / 2,
         (this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw / 2 - var6) / 2,
         0,
         0,
         var5,
         var6
      );
      this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2
         ._WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
            "BUILD " + this.3N43634U70U92133ZUaNYj909RB5DwkFoBTS6atyP5GiVktfCg90sfuoC131, 10, 10, 16777215
         );
      if (this.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q
         .133H4SABj815B05p53qsGvG0T6wXYQJeOV93GEbryghg5O6d9WK185g78Ibb
         .equals("DECRAFT_Player")) {
         this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2
            ._WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30/* $VF was: 9WH7LUf546x263V85v8o87x6d2Y7ZY7fPYyzVR9F61aJ7PnY1EAuj01xIk30 */(
               "(based)", 10, 20, 16777215
            );
      }

      this._fW1DcOg3Y819yUa6j1jy2lJiMPR4hOFs9F2emO20dNK708Di149LF42q7Mt/* $VF was: 8fW1DcOg3Y819yUa6j1jy2lJiMPR4hOFs9F2emO20dNK708Di149LF42q7Mt */();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.setVSyncEnabled(this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.41ci3bZ3JIAX8mLq08E3rvi0L2G4q8Z7n0x2RqlTd5R5pSL43XWO417u505z);
      Display.swapBuffers();
   }

   public void _5K91qBinMWUHOUbx98VAffW08y1PrAdKyXA91NJxW730LGq6P00zosY9Ve6/* $VF was: 75K91qBinMWUHOUbx98VAffW08y1PrAdKyXA91NJxW730LGq6P00zosY9Ve6 */(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT var9 = 4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk;
      var9._xlkp29IV3dqDsM1STBVfF0j99RiS6z898o5R0ZD1U10LYpJKhI0806gUiFW/* $VF was: 0xlkp29IV3dqDsM1STBVfF0j99RiS6z898o5R0ZD1U10LYpJKhI0806gUiFW */();
      var9._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         var1 + 0, var2 + var6, 0.0, (var3 + 0) * var7, (var4 + var6) * var8
      );
      var9._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         var1 + var5, var2 + var6, 0.0, (var3 + var5) * var7, (var4 + var6) * var8
      );
      var9._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         var1 + var5, var2 + 0, 0.0, (var3 + var5) * var7, (var4 + 0) * var8
      );
      var9._ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY/* $VF was: 1ORn6lX5GMFEsWn2wqLuH5iZCnSek18x3v553RlX264C4g2z48J419J5eWrY */(
         var1 + 0, var2 + 0, 0.0, (var3 + 0) * var7, (var4 + 0) * var8
      );
      var9._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
   }

   public static File _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */() {
      if (52mKba05hk3F8WK70QmXBj722EiliFna487ru2G9gwtSlJWLEVbmTbtUt1Xr == null) {
         52mKba05hk3F8WK70QmXBj722EiliFna487ru2G9gwtSlJWLEVbmTbtUt1Xr = 40G9X9sEbrNVWk1I68RpGi9486QjvBn75u9xmmmZ189amc26uqiJAf80zUYu
            ? new File(System.getProperty("user.dir"))
            : _RQRs4xtUq711rFbkY3c3sl86YKyG1Q3203T18w5e3f6ld9YsO2wBm06A94p/* $VF was: 0RQRs4xtUq711rFbkY3c3sl86YKyG1Q3203T18w5e3f6ld9YsO2wBm06A94p */(
               7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
                  7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.1YNrQ38ivM5fhyTo9PH5S33r6S87fqg85pTp0c4YlXfUniwhAwgeD8hZT3Cd
               )
            );
      }

      return 52mKba05hk3F8WK70QmXBj722EiliFna487ru2G9gwtSlJWLEVbmTbtUt1Xr;
   }

   public static File _RQRs4xtUq711rFbkY3c3sl86YKyG1Q3203T18w5e3f6ld9YsO2wBm06A94p/* $VF was: 0RQRs4xtUq711rFbkY3c3sl86YKyG1Q3203T18w5e3f6ld9YsO2wBm06A94p */(
      String var0
   ) {
      String var1 = System.getProperty(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.1Mq8T0QNr27egvw7Ii5njC2U34iHqD9xm0XHd85K26sr2HmLXKQgJ5Uz42hp
         ),
         "."
      );
      File var2;
      switch (21SqcgIh6jIrIV37Tdzb4Kt6u10ojf2PIv99e373w7Piu3K19xW9D2xy9f2XIO1hV7ukheyd6F6t6K218x1h7nafxm9r5j4MPk.32d3x0Xf86cpfgOOi98YK5ZkoMlNOjT5Qy0s2IdlmWB1E6L1z9291maTfUiI[_6FrK9Hi9Pq7POQhAwB1AXXO06TuZ3oTBoeNK2lwq23i4ze2lkp92NN7uWHU/* $VF was: 76FrK9Hi9Pq7POQhAwB1AXXO06TuZ3oTBoeNK2lwq23i4ze2lkp92NN7uWHU */()
         .ordinal()]) {
         case 1:
         case 2:
            var2 = new File(var1, '.' + var0 + '/');
            break;
         case 3:
            String var3 = System.getenv("APPDATA");
            if (var3 != null) {
               var2 = new File(var3, "." + var0 + '/');
            } else {
               var2 = new File(var1, '.' + var0 + '/');
            }
            break;
         case 4:
            var2 = new File(var1, "Library/Application Support/" + var0);
            break;
         default:
            var2 = new File(var1, var0 + '/');
      }

      if (!var2.exists() && !var2.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var2);
      } else {
         return var2;
      }
   }

   private static 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW _6FrK9Hi9Pq7POQhAwB1AXXO06TuZ3oTBoeNK2lwq23i4ze2lkp92NN7uWHU/* $VF was: 76FrK9Hi9Pq7POQhAwB1AXXO06TuZ3oTBoeNK2lwq23i4ze2lkp92NN7uWHU */() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")
         ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.9tcAOMfISXDxIU6BKEuvtwcx4ww0B14Mm4b6Y7M74KOE6PpizYJ75d9BT7T2
         : (
            var0.contains("mac")
               ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.0YCS3Lf0Mnn3Tqh40koCBE19x5QperDvUY8WEyHcufynA4tO3whl4MOq7855
               : (
                  var0.contains("solaris")
                     ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.1ZS30A1M6mj6J0n3H0ztDVCahJVSEmJBuJ4YTR2w27lhzo0Xt5E6AKDiWdG7
                     : (
                        var0.contains("sunos")
                           ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.1ZS30A1M6mj6J0n3H0ztDVCahJVSEmJBuJ4YTR2w27lhzo0Xt5E6AKDiWdG7
                           : (
                              var0.contains("linux")
                                 ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.4r9hY4dYfmaQ44N1Q7417z7VjAf638F22F8PhnULufIp71k63OJ4SuFE6N2I
                                 : (
                                    var0.contains("unix")
                                       ? 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.4r9hY4dYfmaQ44N1Q7417z7VjAf638F22F8PhnULufIp71k63OJ4SuFE6N2I
                                       : 753jUtk5BLkRD9448WzlKTE5h08v6dkLD07oH31vIW43AJn71riIlj7l5B4qvTZ1zf71Poafe4Y2yIgZ57aTxd7xR061vsnlW.3Wp844fK349s36K2Q586hGr9fCA37kAW1Lx823KrE0Sw9SyhqzJ1E461wEIr
                                 )
                           )
                     )
               )
         );
   }

   public void _d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
      3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D var1
   ) {
      if (!(
         this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb instanceof 9yRGohRulMH7lHW12E1vUYEYzRPqfaA0e0NeOwih3tp1qN09jOFx4Wl27eB07pW5jPe63NDRAKA7e6uj938yN52mNE3PpXd1
      )) {
         if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
            this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
               ._3zN406CnnMvKt50m1T5x9TK6olZW559Ze5Um8SL6U0pyu07041JesDT1Mts/* $VF was: 43zN406CnnMvKt50m1T5x9TK6olZW559Ze5Um8SL6U0pyu07041JesDT1Mts */();
         }

         if (var1 == null && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 == null) {
            var1 = new 4XiQ5WlIPZ272kng7qb0S6UQYG08KRySIujYWz6i1dTzm6b00r3NCEA20B8d2n4Nqn0Lk7BtgwCEOkFBHeE1S9u2J6sUgs();
         } else if (var1 == null
            && this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.84JwZ62mzR97M71TI6WThBQ4x5KWDl88ddmORcreEaLngjYTXPxp8a48d8DQ <= 0) {
            var1 = this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 instanceof 542a9768ET3113wO937KGI8Bz7DTWFdkO608uCS8FP7nT69HJRRbq70178Aw46Juy9r6U6YbvITp7Yfh7Nz67a508DALav8
               ? new 26Nsbz39rl6wtra76iko23EBNtintYf2Fl1r9ayu93lOydsL98KhEGQzwwHz06gW69RrIn2yRzX5Q5PKUN5h4s6sE69Q7C()
               : new 8q9JV0NbOGYnE0OHZ0743XjNOS1An3s9U1uKjz4GMOtU7M9Q7ZGm4C4njoysweNnfRTCJb8N8q00TQPj24pP3q7se8TDCr8();
         }

         this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb = var1;
         if (var1 != null) {
            this._07Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92/* $VF was: 807Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92 */();
            2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd var2 = new 2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd(
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
            );
            int var3 = var2._TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc/* $VF was: 4TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc */();
            int var4 = var2._bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4/* $VF was: 1bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4 */();
            var1._51JTpOHxqz7G83fp0d8u3576qY9jTtr0hkY0J2WJQ8E0xlOpEm857I6xIAl/* $VF was: 851JTpOHxqz7G83fp0d8u3576qY9jTtr0hkY0J2WJQ8E0xlOpEm857I6xIAl */(
               this, var3, var4
            );
            var1._QjqiHCzrK6gKACEe1CMZny00Rq3aNdEJ2fZf2Q8T53ugvuH3wUj0meqGRCg/* $VF was: 8QjqiHCzrK6gKACEe1CMZny00Rq3aNdEJ2fZf2Q8T53ugvuH3wUj0meqGRCg */();
            this.7F7j3098q4cjP0LAm9aiyC8I1EWQjxJOBo8VqR7hoCj9gM6ZU62Bjmq5nNtB = false;
         } else {
            this._AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y/* $VF was: 3AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y */();
         }
      }
   }

   private void _hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */(
      String var1
   ) {
      int var2 = GL11.glGetError();
      if (var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
         System.exit(0);
      }
   }

   public void _T4tyP319hE2JojSscGq782dOrj03OgJ36X530YVJ0D1i2bPDWii9IVrSO0G/* $VF was: 9T4tyP319hE2JojSscGq782dOrj03OgJ36X530YVJ0D1i2bPDWii9IVrSO0G */() {
      if (this.6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02 != null) {
         this.6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02
            ._67HZu4rK018A2NGlTuk07QqCR9Oex2dxXwwR4foPmo2FK831a1w9E7hL2xG/* $VF was: 567HZu4rK018A2NGlTuk07QqCR9Oex2dxXwwR4foPmo2FK831a1w9E7hL2xG */();
      }

      try {
         if (this.59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m != null) {
            this.59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m
               ._rioE3fWA5uXv2IL4hcq2hFRj2B2w2A9jB4dGTa7mTI8YXcKaRlDmtP1SkR4/* $VF was: 9rioE3fWA5uXv2IL4hcq2hFRj2B2w2A9jB4dGTa7mTI8YXcKaRlDmtP1SkR4 */();
         }
      } catch (Exception var8) {
      }

      try {
         System.out.println("Stopping!");
         this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
            (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
         );

         try {
            6L0q9fOrT3gF3u9BA7jz880F0hAJeJojaOFZ2y4Q31W9X7S69DROtyz6GWD1c52miu9YzUO1G91Iny44J8D6t8qjkA5482F8._JohDkGJux3P2XGaTywb0M9P0z06NFl6vkehak9CJ39ES63M8dP6LhM8d59Y/* $VF was: 7JohDkGJux3P2XGaTywb0M9P0z06NFl6vkehak9CJ39ES63M8dP6LhM8d59Y */();
         } catch (Exception var6) {
         }

         this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
            ._0dJlN03Q65RV8ike6WjEu8EWp2zZ03p2lMNjbhn07bDU7YpQDV33iO6n6Qm/* $VF was: 30dJlN03Q65RV8ike6WjEu8EWp2zZ03p2lMNjbhn07bDU7YpQDV33iO6n6Qm */();
         Mouse.destroy();
         Keyboard.destroy();
         Controllers.destroy();
      } finally {
         Display.destroy();
      }

      System.gc();
   }

   @Override
   public void run() {
      this.1z4ObCPpG0p71XzmKI5pA52oCuNeQd7W52IDk8415gt4kK2zAQcGob4V39RR = true;

      try {
         this._7DJ8a5s2U959270TtN9ypzMDKf27m9Lwtbk9SoEymd20p5I3fXzU27TbPP3/* $VF was: 17DJ8a5s2U959270TtN9ypzMDKf27m9Lwtbk9SoEymd20p5I3fXzU27TbPP3 */();
      } catch (Exception var10) {
         var10.printStackTrace();
         this._MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417/* $VF was: 4MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417 */(
            new 8O94wV86zi53NUGjB4bjuz07OdZ5AQMFj36j262U4havnb1rT68h61Uu6kluKGu3Zt2A50x51X06Z0VPHPWJM7ZjgEn0n32nr("Failed to start game", var10)
         );
         return;
      }

      try {
         long var1 = System.currentTimeMillis();
         int var3 = 0;

         while (
            this.1z4ObCPpG0p71XzmKI5pA52oCuNeQd7W52IDk8415gt4kK2zAQcGob4V39RR
               && (
                  this.6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02 == null
                     || this.6Dvuc7DJTOL2sEEAZmZAx637WbxAgiq35w5SGk5XTPP5ZwMoECAtDgtKrI02.isActive()
               )
         ) {
            long var4 = System.currentTimeMillis();
            85H57P2H4D6cj141sW70sW6k1pGNK4K4k78ms060bS9Wz8ktuElnkcl5YQCE3305VB1e75Xq1DQYF44ZEikQn64iKmEU62Tu9R5qy07u._agR1dpPvVBADtXUbt48XtItVAsFi8m7FZb8eta2T951RGHNcur15a3LPH96/* $VF was: 3agR1dpPvVBADtXUbt48XtItVAsFi8m7FZb8eta2T951RGHNcur15a3LPH96 */();
            2eMAz4P6NLNrwz70A5Qv10BoP9ox8TFDDjhjO8qUZxA2cY8xN2XQ0mX7rR4w70M8wo670XPdO2g3OeHdfL1NaM0Ti457._6E09N06iAehOLT33v17w4xYEjhq3GpfSpnk7rfCQFioAUs6wZyq7x9p7hvi/* $VF was: 86E09N06iAehOLT33v17w4xYEjhq3GpfSpnk7rfCQFioAUs6wZyq7x9p7hvi */();
            if (this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr == null && Display.isCloseRequested()) {
               this._F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f/* $VF was: 2F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f */();
            }

            if (this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
               float var6 = this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.7rGF2N5Z78ap5TXtRfflRj7w473480k9j6Jl4O5nZu85S5sa5z86CFzdxygi;
               this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs
                  ._LZmq9W9ja88LOy9290iK04e854jh7NYiuuz0jOu16dum980Hyyl1VqzuLX5/* $VF was: 1LZmq9W9ja88LOy9290iK04e854jh7NYiuuz0jOu16dum980Hyyl1VqzuLX5 */();
               this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.7rGF2N5Z78ap5TXtRfflRj7w473480k9j6Jl4O5nZu85S5sa5z86CFzdxygi = var6;
            } else {
               this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs
                  ._LZmq9W9ja88LOy9290iK04e854jh7NYiuuz0jOu16dum980Hyyl1VqzuLX5/* $VF was: 1LZmq9W9ja88LOy9290iK04e854jh7NYiuuz0jOu16dum980Hyyl1VqzuLX5 */();
            }

            for (int var13 = 0;
               var13 < this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.19g54v387Hz6i9H0aWQdT5zXYF8fXnwhWS6T04JEB5ms34fdI70yYbvxr4H3;
               var13++
            ) {
               this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q++;

               try {
                  this._P5ka85Hz5CMe4JCO6fIZp66b2RgTbp3iRVl403m5r4RyL45jc16321oHcC0/* $VF was: 9P5ka85Hz5CMe4JCO6fIZp66b2RgTbp3iRVl403m5r4RyL45jc16321oHcC0 */();
               } catch (58QNZTTsU9MoNCN45O03qVA0975ZxNUqwm2rd84py2xlP87nuI018eWGW28tpiQX6Y78XDuZfw1Gf45oDk0hl0Ygju0rn62qyq4X var9) {
                  this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 = null;
                  this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
                     (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
                  );
                  this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
                     new 68b0caVYEvHJE4Aahp2G03sQX93WhP9A71yTz6G6rN09w4641ygWm71l6uBSVrr6Z1SG0brkQc07t812wlmd35c042v9p6bXVN()
                  );
               }
            }

            this._hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */(
               "Pre render"
            );
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._6GeZa92Vf99NTT69x34046MB4T36U7QnaNQFHZ2lLTQlp3t3A3Va0C3400Q/* $VF was: 46GeZa92Vf99NTT69x34046MB4T36U7QnaNQFHZ2lLTQlp3t3A3Va0C3400Q */(
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5,
                  this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.7rGF2N5Z78ap5TXtRfflRj7w473480k9j6Jl4O5nZu85S5sa5z86CFzdxygi
               );
            GL11.glEnable(3553);
            if (this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
               while (
                  this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
                     ._Z9Gf08bj3c0Ku3htBX4bJKAV4X5O29YLypg7jG8r6AC0t487Vqf2LKLJBHC/* $VF was: 8Z9Gf08bj3c0Ku3htBX4bJKAV4X5O29YLypg7jG8r6AC0t487Vqf2LKLJBHC */()
               ) {
               }
            }

            if (!this.7F7j3098q4cjP0LAm9aiyC8I1EWQjxJOBo8VqR7hoCj9gM6ZU62Bjmq5nNtB) {
               if (this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8 != null) {
                  this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
                     ._7di0um827ra954W69F8ma5fN9izGP9n7uSOoTbq2k318n1iDBLJluDq8pt5/* $VF was: 87di0um827ra954W69F8ma5fN9izGP9n7uSOoTbq2k318n1iDBLJluDq8pt5 */(
                        this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.7rGF2N5Z78ap5TXtRfflRj7w473480k9j6Jl4O5nZu85S5sa5z86CFzdxygi
                     );
               }

               this.4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x
                  ._P6wZ87w6J3LhpUE5GV7K505oSgr0ckSRt0iYkLUL6u01L7OXcZ7t17j0r94/* $VF was: 0P6wZ87w6J3LhpUE5GV7K505oSgr0ckSRt0iYkLUL6u01L7OXcZ7t17j0r94 */(
                     this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.7rGF2N5Z78ap5TXtRfflRj7w473480k9j6Jl4O5nZu85S5sa5z86CFzdxygi
                  );
            }

            if (!Display.isActive()) {
               if (this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG) {
                  this._ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4/* $VF was: 5ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4 */();
               }

               Thread.sleep(10L);
            }

            if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8/* $VF was: 3Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8 */(
               64
            )) {
               this._pLh9glubH3qq9vWJc8Uy2Ngnx7bu3S4Pamv74DkRM3QS80955hosONOpkZW/* $VF was: 7pLh9glubH3qq9vWJc8Uy2Ngnx7bu3S4Pamv74DkRM3QS80955hosONOpkZW */();
            } else {
               this.8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1 = System.nanoTime();
            }

            Thread.yield();
            Display.update();
            if (this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr != null
               && !this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG
               && (
                  this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr.getWidth()
                        != this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA
                     || this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr.getHeight()
                        != this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
               )) {
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr.getWidth();
               this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr
                  .getHeight();
               if (this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA <= 0) {
                  this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = 1;
               }

               if (this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw <= 0) {
                  this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = 1;
               }

               this._2bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz/* $VF was: 42bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz */(
                  this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
               );
            }

            if (2ap75bw7uWpJs9xa2VRa8p40l51ptv8B02tkt5OcOFM8BeYBB08G54gDjTCY > 0) {
               try {
                  Thread.sleep(2ap75bw7uWpJs9xa2VRa8p40l51ptv8B02tkt5OcOFM8BeYBB08G54gDjTCY);
               } catch (Exception var8) {
               }
            }

            this._hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg/* $VF was: 9hSwXiG2WEAl7v5gSx8Rt6Ifpy51h4h8YONCP63u77Kw4253I9GUrDA1dcwg */(
               "Post render"
            );
            var3++;

            for (this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI = !this._q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65/* $VF was: 5q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65 */()
                  && this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null
                  && this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
                     ._NN3K02F9E90B5R25956d9U4WDVnWznsQl0kmp95I5Lx3ID1gG7QFp81LhMo/* $VF was: 7NN3K02F9E90B5R25956d9U4WDVnWznsQl0kmp95I5Lx3ID1gG7QFp81LhMo */();
               System.currentTimeMillis() >= var1 + 1000L;
               var3 = 0
            ) {
               this.05dJRxKFI7at92VB6myg2j2e70g0dxWTCkS35Sfh6qgi9FH5941nNo45q5A0 = var3
                  + " fps, "
                  + 7m678kZ55rXqa3m00xJ1mK7WVq1fiNI7QyJQMaTQ12P4pRN0G5G469700ZYjtg0K7Y80156m77jtU33I1T5Q9p7jY3NDQ30.20O28y9eKui650G63b4A2u9MZw620uhzJi46Wt0EJf3lQyZuDi25R9fquvkp
                  + " chunk updates";
               7m678kZ55rXqa3m00xJ1mK7WVq1fiNI7QyJQMaTQ12P4pRN0G5G469700ZYjtg0K7Y80156m77jtU33I1T5Q9p7jY3NDQ30.20O28y9eKui650G63b4A2u9MZw620uhzJi46Wt0EJf3lQyZuDi25R9fquvkp = 0;
               var1 += 1000L;
            }
         }
      } catch (3tBcECvmFGJwIt49c5e7aQGWU25l6ZwG4jqJN8w81FeWxZ273df1Ogits7X89eg1Rs5gI25HcycLN0wThA7Zry9G9I5xN var11) {
      } catch (Throwable var12) {
         this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 = null;
         var12.printStackTrace();
         this._MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417/* $VF was: 4MXL229F865NFbyV2H086q2G622AN6Ujb6j3w8468w9V9LRXP33fsBq93417 */(
            new 8O94wV86zi53NUGjB4bjuz07OdZ5AQMFj36j262U4havnb1rT68h61Uu6kluKGu3Zt2A50x51X06Z0VPHPWJM7ZjgEn0n32nr("Unexpected error", var12)
         );
      }
   }

   private void _pLh9glubH3qq9vWJc8Uy2Ngnx7bu3S4Pamv74DkRM3QS80955hosONOpkZW/* $VF was: 7pLh9glubH3qq9vWJc8Uy2Ngnx7bu3S4Pamv74DkRM3QS80955hosONOpkZW */() {
      if (this.8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1 == -1L) {
         this.8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1 = System.nanoTime();
      }

      long var1 = System.nanoTime();
      9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9[2Y9tYRU1X81zq4dJPoUz04JK76fi57cul7wM6wX062L5iSe0d750O108Zt1R++
         & 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length - 1] = var1 - this.8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1;
      this.8RHoweK8L396l4lJH261UKhXxP839IKHslUQhEr74aWiJkJl93eJh98h12q1 = var1;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(
         0.0,
         this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA,
         this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw,
         0.0,
         1000.0,
         3000.0
      );
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT var3 = 4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk;
      var3._1G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6/* $VF was: 31G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6 */(7);
      var3._v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq/* $VF was: 8v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq */(538968064);
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         0.0, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw - 100, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         0.0, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw - 100, 0.0
      );
      var3._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
      long var4 = 0L;

      for (int var6 = 0; var6 < 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length; var6++) {
         var4 += 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9[var6];
      }

      int var13 = (int)(var4 / 200000L / 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length);
      var3._1G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6/* $VF was: 31G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6 */(7);
      var3._v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq/* $VF was: 8v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq */(541065216);
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         0.0, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw - var13, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         0.0, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw, 0.0
      );
      var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
         9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw - var13, 0.0
      );
      var3._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
      var3._1G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6/* $VF was: 31G3hr2WJI7y0m0G229iA1zFpQ2OVfNpAb4R1LE0bT9a78f39Q8YIn5T7Tj6 */(1);

      for (int var7 = 0; var7 < 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length; var7++) {
         int var8 = (
               var7 - 2Y9tYRU1X81zq4dJPoUz04JK76fi57cul7wM6wX062L5iSe0d750O108Zt1R & 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length - 1
            )
            * 255
            / 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9.length;
         int var9 = var8 * var8 / 255;
         var9 = var9 * var9 / 255;
         int var10 = var9 * var9 / 255;
         var10 = var10 * var10 / 255;
         var3._v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq/* $VF was: 8v7F8G8g1104wyQ7q86jd6WFsS0S8C9C5G6r53pazN5nIQt79hRlifP4WcDq */(
            -16777216 + var10 + var9 * 256 + var8 * 65536
         );
         long var11 = 9muDBvVZMc5gM6PMgsp79o3RNd2Us2uC2q84VA280hGHk8mInkDq528I0mB9[var7] / 200000L;
         var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
            var7 + 0.5F, (float)(this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw - var11) + 0.5F, 0.0
         );
         var3._ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0/* $VF was: 8ksXSxMGiAnqOySa7lS2v4F63ZY797utQo8Nzf6TrpnZpViseje8RqTT3fg0 */(
            var7 + 0.5F, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw + 0.5F, 0.0
         );
      }

      var3._17DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2/* $VF was: 217DqV88NBKYV391UN4J3avyBa7x1t8ArRJwQSwE9iAUknUSm2Wsg5YkG9K2 */();
      GL11.glEnable(3553);
   }

   public void _F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f/* $VF was: 2F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f */() {
      this.1z4ObCPpG0p71XzmKI5pA52oCuNeQd7W52IDk8415gt4kK2zAQcGob4V39RR = false;
   }

   public void _AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y/* $VF was: 3AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y */() {
      if (Display.isActive() && !this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z) {
         this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z = true;
         this.8LX0s6aC7Ei1dCE02i1qz6h7ocx770a57s7gu0c82Wk1B0Qw261KJ124EkMp
            ._0saknE592QFhTGBXt0ceqRU24410UGDcZdmvgknAbl7KNpEHIYwGDlnn903/* $VF was: 90saknE592QFhTGBXt0ceqRU24410UGDcZdmvgknAbl7KNpEHIYwGDlnn903 */();
         this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
            (3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D)null
         );
         this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q + 10000;
      }
   }

   public void _07Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92/* $VF was: 807Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92 */() {
      if (this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z) {
         if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               ._3FrvU4AZZ8o75vZctnMFe8wb0wAu1i2DQ1wKkBBFb5DM7AJX3fxL38RMuGq/* $VF was: 43FrvU4AZZ8o75vZctnMFe8wb0wAu1i2DQ1wKkBBFb5DM7AJX3fxL38RMuGq */();
         }

         this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z = false;
         this.8LX0s6aC7Ei1dCE02i1qz6h7ocx770a57s7gu0c82Wk1B0Qw261KJ124EkMp
            ._YsFAXv246x8upiAh3qP33MKBPMnmT6Ee09DUc66940373VtwqGy0nQC0kM7/* $VF was: 2YsFAXv246x8upiAh3qP33MKBPMnmT6Ee09DUc66940373VtwqGy0nQC0kM7 */();
      }
   }

   public void _O1Y1U4Dz1xiz2hYWxS5EkUi0jQlW7ehXbjLh4F7nuRm418tjOWAyFz9TBxX/* $VF was: 8O1Y1U4Dz1xiz2hYWxS5EkUi0jQlW7ehXbjLh4F7nuRm418tjOWAyFz9TBxX */() {
      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null) {
         this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
            4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo
               ? new 2IaV18YThkD1IN1fXLdiDUxg0zVnbuKWEXkxY64m16Dtt79P6O3Pi4nQGFRde2snBEN82zy6j24cfQkayyrg8yOdURvqpy8Pa717()
               : new 3u8ZOirzFT7AClQZgu654608apz1O6Oo664YU8zJcl2lGxyhk716RtipaKAAT3L808BqI485lo67p1i4SvVp3HQQA74()
         );
      }
   }

   private void _fZ95XIzMbh5Li97b836mT99cmltg9rBm2475rx1t5Mc344YbOi600841A5P/* $VF was: 1fZ95XIzMbh5Li97b836mT99cmltg9rBm2475rx1t5Mc344YbOi600841A5P */(
      int var1, boolean var2
   ) {
      if (!this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8.5C5z94Jo3e91coKf00k46cfkIpxQFs5GhZ5GW55tvf906mZr9w8JV87CP60D
         && (var1 != 0 || this.8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh <= 0)) {
         if (var2
            && this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN != null
            && this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5Q13962qwol2yWB5h0x3lr2oinkg4QJGjatq9OEjMRo8g9U321yqQABeN7Sl == 0
            && var1 == 0) {
            int var3 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.3KP1B5YD60zxyQI9TAw4RSonbUz4Wa4T1X2F6OtwxisSsac335427j4GS2ge;
            int var4 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5JLycDk5R5hWekl6gwVDOzNlE7r9Xd7SAF8Vs34Slg0i42T99RuK5scFxE42;
            int var5 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.1M7N3W40sj44inMUhh3EX8c2mNz0m9prob01OE6O66TE2elAr47hWkh5phj6;
            this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
               ._4ZMhNairS1YzJ62WQYkyUsOo34bGZYnI6BeQ3XX8a9o06PUMYAu2BhBm8OX/* $VF was: 84ZMhNairS1YzJ62WQYkyUsOo34bGZYnI6BeQ3XX8a9o06PUMYAu2BhBm8OX */(
                  var3,
                  var4,
                  var5,
                  this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5BJ2q7fq20F1o1w3Qfpqujho30eaE6CR96Q4Kz1726i0n6mj2RWTKUtY0RWA
               );
            this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3
               ._biS3jB84H8Xktk89x2GQUHyIPwUo679z57xn59F526c0pCRd8qB12c8w2MP/* $VF was: 0biS3jB84H8Xktk89x2GQUHyIPwUo679z57xn59F526c0pCRd8qB12c8w2MP */(
                  var3,
                  var4,
                  var5,
                  this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5BJ2q7fq20F1o1w3Qfpqujho30eaE6CR96Q4Kz1726i0n6mj2RWTKUtY0RWA
               );
         } else {
            this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
               ._3uAg1M8E5OZQ5BV86Lj2ZUGL3Aeuz41aB23567HD7q71cpHX0m8f430Mm9G/* $VF was: 53uAg1M8E5OZQ5BV86Lj2ZUGL3Aeuz41aB23567HD7q71cpHX0m8f430Mm9G */();
         }
      }
   }

   private void _UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73/* $VF was: 1UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73 */(
      int var1
   ) {
      if (var1 != 0 || this.8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh <= 0) {
         if (var1 == 0) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               ._5099DP6yC8uoX28hN052aO61DK44i2n4I27j2EoJEOsw0u81659ik2osZ6p/* $VF was: 75099DP6yC8uoX28hN052aO61DK44i2n4I27j2EoJEOsw0u81659ik2osZ6p */();
         }

         if (this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN == null) {
            if (var1 == 0
               && !(
                  this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8 instanceof 6AzkirusFdo5Sub9OYxD19gS7z76qsXILSxqzvCoxzNQHP1Z2ui1eu7TZ5x31k7k75KU2L3gRrEzl4f4F3P43Erk10noLLiV
               )) {
               this.8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh = 10;
            }
         } else if (this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5Q13962qwol2yWB5h0x3lr2oinkg4QJGjatq9OEjMRo8g9U321yqQABeN7Sl == 1) {
            if (var1 == 0) {
               this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                  ._1rh1T3k9T7D0CWY0jDT5MgO2Z3t4dGu7IfrZ9oqffIReAsq424GDxT7uyy1/* $VF was: 81rh1T3k9T7D0CWY0jDT5MgO2Z3t4dGu7IfrZ9oqffIReAsq424GDxT7uyy1 */(
                     this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.1Rbqnbnzm2CzswgMXvb4iudwZaPe4Wf0t365BJzJpYser1dG5QQqgS22MDVT
                  );
            }

            if (var1 == 1) {
               this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                  ._hmLTJjH2wYLCq0p63P3cszEck6j9DnR6ZaQ2bgN4PSi3z2WWb4N695F2PM7/* $VF was: 7hmLTJjH2wYLCq0p63P3cszEck6j9DnR6ZaQ2bgN4PSi3z2WWb4N695F2PM7 */(
                     this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.1Rbqnbnzm2CzswgMXvb4iudwZaPe4Wf0t365BJzJpYser1dG5QQqgS22MDVT
                  );
            }
         } else if (this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5Q13962qwol2yWB5h0x3lr2oinkg4QJGjatq9OEjMRo8g9U321yqQABeN7Sl == 0) {
            int var3 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.3KP1B5YD60zxyQI9TAw4RSonbUz4Wa4T1X2F6OtwxisSsac335427j4GS2ge;
            int var2 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5JLycDk5R5hWekl6gwVDOzNlE7r9Xd7SAF8Vs34Slg0i42T99RuK5scFxE42;
            int var4 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.1M7N3W40sj44inMUhh3EX8c2mNz0m9prob01OE6O66TE2elAr47hWkh5phj6;
            int var5 = this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5BJ2q7fq20F1o1w3Qfpqujho30eaE6CR96Q4Kz1726i0n6mj2RWTKUtY0RWA;
            1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC var6 = 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.3gtX9GUU6wdwzByKEps2xBmG14h5CxN4OFC2q5heb8ZC6C6z9632Rh5t94ea[this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
               ._067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM/* $VF was: 1067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM */(
                  var3, var2, var4
               )];
            if (var1 == 0) {
               this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
                  ._OkOrAoz16ZeRmXzg12L12WAvS9y43hmwLM7J4nZ7Hf3GttFI7r8VV85e2jF/* $VF was: 9OkOrAoz16ZeRmXzg12L12WAvS9y43hmwLM7J4nZ7Hf3GttFI7r8VV85e2jF */(
                     var3,
                     var2,
                     var4,
                     this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5BJ2q7fq20F1o1w3Qfpqujho30eaE6CR96Q4Kz1726i0n6mj2RWTKUtY0RWA
                  );
               if (var6
                  != 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.9DwuHv1rF8tHn9hxQ74YH2a9UDMG087j4Z8NJ6X7ly1OaZNeZrC5MTA51CA7
                  )
                {
                  this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
                     ._8WKF3z71y86ph0iQ0Z9iq5nCZs50330olhmXqd292m4esv08Xl2K99UzM80/* $VF was: 48WKF3z71y86ph0iQ0Z9iq5nCZs50330olhmXqd292m4esv08Xl2K99UzM80 */(
                        var3,
                        var2,
                        var4,
                        this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5BJ2q7fq20F1o1w3Qfpqujho30eaE6CR96Q4Kz1726i0n6mj2RWTKUtY0RWA
                     );
               }
            } else {
               43Nc2QnnV13i1c3J76qJpd75c59A9CeY4VaW27tjdsO253ppIO6hy6AxgWx629vT375d3zh7lZ88397172uLJF8jexQRex var7 = this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                  .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                  ._KvPrOor3q0E08UXP5g60PNQ27iNyJywTX08GUNiyFx58mkbWmHHlu6T50Yb/* $VF was: 0KvPrOor3q0E08UXP5g60PNQ27iNyJywTX08GUNiyFx58mkbWmHHlu6T50Yb */();
               int var8 = var7 != null ? var7.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp : 0;
               if (this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
                  ._FnTML94f2R8lqel7un2jy8h4r0S2PK102V1udn1gS0kzdbLC7CNbCdhA7OX/* $VF was: 9FnTML94f2R8lqel7un2jy8h4r0S2PK102V1udn1gS0kzdbLC7CNbCdhA7OX */(
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5,
                     this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0,
                     var7,
                     var3,
                     var2,
                     var4,
                     var5
                  )) {
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     ._5099DP6yC8uoX28hN052aO61DK44i2n4I27j2EoJEOsw0u81659ik2osZ6p/* $VF was: 75099DP6yC8uoX28hN052aO61DK44i2n4I27j2EoJEOsw0u81659ik2osZ6p */();
               }

               if (var7 == null) {
                  return;
               }

               if (var7.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp == 0) {
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU.4Z698693Tjy7aLrFQnKyQqxqlL0Q13Z91n5UyF9CJ4N8Xo5oCb2N2zK9N7gh[this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                     .6Y0i4yJYn7AY7rxpP7O17O53CiF387wnu3Ql52YjuqI8748DqOEWf5a9p1M0] = null;
               } else if (var7.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp != var8) {
                  this.4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x
                     .3o3R8p1x9KY3ph2535Pj3X0APMB5sDzLcU4n08v4o294s11NJ1gjYh85i0u1
                     ._3a44A9D2DpYm83tbays5nE4BqrjbGXCUWCPGDR7uK9466RED0tE9wqOq378/* $VF was: 33a44A9D2DpYm83tbays5nE4BqrjbGXCUWCPGDR7uK9466RED0tE9wqOq378 */();
               }
            }
         }

         if (var1 == 1) {
            43Nc2QnnV13i1c3J76qJpd75c59A9CeY4VaW27tjdsO253ppIO6hy6AxgWx629vT375d3zh7lZ88397172uLJF8jexQRex var10 = this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
               ._KvPrOor3q0E08UXP5g60PNQ27iNyJywTX08GUNiyFx58mkbWmHHlu6T50Yb/* $VF was: 0KvPrOor3q0E08UXP5g60PNQ27iNyJywTX08GUNiyFx58mkbWmHHlu6T50Yb */();
            if (var10 != null) {
               int var9 = var10.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp;
               43Nc2QnnV13i1c3J76qJpd75c59A9CeY4VaW27tjdsO253ppIO6hy6AxgWx629vT375d3zh7lZ88397172uLJF8jexQRex var11 = var10._W3iwL2546qiLdzY67eu00syVPm1Cd5iIGqq6x958GIyTpc5Rcvn9XRqrLWt/* $VF was: 3W3iwL2546qiLdzY67eu00syVPm1Cd5iIGqq6x958GIyTpc5Rcvn9XRqrLWt */(
                  this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0, this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               );
               if (var11 != var10 || var11 != null && var11.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp != var9) {
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU.4Z698693Tjy7aLrFQnKyQqxqlL0Q13Z91n5UyF9CJ4N8Xo5oCb2N2zK9N7gh[this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                     .6Y0i4yJYn7AY7rxpP7O17O53CiF387wnu3Ql52YjuqI8748DqOEWf5a9p1M0] = var11;
                  this.4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x
                     .3o3R8p1x9KY3ph2535Pj3X0APMB5sDzLcU4n08v4o294s11NJ1gjYh85i0u1
                     ._uuzRq0r2DC2Ez7P9BUgo5K6P136zP4bCF01420U7bFH4D2Y1fCQVe0XNP2F/* $VF was: 2uuzRq0r2DC2Ez7P9BUgo5K6P136zP4bCF01420U7bFH4D2Y1fCQVe0XNP2F */();
                  if (var11.79d1F939h1INyxg1oYp3epHUW8nvY23X9CpXFrDNY7E1sU1bt8Ix5Aw0EsGp == 0) {
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU.4Z698693Tjy7aLrFQnKyQqxqlL0Q13Z91n5UyF9CJ4N8Xo5oCb2N2zK9N7gh[this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                        .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                        .6Y0i4yJYn7AY7rxpP7O17O53CiF387wnu3Ql52YjuqI8748DqOEWf5a9p1M0] = null;
                  }
               }
            }
         }
      }
   }

   public void _ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4/* $VF was: 5ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4 */() {
      try {
         this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG = !this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG;
         if (this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = Display.getDisplayMode().getWidth();
            this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = Display.getDisplayMode().getHeight();
            if (this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA <= 0) {
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = 1;
            }

            if (this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw <= 0) {
               this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = 1;
            }
         } else {
            if (this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr != null) {
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr.getWidth();
               this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = this.68coin71iD0ZK7SYsiD6755R9DP3616uR6N1WcfC0WT9r2ZN690g9lmVfDJr
                  .getHeight();
            } else {
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = this.6Ka1oV8hj4147IJma5YhKz2436cq02qdoNEDTHdkSR7MK71PuxgEy8uxLEcI;
               this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = this.4Dr56FcUX71bYH8wrNc8G7S0wTL53B7v8Q5Jp4w109d686N3A8X7HeIVI5Vc;
            }

            if (this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA <= 0) {
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = 1;
            }

            if (this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw <= 0) {
               this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = 1;
            }

            Display.setDisplayMode(
               new DisplayMode(
                  this.6Ka1oV8hj4147IJma5YhKz2436cq02qdoNEDTHdkSR7MK71PuxgEy8uxLEcI, this.4Dr56FcUX71bYH8wrNc8G7S0wTL53B7v8Q5Jp4w109d686N3A8X7HeIVI5Vc
               )
            );
         }

         this._07Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92/* $VF was: 807Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92 */();
         Display.setFullscreen(this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG);
         Display.update();
         Thread.sleep(1000L);
         if (this.09VJHAJaIrh6UsL3t22J5FQ2Gsutq8XFDIPirL8j6a9QssYm17L43h71kTvG) {
            this._AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y/* $VF was: 3AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y */();
         }

         if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
            this._07Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92/* $VF was: 807Tz6uiM4g7DKW8lgD2GN6Owv768139T0sdkg4RTPEtzxuQqZAG45Bz6G92 */();
            this._2bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz/* $VF was: 42bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz */(
               this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA, this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
            );
         }

         System.out
            .println(
               "Size: "
                  + this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA
                  + ", "
                  + this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw
            );
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void _2bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz/* $VF was: 42bXvd8r3tDZ2zZ3m620xUxBY7Z98m9a1RWG0ljpam41DE22verdjw1651Lz */(
      int var1, int var2
   ) {
      if (var1 <= 0) {
         var1 = 1;
      }

      if (var2 <= 0) {
         var2 = 1;
      }

      this.7wa4Q09YKe4Yb610u0jt109nz9o7x3BF0dhmE0yPBjW08svGqii5A6pG84EA = var1;
      this.7n4jM037w4LsPm6ikFf20THdobbKbA6iKJdl98oj1myTsF8PUb5s91JTOGcw = var2;
      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
         2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd var3 = new 2CHDJp1C8lG352UVeot7et4hgyHXM6d5J8b9e2nQsCL5oMUY2n07S3FpqE7Sd05d7w5bj0DjXj9nOodrY77oPGTOk9mOFNc5o625Yd(
            var1, var2
         );
         int var4 = var3._TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc/* $VF was: 4TahmnleBXdYY38cIu9CQ9rvkIj8A9Z3EAkDI08C4P3XZLg2Oz957RaOFKwc */();
         int var5 = var3._bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4/* $VF was: 1bSpi35qTFft8sO8Hoh6bfxcTlpFtdeap71u0QTW8biy1494Qs61xzq7n7V4 */();
         this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
            ._51JTpOHxqz7G83fp0d8u3576qY9jTtr0hkY0J2WJQ8E0xlOpEm857I6xIAl/* $VF was: 851JTpOHxqz7G83fp0d8u3576qY9jTtr0hkY0J2WJQ8E0xlOpEm857I6xIAl */(
               this, var4, var5
            );
      }
   }

   private void _h9j0s25faT26rE11OR1S89k96KKweBm6Wr8w3znQjMWc4gER1TzWJmwiBuR/* $VF was: 9h9j0s25faT26rE11OR1S89k96KKweBm6Wr8w3znQjMWc4gER1TzWJmwiBuR */() {
      if (this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN != null) {
         int var1 = this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
            ._067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM/* $VF was: 1067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM */(
               this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.3KP1B5YD60zxyQI9TAw4RSonbUz4Wa4T1X2F6OtwxisSsac335427j4GS2ge,
               this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.5JLycDk5R5hWekl6gwVDOzNlE7r9Xd7SAF8Vs34Slg0i42T99RuK5scFxE42,
               this.2a7x7QFm3Fj5N48nx7Y2G901VNunL2o4702e0o3i266R4BK8w0LXHkI44SfN.1M7N3W40sj44inMUhh3EX8c2mNz0m9prob01OE6O66TE2elAr47hWkh5phj6
            );
         if (var1
            == 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.63nirDT0ysU52yrV7NrOFP3w5y6GfnHtl75Rxpz4tsleaNpwg02R6ida6v9c
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0) {
            var1 = 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.35wK7RXXc4Uu2oc9JBTTNWs6ng4la5dQ6N3KM9ii276gF3OhPeoRtqJ1k8qk
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0;
         }

         if (var1
            == 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.3ppsM3wr9yuMb0m3xrm41vexgAY9ZBcC970AyKwM5076UXfHQmD9zrjXsO13
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0) {
            var1 = 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.71aPcnrFcbsW0ia1sWorA1n2TbJWrKou486caSbOk5jfum056bgTB1a18820
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0;
         }

         if (var1
            == 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.9DwuHv1rF8tHn9hxQ74YH2a9UDMG087j4Z8NJ6X7ly1OaZNeZrC5MTA51CA7
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0) {
            var1 = 1KjQq26tT3cUE2h3zt5BGj42wc3w980gyGiZq6kKyY7ZMFEN9ALFlPXIX0VW57Z1b0KvTE8sQt8RQ8RBg8xGKhFSDuxaZGCi226hC.26V475EeKyTVt6B142Z2Jgcs6tr37z2in7wZlqoDyiUykn30S0vQ2evr9SGO
               .6eYzDMQF09g6izPuwQHhO952GYS7T3Drt11u0692dlqn6aEztEFQqC6uvfv0;
         }

         this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
            .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
            ._60Okt42Yea9toSes6wp4IMe7oFyIq9277EC8W5BgE04qy9I27LP0uDL746n/* $VF was: 560Okt42Yea9toSes6wp4IMe7oFyIq9277EC8W5BgE04qy9I27LP0uDL746n */(
               var1,
               this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8 instanceof 6AzkirusFdo5Sub9OYxD19gS7z76qsXILSxqzvCoxzNQHP1Z2ui1eu7TZ5x31k7k75KU2L3gRrEzl4f4F3P43Erk10noLLiV
            );
      }
   }

   public void _P5ka85Hz5CMe4JCO6fIZp66b2RgTbp3iRVl403m5r4RyL45jc16321oHcC0/* $VF was: 9P5ka85Hz5CMe4JCO6fIZp66b2RgTbp3iRVl403m5r4RyL45jc16321oHcC0 */() {
      this.1202Xh2to5K411eCdkp7924Hyz4tEuc93T8eZ9qf5D33M4HWlnu524P0Mlk2 = 4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk
         .0MROVDArlUltRNep2c82Yjn0c1YV0K6TX18zu3ch3eo466SKujDB70HFNvjW;
      4Rwayi21P7U4FG30AO4ZjY1nn17NSFEhgFcp7MRAcX7sJ1ju98vl7h7Z7GxSWAHWajFDqC3o1ymdUca5zNBIGlaAnE0wUT.8PZK90pwbY0Ix8mw49n397dpnEeWy4IV27LT8PITn9P4MFQYVE345V9X89Qk
         .0MROVDArlUltRNep2c82Yjn0c1YV0K6TX18zu3ch3eo466SKujDB70HFNvjW = 0;
      this.2w11sSa7Bs9LcLsC7934u93KQ7ddy7D30Qm40R9Tadk9wwIXYd41bvx16wT6
         ._pS2f9JEUgzWMiy7wX553O5LD45Ap4t441sFzV2kzjQf916mn96Qi9huW1AU/* $VF was: 0pS2f9JEUgzWMiy7wX553O5LD45Ap4t441sFzV2kzjQf916mn96Qi9huW1AU */();
      this.4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x
         ._PnuN30Zo565fUUtWTC52bpKFZ9dn65OOdCwx9rShUZ8Q8dSxjgwvT135g9f/* $VF was: 0PnuN30Zo565fUUtWTC52bpKFZ9dn65OOdCwx9rShUZ8Q8dSxjgwvT135g9f */(1.0F);
      if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
         this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
            ._iEEFi8q9pW1PZ0WK3COFZ4vNPdPM40B27r21GaV8f3qL2V9FDjAD0Ubn7b4/* $VF was: 8iEEFi8q9pW1PZ0WK3COFZ4vNPdPM40B27r21GaV8f3qL2V9FDjAD0Ubn7b4 */();
      }

      if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
         this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
            ._3N1wi8GYMTSR71kRcBkZJ7PDPJ14XMJ4cWQap4k3YYrL365jo4209vW9Pbh/* $VF was: 63N1wi8GYMTSR71kRcBkZJ7PDPJ14XMJ4cWQap4k3YYrL365jo4209vW9Pbh */();
      }

      GL11.glBindTexture(
         3553,
         this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8/* $VF was: 7vr7L7MEUPLNFHeDB0cpS18i1kbYTl3cg8B9xZTI4Q7Y2C8A0s7Y075Qa7O8 */(
               3A3F71eia4o7hinl32z3YhX5z1YU4tLl0Pa5fhF3On0AAcu71UaBBB87kO4L
            )
      );
      if (this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.21n1Yc74v7G6eY24T7KSj34XifI3R56mzeD6BEe0SmDhkmylgeGogGH3s6Mb == 2) {
         GL11.glDisable(3042);
      }

      if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI) {
         this.6k7260CiP0XTr745HhMVzH4snG33O0674eoXAU199DGO78b3mDwG4V9Rs8yO
            ._imU9lL98dWgKDo5L9HJeZU7uS13MOdLQi7WA6lZy85H5Y88G3seCp1YUr33/* $VF was: 1imU9lL98dWgKDo5L9HJeZU7uS13MOdLQi7WA6lZy85H5Y88G3seCp1YUr33 */();
      }

      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null
         && this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null
         && this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.84JwZ62mzR97M71TI6WThBQ4x5KWDl88ddmORcreEaLngjYTXPxp8a48d8DQ <= 0) {
         this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
            (3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D)null
         );
      }

      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
         this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q + 10000;
      }

      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
         this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
            ._yTDY7xv1zcvgnL57Xh4lG3yAot4T912AG58eujB7N8roYLw4ov61evcpcQV/* $VF was: 4yTDY7xv1zcvgnL57Xh4lG3yAot4T912AG58eujB7N8roYLw4ov61evcpcQV */();
         if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
            this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
               ._9dcDBX8wOiJ7P492Y177gZw78gOSlsV8lxmDRioLVlEh14o5HL6Utyo3Gfq/* $VF was: 79dcDBX8wOiJ7P492Y177gZw78gOSlsV8lxmDRioLVlEh14o5HL6Utyo3Gfq */();
         }
      }

      if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null
         || this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb.93QovqXI4cvpj6v35Vl2mv99720FtE34fwg6Gx681vytU322t104F82pxa90) {
         while (
            1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._a9o5w8761299aY0803nZqT2qfw99G8V4j1mrW5LcuU3ZY53L7hC8tHylrk5/* $VF was: 9a9o5w8761299aY0803nZqT2qfw99G8V4j1mrW5LcuU3ZY53L7hC8tHylrk5 */()
         ) {
            long var1 = System.currentTimeMillis() - this.1k2OKYBdu2G71Ba0RoibXZR60E3eoQNyP1u3o65LCmM8vXKhlJBGY0IWMCm9;
            if (var1 <= 200L) {
               int var3 = 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._2yjW8fBAdGc4T5rbvJ476kxSS1a48Fsdf9TZ0692wEDQg4im2nM9YaivWI8/* $VF was: 42yjW8fBAdGc4T5rbvJ476kxSS1a48Fsdf9TZ0692wEDQg4im2nM9YaivWI8 */();
               if (var3 != 0) {
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                     .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                     ._5OWt4O889mqXz3N43g2NIUJd92dmGKRI1JMHfMlw76kTUK1lEjssr367P4Q/* $VF was: 65OWt4O889mqXz3N43g2NIUJd92dmGKRI1JMHfMlw76kTUK1lEjssr367P4Q */(
                        var3
                     );
               }

               if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null) {
                  if (!this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z
                     && 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._WsAP0Xntr7825vL08eeYQvCV8u3bpqgrfIJ3Y7JBhG7EBO1W4qTNZHw1V5u/* $VF was: 5WsAP0Xntr7825vL08eeYQvCV8u3bpqgrfIJ3Y7JBhG7EBO1W4qTNZHw1V5u */()
                     )
                   {
                     this._AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y/* $VF was: 3AhGMp6608Ha88cP0AKp402fgrMuur6v37TLnyN944DeKr5Y6m227AaMmY1Y */();
                  } else if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._WsAP0Xntr7825vL08eeYQvCV8u3bpqgrfIJ3Y7JBhG7EBO1W4qTNZHw1V5u/* $VF was: 5WsAP0Xntr7825vL08eeYQvCV8u3bpqgrfIJ3Y7JBhG7EBO1W4qTNZHw1V5u */()
                     )
                   {
                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._0SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O/* $VF was: 00SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O */()
                        == 0) {
                        this._UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73/* $VF was: 1UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73 */(
                           0
                        );
                        this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q;
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._0SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O/* $VF was: 00SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O */()
                        == 1) {
                        this._UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73/* $VF was: 1UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73 */(
                           1
                        );
                        this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q;
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._0SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O/* $VF was: 00SSQ41K4IpMLHtphA8GZEc2hd50869w7BMHr97NLX9LjK469PHuz7quiK6O */()
                        == 2) {
                        this._h9j0s25faT26rE11OR1S89k96KKweBm6Wr8w3znQjMWc4gER1TzWJmwiBuR/* $VF was: 9h9j0s25faT26rE11OR1S89k96KKweBm6Wr8w3znQjMWc4gER1TzWJmwiBuR */();
                     }
                  }
               } else if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
                  this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
                     ._7ZVc0dbIa439OBoT5LigRMatK3S7FXjA5e9ZH67A9ZcXFAe937I3NCTa1mc/* $VF was: 57ZVc0dbIa439OBoT5LigRMatK3S7FXjA5e9ZH67A9ZcXFAe937I3NCTa1mc */();
               }
            }
         }

         if (this.8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh > 0) {
            this.8nLH6NWcJNEc54GSNmw5BbtmTpBY2TcIJ13va3Z1Tz78P6521EMM5LjhTYKh--;
         }

         while (
            1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._944Y14BKZcYTNPE5RBi0Oa210Zw6zkR0fXN4RSo0p4GLqn28dqcnNjzJa0E/* $VF was: 9944Y14BKZcYTNPE5RBi0Oa210Zw6zkR0fXN4RSo0p4GLqn28dqcnNjzJa0E */()
         ) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               ._8fHZ3yxDyOHXVCP2815bCgNu58aQ432A25pahdCiOkp7j37S67WEBWjzRIY/* $VF was: 88fHZ3yxDyOHXVCP2815bCgNu58aQ432A25pahdCiOkp7j37S67WEBWjzRIY */(
                  1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */(),
                  1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._13z2ofJPdHa6VbIAmEgTsWHT3ePGnKtzuFlS2em5TQP88Ioyt12d71U47VK/* $VF was: 313z2ofJPdHa6VbIAmEgTsWHT3ePGnKtzuFlS2em5TQP88Ioyt12d71U47VK */()
               );
            if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._13z2ofJPdHa6VbIAmEgTsWHT3ePGnKtzuFlS2em5TQP88Ioyt12d71U47VK/* $VF was: 313z2ofJPdHa6VbIAmEgTsWHT3ePGnKtzuFlS2em5TQP88Ioyt12d71U47VK */()
               )
             {
               if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                  == 87) {
                  this._ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4/* $VF was: 5ih4xMEE4EbaRT6o4CA5T809hopo44q7bG9hq5pAZ6GT6gvqHx8F8kw2TFi4 */();
               } else {
                  if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb != null) {
                     this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb
                        ._oau5Z4Zg4P10W079SMCjWVQ441vx3INljL78592Y02r7QgT7s0vT0x0ct60/* $VF was: 6oau5Z4Zg4P10W079SMCjWVQ441vx3INljL78592Y02r7QgT7s0vT0x0ct60 */();
                  } else {
                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                        == 1) {
                        this._O1Y1U4Dz1xiz2hYWxS5EkUi0jQlW7ehXbjLh4F7nuRm418tjOWAyFz9TBxX/* $VF was: 8O1Y1U4Dz1xiz2hYWxS5EkUi0jQlW7ehXbjLh4F7nuRm418tjOWAyFz9TBxX */();
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                           == 31
                        && 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8/* $VF was: 3Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8 */(
                           61
                        )) {
                        this._hH5uv06K13h169e3Qeps1958xexC1PPZ5Dx0BGMZEkR4l001ry2F0KK6o45/* $VF was: 8hH5uv06K13h169e3Qeps1958xexC1PPZ5Dx0BGMZEkR4l001ry2F0KK6o45 */();
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                        == 63) {
                        this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.62p9oNt3fL95Z2GQCrZ6mc1ALIkgs35mKZ9ozwF97QlZmhcw5pU7GVl135uP = !this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
                           .62p9oNt3fL95Z2GQCrZ6mc1ALIkgs35mKZ9ozwF97QlZmhcw5pU7GVl135uP;
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                        == this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.400nmSgqkmWs4T9j7Z2Rtse46ME5W3lmkz88JuE91nRGK1LJ0n3MnjdVQG14.7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
                        )
                      {
                        this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                           ._Y2V1e7t06S7hQ12YogQ88R8Lcbm2Sz6Y3o802q297lUgzXrhuM8Ioqo9Hzq/* $VF was: 0Y2V1e7t06S7hQ12YogQ88R8Lcbm2Sz6Y3o802q297lUgzXrhuM8Ioqo9Hzq */(
                              this
                           );
                     }

                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                        == this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.2Ykx4GZjpFlzho5iH00m9ZV3lKWAK1V1i7l8IwksoId2p1z5nv077OnTHG22.7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
                        )
                      {
                        this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                           ._iz0SFcYSpH2ONgZ6LASY36BoGd22jzaf7mEW58C5C8n2Kh6Il589Sm2l299/* $VF was: 6iz0SFcYSpH2ONgZ6LASY36BoGd22jzaf7mEW58C5C8n2Kh6Il589Sm2l299 */(
                              this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                                 .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                                 ._OTj3tDo1St0hFeuR5WrV9C8xemx0218exV9jyidNx1Bc7aUPWZq3zO1I88v/* $VF was: 2OTj3tDo1St0hFeuR5WrV9C8xemx0218exV9jyidNx1Bc7aUPWZq3zO1I88v */(
                                    this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                                       .1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU
                                       .6Y0i4yJYn7AY7rxpP7O17O53CiF387wnu3Ql52YjuqI8748DqOEWf5a9p1M0,
                                    1
                                 ),
                              false
                           );
                     }

                     if ((
                           this._q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65/* $VF was: 5q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65 */()
                              || 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8/* $VF was: 3Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8 */(
                                 54
                              )
                        )
                        && 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                           == this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.8sz2228sPity2FLj12vTITSeMt2C39BWEPskZ82JvrV6LDsFrv9g18uH23L1.7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
                        )
                      {
                        this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
                           new 7NBVQ0W8nn05XpUH3Aijj65jn1T60p1uuqkm576W63Zm4PrGc3VJ2698HJd87LLugvhkb4U00Ik3zwqPs53d60Jq57KeGS9E()
                        );
                     }
                  }

                  for (int var4 = 0; var4 < 9; var4++) {
                     if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                           == 2 + var4
                        && (
                           !(
                                 this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 instanceof 542a9768ET3113wO937KGI8Bz7DTWFdkO608uCS8FP7nT69HJRRbq70178Aw46Juy9r6U6YbvITp7Yfh7Nz67a508DALav8
                              )
                              || var4 < 2
                        )) {
                        this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.1Y7q220SInyHlr1u9Fb9uZKo77o461M0BjqRk6iZ85BKUjbm6rT3ph8MzJPU.6Y0i4yJYn7AY7rxpP7O17O53CiF387wnu3Ql52YjuqI8748DqOEWf5a9p1M0 = var4;
                     }
                  }

                  if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP/* $VF was: 6hH86kTy165Ioar4aF0mUYKaH1vN24xKRpBbZHDmn89LT0TFXF3fn4cVP5QP */()
                     == this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn.8nj81Ha0z6kkA82L191Z2XuGhV8Ad5073HJWD34egOjVN9Y397KLC1a5ATH4.7M9vbOHR7eAl017agGF84rYlw8NaF599n69iSj55uMdW5JjI69eY3aYhJTQN
                     )
                   {
                     this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
                        ._90874nZdx634bxSyP8662vVZm4CCxF145OGW0Ndz0kdVV9MnO7T5G6Oy3t9/* $VF was: 990874nZdx634bxSyP8662vVZm4CCxF145OGW0Ndz0kdVV9MnO7T5G6Oy3t9 */(
                           4,
                           !1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8/* $VF was: 3Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8 */(
                                    42
                                 )
                                 && !1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8/* $VF was: 3Qh5JgDKG16I2LMH200ubt9Ib7aad5w24R460sAze1KErHj022lk1FkwVGo8 */(
                                    54
                                 )
                              ? 1
                              : -1
                        );
                  }
               }
            }
         }

         if (this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null) {
            if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH/* $VF was: 1y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH */(
                  0
               )
               && this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q - this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW
                  >= this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.9x8SF7Sm6KBd7Bl9uNykLCIU00v2F8xxu38KPYS7v38r3aCdp4EPwuP6p1cr / 4.0F
               && this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z) {
               this._UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73/* $VF was: 1UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73 */(0);
               this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q;
            }

            if (1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH/* $VF was: 1y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH */(
                  1
               )
               && this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q - this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW
                  >= this.0468Lhs2pZ7h228rJ63og8gI4A0A0nP5UBA9bP6czyyBBCY7Da5o1qvxJnGs.9x8SF7Sm6KBd7Bl9uNykLCIU00v2F8xxu38KPYS7v38r3aCdp4EPwuP6p1cr / 4.0F
               && this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z) {
               this._UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73/* $VF was: 1UY1bCn026PA8O6C4t7UxDNT8afZjqcJJB2l6Ksn23jw8KA3NC360yPqQr73 */(1);
               this.296tTIZuuD2SKB32V1NuGaaYdHf12Yi9ntVr20QqN3ifzgMt2cZTux7Yl7fW = this.0WAfkZ20mNdXXn961e937vR85xLvC8U3qIZ2k2StlFD106pr7E9GzkI86c7Q;
            }
         }

         this._fZ95XIzMbh5Li97b836mT99cmltg9rBm2475rx1t5Mc344YbOi600841A5P/* $VF was: 1fZ95XIzMbh5Li97b836mT99cmltg9rBm2475rx1t5Mc344YbOi600841A5P */(
            0,
            this.5qb40IUHA9HwkHE9H6Pw5jQkWgRm689t02eg1oWLR2M3x8586n3eGW1x87rb == null
               && 1WAt54cM2S9HXBE2tf8vYm3Ind025Sf2dsQX7QMLl5G8NnHoRiW1ncB7Owy2FMxwF68U3LMu8o452Ucs6r4G9svQ91OCmip._y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH/* $VF was: 1y528y65zhW2e10REGA9PL1yYz5Sb3k5L608fuTc9HW7072rv02d352KWhlH */(
                  0
               )
               && this.4GNR2d4AyT50Cl3LQ0f30ZZ7qSvAvtpLkCo5Q50K2XyKTqhqJoKur4vi7J6z
         );
      }

      if (this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
         if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
            this.34K5LBRK0BSEpA78Lw590c9p091CQMcR47A2fgo54D27wz9gx3fvVXPfX9yl++;
            if (this.34K5LBRK0BSEpA78Lw590c9p091CQMcR47A2fgo54D27wz9gx3fvVXPfX9yl == 30) {
               this.34K5LBRK0BSEpA78Lw590c9p091CQMcR47A2fgo54D27wz9gx3fvVXPfX9yl = 0;
               this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
                  ._EsmKu3rDibs5Lmg0a4FZeoKdRCH9E1y0z513XeoUS7R5pYvEf6qlUHpw6FW/* $VF was: 3EsmKu3rDibs5Lmg0a4FZeoKdRCH9E1y0z513XeoUS7R5pYvEf6qlUHpw6FW */(
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
                  );
            }
         }

         this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.4emVP4ErzEP5fUII859Wtz5UC5R8RamfnsH1CWK6rJ4tm3kVqncaz1ClqV4B = this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
            .83Du5N39GKmrFsh28BjNwZ7As6n5k0B7yZJq2hlj0EE6RLWyH6Z684B7Rq89;
         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI) {
            this.4IANsa3RvXBdMujF12ZbA0Z88ivnPrHM29EW5Z4kHIr0fOBKZkr212bJou2x
               ._45pqg071sK6qlu6bz4B6YpXoWfC1V5HPmSDn53n76o7wAOkU8nms3gxep7D/* $VF was: 645pqg071sK6qlu6bz4B6YpXoWfC1V5HPmSDn53n76o7wAOkU8nms3gxep7D */();
         }

         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI) {
            this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi
               ._TSVTjqLp86wgc1eIBUFV6FUcq91myVPA5a11R7NK8qq8Q4408EK2UNW2M8X/* $VF was: 3TSVTjqLp86wgc1eIBUFV6FUcq91myVPA5a11R7NK8qq8Q4408EK2UNW2M8X */();
         }

         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI) {
            this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
               ._97h50n02vLyse656U7e47JTTv7he4wLE468qL85qE9OXJlRuoYugx5wkMob/* $VF was: 997h50n02vLyse656U7e47JTTv7he4wLE468qL85qE9OXJlRuoYugx5wkMob */();
         }

         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI
            || this._q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65/* $VF was: 5q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65 */()) {
            this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
               ._H823MmhJXOd35yW3P9ZhiUw2cFxYj369y6vowZO2j724PmAkP6jQ245ZedT/* $VF was: 9H823MmhJXOd35yW3P9ZhiUw2cFxYj369y6vowZO2j724PmAkP6jQ245ZedT */();
         }

         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
            this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
               ._JZNyrL6ubZ3sSM9VkQkoVCea5mmJl9euA216Z2A537PW1Sj4OplaEFzU0s1/* $VF was: 3JZNyrL6ubZ3sSM9VkQkoVCea5mmJl9euA216Z2A537PW1Sj4OplaEFzU0s1 */(
                  5t78bjRYk0fi1yaf7z3x8U13h4eev2t4rjz0b1ldW6157a5RnUXxo75a0MwN32lv961oZ9qzC8R65xSGg9OE86P22SYrvn._IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG/* $VF was: 2IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG */(
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.497Ny8ieOOsR16Sz600331Tse4JQLpB9t68N055JeLhS6p82x0V6dPP7m43N
                  ),
                  5t78bjRYk0fi1yaf7z3x8U13h4eev2t4rjz0b1ldW6157a5RnUXxo75a0MwN32lv961oZ9qzC8R65xSGg9OE86P22SYrvn._IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG/* $VF was: 2IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG */(
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.8FECN1K2ZwI9gQQLDHe1k9PtBM7o0SIgR9IuNw1V282G0Sv8h5T952A1BGX8
                  ),
                  5t78bjRYk0fi1yaf7z3x8U13h4eev2t4rjz0b1ldW6157a5RnUXxo75a0MwN32lv961oZ9qzC8R65xSGg9OE86P22SYrvn._IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG/* $VF was: 2IE1iL5T3Q39d1dd737s8V13Ag4WxCVdwkXpL40J2e3apcTZ7gqF43NoocHG */(
                     this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.68900A16KVY7SEiF2YQ3hM0ZG79rACr5q730w1yAkf6oUgPjo4rVq892edT0
                  )
               );
         }

         if (!this.4L71E4LNZQ1077SZjWB7gXXWtv0kka0QYa8J5zA54n7t636j7yOJo6mE5bOI) {
            this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3
               ._QIFjKG2XwKrR3147er22acx77QlCUpT6SQnJLusM9G00uO0r2pusRq72yT6/* $VF was: 0QIFjKG2XwKrR3147er22acx77QlCUpT6SQnJLusM9G00uO0r2pusRq72yT6 */();
         }
      }

      this.1k2OKYBdu2G71Ba0RoibXZR60E3eoQNyP1u3o65LCmM8vXKhlJBGY0IWMCm9 = System.currentTimeMillis();
   }

   private void _hH5uv06K13h169e3Qeps1958xexC1PPZ5Dx0BGMZEkR4l001ry2F0KK6o45/* $VF was: 8hH5uv06K13h169e3Qeps1958xexC1PPZ5Dx0BGMZEkR4l001ry2F0KK6o45 */() {
      System.out.println("FORCING RELOAD!");
      this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG = new 0hAIC3TYFFRBw7X27377CB8mov7mOuK3ZuV6ofmix4NppPrBNqiUSiSy41S31Fvfz9jH1tpIf87stMiKd1Sp5T9snFpPbN();
      this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
         ._DyDBI9g7bkcXoYY94kLBk49TSkIjZb5HPgFSiY24s996Npy7F6T7nQlbP5i/* $VF was: 8DyDBI9g7bkcXoYY94kLBk49TSkIjZb5HPgFSiY24s996Npy7F6T7nQlbP5i */(
            this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
         );
      this.59sX1h2a15GGLrbg32KyN8lsTC8Z6B45lXRJxG19NjrI1w3LBAJ0NDt8re0m
         ._jbLmg4401IP1RX58N3ll0u3Hna07RX3rpWC8T4XuJRUZ22RCb6ZUdg70ySb/* $VF was: 4jbLmg4401IP1RX58N3ll0u3Hna07RX3rpWC8T4XuJRUZ22RCb6ZUdg70ySb */();
   }

   public boolean _q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65/* $VF was: 5q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65 */() {
      return this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null
         && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.9Q2HU4VRIHDwJpHQ14kY594OhW0Np80e85fr65M6CYCpcKVY8M23PsrUA1VM;
   }

   public void _aYeA7ake0QjnoN2mM18RmjL87K61kJ6LTR6757eYWVL92EF6a2A12Lc978r/* $VF was: 3aYeA7ake0QjnoN2mM18RmjL87K61kJ6LTR6757eYWVL92EF6a2A12Lc978r */(
      String var1
   ) {
      this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
         (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
      );
      System.gc();
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var2 = new 5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY(
         new File(
            _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */(), "saves"
         ),
         var1
      );
      7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
         "Attempting to load world " + var2.8Xa1UDY4ThwhO2pF5Ejwy5d9rWaK5E2nfNv3OWQ0RA9l8ObwH627n7F8D64E.toPath() + "..."
      );

      try {
         Files.write(Paths.get("./qfile"), var1.getBytes());
      } catch (IOException var4) {
      }

      if (var2.49Ld7y95W2MH7LO4EeyJ6653lg31phiMqHrtw80qKt80eWbZGUz1945x2zu3) {
         this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
            var2, "Generating level"
         );
      } else {
         this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
            var2, "Loading level"
         );
      }
   }

   public void _9708o9t3Kv11ORjhW6WgtZ1jrShpxII2V33oCWwflopdLkDYzM1ouYGxg87/* $VF was: 29708o9t3Kv11ORjhW6WgtZ1jrShpxII2V33oCWwflopdLkDYzM1ouYGxg87 */(
      String var1, Class<? extends 3Hm9O70Rua5IY98MZU32Z01gEL57GOpK193cl1oGEtbob9Jio1516a9Qh0JCg4E12jnvv33Vx1gBMEyrKx4B3B9440B3CRyQw27iS> var2
   ) {
      this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
         (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
      );
      System.gc();
      this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8 = new 3y4138jg7juGvMgr095I6s2nl94GI6R9b5t4wue6BSHvW44OhWLl6306k8B395HxD425psaT0FT3q9084gWC1K180xuV4KSbkX9F(
         this
      );

      try {
         5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var3 = (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)var2.getDeclaredConstructor(
               File.class, String.class
            )
            .newInstance(
               new File(
                  _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */(),
                  "saves"
               ),
               var1
            );
         7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
            "Attempting to load world " + var3.8Xa1UDY4ThwhO2pF5Ejwy5d9rWaK5E2nfNv3OWQ0RA9l8ObwH627n7F8D64E.toPath() + "..."
         );
         if (var3.49Ld7y95W2MH7LO4EeyJ6653lg31phiMqHrtw80qKt80eWbZGUz1945x2zu3) {
            return;
         }

         this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
            var3, "Loading level"
         );
      } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException var4) {
      }
   }

   public void _9qZtzs9Umn2t4Yo7zgL9jG0eGk29r7apQzgXA0F4G93V675ed5o7E7DaMF4/* $VF was: 39qZtzs9Umn2t4Yo7zgL9jG0eGk29r7apQzgXA0F4G93V675ed5o7E7DaMF4 */(
      String var1
   ) {
      this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
         (3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D)null
      );
      this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8 = new 1S8Z13J70AdD82z1og3YEdowZUz4do5hyK1shJ6v3bHh7w0Akmv3RRX6MNK0n71Ql9lR8g9FQZwIPm60mSSi6hhwPpvl8c1fpqYy(
         this
      );
      this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
         (3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D)null
      );
      this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
         (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
      );
      System.gc();
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var2 = new 5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY(
         new File(
            _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */(), "saves"
         ),
         var1
      );
      7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
         "Attempting to load world " + var2.8Xa1UDY4ThwhO2pF5Ejwy5d9rWaK5E2nfNv3OWQ0RA9l8ObwH627n7F8D64E.toPath() + "..."
      );
      this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
         var2, "Loading level"
      );
      this._d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G/* $VF was: 6d2Q962XavWIyK2mppq0vU2tlSu9moK4ckx8NlHiW64kcoOn5G8qHAgY284G */(
         (3JtyNvNqN9kLf4RFXz7Fi009OPt48kRSSvJ552I1qLHaDizfWTpAD2ZjN7091Uy4jlGaMN9V1zt5UjrbVzvKgfqCpGj68S7D)null
      );
   }

   public void _1au6k35k5FtG2NSeEY81nM6cEMq9s813ZJ5zelgNb1pyX20syXDH0z15gpb/* $VF was: 71au6k35k5FtG2NSeEY81nM6cEMq9s813ZJ5zelgNb1pyX20syXDH0z15gpb */(
      String var1, Class<? extends 6whp7kUIx5CXDJo2kaXW6WhjZ3q7dZ1s6O96vJeEM1nVlTjlKu220854rokjZ7cyhFs8t7nlDO11va4N5A9ArEKJVe76> var2
   ) {
      this._C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
         (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)null
      );
      System.gc();

      try {
         5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var3 = (5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY)var2.getDeclaredConstructor(
               File.class, String.class
            )
            .newInstance(
               new File(
                  _4365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79/* $VF was: 74365lSUZG8SRi4QcP0LdVO61o0N3570jYi74Tv6MwBh3c90i6CydLQuxD79 */(),
                  "saves"
               ),
               var1
            );
         7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
            "Attempting to load world " + var3.8Xa1UDY4ThwhO2pF5Ejwy5d9rWaK5E2nfNv3OWQ0RA9l8ObwH627n7F8D64E.toPath() + "..."
         );
         if (var3.49Ld7y95W2MH7LO4EeyJ6653lg31phiMqHrtw80qKt80eWbZGUz1945x2zu3) {
            return;
         }

         this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
            var3, "Loading level"
         );
      } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException var4) {
      }
   }

   public void _C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4/* $VF was: 9C4Z46257W1E6vQBxmROHpdv4Mj3QD47gHaEuHV5x4967680j3Ig47k5vVL4 */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1
   ) {
      this._RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(var1, "");
   }

   public void _RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN/* $VF was: 5RDbmzDcBswGkR9G3X4B3Xsy0592TsY4ij6RDr2bbSyspy7q1zz8IJj1LDbN */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1, String var2
   ) {
      if (0hAIC3TYFFRBw7X27377CB8mov7mOuK3ZuV6ofmix4NppPrBNqiUSiSy41S31Fvfz9jH1tpIf87stMiKd1Sp5T9snFpPbN.56fOEBIsM5JqtBCx6Bjo40o1D5jvZBeotwEb0wU25jjVWokZC5342ZAp34oX
         != null) {
         this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
            ._14dv3mYU7t95lOh23lLhBI10XBv07D8y61Goe1u7G926JNt2Y1WIoiHj5tm/* $VF was: 514dv3mYU7t95lOh23lLhBI10XBv07D8y61Goe1u7G926JNt2Y1WIoiHj5tm */(null, true);
      }

      this._ZBv5568tmn0cVMP4o2NLg0n53pe0YrwKopF24mDp16EyXlr2BaxKqg754IV/* $VF was: 2ZBv5568tmn0cVMP4o2NLg0n53pe0YrwKopF24mDp16EyXlr2BaxKqg754IV */(
         var1, var2, true
      );
   }

   public void _ZBv5568tmn0cVMP4o2NLg0n53pe0YrwKopF24mDp16EyXlr2BaxKqg754IV/* $VF was: 2ZBv5568tmn0cVMP4o2NLg0n53pe0YrwKopF24mDp16EyXlr2BaxKqg754IV */(
      5gdApI3fnTM886NnVpNF5whRWSAY3i2e4yaS902KVT3Vi20lFKKqt7hQxQ4Am9w5DexG9374FK1Y5g7W3H8w65kv4VzY var1, String var2, boolean var3
   ) {
      this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
         ._x1G9X3US1O63U618Zk780zRJPOD9qz8Cr4w92F9ae8YJOy5LAqA8BbgGsb6/* $VF was: 7x1G9X3US1O63U618Zk780zRJPOD9qz8Cr4w92F9ae8YJOy5LAqA8BbgGsb6 */(
            (String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F
         );
      if (var3 && this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 != null) {
         this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
            ._uX75c14o8h3bQpccj4077ACoUYnX7dReKQEl55PRFpK0P0vp77x1i5tKpke/* $VF was: 9uX75c14o8h3bQpccj4077ACoUYnX7dReKQEl55PRFpK0P0vp77x1i5tKpke */(
               this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
            );
      }

      this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0 = var1;
      if (var1 != null) {
         this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
            ._83QX39Zf5eOhveMK8ootJ9692RkL49UmOTYfN21fCL9glCSA331f90Q82VS/* $VF was: 483QX39Zf5eOhveMK8ootJ9692RkL49UmOTYfN21fCL9glCSA331f90Q82VS */(var1);
         var1.7SjPwv94Z8WQWJxHUnp9JG56N4Z3ekQZu5TPE0tNUhcU925O647HImBXEPB2 = this.4gTIxYqR91GOe6nJ3qln6t9eH31Cng1A7QRR4E59Vhz8La6hfSFZ0nzE6aF2;
         if (!this._q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65/* $VF was: 5q0PVFWeoE5xRVPAQ8Qa46EFuNPtUreX61D7B8LiL268NSuPjxJnYytfyd65 */()) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 = (799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j)var1._RLTU1Ua1sMif7CXS1Zs2yLm6RjUV71WFXI090O88eFX6968ycun323268d0/* $VF was: 8RLTU1Ua1sMif7CXS1Zs2yLm6RjUV71WFXI090O88eFX6968ycun323268d0 */(
               799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j.class
            );
         } else if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               ._hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx/* $VF was: 3hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx */();
            if (var1 != null) {
               var1._OhRvcs86wy35mcXvZXvSp35C9G263nN06i0tvqI9n8Xlv9vFjpEAwrvbOSR/* $VF was: 7OhRvcs86wy35mcXvZXvSp35C9G263nN06i0tvqI9n8Xlv9vFjpEAwrvbOSR */(
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               );
            }
         }

         if (!var1.9Q2HU4VRIHDwJpHQ14kY594OhW0Np80e85fr65M6CYCpcKVY8M23PsrUA1VM) {
            this._fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c/* $VF was: 2fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c */(var2);
         }

         if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 == null) {
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 = (799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j)this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
               ._NGDNzTFeL7bDgU7WYv2BSN649kcFTn5xK5s573aAq0mRmoLkvzXOdR55XeY/* $VF was: 5NGDNzTFeL7bDgU7WYv2BSN649kcFTn5xK5s573aAq0mRmoLkvzXOdR55XeY */(var1);
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               ._hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx/* $VF was: 3hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx */();
            this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
               ._HvxYkrn2cvqUTnd6Kgo0WKU8vQh695O78EV0j6RL7EjYYD95p4Bj2RXpXVA/* $VF was: 8HvxYkrn2cvqUTnd6Kgo0WKU8vQh695O78EV0j6RL7EjYYD95p4Bj2RXpXVA */(
                  this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
               );
         }

         this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.444p81G5ctRBZeBBEWQ7nq13KC7tWcq0mL6z9IwvrS7Gdm1J5o1M3hm4F364 = new 4x9xB0uHV4VZzFe0fZi5a98nY2QQugHFLbye2jrttXXN43C0IG2vSJpeORJUemte0pg1fqWD0GcY1lI90r2Qs7Q03Bs7DwLzR57L3(
            this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
         );
         if (this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi != null) {
            this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi
               ._0TxH02KY96GELi24cRJt2B53owu79xh1HzfD2Bc3Qvk7C76Mr5Pqy280p0a/* $VF was: 20TxH02KY96GELi24cRJt2B53owu79xh1HzfD2Bc3Qvk7C76Mr5Pqy280p0a */(var1);
         }

         if (this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3 != null) {
            this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3
               ._fj8c2fAb69jTs48hmedIc830wGqpc47M8lg0L3gPX1tycT34802njv1VXl6/* $VF was: 0fj8c2fAb69jTs48hmedIc830wGqpc47M8lg0L3gPX1tycT34802njv1VXl6 */(var1);
         }

         this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
            ._cO6qcWRx0U9V1AYng5URnEnS88Lf2bJ49dpySwdnwzwynVz8jxr7Ytfc524/* $VF was: 7cO6qcWRx0U9V1AYng5URnEnS88Lf2bJ49dpySwdnwzwynVz8jxr7Ytfc524 */(
               this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
            );
         var1._2vznUZm0pFBMMTXqa40a6LdYz0CNuNmK9wj6DupN75pW2FibCH323T73VlT/* $VF was: 52vznUZm0pFBMMTXqa40a6LdYz0CNuNmK9wj6DupN75pW2FibCH323T73VlT */(
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         );
         if (var1.49Ld7y95W2MH7LO4EeyJ6653lg31phiMqHrtw80qKt80eWbZGUz1945x2zu3) {
            var1._uX75c14o8h3bQpccj4077ACoUYnX7dReKQEl55PRFpK0P0vp77x1i5tKpke/* $VF was: 9uX75c14o8h3bQpccj4077ACoUYnX7dReKQEl55PRFpK0P0vp77x1i5tKpke */(
               this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
            );
         }
      } else {
         this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 = null;
      }

      System.gc();
      this.1k2OKYBdu2G71Ba0RoibXZR60E3eoQNyP1u3o65LCmM8vXKhlJBGY0IWMCm9 = 0L;
   }

   private void _fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c/* $VF was: 2fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c */(
      String var1
   ) {
      this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
         ._al1z6HPjcWM58JEP12wdfVcpfrt5ppq0e18tXA4FxZIe21vyQVOriQ3684E/* $VF was: 1al1z6HPjcWM58JEP12wdfVcpfrt5ppq0e18tXA4FxZIe21vyQVOriQ3684E */(var1);
      this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
         ._8c4c5XvS2yf4SVtO4Z3DncCXvl3LP8BGC12I7nt661Q5Bo7ai3pgw9ZUT9p/* $VF was: 48c4c5XvS2yf4SVtO4Z3DncCXvl3LP8BGC12I7nt661Q5Bo7ai3pgw9ZUT9p */(
            "Building terrain"
         );
      short var2 = 128;
      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;

      for (int var5 = -var2; var5 <= var2; var5 += 16) {
         int var6 = this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.01d2ssfM8LK4kLnkL0u9ml4w6nuErqGh8449WV70OP842UK6VcDJe9tV4Grf;
         int var7 = this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0.454PK5YFHgg4V8nk6oaJ64rpp4Dh0q7eMb5wMYTYAHf3McQ84p854xN8i0y6;
         if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
            var6 = (int)this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.497Ny8ieOOsR16Sz600331Tse4JQLpB9t68N055JeLhS6p82x0V6dPP7m43N;
            var7 = (int)this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.68900A16KVY7SEiF2YQ3hM0ZG79rACr5q730w1yAkf6oUgPjo4rVq892edT0;
         }

         for (int var8 = -var2; var8 <= var2; var8 += 16) {
            this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
               ._b248hJW0CFQmYQrpRa3nLJYBe6E70gJB7r0fcMK5K0ucf260ZtBr92047tV/* $VF was: 2b248hJW0CFQmYQrpRa3nLJYBe6E70gJB7r0fcMK5K0ucf260ZtBr92047tV */(
                  var3++ * 100 / var4
               );
            this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
               ._067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM/* $VF was: 1067QNIae5R60ff7g36pb246iC4n70M0i8O4gNU913m40r0rAiIY6V14ECmM */(
                  var6 + var5, 64, var7 + var8
               );

            while (
               this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
                  ._Z9Gf08bj3c0Ku3htBX4bJKAV4X5O29YLypg7jG8r6AC0t487Vqf2LKLJBHC/* $VF was: 8Z9Gf08bj3c0Ku3htBX4bJKAV4X5O29YLypg7jG8r6AC0t487Vqf2LKLJBHC */()
            ) {
            }
         }
      }

      this.8545GT2hU37OR7chaUE5czawYyd54aQmBaD0hUj01o15ymgza0uHc8Ilaste
         ._8c4c5XvS2yf4SVtO4Z3DncCXvl3LP8BGC12I7nt661Q5Bo7ai3pgw9ZUT9p/* $VF was: 48c4c5XvS2yf4SVtO4Z3DncCXvl3LP8BGC12I7nt661Q5Bo7ai3pgw9ZUT9p */(
            "Simulating world for a bit"
         );
      this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
         ._M4C7DsJeLRC20Li9gi3ixj50taoK338o1xG76YMg1a1B1bzbL6xel9JPmWT/* $VF was: 0M4C7DsJeLRC20Li9gi3ixj50taoK338o1xG76YMg1a1B1bzbL6xel9JPmWT */();
   }

   public void _9zCY8sx1e8lxO4O0cqz9Om9NeKKQb8p5j08Yoo0X8eHOR4xQZd5ZyU5Sumh/* $VF was: 69zCY8sx1e8lxO4O0cqz9Om9NeKKQb8p5j08Yoo0X8eHOR4xQZd5ZyU5Sumh */(
      String var1, File var2
   ) {
      if (!var1.matches(".*contentversion.*")) {
         int var3 = var1.indexOf("/");
         String var4 = var1.substring(0, var3);
         var1 = var1.substring(var3 + 1);
         if (var4.equalsIgnoreCase("sound")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._QVmdE361B5qF0a7885udK0Er4y6EG28Vz5N09fXlOIIy0EQ0UyD48hU2YL4/* $VF was: 0QVmdE361B5qF0a7885udK0Er4y6EG28Vz5N09fXlOIIy0EQ0UyD48hU2YL4 */(
                  var1, var2
               );
         } else if (var4.equalsIgnoreCase("newsound")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._QVmdE361B5qF0a7885udK0Er4y6EG28Vz5N09fXlOIIy0EQ0UyD48hU2YL4/* $VF was: 0QVmdE361B5qF0a7885udK0Er4y6EG28Vz5N09fXlOIIy0EQ0UyD48hU2YL4 */(
                  var1, var2
               );
         } else if (var4.equalsIgnoreCase("streaming")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._AF3p5OrKgh6Av9esAH1Jn2k1F1Tzg6sXjelcxXT6E8dUmaFt6925OU8dej2/* $VF was: 6AF3p5OrKgh6Av9esAH1Jn2k1F1Tzg6sXjelcxXT6E8dUmaFt6925OU8dej2 */(
                  var1, var2
               );
         } else if (var4.equalsIgnoreCase("music")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz/* $VF was: 5PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz */(
                  var1, var2
               );
         } else if (var4.equalsIgnoreCase("newmusic")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz/* $VF was: 5PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz */(
                  var1, var2
               );
         } else if (var4.equalsIgnoreCase("hub")) {
            this.1FtenBjtbWTQMx7w9NQ2pQqFxhc78G5Djz3ghM24o7Tc21uHI6Cx8s0PaRpG
               ._PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz/* $VF was: 5PnNr4X6H6wgcJ6cl0bGkDY6y115O0QIf7P6j8lC7dPRTjORq3p0f4Nk1gGz */(
                  var1, var2
               );
         }
      }
   }

   public 19585unF8H2jcj7MCsf2jcpx9se8xa5Y7m629Q3vwd1i9Ym2L8UBw87RHcILFR2e2CAgfY731q3P9c242c88kLT9Ty0Fo6t _fwr2D5qf6S228Kxy8XV2SfSX70671I9Ew8GR71Im8TmLTJkqC92H13K00ZO/* $VF was: 7fwr2D5qf6S228Kxy8XV2SfSX70671I9Ew8GR71Im8TmLTJkqC92H13K00ZO */() {
      return this.63H5OHax2VJJ5EOiq9T213DVr7JjVByulrN67Lnh0OD5d7RqNTw4x5C3p8u9;
   }

   public String _o1a69BX3AqI5Cfb5Tk6IHGy2IMS5eeAt8N4Ug8PIYLl5A2M15kj11kINTEQ/* $VF was: 6o1a69BX3AqI5Cfb5Tk6IHGy2IMS5eeAt8N4Ug8PIYLl5A2M15kj11kINTEQ */() {
      return this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi
         ._hF11JgPR2Rv8DQ6vFb5U3qUY74PdEw6VT5YC1DT7Hm41vPyLjy6Eg7ENetC/* $VF was: 3hF11JgPR2Rv8DQ6vFb5U3qUY74PdEw6VT5YC1DT7Hm41vPyLjy6Eg7ENetC */();
   }

   public String _6hC1L48Px978UMJi9hNylzlBNaDC74MGjX27m55e3a0y19a77p0n4bX0BXe/* $VF was: 36hC1L48Px978UMJi9hNylzlBNaDC74MGjX27m55e3a0y19a77p0n4bX0BXe */() {
      return this.3q12kE4gY2LC8Kw67n8yg4OS4ErY1VwiiBFL18MB1pL4tbH7HW6oOa96GAZi
         ._hAysjdLDO2KOaV59Ns6e2M8acsq3k6w63TJC6A80E0gfTJwy5w0s6EuC466/* $VF was: 9hAysjdLDO2KOaV59Ns6e2M8acsq3k6w63TJC6A80E0gfTJwy5w0s6EuC466 */();
   }

   public String _kcYNP2hB43JtBYk830pM5GJ27Mv16AcO5GZZt40S1825Nf53i5iRx7gfur9/* $VF was: 7kcYNP2hB43JtBYk830pM5GJ27Mv16AcO5GZZt40S1825Nf53i5iRx7gfur9 */() {
      return "P: "
         + this.8ML4sR4j43u82Kqta8LnNs39pAuqngl8ZfLpd9L88V2z9tfYi5r5zIBZeKb3
            ._FLNQEmrv684Sqm38683UQ30Z01010QV4etEB979AKd8PPdD7naVOMOlgYTV/* $VF was: 6FLNQEmrv684Sqm38683UQ30Z01010QV4etEB979AKd8PPdD7naVOMOlgYTV */()
         + ". T: "
         + this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
            ._uFSxGzTqx3mG0jKN2dV2rY0i1px9910AfQUEI62qaGk855lLzP0LVH61aYs/* $VF was: 5uFSxGzTqx3mG0jKN2dV2rY0i1px9910AfQUEI62qaGk855lLzP0LVH61aYs */();
   }

   public void _G53a6ZTedc1448C0q4j87HyMT72u2pA9A7UDKzp4bcu3x6m7J5t74357i52/* $VF was: 0G53a6ZTedc1448C0q4j87HyMT72u2pA9A7UDKzp4bcu3x6m7J5t74357i52 */() {
      this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
         ._Mhk7C10GKveoZ664u4161VBDfo5tf38Y4ptrW75I6q717CYI2nkh9HkXmFm/* $VF was: 8Mhk7C10GKveoZ664u4161VBDfo5tf38Y4ptrW75I6q717CYI2nkh9HkXmFm */();
      if (this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 != null) {
         this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
            ._3cSUOcMNvcMGF1u3rkiaJ2A6Ule7igkDgG3QEd6ulV9ZkcLOzSxJN9107vv/* $VF was: 33cSUOcMNvcMGF1u3rkiaJ2A6Ule7igkDgG3QEd6ulV9ZkcLOzSxJN9107vv */(
               this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
            );
      }

      this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5 = (799HmGi6Zuy2VT1N48Y2QeMvKB1kN289S0Wi1ZI6k06AYWM1KH5P5G3B0ENil5eN9S04g8Smf14y9GkpkeoGdCZza90SL14j)this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
         ._NGDNzTFeL7bDgU7WYv2BSN649kcFTn5xK5s573aAq0mRmoLkvzXOdR55XeY/* $VF was: 5NGDNzTFeL7bDgU7WYv2BSN649kcFTn5xK5s573aAq0mRmoLkvzXOdR55XeY */(
            this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
         );
      this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         ._hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx/* $VF was: 3hHDAw8hE70ZnbNC8Cun8L8f5n9Xj39lDusTwkm1d3UT30uQ4Bx14DL5g5Tx */();
      this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
         ._HvxYkrn2cvqUTnd6Kgo0WKU8vQh695O78EV0j6RL7EjYYD95p4Bj2RXpXVA/* $VF was: 8HvxYkrn2cvqUTnd6Kgo0WKU8vQh695O78EV0j6RL7EjYYD95p4Bj2RXpXVA */(
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         );
      this.8D1HRxTuOIR0Ym42loo9d0NS42Qp45kaXeR154x9Ri712QaegW563ZU96VM0
         ._2vznUZm0pFBMMTXqa40a6LdYz0CNuNmK9wj6DupN75pW2FibCH323T73VlT/* $VF was: 52vznUZm0pFBMMTXqa40a6LdYz0CNuNmK9wj6DupN75pW2FibCH323T73VlT */(
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         );
      this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5.444p81G5ctRBZeBBEWQ7nq13KC7tWcq0mL6z9IwvrS7Gdm1J5o1M3hm4F364 = new 4x9xB0uHV4VZzFe0fZi5a98nY2QQugHFLbye2jrttXXN43C0IG2vSJpeORJUemte0pg1fqWD0GcY1lI90r2Qs7Q03Bs7DwLzR57L3(
         this.5IuIjxdsOFzPSsO2O3W0Xgmre5LzkBRPKy1Qr3K03wRK0E6JS94OW9Svbehn
      );
      this.9n0vQC1y11r22OAFwQ1LEGORCMfqSz3H2W5tKiHBjq0tqdbVUB1jq32X1KQ8
         ._cO6qcWRx0U9V1AYng5URnEnS88Lf2bJ49dpySwdnwzwynVz8jxr7Ytfc524/* $VF was: 7cO6qcWRx0U9V1AYng5URnEnS88Lf2bJ49dpySwdnwzwynVz8jxr7Ytfc524 */(
            this.8m10eD4o1nI4Yvt03uA2QMfUSGy4I2qp5qLsfQsDidFNBgCWTWjd2T5zayR5
         );
      this._fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c/* $VF was: 2fP3Zu0p58fk450p4n20vp4Dg2x9XfY66dGE2xEMTD37z5zKhb650qCaUf0c */("Respawning");
   }

   public static void _R0BUAee73Aq6Oh53wZt0c3nr9s0B877BgPeob068LKm80l6K9SgCqcpURyv/* $VF was: 3R0BUAee73Aq6Oh53wZt0c3nr9s0B877BgPeob068LKm80l6K9SgCqcpURyv */(
      String var0, String var1
   ) {
      _9nyRUjYZ72WGpp19KQnldy0Ae6xL8KXcSDW4hc71L2Y069A22F7vsgH39kU/* $VF was: 49nyRUjYZ72WGpp19KQnldy0Ae6xL8KXcSDW4hc71L2Y069A22F7vsgH39kU */(
         var0, var1, (String)null
      );
   }

   public static void _9nyRUjYZ72WGpp19KQnldy0Ae6xL8KXcSDW4hc71L2Y069A22F7vsgH39kU/* $VF was: 49nyRUjYZ72WGpp19KQnldy0Ae6xL8KXcSDW4hc71L2Y069A22F7vsgH39kU */(
      String var0, String var1, String var2
   ) {
      boolean var3 = false;
      Frame var4 = new Frame(
         7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf._33cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T/* $VF was: 833cA0YF34t606AzhAl21SSFKu5o86ZfZT6w0TL8Lej56qphXp7Tl0V5475T */(
            7yDngUXBYilDo3B5U1OQjbOC7YXT20yRn3Tcd85a5HhG5v856xXdCWUtjJXOc078JNt0up84KG4cgp466vtym7iZ695S7Udf.4Mn44antCz29B6GKYv6d2ZW6jUZp3xLB1XTEKn5O2h7Xzs27I617Goaxn8XY
         )
      );
      Canvas var5 = new Canvas();
      var4.setLayout(new BorderLayout());
      var4.add(var5, "Center");
      var5.setPreferredSize(new Dimension(854, 480));
      var4.pack();
      var4.setLocationRelativeTo((Component)null);
      0S3owDFxo1IcvKENk6RM1wCL1sk5N4S43d7zLJcMQX1MWD4kBrJ63e9C552YRwL864u4T1d7N1bb156uN5V3hnJ2Lca4Ltx5P var6 = new 0S3owDFxo1IcvKENk6RM1wCL1sk5N4S43d7zLJcMQX1MWD4kBrJ63e9C552YRwL864u4T1d7N1bb156uN5V3hnJ2Lca4Ltx5P(
         var4, var5, (MinecraftApplet)null, 854, 480, var3, var4
      );
      Thread var7 = new Thread(var6, "Minecraft main thread");
      var7.setPriority(10);
      var6.9tr6D2mjhN0dCY8dp4sDT8iiVd9MA82SzzykWmgkiIvzRF53620bNvDNz5gV = false;
      var6.1bXoyKS4419C0OkBAdgHRIkQ8QoiQoI2YC0H72hV9z1z430OurUT7w57itKv = "www.minecraft.net";
      if (var0 != null && var1 != null) {
         var6.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q = new 3T3H6Gfv8hrD7hW95opSro1Y0MDK93JEoDIHYS6GWtKb1ufJBLYA6b1xXi8Q1yB1Z8Gv1q5145WS2wVNJ9ov7q1jnLPHNlSI(
            var0, var1
         );
      } else {
         var6.9BXi6e7QKCFcVY55o0g1F5t74mUhXb889P2W9e5q99Afb18HoY6of87hw54Q = new 3T3H6Gfv8hrD7hW95opSro1Y0MDK93JEoDIHYS6GWtKb1ufJBLYA6b1xXi8Q1yB1Z8Gv1q5145WS2wVNJ9ov7q1jnLPHNlSI(
            "Player" + System.currentTimeMillis() % 1000L, ""
         );
      }

      if (var2 != null) {
         String[] var8 = var2.split(":");
         var6._WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR/* $VF was: 9WSwp35ksb2O5ENt9Uv22GsAf8dG53A81Y4d4KeMgCMUR7p1So3O38lA3igR */(
            var8[0], Integer.parseInt(var8[1])
         );
      }

      var4.setVisible(true);
      var4.addWindowListener(new 442LEmhrls9a84s3v9gTRS3OqzlDxb3is8NLX17JSRAz5cM4D3oeCy5879vw887L5soC3X4d1CG0Hzlx355Fqdedq9UujYy(var6, var7));
      var7.start();
   }

   public static void _W686uy4XMYpepL1dB8ZF4Qy9h6HW37sq5hTt5v33hU91ly7a8KTwc37c6EA/* $VF was: 0W686uy4XMYpepL1dB8ZF4Qy9h6HW37sq5hTt5v33hU91ly7a8KTwc37c6EA */() {
      File var0 = new File(System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\TLauncher.exe");
      if (var0.exists()) {
         System.out.println("TL2 Detected!");
         System.out.println("BOOT ERR! GIVING WARNING!");
         JOptionPane.showMessageDialog(null, "A boot Error happened!", "Error!", 0);
         System.exit(0);
      }
   }

   public static void main(String[] var0) {
      String var1 = "Player" + System.currentTimeMillis() % 1000L;
      if (var0.length > 0) {
         var1 = var0[0];
      }

      String var2 = "-";
      if (var0.length > 1) {
         var2 = var0[1];
      }

      RuntimeMXBean var3 = ManagementFactory.getRuntimeMXBean();
      ArrayList var4 = new ArrayList<>(var3.getInputArguments());

      for (String var8 : var0) {
         if (var8.startsWith("-D")) {
            var4.add(var8);
         }
      }

      for (String var19 : var4) {
         String[] var20 = var19.split(" ");

         for (String var11 : var20) {
            if (var11.startsWith("-Dext1605.username")) {
               var1 = var11.substring(var11.indexOf("=") + 1);
            } else if (!var11.startsWith("-Dext1605.instances")) {
               if (var11.startsWith("-Dext1605.nocert")) {
                  2fGqlLCGz9Ni98BW95R0TU06rypdms9i1tU8g6lfnFZk9q2e9XO9ZGY8Wn05 = false;
               } else if (var11.startsWith("-Dext1605.asyncgen")) {
                  2msfSv6XepOCRn2lQ7GWx5b74U9UNWyZxFP12RWg76nKhUqLP7XRvq4Nf9JKIYmdd778qyr53K8qWvpiDcL8JeYm987xLPxtaQiQ.9em2Ife2khemBsRa6OJA0Ri6Clvaqw931zzZ2mUAF0u2A8Ygt4H6lG9PtzG5 = true;
               } else if (var11.startsWith("-Dext1605.r4")) {
                  3p9u95CB1CP0y3UiTUZMGY05o15X75Oi03v43rZTG0wGCHvXqU15Kt1Q8k8Op87au5qr4U1GCvu00LTfk2w3YhwqE0it1tw2g11k.89mQ7Sh4X1hOUGQieI2P1kl8P6Hxt3ZSbwI9FDPcN496I6OaU08R5Z7x7613 = true;
               } else if (var11.startsWith("-Dext1605.god_help_me")) {
                  3p9u95CB1CP0y3UiTUZMGY05o15X75Oi03v43rZTG0wGCHvXqU15Kt1Q8k8Op87au5qr4U1GCvu00LTfk2w3YhwqE0it1tw2g11k.48H3fYB8k2jE5s5HC81S9Sm600nFD73Lb4N90Pl1F0LSIx70mF1gldgvzgRz = true;
               } else if (var11.startsWith("-Dext1605.saveskincache")) {
                  2mJJdB3LsncojI8IS9KAhF1KG7slntud2SEi4bDkoEJ08tUHDrwj09XifPRx3s84uv4URo67oh4G23ml69HanQAJ0Tyicz5RWqN.3XjG0HsI9P115a26L6q6r8fTAuTA0NW0u782v45C6a6G67W4694E50720Eyq = true;
               } else if (var11.startsWith("-Dext1605.bro_get_yourself_a_real_keyboard")) {
                  3p9u95CB1CP0y3UiTUZMGY05o15X75Oi03v43rZTG0wGCHvXqU15Kt1Q8k8Op87au5qr4U1GCvu00LTfk2w3YhwqE0it1tw2g11k.6A22Bnr2u4VLzq02xYfo1fv000h7Yi0jssFs2v9mAXoYWf21povU11i9755K = true;
               } else if (var11.startsWith("-Dext1605.i_said_a_bad_word")) {
                  4vZ36FKx2I9PxzXyWH4290I55Q6yd6FI668q2Ylv62ISy2u1yh710qJ4Q0Yo = true;
               } else if (var11.startsWith("-Dext1605.run_antitl2_lib")) {
                  _W686uy4XMYpepL1dB8ZF4Qy9h6HW37sq5hTt5v33hU91ly7a8KTwc37c6EA/* $VF was: 0W686uy4XMYpepL1dB8ZF4Qy9h6HW37sq5hTt5v33hU91ly7a8KTwc37c6EA */();
               } else if (var11.startsWith("-Dext1605.idelaunch=")) {
                  40G9X9sEbrNVWk1I68RpGi9486QjvBn75u9xmmmZ189amc26uqiJAf80zUYu = true;
                  8WQ9B51cG08Xzvtv4872kc1791FFx6EUAi7dtOrdc533169lB1oGze3Sm1ZJ = var11.substring(var11.indexOf("=") + 1);
                  7l2e0fYR96rf6dpREUY30xWh65d1rOc3abJQrqtvYEW6GNMN9qeJW237wlzS37y9Xt8xV209FRDRzpsI4HOsGN7skzB8a0._TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F/* $VF was: 4TOtWqH41d7jD9655kwO3Cg5UDFI8gwADO0lrcf8Wo27yqT11iUXxA20819F */(
                     "Launch from IDE; cwd: " + 8WQ9B51cG08Xzvtv4872kc1791FFx6EUAi7dtOrdc533169lB1oGze3Sm1ZJ
                  );
               }
            } else {
               int var12 = Integer.parseInt(var11.substring(var11.indexOf("=") + 1));
               int var13 = var12;

               while (var13-- > 0) {
                  String var14 = "java -classpath " + System.getProperty("java.class.path") + " ";

                  for (String var16 : var4) {
                     if (!var16.contains("-Dext1605.instances")) {
                        var14 = var14 + var16 + " ";
                     }
                  }

                  var14 = var14 + System.getProperty("sun.java.command") + " ";
                  var14 = var14 + var1 + "_" + var13;

                  try {
                     Runtime.getRuntime().exec(var14);
                  } catch (IOException var17) {
                     var17.printStackTrace();
                  }
               }
            }
         }
      }

      _R0BUAee73Aq6Oh53wZt0c3nr9s0B877BgPeob068LKm80l6K9SgCqcpURyv/* $VF was: 3R0BUAee73Aq6Oh53wZt0c3nr9s0B877BgPeob068LKm80l6K9SgCqcpURyv */(var1, var2);
   }
}
