public class bl extends dd {
   public bl(int var1) {
      super(var1);
      this.aR = 16;
   }

   @Override
   public eo a(eo var1, cj var2, dg var3) {
      var1.a--;
      var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
      var2.a(new al(var2, var3));
      return var1;
   }
}
