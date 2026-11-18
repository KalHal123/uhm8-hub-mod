package x;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class Class0303 {
   public static Logger 0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs = Logger.getLogger("Minecraft");
   public List<Class0190> 7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM = new ArrayList<>();
   private MinecraftServer 5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC;
   private Class0162 5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB;
   private int 3zUChPBNOp60lknVo4xP471c437c7uYFhT0FF66zpmk5ikGsSsE2sgWO5pX5;
   private Set<String> 9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw = new HashSet<>();
   private Set<String> 5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A = new HashSet<>();
   private Set<String> 17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK = new HashSet<>();
   private File 1aUPNll0Djh52Qa6z2E4645bp7rWg51u100s5rDrzGW1JWZC68rO1818u58p;
   private File 1Ruy948h13Ku0hZbJP1RcTwV8p7Pfe3Zcw668TRE8U2Xv5IiiA62L05npC7k;
   private File 6XBAdtTo23s3w03Fq0Ct8H1FKh1P3jz0otTI53L4QB4Un0meLJ3rxrnpqQ5z;
   private Class0188 8Qrl9498Fd38aH2rVh5d1hB820EQ9A09Qq6F8O2j89BH15hx58HKCw2qAY90;

   public Class0303(MinecraftServer var1) {
      this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC = var1;
      this.1aUPNll0Djh52Qa6z2E4645bp7rWg51u100s5rDrzGW1JWZC68rO1818u58p = var1._s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P/* $VF was: 8s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P */(
         "banned-players.txt"
      );
      this.1Ruy948h13Ku0hZbJP1RcTwV8p7Pfe3Zcw668TRE8U2Xv5IiiA62L05npC7k = var1._s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P/* $VF was: 8s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P */(
         "banned-ips.txt"
      );
      this.6XBAdtTo23s3w03Fq0Ct8H1FKh1P3jz0otTI53L4QB4Un0meLJ3rxrnpqQ5z = var1._s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P/* $VF was: 8s62Noo2qU4Qoxk4z25d39WZzu2jHQ001h7n7N8hE6IdUE35eXX4CpRc3F5P */(
         "ops.txt"
      );
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB = new Class0162(var1);
      this.3zUChPBNOp60lknVo4xP471c437c7uYFhT0FF66zpmk5ikGsSsE2sgWO5pX5 = var1.3Y5EuG26pLxzHT5Im1H12n0vm9pF46o6QQXnpWflDf3kq0pqMTG03M15E9hT
         ._4WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP/* $VF was: 34WxRg828fLLt5Ochqx2o508Z46ZEIKk602W1y8244lZ16Bod1EAdho5b2oP */(
            "max-players", 20
         );
      this._3O1kA69B392iahHRVL27vMgW6AkLEiChcGBrhUNaUWWg7zea04eBWyBogw3/* $VF was: 83O1kA69B392iahHRVL27vMgW6AkLEiChcGBrhUNaUWWg7zea04eBWyBogw3 */();
      this._O6BnrmXP4xHrevie1V8yHSs0536gE4C6Uf2r132Y2ezLL32zv8ZnodH01qo/* $VF was: 7O6BnrmXP4xHrevie1V8yHSs0536gE4C6Uf2r132Y2ezLL32zv8ZnodH01qo */();
      this._AXJwZGm3Xkfm7OkM479158366QbbIhEuH61GFNSmp240KbuOzQLraSt2HAT/* $VF was: 0AXJwZGm3Xkfm7OkM479158366QbbIhEuH61GFNSmp240KbuOzQLraSt2HAT */();
      this._V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD/* $VF was: 6V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD */();
      this._B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD/* $VF was: 0B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD */();
      this._S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a/* $VF was: 6S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a */();
   }

   public void _mKEx7X5QPIQTV9DB8RKXDsm9ZDzRxwZ31Oy8AnAZZ2p6j3KueqlI27oGK70/* $VF was: 5mKEx7X5QPIQTV9DB8RKXDsm9ZDzRxwZ31Oy8AnAZZ2p6j3KueqlI27oGK70 */(
      Class0328 var1
   ) {
      this.8Qrl9498Fd38aH2rVh5d1hB820EQ9A09Qq6F8O2j89BH15hx58HKCw2qAY90 = new Class0188(
         new File(var1.1BXTea90D7OoJelsZ1515WxOOTAP7KV3p0XMHLMY6DLkoBd2xk5Zx1GKxd0I, "players")
      );
   }

   public int _35AjIl1E96tUXyi04b1C98eVqjaVd573lw2X7o4l283zUtQv3293tXq86PQ/* $VF was: 235AjIl1E96tUXyi04b1C98eVqjaVd573lw2X7o4l283zUtQv3293tXq86PQ */() {
      return this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._7Ncb96r0x69pQgew4cW2m3p5169c6V4UlaW0u0ZTqEKKu6a2YaXuZ3S6Wdj/* $VF was: 37Ncb96r0x69pQgew4cW2m3p5169c6V4UlaW0u0ZTqEKKu6a2YaXuZ3S6Wdj */();
   }

   public void _XvnU5qWZq05i82hE08A8iuxgXDx89P0Pe18Mcm3FU391kbo1M7SH7PO0nJU/* $VF was: 6XvnU5qWZq05i82hE08A8iuxgXDx89P0Pe18Mcm3FU391kbo1M7SH7PO0nJU */(
      Class0190 var1
   ) {
      this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.add(var1);
      this.8Qrl9498Fd38aH2rVh5d1hB820EQ9A09Qq6F8O2j89BH15hx58HKCw2qAY90
         ._8t5g3qql8ImprA5qemuFQZ8HN1sD1x515h7MFJ0n77UaBMjte0930zEcius/* $VF was: 68t5g3qql8ImprA5qemuFQZ8HN1sD1x515h7MFJ0n77UaBMjte0930zEcius */(var1);
      this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC
         .2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         .258nWDLx6G601r4N27TCfi75fnI513ndOr0Ml93L0SfRjBKRei82gISphfMJ
         ._c9Wqxy8TmJbhzyp5LgOUT1ExpF109kt7iL30fpNF28023YWbDKNoBB4L9gR/* $VF was: 7c9Wqxy8TmJbhzyp5LgOUT1ExpF109kt7iL30fpNF28023YWbDKNoBB4L9gR */(
            (int)var1.8BKn5O693h7F1gA8181SGlf7Scz51qLsKq7174s22o5TY09247melakNLfD3 >> 4,
            (int)var1.89Z2Hn6coWE24275g54RXJPI8ghNqC3562O1sHVFWWu2ce45JPiMZ4EIiUqw >> 4
         );

      while (
         this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC
               .2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
               ._aqeL002mqWfxCH2b85yD3lq5Jl1RIzxr7WCD0uBnAp4jKcYNY7m736S82q0/* $VF was: 8aqeL002mqWfxCH2b85yD3lq5Jl1RIzxr7WCD0uBnAp4jKcYNY7m736S82q0 */(
                  var1, var1.0j85F3WG620Xx50myMAI9bURM7RP02QHmXPD4GIj6G9SyYoAU0X6zl0i0ef8
               )
               .size()
            != 0
      ) {
         var1._53r02rcD5c4tmbvagzlvvVRDcj719w8V78PyYik6gtP2af5MqDGrJ5VUez6/* $VF was: 753r02rcD5c4tmbvagzlvvVRDcj719w8V78PyYik6gtP2af5MqDGrJ5VUez6 */(
            var1.8BKn5O693h7F1gA8181SGlf7Scz51qLsKq7174s22o5TY09247melakNLfD3,
            var1.3zvsz8gL3ub8LDNct7Hj1xie72SaOqi5iYxVlxSkCXxxxWBwHP9cs22s95ED + 1.0,
            var1.89Z2Hn6coWE24275g54RXJPI8ghNqC3562O1sHVFWWu2ce45JPiMZ4EIiUqw
         );
      }

      this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC
         .2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._P59Oe5Acfu13q3XXMe18Qs36mqpvoe154m4bKo38Q0i321FvLU9pDY5IfO2/* $VF was: 2P59Oe5Acfu13q3XXMe18Qs36mqpvoe154m4bKo38Q0i321FvLU9pDY5IfO2 */(var1);
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._du3Q2T02uudWOO11vuk78KhCg9LXdho8G6Ms24EHa6L4O1c01M9S3td4PJ3/* $VF was: 6du3Q2T02uudWOO11vuk78KhCg9LXdho8G6Ms24EHa6L4O1c01M9S3td4PJ3 */(var1);
   }

   public void _3vT8DM2w0eI8t1B6dt85GkTOY5bF5zCLOdNP08CH4eBhwAE26093dbspWb1/* $VF was: 23vT8DM2w0eI8t1B6dt85GkTOY5bF5zCLOdNP08CH4eBhwAE26093dbspWb1 */(
      Class0190 var1
   ) {
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._SbT82LRXOI2boxV6408qDY5h01sPTJUsBY5f10EYL86bu35kUoe10B9LrRE/* $VF was: 4SbT82LRXOI2boxV6408qDY5h01sPTJUsBY5f10EYL86bu35kUoe10B9LrRE */(var1);
   }

   public void _hXXEZaMCC10A4mBvTwvDo6XAjZIMNF4WPLXxZaQH06rx8cP1TC0sutjL2TE/* $VF was: 9hXXEZaMCC10A4mBvTwvDo6XAjZIMNF4WPLXxZaQH06rx8cP1TC0sutjL2TE */(
      Class0190 var1
   ) {
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._s975Jy5MQh4XtJ9cB341T1A036J5ZpPf08qy017e1mTA6PkmT2KYBQ1zIcw/* $VF was: 5s975Jy5MQh4XtJ9cB341T1A036J5ZpPf08qy017e1mTA6PkmT2KYBQ1zIcw */(var1);
      this.8Qrl9498Fd38aH2rVh5d1hB820EQ9A09Qq6F8O2j89BH15hx58HKCw2qAY90
         ._q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38/* $VF was: 6q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38 */(var1);
      this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC
         .2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
         ._EZlyhhrti9LHkXoH06LikLmuJbK9UdEJ65omjoK97q9fpsOCKu2EAGY1ifJ/* $VF was: 6EZlyhhrti9LHkXoH06LikLmuJbK9UdEJ65omjoK97q9fpsOCKu2EAGY1ifJ */(var1);
      this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.remove(var1);
   }

   public Class0190 _Rnp5hVT9HCgcuTt9b3uu7K9ky6RkkBxUTx87bT4LF1u41mIJp4BVvrgoQ1w/* $VF was: 9Rnp5hVT9HCgcuTt9b3uu7K9ky6RkkBxUTx87bT4LF1u41mIJp4BVvrgoQ1w */(
      Class0073 var1, String var2, String var3
   ) {
      if (this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw.contains(var2.trim().toLowerCase())) {
         var1._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
            "You are banned from this server!"
         );
         return null;
      }

      String var4 = var1.4wz49m7T316cURdsmP2g3fS7gjwkjJ2TwlNaua5v1by9ZW026mZn4d5L3jY1
         ._X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu/* $VF was: 7X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu */()
         .toString();
      var4 = var4.substring(var4.indexOf("/") + 1);
      var4 = var4.substring(0, var4.indexOf(":"));
      if (this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A.contains(var4)) {
         var1._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
            "Your IP address is banned from this server!"
         );
         return null;
      }

      if (this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size() >= this.3zUChPBNOp60lknVo4xP471c437c7uYFhT0FF66zpmk5ikGsSsE2sgWO5pX5) {
         var1._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
            "The server is full!"
         );
         return null;
      }

      for (int var5 = 0; var5 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var5++) {
         Class0190 var6 = this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var5);
         if (var6.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v.equalsIgnoreCase(var2)) {
            var6.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
               ._7JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z/* $VF was: 07JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z */(
                  "You logged in from another location"
               );
         }
      }

      return new Class0190(
         this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC,
         this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2,
         var2,
         new Class0371(this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC.2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2)
      );
   }

   public void _yDQm94noJyLH4S8y9tw0ir3w7jij2594q1r2B6X3GhEXM90E23J41f02Ott/* $VF was: 8yDQm94noJyLH4S8y9tw0ir3w7jij2594q1r2B6X3GhEXM90E23J41f02Ott */() throws IOException {
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._3GY33WK0gIs986tXAQy4gNGu5458XNauybkSF84xWXLXv7x0GOtM6AE8A2R/* $VF was: 73GY33WK0gIs986tXAQy4gNGu5458XNauybkSF84xWXLXv7x0GOtM6AE8A2R */();
   }

   public void _7T85n5h24V6q0vv3GL0uez91981CO4Ng8zmQVllX7lp9P5T3MYOL7J7lMYZ/* $VF was: 27T85n5h24V6q0vv3GL0uez91981CO4Ng8zmQVllX7lp9P5T3MYOL7J7lMYZ */(
      int var1, int var2, int var3
   ) {
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._CGJxWT0OrtNuOsF4pD95mNFxXYf19nl9x1XD3tHW3wnhH3Cg1O7zGlw5lz8/* $VF was: 4CGJxWT0OrtNuOsF4pD95mNFxXYf19nl9x1XD3tHW3wnhH3Cg1O7zGlw5lz8 */(
            var1, var2, var3
         );
   }

   public void _Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0/* $VF was: 6Yv70gwAB5PWJ0KtzjOYgF26d0lu3byvZ12BSeX767VdM5g896VxwA3Ru4X0 */(
      Class0321 var1
   ) {
      for (int var2 = 0; var2 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var2++) {
         Class0190 var3 = this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var2);
         var3.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
            ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(var1);
      }
   }

   public String _E9K3N56M46GpUfX6WU0ztkDi8X1Odj20hGG6og41NF0fhfdUu8hb0ZfB660/* $VF was: 4E9K3N56M46GpUfX6WU0ztkDi8X1Odj20hGG6og41NF0fhfdUu8hb0ZfB660 */() {
      String var1 = "";

      for (int var2 = 0; var2 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var2++) {
         if (var2 > 0) {
            var1 = var1 + ", ";
         }

         var1 = var1 + this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var2).96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v;
      }

      return var1;
   }

   public void _rCaF0hMZpT08QWe5h6LjrR7r03408L21S72w73H751CLac54YNO8Cw5Rd91/* $VF was: 0rCaF0hMZpT08QWe5h6LjrR7r03408L21S72w73H751CLac54YNO8Cw5Rd91 */(
      String var1
   ) {
      this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw.add(var1.toLowerCase());
      this._V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD/* $VF was: 6V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD */();
   }

   public void _Eqy3W1pRSCjzl95zIg1x7NBULmHV1JBxKkG7Ssfs3tfTg1dvh9LGl5eD3xn/* $VF was: 7Eqy3W1pRSCjzl95zIg1x7NBULmHV1JBxKkG7Ssfs3tfTg1dvh9LGl5eD3xn */(
      String var1
   ) {
      this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw.remove(var1.toLowerCase());
      this._V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD/* $VF was: 6V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD */();
   }

   private void _3O1kA69B392iahHRVL27vMgW6AkLEiChcGBrhUNaUWWg7zea04eBWyBogw3/* $VF was: 83O1kA69B392iahHRVL27vMgW6AkLEiChcGBrhUNaUWWg7zea04eBWyBogw3 */() {
      try {
         this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.1aUPNll0Djh52Qa6z2E4645bp7rWg51u100s5rDrzGW1JWZC68rO1818u58p));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to load ban list: " + var3);
      }
   }

   private void _V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD/* $VF was: 6V8dyFw9m0L5e6XiCJU49selO3z51i1uEcdW8Wa4AOkG07kgBamKpAjuF7jD */() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.1aUPNll0Djh52Qa6z2E4645bp7rWg51u100s5rDrzGW1JWZC68rO1818u58p, false));

         for (String var3 : this.9wgg6oBo5ByMFDylJawlje3Qwz60Zm5Hzn28W1kQKNRe594712OWi4K9HPqw) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to save ban list: " + var4);
      }
   }

   public void _nc2Y5rp4uI37Duz7RDGTg6b88S40G3W9H87sAQOjHiyydb218qh249HmB45/* $VF was: 0nc2Y5rp4uI37Duz7RDGTg6b88S40G3W9H87sAQOjHiyydb218qh249HmB45 */(
      String var1
   ) {
      this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A.add(var1.toLowerCase());
      this._B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD/* $VF was: 0B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD */();
   }

   public void _EycbuSPs550gZFX6UPi32MV0uTBD41R8AdsC6GH4VOjALhlAVp6kqk21E69/* $VF was: 7EycbuSPs550gZFX6UPi32MV0uTBD41R8AdsC6GH4VOjALhlAVp6kqk21E69 */(
      String var1
   ) {
      this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A.remove(var1.toLowerCase());
      this._B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD/* $VF was: 0B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD */();
   }

   private void _O6BnrmXP4xHrevie1V8yHSs0536gE4C6Uf2r132Y2ezLL32zv8ZnodH01qo/* $VF was: 7O6BnrmXP4xHrevie1V8yHSs0536gE4C6Uf2r132Y2ezLL32zv8ZnodH01qo */() {
      try {
         this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.1Ruy948h13Ku0hZbJP1RcTwV8p7Pfe3Zcw668TRE8U2Xv5IiiA62L05npC7k));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to load ip ban list: " + var3);
      }
   }

   private void _B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD/* $VF was: 0B6L3hVFhlAyL35Wotb47WTm4N4RKbRb5e1H7anxbT74vP85FsSyHwwBYJGD */() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.1Ruy948h13Ku0hZbJP1RcTwV8p7Pfe3Zcw668TRE8U2Xv5IiiA62L05npC7k, false));

         for (String var3 : this.5L1a58ZDXr8r4DzON4W9Wm78bd87vjfx98pZ6vqB6m8IESR1zZj9B6iQt87A) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to save ip ban list: " + var4);
      }
   }

   public void _pYmA360zAYOaPh3cNCaASe6Ju3h0RwuR5j14l48rtjOaYWsvc66BNIb35Ty/* $VF was: 0pYmA360zAYOaPh3cNCaASe6Ju3h0RwuR5j14l48rtjOaYWsvc66BNIb35Ty */(
      String var1
   ) {
      this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK.add(var1.toLowerCase());
      this._S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a/* $VF was: 6S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a */();
   }

   public void _r1Jn29zc788u5ZrCedgds2P07A0sSCuHFEE6Wd9287073oVezzs5q8tGoJS/* $VF was: 3r1Jn29zc788u5ZrCedgds2P07A0sSCuHFEE6Wd9287073oVezzs5q8tGoJS */(
      String var1
   ) {
      this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK.remove(var1.toLowerCase());
      this._S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a/* $VF was: 6S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a */();
   }

   private void _AXJwZGm3Xkfm7OkM479158366QbbIhEuH61GFNSmp240KbuOzQLraSt2HAT/* $VF was: 0AXJwZGm3Xkfm7OkM479158366QbbIhEuH61GFNSmp240KbuOzQLraSt2HAT */() {
      try {
         this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK.clear();
         BufferedReader var1 = new BufferedReader(new FileReader(this.6XBAdtTo23s3w03Fq0Ct8H1FKh1P3jz0otTI53L4QB4Un0meLJ3rxrnpqQ5z));
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK.add(var2.trim().toLowerCase());
         }

         var1.close();
      } catch (Exception var3) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to load ip ban list: " + var3);
      }
   }

   private void _S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a/* $VF was: 6S3Eqm9jsXfcgZ7fpYB1n3adln2F4p3dXyzj2BYw8LyVmg82FvdN68m31l0a */() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.6XBAdtTo23s3w03Fq0Ct8H1FKh1P3jz0otTI53L4QB4Un0meLJ3rxrnpqQ5z, false));

         for (String var3 : this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK) {
            var1.println(var3);
         }

         var1.close();
      } catch (Exception var4) {
         0x6ow0j0AEfQ4Xfo8Q5L5a8Zp8MnRtpVAcj4TyPt6jTn10MZCzH49Ih3T7gs.warning("Failed to save ip ban list: " + var4);
      }
   }

   public boolean _6G1uPk5cwAj4c8oiZiQlKZ6fWv0V1J83RdF6N31xOqPl50vRtx58BH4ZC8U/* $VF was: 86G1uPk5cwAj4c8oiZiQlKZ6fWv0V1J83RdF6N31xOqPl50vRtx58BH4ZC8U */(
      String var1
   ) {
      return this.17D1mN8bXSWcEhvxHmIhACSV8TL15SMQU59D24759BHsR047ouRceaOI00dK.contains(var1.trim().toLowerCase());
   }

   public Class0190 _3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(
      String var1
   ) {
      for (int var2 = 0; var2 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var2++) {
         Class0190 var3 = this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var2);
         if (var3.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v.equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void _261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK/* $VF was: 6261IcYC4mnz5RmKRqbfx7ii0EHpwEuLF1fmL60t8EjB78EZdQH8888087LK */(
      String var1, String var2
   ) {
      Class0190 var3 = this._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(
         var1
      );
      if (var3 != null) {
         var3.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
            ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(
               new Class0199(var2)
            );
      }
   }

   public void _joA9wqQk88k8gnE8L0F47uf9h4cjmH3jH5rqt949tzXM1B0I0Lsq078X37R/* $VF was: 8joA9wqQk88k8gnE8L0F47uf9h4cjmH3jH5rqt949tzXM1B0I0Lsq078X37R */(
      String var1
   ) {
      Class0199 var2 = new Class0199(var1);

      for (int var3 = 0; var3 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var3++) {
         Class0190 var4 = this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var3);
         if (this._6G1uPk5cwAj4c8oiZiQlKZ6fWv0V1J83RdF6N31xOqPl50vRtx58BH4ZC8U/* $VF was: 86G1uPk5cwAj4c8oiZiQlKZ6fWv0V1J83RdF6N31xOqPl50vRtx58BH4ZC8U */(
            var4.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v
         )) {
            var4.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
               ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(var2);
         }
      }
   }

   public boolean _jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7/* $VF was: 3jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7 */(
      String var1, Class0321 var2
   ) {
      Class0190 var3 = this._3NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3/* $VF was: 43NZa29NqpHxt4DEOSg5jztwyVR5bG3qJifgQGf1xOBYjqU0eapz7xY2FNj3 */(
         var1
      );
      if (var3 != null) {
         var3.8zpaX7J1YQIutC77pBs76pF7B2n2a2HPm4gA0t11Pf09l3wxK6cFHJB0ctF4
            ._Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1/* $VF was: 5Zg9fUahJZIHP8KiDVcb8eO04OMcxNG7445VlSUXa4VsRl7nAjk69z9THsa1 */(var2);
         return true;
      } else {
         return false;
      }
   }

   public void _u19ArmiHUTbT2wTW077j4NXFUyyQd65nCCG3q0EDQ7hms12SxX19Mr06MQH/* $VF was: 9u19ArmiHUTbT2wTW077j4NXFUyyQd65nCCG3q0EDQ7hms12SxX19Mr06MQH */(
      int var1, int var2, int var3, Class0065 var4
   ) {
      this.5Uh95C34PgHTq77wk12ebhIPy9H8UnxO7O971RMrKir0czs4rZM84r81heOB
         ._2qt042wVmdOFvq7nXrEy0l2rBQ0O1dV4RHlqvLiLSqWF24nbBpbxuTkSkI4/* $VF was: 12qt042wVmdOFvq7nXrEy0l2rBQ0O1dV4RHlqvLiLSqWF24nbBpbxuTkSkI4 */(
            new Class0384(var1, var2, var3, var4), var1, var2, var3
         );
   }

   public void _2jFgEwsBPhwxqtp43U3w20eV9J5KlLfgdo3631MwYGVI77elMO08C4l7q71/* $VF was: 52jFgEwsBPhwxqtp43U3w20eV9J5KlLfgdo3631MwYGVI77elMO08C4l7q71 */() {
      for (int var1 = 0; var1 < this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.size(); var1++) {
         this.8Qrl9498Fd38aH2rVh5d1hB820EQ9A09Qq6F8O2j89BH15hx58HKCw2qAY90
            ._q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38/* $VF was: 6q8433DFoPMuv5ud7QIBGOn6Qd94T6KK8Vg9my6Aoc1eb875o7NL98088T38 */(
               this.7L74MHjF1w100GbFmm7549775eMe59z5JSdHuGuGVvDO1BI86OZ79764vwvM.get(var1)
            );
      }
   }

   public void _9pl0QQx7RRBVy4UnQ096NE0lKNB0QpE26Og5gn7269TQV76YH9Eoe3ORb8P/* $VF was: 69pl0QQx7RRBVy4UnQ096NE0lKNB0QpE26Og5gn7269TQV76YH9Eoe3ORb8P */(
      Class0321 var1, double var2, double var4, double var6, int var8
   ) {
      ArrayList var9 = new ArrayList<>(
         this.5Tvw096tF3r5l73LCWQbOd7sAh92uIDG87H8Pb4zC6zEej29Gw64y6a05iKC
            .2nBpV0v9VERdSD6plmg6zt33T93I49Njq2komcTi92jPckQUM8ZA1wq8j5E2
            ._voS1o8QN14NRxk07e59mPH75lS956t8peciTK4mtOhCJQRK6T09qc8eH646/* $VF was: 4voS1o8QN14NRxk07e59mPH75lS956t8peciTK4mtOhCJQRK6T09qc8eH646 */(
               Class0190.class,
               Class0092._DfdIDMD7OLt0h5X2Z9or7iqM54tahlW9b5AZiVqd0ZV9q74zW6uVW043525/* $VF was: 9DfdIDMD7OLt0h5X2Z9or7iqM54tahlW9b5AZiVqd0ZV9q74zW6uVW043525 */(
                  var2 - var8, var4 - var8, var6 - var8, var2 + var8, var4 + var8, var6 + var8
               )
            )
      );
      if (!var9.isEmpty()) {
         for (Class0190 var11 : var9) {
            this._jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7/* $VF was: 3jpTH278LwHa0V7Ij1FtDz29fCT85Svf795UaO5eFK8tq9nh7hOMMi91w0F7 */(
               var11.96m4VY8xj6BdgnJ4S6lKffLjqw638uwZi2kKERH0l07uT5RpreL9H4KbM27v, var1
            );
         }
      }
   }
}
