package net.minecraft.server;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MinecraftServer implements 7Kq8Ho3pSk36ZssE160899qs40e4AXkmhdNADuy27bR6zc1EYAd36xmb1B140S2GVKg7797K76cc27x7TSCY3o31A1X4TY2yD8SCM0, Runnable {
   public static Logger 3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq = Logger.getLogger("Minecraft");
   public static HashMap<String, Integer> 8DAY393EC5cEyOpBJ2YATje5fi1g4G6wd1453q6c60c7YdE6Sgcz9rYT88bg = new HashMap<>();
   public 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L 4VTH9nXSH3iW6f0o8121U3I2KPb85we7cqHlCq475Nln8L8ObCE40WgdHZ43;
   public 04ux2f139JzPNRN9xkAE5YE5fgUn09xTfmHbP0S4PuLAjutJ10b8H826k8024GmP3O0xgwQ9iLpC4er327YGex6FO628N9gzYd1 3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT;
   public 89Pn29DG2590vDVN4YKd61vubAL06JxM5Fm0Dt1a5CUM0rZfz59tr3W3W6qf5o6XosJL9BXbbyZUV7INofX1l92zjT58i9QwSW 2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2;
   public 7q21ajpG0Fo6Dt7T78SflV48X335FKda3PbLQikH3OJBN5V0E8DNsebNgA9a3d1S37d79N9hT47n1D953Mu0ldpVP4u940X 6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec;
   private boolean 9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9 = true;
   public boolean 4e9doDH1KSK02j5KiH971S3q4D0KACFejPc4c839KoX5457iW3Fv7hK8vFiw = false;
   int 02WVGa8pw642OlvqmB5657q7YBa731mHGaDV37abjuDT8jFakimHDZG0Zt8Z = 0;
   public String 7z0Gt4h8m8IWlvEPR4j9vB6R108km1kce409iWZ31EPVE1jNzTEVo3tWPtj1;
   public int 08m0PZLoFSx021r2BxaO4S5S5a4IaYI0QAthZK1hpAeR5qaVyBHen19S4U54;
   private List<302Lr6y62k7M188kBtc9Ru7tExv5M4f3Y16UT3rN96m83hyHmyb2x37dUkH61rYZhQ07b1M05q901b9YrahSMuhXJ82CZV5Pu> 6b3403vzS0iNppy18o2Sb5ixaCvaC5pYlQOX4F0gjx8263ycr5C235AX9Yc1 = new ArrayList<>();
   private List<28WcE2OXf4ur8zSNVL3SkdP0d1s54gJeGbq4zh422jc1Z40xhc82BmgnG9ZaFd7187W792NkaJNDX6wpDKOLXg017800z> 0Bq3uZYBVmQRxrz9b4D0wErD2JO99V4Cr6syF3F6TSiHlTP08C3JObysU1rw = Collections.synchronizedList(
      new ArrayList<>()
   );
   public 0HL4W5WFaUso27v22Sp2tspvv3j6QXXPtnYmKXNz9Qlrzhhu9d0k0WLDjY5q9h2gRn0e4dT44wu0t39IS77Mu7Y879ck5 7MFF00g85z23ncn003bSB4TsBSXo0rrnl4mLU9LUhE1lvbHT47T5ow2mHU6q;
   public boolean 7VMttey14aGT8m8YVK5QJwk2093vVTpP54Pq8L4rS7gEa4FQR7M2714eYt12;
   public static MinecraftServer 47T69Px11B2sK2WzDkgABw58BK6Bs11QIk6TmoU8Y89Fs8WTSdr6zO59qDz1;

   public MinecraftServer() {
      new 1dF4aiKrmNNbU8QA4Rq9XHat66Qu897JVoMVMJjVkL1F2RK1HI00058vu1GDIu74sBcdbM214n4nB42adZ3ObIfAY2nV6j0VGAu(this);
   }

   private boolean _DVsXi883cr5s3d5y8HVn96Z9R8YiL7rhBPgyu5Sls6FF1a2L0rI34PtbjHN/* $VF was: 8DVsXi883cr5s3d5y8HVn96Z9R8YiL7rhBPgyu5Sls6FF1a2L0rI34PtbjHN */() throws IOException {
      80hlmSqNRFgH7pyW89iKnb7p0j7P1eGub7vfc6W15l6922uX86p7W5I0Sn5H9WS2HU2dyZY1E27vqq6czf58bGD3OA4PQhiy3O4UhC var1 = new 80hlmSqNRFgH7pyW89iKnb7p0j7P1eGub7vfc6W15l6922uX86p7W5I0Sn5H9WS2HU2dyZY1E27vqq6czf58bGD3OA4PQhiy3O4UhC(
         this
      );
      var1.setDaemon(true);
      var1.start();
      2ns3YCRSY82Ze9G4Xoznnc2lqhSjR29mGC2yArd5W2tpxeI2u2o2z92Tvm66l0QyoA6OFAQQYHy91VUk9r5944QmzD5LZY1YNnW0Jc._PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu/* $VF was: 9PTTJ3Ah35U03JjV405Sr0UbC01a6UdiIf5Oc61wx2C5SK34gpf9xFe2Flmu */();
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Starting minecraft server version 0.2.1-16.05-R4");
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("**** NOT ENOUGH RAM!");
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning(
            "To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\""
         );
      }

      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Loading properties");
      this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT = new 04ux2f139JzPNRN9xkAE5YE5fgUn09xTfmHbP0S4PuLAjutJ10b8H826k8024GmP3O0xgwQ9iLpC4er327YGex6FO628N9gzYd1(
         new File("server.properties")
      );
      String var2 = this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
         ._ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR/* $VF was: 6ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR */(
            "server-ip", ""
         );
      this.7VMttey14aGT8m8YVK5QJwk2093vVTpP54Pq8L4rS7gEa4FQR7M2714eYt12 = this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
         ._0lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN/* $VF was: 30lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN */(
            "online-mode", false
         );
      InetAddress var3 = null;
      if (var2.length() > 0) {
         var3 = InetAddress.getByName(var2);
      }

      int var4 = this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
         ._4WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP/* $VF was: 34WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP */(
            "server-port", 25565
         );
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Starting Minecraft server on " + (var2.length() == 0 ? "*" : var2) + ":" + var4);

      try {
         this.4VTH9nXSH3iW6f0o8121U3I2KPb85we7cqHlCq475Nln8L8ObCE40WgdHZ43 = new 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L(
            this, var3, var4
         );
      } catch (IOException var6) {
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("**** FAILED TO BIND TO PORT!");
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.log(Level.WARNING, "The exception was: " + var6.toString());
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.7VMttey14aGT8m8YVK5QJwk2093vVTpP54Pq8L4rS7gEa4FQR7M2714eYt12) {
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("The server will make no attempt to authenticate usernames. Beware.");
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("To change this, set \"online-mode\" to \"true\" in the server.settings file.");
      }

      1CAyBz2E0DOL2941A7YNSk0e8NbGZ8I5Uuf8Yja5Dvv903s5cw8T07J5iMny81DVIm403Hr0q2nV2IfC9pya0qhroPqBAj6mXiq8._4K26W59q4v74lhIsoUv4V87rs4U03so6Z4wQ0Coy41en87E4nn2743n5PU1/* $VF was: 44K26W59q4v74lhIsoUv4V87rs4U03so6Z4wQ0Coy41en87E4nn2743n5PU1 */();
      this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec = new 7q21ajpG0Fo6Dt7T78SflV48X335FKda3PbLQikH3OJBN5V0E8DNsebNgA9a3d1S37d79N9hT47n1D953Mu0ldpVP4u940X(
         this
      );
      this.7MFF00g85z23ncn003bSB4TsBSXo0rrnl4mLU9LUhE1lvbHT47T5ow2mHU6q = new 0HL4W5WFaUso27v22Sp2tspvv3j6QXXPtnYmKXNz9Qlrzhhu9d0k0WLDjY5q9h2gRn0e4dT44wu0t39IS77Mu7Y879ck5(
         this
      );
      String var5 = this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
         ._ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR/* $VF was: 6ukm3afod7p0Bn44PG18jG9RxD3e3950nY1mm0vSCP2C4jrs887WJ2PEwhoR */(
            "level-name", "world"
         );
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Preparing level \"" + var5 + "\"");
      this._423Kq8km6M1lUU7Zmqoa2503wlGP8umkEsJtyk488ndyI967925N2xf6gX0/* $VF was: 2423Kq8km6M1lUU7Zmqoa2503wlGP8umkEsJtyk488ndyI967925N2xf6gX0 */(var5);
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Done! For help, type \"help\" or \"?\"");
      return true;
   }

   private void _423Kq8km6M1lUU7Zmqoa2503wlGP8umkEsJtyk488ndyI967925N2xf6gX0/* $VF was: 2423Kq8km6M1lUU7Zmqoa2503wlGP8umkEsJtyk488ndyI967925N2xf6gX0 */(
      String var1
   ) {
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Preparing start region");
      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2 = new 89Pn29DG2590vDVN4YKd61vubAL06JxM5Fm0Dt1a5CUM0rZfz59tr3W3W6qf5o6XosJL9BXbbyZUV7INofX1l92zjT58i9QwSW(
         new File("."),
         var1,
         this.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
            ._0lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN/* $VF was: 30lmK5h4k1IVLPmwCIvLDxw478AnSjaYyxnThvppaUnwPACZdF9WLe0qpTtN */(
               "monsters", false
            )
      );
      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._c3BtKesyg1Rg080KVxAQTvKCFNs4g6N3609oxjvXQ89508Zt4L36bm4Nj93/* $VF was: 6c3BtKesyg1Rg080KVxAQTvKCFNs4g6N3609oxjvXQ89508Zt4L36bm4Nj93 */(
            new 4JTi4tpDp4VbWiyZr1KJp7QrX1tTVk90KxvJ8foJ22OJ0q9MT69hgdeF85K35R6fp1wCYX3i8vQPSR3zb2Fu92zZLCu0494sZ(this)
         );
      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.9clWg64sbC1eC1Stl2yA88YjB80h88yA67ZJ4w7769YawMJ0vu1160r1EcXU = 1;
      this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
         ._mKEx7X5QPIQTV9DB8RKXDsm9ZDzRxwZ31Oy8AnAZZ2p6j3KueqlI27oGK70/* $VF was: 5mKEx7X5QPIQTV9DB8RKXDsm9ZDzRxwZ31Oy8AnAZZ2p6j3KueqlI27oGK70 */(
            this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         );
      byte var2 = 10;

      for (int var3 = -var2; var3 <= var2; var3++) {
         this._3TEiKGO4Y9If5I3y5MYt6kI4Y0Kbdq94nWzVq662d09NzAmaVWk23StS4N8/* $VF was: 03TEiKGO4Y9If5I3y5MYt6kI4Y0Kbdq94nWzVq662d09NzAmaVWk23StS4N8 */(
            "Preparing spawn area", (var3 + var2) * 100 / (var2 + var2 + 1)
         );

         for (int var4 = -var2; var4 <= var2; var4++) {
            if (!this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9) {
               return;
            }

            this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
               .258nWDLx6G601r4N27TCfi75fnI513ndOr0Ml93L0SfRjBKRei82gISphfMJ
               ._c9Wqxy8TmJbhzyp5LgOUT1ExpF109kt7iL30fpNF28023YWbDKNoBB4L9gR/* $VF was: 7c9Wqxy8TmJbhzyp5LgOUT1ExpF109kt7iL30fpNF28023YWbDKNoBB4L9gR */(
                  (this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.5q3TSudd3JAEUd3hC0rlkaBka660Sh6x5R2tI2n52g0eE0J6HWavR5123BY5 >> 4) + var3,
                  (this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.9U9Nz3112ZP49CHVF49wPBC9Ck19wGqfZc5Co3lm06JNWCS12C4e89SjNsCa >> 4) + var4
               );
         }
      }

      this._55d6U50oUIeZ5XiehH7IrRwx1x54rSkLu8UK76f2TF48SmL5IK4Jx8w1uC7/* $VF was: 055d6U50oUIeZ5XiehH7IrRwx1x54rSkLu8UK76f2TF48SmL5IK4Jx8w1uC7 */();
   }

   private void _3TEiKGO4Y9If5I3y5MYt6kI4Y0Kbdq94nWzVq662d09NzAmaVWk23StS4N8/* $VF was: 03TEiKGO4Y9If5I3y5MYt6kI4Y0Kbdq94nWzVq662d09NzAmaVWk23StS4N8 */(
      String var1, int var2
   ) {
      this.7z0Gt4h8m8IWlvEPR4j9vB6R108km1kce409iWZ31EPVE1jNzTEVo3tWPtj1 = var1;
      this.08m0PZLoFSx021r2BxaO4S5S5a4IaYI0QAthZK1hpAeR5qaVyBHen19S4U54 = var2;
      System.out.println(var1 + ": " + var2 + "%");
   }

   private void _55d6U50oUIeZ5XiehH7IrRwx1x54rSkLu8UK76f2TF48SmL5IK4Jx8w1uC7/* $VF was: 055d6U50oUIeZ5XiehH7IrRwx1x54rSkLu8UK76f2TF48SmL5IK4Jx8w1uC7 */() {
      this.7z0Gt4h8m8IWlvEPR4j9vB6R108km1kce409iWZ31EPVE1jNzTEVo3tWPtj1 = null;
      this.08m0PZLoFSx021r2BxaO4S5S5a4IaYI0QAthZK1hpAeR5qaVyBHen19S4U54 = 0;
   }

   private void _K30b04q71tMh224PMbn15WsAHDA5D9zWIN2PPJWzk0dXY283Xy52uPsUV2l/* $VF was: 3K30b04q71tMh224PMbn15WsAHDA5D9zWIN2PPJWzk0dXY283Xy52uPsUV2l */() {
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Saving chunks");
      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._HtcY5vD3MIEO9735pSrVtWLI5YQGd22qGfqU78RkQt4tN4Pcy9O70vnj65C/* $VF was: 3HtcY5vD3MIEO9735pSrVtWLI5YQGd22qGfqU78RkQt4tN4Pcy9O70vnj65C */(true, null);
   }

   private void _g5lpkSG88gUrjeiyX73b9VDoe8nSrE9kSP37X9239I75lwdZ956W498WN8j/* $VF was: 9g5lpkSG88gUrjeiyX73b9VDoe8nSrE9kSP37X9239I75lwdZ956W498WN8j */() {
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Stop from");
      new Exception().printStackTrace();
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Stopping server");
      if (this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec != null) {
         this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
            ._2jFgEwsBPhwxqtp43U3w20eV9J5KlLfgdo3631MwYGVI77elMO08C4l7q71/* $VF was: 52jFgEwsBPhwxqtp43U3w20eV9J5KlLfgdo3631MwYGVI77elMO08C4l7q71 */();
      }

      if (this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2 != null) {
         this._K30b04q71tMh224PMbn15WsAHDA5D9zWIN2PPJWzk0dXY283Xy52uPsUV2l/* $VF was: 3K30b04q71tMh224PMbn15WsAHDA5D9zWIN2PPJWzk0dXY283Xy52uPsUV2l */();
      }
   }

   public void _pO91HnWrjrjOOo585691SJZP3mKk46Pv3JCgQ4GqleQEx8rKsKRpH61r9c5/* $VF was: 8pO91HnWrjrjOOo585691SJZP3mKk46Pv3JCgQ4GqleQEx8rKsKRpH61r9c5 */() {
      this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9 = false;
   }

   @Override
   public void run() {
      try {
         this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9 = true;
         if (this._DVsXi883cr5s3d5y8HVn96Z9R8YiL7rhBPgyu5Sls6FF1a2L0rI34PtbjHN/* $VF was: 8DVsXi883cr5s3d5y8HVn96Z9R8YiL7rhBPgyu5Sls6FF1a2L0rI34PtbjHN */()) {
            long var1 = System.currentTimeMillis();
            long var3 = 0L;

            while (this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9) {
               long var5 = System.currentTimeMillis();
               long var7 = var5 - var1;
               if (var7 > 2000L) {
                  3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning(
                     "Can't keep up! Did the system time change, or is the server overloaded?"
                  );
                  var7 = 2000L;
               }

               if (var7 < 0L) {
                  3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.warning("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var3 += var7;
               var1 = var5;

               while (var3 > 50L) {
                  var3 -= 50L;
                  this._d7UCP2wVV837x3qQktV45V8R03v6TiLD4UqHot9Cta11PR9uM923fRMSG8B/* $VF was: 6d7UCP2wVV837x3qQktV45V8R03v6TiLD4UqHot9Cta11PR9uM923fRMSG8B */();
               }

               Thread.sleep(1L);
            }
         } else {
            while (this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9) {
               this._d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk/* $VF was: 7d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk */();

               try {
                  Thread.sleep(10L);
               } catch (InterruptedException var10) {
                  var10.printStackTrace();
               }
            }
         }
      } catch (Exception var11) {
         var11.printStackTrace();
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.log(Level.SEVERE, "Unexpected exception", var11);

         while (this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9) {
            this._d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk/* $VF was: 7d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk */();

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var9) {
               var9.printStackTrace();
            }
         }
      }

      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info(
         this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9 + ", " + this.4e9doDH1KSK02j5KiH971S3q4D0KACFejPc4c839KoX5457iW3Fv7hK8vFiw
      );
      this._g5lpkSG88gUrjeiyX73b9VDoe8nSrE9kSP37X9239I75lwdZ956W498WN8j/* $VF was: 9g5lpkSG88gUrjeiyX73b9VDoe8nSrE9kSP37X9239I75lwdZ956W498WN8j */();
      this.4e9doDH1KSK02j5KiH971S3q4D0KACFejPc4c839KoX5457iW3Fv7hK8vFiw = true;
      System.exit(2);
   }

   private void _d7UCP2wVV837x3qQktV45V8R03v6TiLD4UqHot9Cta11PR9uM923fRMSG8B/* $VF was: 6d7UCP2wVV837x3qQktV45V8R03v6TiLD4UqHot9Cta11PR9uM923fRMSG8B */() throws IOException {
      ArrayList var1 = new ArrayList();

      for (String var3 : 8DAY393EC5cEyOpBJ2YATje5fi1g4G6wd1453q6c60c7YdE6Sgcz9rYT88bg.keySet()) {
         int var4 = 8DAY393EC5cEyOpBJ2YATje5fi1g4G6wd1453q6c60c7YdE6Sgcz9rYT88bg.get(var3);
         if (var4 > 0) {
            8DAY393EC5cEyOpBJ2YATje5fi1g4G6wd1453q6c60c7YdE6Sgcz9rYT88bg.put(var3, var4 - 1);
         } else {
            var1.add(var3);
         }
      }

      for (int var6 = 0; var6 < var1.size(); var6++) {
         8DAY393EC5cEyOpBJ2YATje5fi1g4G6wd1453q6c60c7YdE6Sgcz9rYT88bg.remove(var1.get(var6));
      }

      2J2W0U7Tilg0exygIpqB6o05SJ0wu8OKaO4Tn548u3BGK4R5unNMe9R3BK253Gu7nEe598GWfRx1KudkH16fM5flhl0x50kt3y._c52u5tiPDHaZ7YR6Nz9L31g179O0DS3KsUT2AC2e7BE5BkR0ePdT7H61wtv/* $VF was: 1c52u5tiPDHaZ7YR6Nz9L31g179O0DS3KsUT2AC2e7BE5BkR0ePdT7H61wtv */();
      1967nXU1oUBfh3ia22863MXiRp18PL3dq4Pi7a8E022ZzJFvtkU84g3b5vO8TwDs5j8k2Gz3qT6Kl735c8bZk3e4qBg30jpR9._89zyL10cl1VuG9h847sXCRM3ZaK0p7aPvIFq294coPSWxj9bE61M97KSUjt/* $VF was: 989zyL10cl1VuG9h847sXCRM3ZaK0p7aPvIFq294coPSWxj9bE61M97KSUjt */();
      this.02WVGa8pw642OlvqmB5657q7YBa731mHGaDV37abjuDT8jFakimHDZG0Zt8Z++;
      if (this.02WVGa8pw642OlvqmB5657q7YBa731mHGaDV37abjuDT8jFakimHDZG0Zt8Z % 20 == 0) {
         this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
            ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
               new 2b455CbG8BUR886x9kPMJ3FWEyRtLbi2W7iogZnJi37Wow3zRM0OMEjF0kdIjtSSJxV6sMfKCBKu99g1bLzPw4tRjGsI(
                  this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.1yQ1oWQad4gDAonvCHt0w671JAYDVJ6X41XarEO15r8KUeKkI11y3IRbfK8K
               )
            );
      }

      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._WTXAPu213lxG8Q25HmRr2jF3gaWtzbN74O5Xh8Qy222fzIvd7L6Uxs77BEm/* $VF was: 0WTXAPu213lxG8Q25HmRr2jF3gaWtzbN74O5Xh8Qy222fzIvd7L6Uxs77BEm */();

      while (
         this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
            ._6Bf6HnKF8Q6gS990P8jPzDBSrQGXZa8QkFA8qeVWeoJJA7sAr1724eyVsh5/* $VF was: 06Bf6HnKF8Q6gS990P8jPzDBSrQGXZa8QkFA8qeVWeoJJA7sAr1724eyVsh5 */()
      ) {
      }

      this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._Z1C4vOnX6d6996SJV8BBE0eUFcDp1q1InMyhh1oB090yXvtu8245JK9Hc37/* $VF was: 5Z1C4vOnX6d6996SJV8BBE0eUFcDp1q1InMyhh1oB090yXvtu8245JK9Hc37 */();
      this.4VTH9nXSH3iW6f0o8121U3I2KPb85we7cqHlCq475Nln8L8ObCE40WgdHZ43
         ._qSqZ9L1r01N31TFoa8Zv2A1V3q3mr36V0kuz3InK2u23ne9ye2358g92FlO/* $VF was: 2qSqZ9L1r01N31TFoa8Zv2A1V3q3mr36V0kuz3InK2u23ne9ye2358g92FlO */();
      this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
         ._yDQm94noJyLH4S8y9tw0ir3w7jij2594q1r2B6X3GhEXM90E23J41f02Ott/* $VF was: 8yDQm94noJyLH4S8y9tw0ir3w7jij2594q1r2B6X3GhEXM90E23J41f02Ott */();
      this.7MFF00g85z23ncn003bSB4TsBSXo0rrnl4mLU9LUhE1lvbHT47T5ow2mHU6q
         ._Fir5d4CSJ1S7RnUyeJA8o3343z25d1VE5kiphZDRXM4OM6bV7yfsqg5C621/* $VF was: 8Fir5d4CSJ1S7RnUyeJA8o3343z25d1VE5kiphZDRXM4OM6bV7yfsqg5C621 */();

      for (int var7 = 0; var7 < this.6b3403vzS0iNppy18o2Sb5ixaCvaC5pYlQOX4F0gjx8263ycr5C235AX9Yc1.size(); var7++) {
         this.6b3403vzS0iNppy18o2Sb5ixaCvaC5pYlQOX4F0gjx8263ycr5C235AX9Yc1
            .get(var7)
            ._87n65CXksqY8RguvL2ux8Hy2jBxS5qCLPXq6Q0g512Xhvi06s1q4Kg0s1u0/* $VF was: 987n65CXksqY8RguvL2ux8Hy2jBxS5qCLPXq6Q0g512Xhvi06s1q4Kg0s1u0 */();
      }

      try {
         this._d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk/* $VF was: 7d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk */();
      } catch (Exception var5) {
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.log(Level.WARNING, "Unexpected exception while parsing console command", var5);
      }
   }

   public void _0n4JGs731KDGijo2uzzGl0CXlVIf3m89409b60FUk4mSp46Iyi27A9j746M/* $VF was: 00n4JGs731KDGijo2uzzGl0CXlVIf3m89409b60FUk4mSp46Iyi27A9j746M */(
      String var1, 7Kq8Ho3pSk36ZssE160899qs40e4AXkmhdNADuy27bR6zc1EYAd36xmb1B140S2GVKg7797K76cc27x7TSCY3o31A1X4TY2yD8SCM0 var2
   ) {
      this.0Bq3uZYBVmQRxrz9b4D0wErD2JO99V4Cr6syF3F6TSiHlTP08C3JObysU1rw
         .add(new 28WcE2OXf4ur8zSNVL3SkdP0d1s54gJeGbq4zh422jc1Z40xhc82BmgnG9ZaFd7187W792NkaJNDX6wpDKOLXg017800z(var1, var2));
   }

   public void _d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk/* $VF was: 7d7WUotTpb0j52IQ3rDS66e347xiUS1uUH1EMJU4Tcs58G0y1rN962QVcefk */() {
      while (this.0Bq3uZYBVmQRxrz9b4D0wErD2JO99V4Cr6syF3F6TSiHlTP08C3JObysU1rw.size() > 0) {
         28WcE2OXf4ur8zSNVL3SkdP0d1s54gJeGbq4zh422jc1Z40xhc82BmgnG9ZaFd7187W792NkaJNDX6wpDKOLXg017800z var1 = this.0Bq3uZYBVmQRxrz9b4D0wErD2JO99V4Cr6syF3F6TSiHlTP08C3JObysU1rw
            .remove(0);
         String var2 = var1.2K42z70CDPyb4kt0e1i1P79yOhoc2xWR41aLD8eDPsb2J0en7EmGakUliF1m;
         7Kq8Ho3pSk36ZssE160899qs40e4AXkmhdNADuy27bR6zc1EYAd36xmb1B140S2GVKg7797K76cc27x7TSCY3o31A1X4TY2yD8SCM0 var3 = var1.4gR4JtR8L1QMZN27skQkp2yo9W6Rl7kjBWA334srIwlzD9l8f1ib4m633t89;
         String var4 = var3._KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2/* $VF was: 3KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2 */();
         if (var2.toLowerCase().startsWith("help") || var2.toLowerCase().startsWith("?")) {
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "To run the server without a gui, start it like this:"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   java -Xmx1024M -Xms1024M -jar minecraft_server.jar nogui"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "Console commands:"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   help  or  ?               shows this message"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   kick <player>             removes a player from the server"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   ban <player>              bans a player from the server"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   pardon <player>           pardons a banned player so that they can connect again"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   ban-ip <ip>               bans an IP address from the server"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   pardon-ip <ip>            pardons a banned IP address so that they can connect again"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   op <player>               turns a player into an op"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   deop <player>             removes op status from a player"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   tp <player1> <player2>    moves one player to the same location as another player"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   give <player> <id> [num]  gives a player a resource"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   tell <player> <message>   sends a private message to a player"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   stop                      gracefully stops the server"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   save-all                  forces a server-wide level save"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   save-off                  disables terrain saving (useful for backup scripts)"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   save-on                   re-enables terrain saving"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   list                      lists all currently connected players"
            );
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "   say <message>             broadcasts a message to all players"
            );
         } else if (var2.toLowerCase().startsWith("list")) {
            var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
               "Connected players: "
                  + this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                     ._E9K3N56M46GpUfX6WU0ztkDi8X1Odj20hGG6og41NF0fhfdUu8hb0ZfB660/* $VF was: 4E9K3N56M46GpUfX6WU0ztkDi8X1Odj20hGG6og41NF0fhfdUu8hb0ZfB660 */()
            );
         } else if (var2.toLowerCase().startsWith("stop")) {
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Stopping the server.."
            );
            this.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9 = false;
         } else if (var2.toLowerCase().startsWith("save-all")) {
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Forcing save.."
            );
            this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
               ._HtcY5vD3MIEO9735pSrVtWLI5YQGd22qGfqU78RkQt4tN4Pcy9O70vnj65C/* $VF was: 3HtcY5vD3MIEO9735pSrVtWLI5YQGd22qGfqU78RkQt4tN4Pcy9O70vnj65C */(
                  true, null
               );
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Save complete."
            );
         } else if (var2.toLowerCase().startsWith("save-off")) {
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Disabling level saving.."
            );
            this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.76Dit9W6Ihog5LDKyaX4jU6iZF1G2uT48r9QCBRRolllsr4SZ4n96fCl277o = true;
         } else if (var2.toLowerCase().startsWith("save-on")) {
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Enabling level saving.."
            );
            this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.76Dit9W6Ihog5LDKyaX4jU6iZF1G2uT48r9QCBRRolllsr4SZ4n96fCl277o = false;
         } else if (var2.toLowerCase().startsWith("time ")) {
            try {
               this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.1yQ1oWQad4gDAonvCHt0w671JAYDVJ6X41XarEO15r8KUeKkI11y3IRbfK8K = Long.parseLong(
                  var2.substring(5)
               );
               this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
                  var4,
                  "Setting time to "
                     + this.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2.1yQ1oWQad4gDAonvCHt0w671JAYDVJ6X41XarEO15r8KUeKkI11y3IRbfK8K
               );
            } catch (Exception var12) {
               this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
                  var4, "Invalid time value"
               );
            }
         } else if (var2.toLowerCase().startsWith("playmus ")) {
            String var25 = var2.substring(8);
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 7KeO2sp8Bm49845S3JWbv7ck29Zkfju6B0K7PN0NcceJU4l7p7xQ4sXfgJ11Ilb883YN7J89o8HSbLw0828UTzldEqG8W(var25)
               );
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Playing music for all players: " + var25
            );
         } else if (var2.toLowerCase().startsWith("sysmsg ")) {
            String var24 = var2.substring(7);
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 0zK2G3a8r6m4XrXUU9AV8VrFCC8KJqwKAlXE9wJ1vJcZ49w2UaMCcgj4R7oyFCg69n6MMHu8nRuYFNw0670CKiz9J6hP(var24, 10000)
               );
         } else if (var2.toLowerCase().startsWith("amoung")) {
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL(
                     "§d" + var4 + " HAS AN IMPORTANT ANNOUNCEMENT TO MAKE"
                  )
               );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d<" + var4 + ">   ####")
               );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d<" + var4 + "> ###   #")
               );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d<" + var4 + "> ######")
               );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d<" + var4 + ">  ## ##")
               );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§dTHANK YOU FOR YOUR ATTENTION")
               );
         } else if (var2.toLowerCase().startsWith("op ")) {
            String var23 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._pYmA360zAYOaPh3cNCaASe6Ju3h0RwuR5j14l48rtjOaYWsvc66BNIb35Ty/* $VF was: 0pYmA360zAYOaPh3cNCaASe6Ju3h0RwuR5j14l48rtjOaYWsvc66BNIb35Ty */(var23);
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Opping " + var23
            );
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK/* $VF was: 6261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK */(
                  var23, "§eYou are now op!"
               );
         } else if (var2.toLowerCase().startsWith("deop ")) {
            String var22 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._r1Jn29zc788u5ZrCedgds2P07A0sSCuHFEE6Wd9287073oVezzs5q8tGoJS/* $VF was: 3r1Jn29zc788u5ZrCedgds2P07A0sSCuHFEE6Wd9287073oVezzs5q8tGoJS */(var22);
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK/* $VF was: 6261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK */(
                  var22, "§eYou are no longer op!"
               );
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "De-opping " + var22
            );
         } else if (var2.toLowerCase().startsWith("ban-ip ")) {
            String var21 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._nc2Y5rp4uI37Duz7RDGTg6b88S40G3W9H87sAQOjHiyydb218qh249HmB45/* $VF was: 0nc2Y5rp4uI37Duz7RDGTg6b88S40G3W9H87sAQOjHiyydb218qh249HmB45 */(var21);
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Banning ip " + var21
            );
         } else if (var2.toLowerCase().startsWith("pardon-ip ")) {
            String var20 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._EycbuSPs550gZFX6UPi32MV0uTBD41R8AdsC6GH4VOjALhlAVp6kqk21E69/* $VF was: 7EycbuSPs550gZFX6UPi32MV0uTBD41R8AdsC6GH4VOjALhlAVp6kqk21E69 */(var20);
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Pardoning ip " + var20
            );
         } else if (var2.toLowerCase().startsWith("ban ")) {
            String var19 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._rCaF0hMZpT08QWe5h6LjrR7r03408L21S72w73H751CLac54YNO8Cw5Rd91/* $VF was: 0rCaF0hMZpT08QWe5h6LjrR7r03408L21S72w73H751CLac54YNO8Cw5Rd91 */(var19);
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Banning " + var19
            );
            4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var27 = this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(var19);
            if (var27 != null) {
               var27.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
                  ._7JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z/* $VF was: 07JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z */(
                     "Banned by admin"
                  );
            }
         } else if (var2.toLowerCase().startsWith("pardon ")) {
            String var18 = var2.substring(var2.indexOf(" ")).trim();
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Eqy3W1pRSCjzl95zIg1x7NBULmHV1JBxKkG7Ssfs3tfTg1dvh9LGl5eD3xn/* $VF was: 7Eqy3W1pRSCjzl95zIg1x7NBULmHV1JBxKkG7Ssfs3tfTg1dvh9LGl5eD3xn */(var18);
            this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
               var4, "Pardoning " + var18
            );
         } else if (var2.toLowerCase().startsWith("kick ")) {
            String var5 = var2.substring(var2.indexOf(" ")).trim();
            4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var26 = null;

            for (int var30 = 0;
               var30 < this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size();
               var30++
            ) {
               4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var32 = this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                  .7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM
                  .get(var30);
               if (var32.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v.equalsIgnoreCase(var5)) {
                  var26 = var32;
               }
            }

            if (var26 != null) {
               var26.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
                  ._7JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z/* $VF was: 07JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z */(
                     "Kicked by admin"
                  );
               this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
                  var4, "Kicking " + var26.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v
               );
            } else {
               var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                  "Can't find user " + var5 + ". No kick."
               );
            }
         } else if (var2.toLowerCase().startsWith("tp ")) {
            String[] var29 = var2.split(" ");
            if (var29.length == 3) {
               4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var6 = this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                  ._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(
                     var29[1]
                  );
               4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var31 = this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                  ._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(
                     var29[2]
                  );
               if (var6 == null) {
                  var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                     "Can't find user " + var29[1] + ". No tp."
                  );
               } else if (var31 == null) {
                  var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                     "Can't find user " + var29[2] + ". No tp."
                  );
               } else {
                  var6.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
                     ._pCc4ZW1MFt7Wf2AjWls9cd83Ra4Qqkd9kGoPd1qSQ5YZJjTCQQ6YccmdSDA/* $VF was: 0pCc4ZW1MFt7Wf2AjWls9cd83Ra4Qqkd9kGoPd1qSQ5YZJjTCQQ6YccmdSDA */(
                        var31.8BKn5O693h7F1gA8181SGlf7Scz51qLsKq7174s22o5TY09247melakNLfD3,
                        var31.3zvsz8gL3ub8LDNct7Hj1xie72SaOqi5iYxVlxSkCXxxxWBwHP9cs22s95ED,
                        var31.89Z2Hn6coWE24275g54RXJPI8ghNqC3562O1sHVFWWu2ce45JPiMZ4EIiUqw,
                        var31.5bjP62l3un7D1T2Cbc00YUO3RxrWoQU2Ja2vSqBCgLp5Gr2zl21wGy4JLSXk,
                        var31.2gA93w044SoC300q47Y50SIbwV5nFWBB3u9PgB8bBoPkoJ91c6X65YeGk160
                     );
                  this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
                     var4, "Teleporting " + var29[1] + " to " + var29[2] + "."
                  );
               }
            } else {
               var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                  "Syntax error, please provice a source and a target."
               );
            }
         } else if (var2.toLowerCase().startsWith("give ")) {
            String[] var28 = var2.split(" ");
            if (var28.length != 3 && var28.length != 4) {
               return;
            }

            String var9 = var28[1];
            4bE7i086262qwjp6QEY1r1yuto22Fp3Xn52F58kFCnV7D8cLa2uMYDXdkI6s4N9ntBa78r1l25xChxG3O50vo640qP02 var8 = this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(var9);
            if (var8 != null) {
               try {
                  int var10 = Integer.parseInt(var28[2]);
                  if (922HppOiy3oKliIpY4oyxno015ujjkydL0s9mCyYXRS3fAO25A8370f4R06nh9MNUr09axO4L1826Mjo4b650zoI99HzUt1.1PEZyJX065hYs4uf56wQNE8HN86xGjQhm0jj25K9v1IRBcLLnrjV2523PdlU[var10]
                     != null) {
                     this._w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
                        var4, "Giving " + var8.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v + " some " + var10
                     );
                     int var11 = 1;
                     if (var28.length > 3) {
                        var11 = this._O3bvF6N0LsUnyM8Iy8WCHSMTcAbSO6q11Y9teK7Ztb35ltHr89F48j3340b/* $VF was: 7O3bvF6N0LsUnyM8Iy8WCHSMTcAbSO6q11Y9teK7Ztb35ltHr89F48j3340b */(
                           var28[3], 1
                        );
                     }

                     if (var11 < 1) {
                        var11 = 1;
                     }

                     if (var11 > 64) {
                        var11 = 64;
                     }

                     var8._mJA390Q0XW2gtvdL4k381vo4EUcnVJGO8iyPKVm7o3XoVDDYEp1z30MVmi7/* $VF was: 0mJA390Q0XW2gtvdL4k381vo4EUcnVJGO8iyPKVm7o3XoVDDYEp1z30MVmi7 */(
                        new 3rOUCuPQIDJDe64mcxB6VA9TS733I0lL3LsSuARV02xx2mCq7zj73j07H7rB8T0Nq2YUK6f15Azvi1Hw0J1wbH5SInS4wGWL(var10, var11)
                     );
                  } else {
                     var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                        "There's no item with id " + var10
                     );
                  }
               } catch (NumberFormatException var13) {
                  var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                     "There's no item with id " + var28[2]
                  );
               }
            } else {
               var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                  "Can't find user " + var9
               );
            }
         } else if (var2.toLowerCase().startsWith("say ")) {
            var2 = var2.substring(var2.indexOf(" ")).trim();
            3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("[" + var4 + "] " + var2);
            this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
               ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                  new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d[Server] " + var2)
               );
         } else if (var2.toLowerCase().startsWith("tell ")) {
            String[] var7 = var2.split(" ");
            if (var7.length >= 3) {
               var2 = var2.substring(var2.indexOf(" ")).trim();
               var2 = var2.substring(var2.indexOf(" ")).trim();
               3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("[" + var4 + "->" + var7[1] + "] " + var2);
               this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                  ._Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
                     new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL("§d[Server] " + var2)
                  );
               var2 = "§7" + var4 + " whispers " + var2;
               3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info(var2);
               if (!this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
                  ._jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7/* $VF was: 3jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7 */(
                     var7[1], new 4k4NA4H58j68Sao61LJ5Rw62i5Vd247v1Z2H53h300B1wgcyUV8t1YZP0P7bi1F394C4E461pca8zueMsc0Rh6oR6p50Gy4Z4JL(var2)
                  )) {
                  var3._LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
                     "There's no player by that name online."
                  );
               }
            }
         } else {
            3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info("Unknown console command. Type \"help\" for help.");
         }
      }
   }

   private void _w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue/* $VF was: 2w73i72l47H30G7k5Fddd5l8HlWbX665Yy88dxU43885IgSnXJsDgWloG2Ue */(
      String var1, String var2
   ) {
      String var3 = var1 + ": " + var2;
      this.6msOEGoiUk6b5fD741opbo5QV55H1V4230FFJpNLNSPzX1gyT1NkVX25U3Ec
         ._joA9wqQk88k8gnE8L0F47uf9h4cjmH3jH5rqt949tzXM1B0I0Lsq078X37R/* $VF was: 8joA9wqQk88k8gnE8L0F47uf9h4cjmH3jH5rqt949tzXM1B0I0Lsq078X37R */(
            "§7(" + var3 + ")"
         );
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info(var3);
   }

   private int _O3bvF6N0LsUnyM8Iy8WCHSMTcAbSO6q11Y9teK7Ztb35ltHr89F48j3340b/* $VF was: 7O3bvF6N0LsUnyM8Iy8WCHSMTcAbSO6q11Y9teK7Ztb35ltHr89F48j3340b */(
      String var1, int var2
   ) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
         return var2;
      }
   }

   public void _g06Zo89WpqFEiJ2gjFRQw8VU0RbwzaQ6a47W72s8518ko541PvLZXV7O108/* $VF was: 4g06Zo89WpqFEiJ2gjFRQw8VU0RbwzaQ6a47W72s8518ko541PvLZXV7O108 */(
      302Lr6y62k7M188kBtc9Ru7tExv5M4f3Y16UT3rN96m83hyHmyb2x37dUkH61rYZhQ07b1M05q901b9YrahSMuhXJ82CZV5Pu var1
   ) {
      this.6b3403vzS0iNppy18o2Sb5ixaCvaC5pYlQOX4F0gjx8263ycr5C235AX9Yc1.add(var1);
   }

   public static void main(String[] var0) {
      try {
         47T69Px11B2sK2WzDkgABw58BK6Bs11QIk6TmoU8Y89Fs8WTSdr6zO59qDz1 = new MinecraftServer();
         if (!GraphicsEnvironment.isHeadless() && (var0.length <= 0 || !var0[0].equals("nogui"))) {
            3X5i5Q9H6jHqn8Z1YN0S54rHVZxQ9l6ALxWf2439uwB1909nA5Qygr0A8aEsKhp77FcDHN1mTKZK90975aoz3BWv13v7HErY2gqLL._p9Qx9hFIjzdm0d2B8c6W1z5H1PMME22GU84cHxnJ0Rjb66Mj43aGdA3n415/* $VF was: 6p9Qx9hFIjzdm0d2B8c6W1z5H1PMME22GU84cHxnJ0Rjb66Mj43aGdA3n415 */(
               47T69Px11B2sK2WzDkgABw58BK6Bs11QIk6TmoU8Y89Fs8WTSdr6zO59qDz1
            );
         }

         new 410D2j9o33hWreX63yZUaM3xR6g99Wvv7yTq5eoREX3CbDRqCGg51KIYq9maMP3Qh59B1sqxyTTO2f9QRH2RJWMIajWahnkq1(
               "Server thread", 47T69Px11B2sK2WzDkgABw58BK6Bs11QIk6TmoU8Y89Fs8WTSdr6zO59qDz1
            )
            .start();
      } catch (Exception var2) {
         3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.log(Level.SEVERE, "Failed to start the minecraft server", var2);
      }
   }

   public File _s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P/* $VF was: 8s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P */(
      String var1
   ) {
      return new File(var1);
   }

   @Override
   public void _LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji/* $VF was: 4LU3x3eoA5wj0r30G6jaPQcUf6R44TwJbRck63U6pDsND697n03HPVHjO9ji */(
      String var1
   ) {
      3pKe8zjqb9HS7092GG7uK7c3kh33XuM3A7wJ64N39ie7Y78nKGOz040j9Aoq.info(var1);
   }

   @Override
   public String _KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2/* $VF was: 3KG990B8BH78rt4ZPwE0XzXu2Vx0Oem9Vz34EnpsiX7Y9v6ofT2wlBDFdjB2 */() {
      return "CONSOLE";
   }

   public static boolean _Xp71NCetA9Tks82L0o281iF44M0bpN30QWv32Ar1b1SZFseoAyRlIHI1T5B/* $VF was: 3Xp71NCetA9Tks82L0o281iF44M0bpN30QWv32Ar1b1SZFseoAyRlIHI1T5B */(
      MinecraftServer var0
   ) {
      return var0.9RKRr1kYXi729w3EhJ57jOJv0Q98i9cxdcY4jb2nV8ug72Es0f2Ow8yL0LK9;
   }
}
