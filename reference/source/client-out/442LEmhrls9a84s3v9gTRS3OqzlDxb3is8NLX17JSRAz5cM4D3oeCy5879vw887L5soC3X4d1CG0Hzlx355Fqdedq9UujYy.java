import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.client.Minecraft;

public final class 442LEmhrls9a84s3v9gTRS3OqzlDxb3is8NLX17JSRAz5cM4D3oeCy5879vw887L5soC3X4d1CG0Hzlx355Fqdedq9UujYy extends WindowAdapter {
   final Minecraft 9NgSpzsjJc504h7QpF9vV5hgA10D5D7T2g9004TZ8M89PTwkt11hk8069KSd;
   final Thread 02K5E1PpErsPATdx69lc2QDfs0n2jII8R69Vl18GwMjjeFQH6WRv3HY93066;

   public _42LEmhrls9a84s3v9gTRS3OqzlDxb3is8NLX17JSRAz5cM4D3oeCy5879vw887L5soC3X4d1CG0Hzlx355Fqdedq9UujYy/* $VF was: 442LEmhrls9a84s3v9gTRS3OqzlDxb3is8NLX17JSRAz5cM4D3oeCy5879vw887L5soC3X4d1CG0Hzlx355Fqdedq9UujYy */(
      Minecraft var1, Thread var2
   ) {
      this.9NgSpzsjJc504h7QpF9vV5hgA10D5D7T2g9004TZ8M89PTwkt11hk8069KSd = var1;
      this.02K5E1PpErsPATdx69lc2QDfs0n2jII8R69Vl18GwMjjeFQH6WRv3HY93066 = var2;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.9NgSpzsjJc504h7QpF9vV5hgA10D5D7T2g9004TZ8M89PTwkt11hk8069KSd
         ._F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f/* $VF was: 2F487nXtBcZHUniC3RAaQkjPat9E0C39FL3iEiaGPs2TNnr16TXWREX5Y48f */();

      try {
         this.02K5E1PpErsPATdx69lc2QDfs0n2jII8R69Vl18GwMjjeFQH6WRv3HY93066.join();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      System.exit(0);
   }
}
