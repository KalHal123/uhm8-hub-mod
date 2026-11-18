package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Class0321 {
   private static Map<Integer, Class<? extends Class0321>> 5ls4Fos9oP83uNb803uyOESgv73r9tY95N7Oh2nSbv4d3E2fPsdMoTV8589V = new HashMap<>();
   private static Map<Class<? extends Class0321>, Integer> 4T0u777grM7nYe71X80o246p62cWxig589p98CF9q9CDe2eML0U5l3fKQsT2 = new HashMap<>();
   public boolean 1E562P8qZ2018R02dmQAAVbr42qL73I7mrDJ42HmbP9VEA4CqLbaVmJ4Wk53 = false;

   static void _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
      int var0, Class<? extends Class0321> var1
   ) {
      if (5ls4Fos9oP83uNb803uyOESgv73r9tY95N7Oh2nSbv4d3E2fPsdMoTV8589V.containsKey(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      }

      if (4T0u777grM7nYe71X80o246p62cWxig589p98CF9q9CDe2eML0U5l3fKQsT2.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      }

      5ls4Fos9oP83uNb803uyOESgv73r9tY95N7Oh2nSbv4d3E2fPsdMoTV8589V.put(var0, var1);
      4T0u777grM7nYe71X80o246p62cWxig589p98CF9q9CDe2eML0U5l3fKQsT2.put(var1, var0);
   }

   public static Class0321 _61l4MNnX8cT8889yM7N0WKo72lwRMn92jv63F7Z01d7XaS4NzM5FQ1Y5ww3/* $VF was: 761l4MNnX8cT8889yM7N0WKo72lwRMn92jv63F7Z01d7XaS4NzM5FQ1Y5ww3 */(
      int var0
   ) {
      try {
         Class var1 = 5ls4Fos9oP83uNb803uyOESgv73r9tY95N7Oh2nSbv4d3E2fPsdMoTV8589V.get(var0);
         return var1 == null ? null : (Class0321)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int _0pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg/* $VF was: 30pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg */() {
      return 4T0u777grM7nYe71X80o246p62cWxig589p98CF9q9CDe2eML0U5l3fKQsT2.get(this.getClass());
   }

   public static Class0321 _RYY3XUmz5D5Vu8x8yhpuZ29o49wm517IjA934H1VB1j4N39CJqt9bY8ed7D/* $VF was: 8RYY3XUmz5D5Vu8x8yhpuZ29o49wm517IjA934H1VB1j4N39CJqt9bY8ed7D */(
      DataInputStream var0
   ) throws IOException {
      int var1 = var0.read();
      if (var1 == -1) {
         return null;
      }

      Class0321 var2 = _61l4MNnX8cT8889yM7N0WKo72lwRMn92jv63F7Z01d7XaS4NzM5FQ1Y5ww3/* $VF was: 761l4MNnX8cT8889yM7N0WKo72lwRMn92jv63F7Z01d7XaS4NzM5FQ1Y5ww3 */(
         var1
      );
      if (var2 == null) {
         throw new IOException("Bad packet id " + var1);
      }

      if (var1 != 10 && var1 != 11) {
      }

      var2._qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(var0);
      return var2;
   }

   public static void _Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s/* $VF was: 4Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s */(
      Class0321 var0, DataOutputStream var1
   ) throws IOException {
      int var2 = var0._0pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg/* $VF was: 30pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg */();
      if (var2 != 52 && var2 != 53 && var2 != 51 && var2 != 4 && var2 != 30 && var2 != 0) {
      }

      var1.write(var0._0pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg/* $VF was: 30pyO12qFpnNcoDyO162Cu7q55l5p7PwfKi8cqO1vsrtltf92r0mb87C4wLg */());
      var0._1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(var1);
   }

   public abstract void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException;

   public abstract void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException;

   public abstract void _qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
      Class0193 var1
   );

   public abstract int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */();

   static {
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         0, Class0176.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         1, Class0203.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         2, Class0147.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         3, Class0199.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         4, Class0099.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         5, Class0319.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         6, Class0370.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         7, Class0293.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         8, Class0380.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         10, Class0323.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         11, Class0378.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         12, Class0230.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         13, Class0291.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         14, Class0292.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         15, Class0129.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         16, Class0018.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         17, Class0385.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         18, Class0096.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         20, Class0128.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         21, Class0059.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         22, Class0202.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         23, Class0312.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         24, Class0133.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         29, Class0359.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         30, Class0297.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         31, Class0095.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         32, Class0316.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         33, Class0151.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         34, Class0377.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         50, Class0180.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         51, Class0037.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         52, Class0164.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         53, Class0355.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         59, Class0384.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         70, Class0287.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         71, Class0235.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         72, Class0035.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         200, Class0032.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         201, Class0306.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         202, Class0008.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         211, Class0224.class
      );
      _iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K/* $VF was: 4iR5iVYp8Lb3yJTm3u8o9Qm3y5tN89HQdwA9WzindNPt8EeNhN0yY3H3618K */(
         255, Class0004.class
      );
   }
}
