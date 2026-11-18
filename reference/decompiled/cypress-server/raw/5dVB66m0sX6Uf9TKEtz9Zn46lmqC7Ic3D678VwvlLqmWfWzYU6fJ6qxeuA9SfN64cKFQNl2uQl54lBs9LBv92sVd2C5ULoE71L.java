import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L {
   public static Logger 57f8kLm1m6cssHFz8FMPOUw0P1Dzl8sfda7BOZ412SFSHIxi8OnkhRzwHQ64 = Logger.getLogger("Minecraft");
   private ServerSocket 1nKQ7tdKj8kvO9deTmDbsD6pGeZh9Uo6toJVDQ1SgzQ0f7385X68CxSGFOpm;
   private Thread 9PB8pL4Gzi6AFlUd2PRHgUTxQdbIm000Zk792i6Nqjr7AQ0g61vB5QxsHx03;
   public volatile boolean 843obqINT447jg1wxMKoAK4DlUHsD21kGHsI944Ba7Z09Z287L1Jh80gjPJ2 = false;
   private int 5UqSKZ1oquC84pCL9UgiCyTt4RQdy55Wjau56X48q2MjjW68jNGtEh8flHJY = 0;
   private ArrayList 6KlvwXJpz1u8EeNVpkvFG8Dt3pXrFnD7pzcG00g4Ev9fEA0i4OJpeqPoW0Ji = new ArrayList();
   private ArrayList 1wfKI769u1DY0jap07SH32Ae7Y97m9Fl2m7EYt776o4TkDmmLJTkR61b3UP6 = new ArrayList();
   public MinecraftServer 0pcm0A1A51Tiefwa39QknNPLQ3lu698088ll41Yp5puy1w7GA18Y2y40MENr;

   public _dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L/* $VF was: 5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L */(
      MinecraftServer var1, InetAddress var2, int var3
   ) throws IOException {
      this.0pcm0A1A51Tiefwa39QknNPLQ3lu698088ll41Yp5puy1w7GA18Y2y40MENr = var1;
      this.1nKQ7tdKj8kvO9deTmDbsD6pGeZh9Uo6toJVDQ1SgzQ0f7385X68CxSGFOpm = new ServerSocket(var3, 0, var2);
      this.1nKQ7tdKj8kvO9deTmDbsD6pGeZh9Uo6toJVDQ1SgzQ0f7385X68CxSGFOpm.setPerformancePreferences(0, 2, 1);
      this.843obqINT447jg1wxMKoAK4DlUHsD21kGHsI944Ba7Z09Z287L1Jh80gjPJ2 = true;
      this.9PB8pL4Gzi6AFlUd2PRHgUTxQdbIm000Zk792i6Nqjr7AQ0g61vB5QxsHx03 = new 8LqhhUky6snO3286U556Y06V1Fw6g77j0dfB085n9478w67A138jn6Vpv0FaxxDV00L915wW5rL16801tHKycnD1541d0d4L8G(
         this, "Listen thread", var1
      );
      this.9PB8pL4Gzi6AFlUd2PRHgUTxQdbIm000Zk792i6Nqjr7AQ0g61vB5QxsHx03.start();
   }

   public void _Mr365gZZn95id5yxIlYcXvm7QK86V813XA4tdLV541p83xiR22Tk91GnKs6/* $VF was: 5Mr365gZZn95id5yxIlYcXvm7QK86V813XA4tdLV541p83xiR22Tk91GnKs6 */(
      3451q5r9FLZo4K1nh5r14n8fPC2FP0a954eLpWC60a5rfhdRKiZ915woox3U56JE1dIFkZlY5jR35X4UH33NHDJkP7J57XI var1
   ) {
      this.1wfKI769u1DY0jap07SH32Ae7Y97m9Fl2m7EYt776o4TkDmmLJTkR61b3UP6.add(var1);
   }

   private void _A41X209jaNic317g3VBp1F5aUn2Pt4q21hTAIm1Lybp3va5NCENxJ5PwQ56/* $VF was: 9A41X209jaNic317g3VBp1F5aUn2Pt4q21hTAIm1Lybp3va5NCENxJ5PwQ56 */(
      22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a var1
   ) {
      if (var1 == null) {
         throw new IllegalArgumentException("Got null pendingconnection!");
      }

      this.6KlvwXJpz1u8EeNVpkvFG8Dt3pXrFnD7pzcG00g4Ev9fEA0i4OJpeqPoW0Ji.add(var1);
   }

   public void _qSqZ9L1r01N31TFoa8Zv2A1V3q3mr36V0kuz3InK2u23ne9ye2358g92FlO/* $VF was: 2qSqZ9L1r01N31TFoa8Zv2A1V3q3mr36V0kuz3InK2u23ne9ye2358g92FlO */() {
      for (int var1 = 0; var1 < this.6KlvwXJpz1u8EeNVpkvFG8Dt3pXrFnD7pzcG00g4Ev9fEA0i4OJpeqPoW0Ji.size(); var1++) {
         22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a var2 = (22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a)this.6KlvwXJpz1u8EeNVpkvFG8Dt3pXrFnD7pzcG00g4Ev9fEA0i4OJpeqPoW0Ji
            .get(var1);

         try {
            var2._ugSrPcTwNmTckI57ci0V4MH0x53wIJo735JEeW59ZTjYuyx2Ovv4XKrgQq5/* $VF was: 3ugSrPcTwNmTckI57ci0V4MH0x53wIJo735JEeW59ZTjYuyx2Ovv4XKrgQq5 */();
         } catch (Exception var5) {
            var2._EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys/* $VF was: 8EBYs8696oSbpqPuXh282876rLJ73kQHuJ503IX673SMY0E5bw3QZhbwTLys */(
               "Internal server error"
            );
            57f8kLm1m6cssHFz8FMPOUw0P1Dzl8sfda7BOZ412SFSHIxi8OnkhRzwHQ64.log(Level.WARNING, "Failed to handle packet: " + var5, var5);
         }

         if (var2.0cPsupKbbeKHzkR25H11G5saFrJ50p3y74RaWMn9xC22kFosJxZTG57G87ET) {
            this.6KlvwXJpz1u8EeNVpkvFG8Dt3pXrFnD7pzcG00g4Ev9fEA0i4OJpeqPoW0Ji.remove(var1--);
         }
      }

      for (int var6 = 0; var6 < this.1wfKI769u1DY0jap07SH32Ae7Y97m9Fl2m7EYt776o4TkDmmLJTkR61b3UP6.size(); var6++) {
         3451q5r9FLZo4K1nh5r14n8fPC2FP0a954eLpWC60a5rfhdRKiZ915woox3U56JE1dIFkZlY5jR35X4UH33NHDJkP7J57XI var7 = (3451q5r9FLZo4K1nh5r14n8fPC2FP0a954eLpWC60a5rfhdRKiZ915woox3U56JE1dIFkZlY5jR35X4UH33NHDJkP7J57XI)this.1wfKI769u1DY0jap07SH32Ae7Y97m9Fl2m7EYt776o4TkDmmLJTkR61b3UP6
            .get(var6);

         try {
            var7._96X6PF0B606p45KKd4DdpU5Vz13RdSP58Lq4Lg743DPCkKL1BY98pgzG429/* $VF was: 096X6PF0B606p45KKd4DdpU5Vz13RdSP58Lq4Lg743DPCkKL1BY98pgzG429 */();
         } catch (Exception var4) {
            var7._7JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z/* $VF was: 07JB3677adZ64Dk6jTUO3bY81qKZW33vyDD622FR71t1x9r897PtxoeW6G0Z */(
               "Internal server error"
            );
            57f8kLm1m6cssHFz8FMPOUw0P1Dzl8sfda7BOZ412SFSHIxi8OnkhRzwHQ64.log(Level.WARNING, "Failed to handle packet: " + var4, var4);
         }

         if (var7.5F76Rg1pUfI087dcH77a6264bVj7n1v02hs81A8V1SEvWrd0pgfntkLXL5uC) {
            this.1wfKI769u1DY0jap07SH32Ae7Y97m9Fl2m7EYt776o4TkDmmLJTkR61b3UP6.remove(var6--);
         }
      }
   }

   static ServerSocket _1voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb/* $VF was: 41voW209yTKO2b18paAuunY1712JgE50rJH442q119F6mz2r253rt2BLXDQb */(
      5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L var0
   ) {
      return var0.1nKQ7tdKj8kvO9deTmDbsD6pGeZh9Uo6toJVDQ1SgzQ0f7385X68CxSGFOpm;
   }

   static int _g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17/* $VF was: 5g0AFYQNSP3ZbXbuCZ942McJ85ow25hrj0xU8TR8Jouu1a2xN4fNyG6SJF17 */(
      5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L var0
   ) {
      return var0.5UqSKZ1oquC84pCL9UgiCyTt4RQdy55Wjau56X48q2MjjW68jNGtEh8flHJY++;
   }

   static void _2ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U/* $VF was: 72ljcJ9BesDuyHMgowJsZ6V440BBEvDu7O4OMlbD41jF0Qz7lEcQB394qO1U */(
      5dVB66m0sX6Uf9TKEtz9Zn46lmqC7Ic3D678VwvlLqmWfWzYU6fJ6qxeuA9SfN64cKFQNl2uQl54lBs9LBv92sVd2C5ULoE71L var0,
      22dKNn35WF8T53SYas4mlrwIe39PY55o1H5rc1T8KM0y45CUdXge349951U4h9505Sf63Wz6DYE8v5q0O4DC818GlOTV5L7B4a var1
   ) {
      var0._A41X209jaNic317g3VBp1F5aUn2Pt4q21hTAIm1Lybp3va5NCENxJ5PwQ56/* $VF was: 9A41X209jaNic317g3VBp1F5aUn2Pt4q21hTAIm1Lybp3va5NCENxJ5PwQ56 */(var1);
   }
}
