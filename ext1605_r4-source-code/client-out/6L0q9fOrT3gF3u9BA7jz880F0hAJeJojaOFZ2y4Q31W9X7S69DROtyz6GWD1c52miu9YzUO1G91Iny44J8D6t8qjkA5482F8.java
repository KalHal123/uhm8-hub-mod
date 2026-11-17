import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class 6L0q9fOrT3gF3u9BA7jz880F0hAJeJojaOFZ2y4Q31W9X7S69DROtyz6GWD1c52miu9YzUO1G91Iny44J8D6t8qjkA5482F8 {
   private static List<Integer> 270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G = new ArrayList<>();
   private static List<Integer> 1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK = new ArrayList<>();

   public static synchronized int _38K2t9YH4nAdJ6uDNr4xjMccU3H5E3JlRhhv9Vj028i2gtCBW9T2h1ZHTH4/* $VF was: 138K2t9YH4nAdJ6uDNr4xjMccU3H5E3JlRhhv9Vj028i2gtCBW9T2h1ZHTH4 */(
      int var0
   ) {
      int var1 = GL11.glGenLists(var0);
      270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.add(var1);
      270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.add(var0);
      return var1;
   }

   public static synchronized void _2DHX6qz0xD4W6xAaHcb3Y5lgdft9Ojb4P321YtSO802tDB5S0O0WW0iqaoO/* $VF was: 52DHX6qz0xD4W6xAaHcb3Y5lgdft9Ojb4P321YtSO802tDB5S0O0WW0iqaoO */(
      IntBuffer var0
   ) {
      GL11.glGenTextures(var0);

      for (int var1 = var0.position(); var1 < var0.limit(); var1++) {
         1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK.add(var0.get(var1));
      }
   }

   public static synchronized void _JohDkGJux3P2XGaTywb0M9P0z06NFl6vkehak9CJ39ES63M8dP6LhM8d59Y/* $VF was: 7JohDkGJux3P2XGaTywb0M9P0z06NFl6vkehak9CJ39ES63M8dP6LhM8d59Y */() {
      for (byte var0 = 0; var0 < 270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.size(); var0 += 2) {
         GL11.glDeleteLists(
            270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.get(var0), 270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.get(var0 + 1)
         );
      }

      IntBuffer var2 = _R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2/* $VF was: 1R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2 */(
         1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK.size()
      );
      ((Buffer)var2).flip();
      GL11.glDeleteTextures(var2);

      for (int var1 = 0; var1 < 1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK.size(); var1++) {
         var2.put(1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK.get(var1));
      }

      ((Buffer)var2).flip();
      GL11.glDeleteTextures(var2);
      270g5qvqO575mD67Au51C4d03251uXK2285BfWO5R49T0eTB85yJSMst3m9G.clear();
      1pIE2lrI0vV9q5qc3HCjiywZgmX3yhZVV9ik2wF08BP6s6xKh9s9SuV0R7GK.clear();
   }

   public static synchronized ByteBuffer _1EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h/* $VF was: 91EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h */(
      int var0
   ) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer _R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2/* $VF was: 1R0cvYjOOKvGsD06D0rUI7v5l8UW5g50A7vNmbfAYuiFodFv87BlfGv90Uh2 */(
      int var0
   ) {
      return _1EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h/* $VF was: 91EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h */(var0 << 2)
         .asIntBuffer();
   }

   public static FloatBuffer _10Npi02jcMInW39XFn5U3SXl11K8DIy9pBIJbF88C9f6zoBKV9MYNjg2p20/* $VF was: 010Npi02jcMInW39XFn5U3SXl11K8DIy9pBIJbF88C9f6zoBKV9MYNjg2p20 */(
      int var0
   ) {
      return _1EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h/* $VF was: 91EuTmkXm8xAIAY7j7v6912p5y1QFEu55cAH1a443YZgof0oct95U9qVT07h */(var0 << 2)
         .asFloatBuffer();
   }
}
