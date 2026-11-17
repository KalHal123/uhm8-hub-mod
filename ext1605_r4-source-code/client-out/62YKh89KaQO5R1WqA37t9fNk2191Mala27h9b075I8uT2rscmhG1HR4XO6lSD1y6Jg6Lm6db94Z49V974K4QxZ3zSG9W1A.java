import java.util.HashMap;
import java.util.Map.Entry;

public class 62YKh89KaQO5R1WqA37t9fNk2191Mala27h9b075I8uT2rscmhG1HR4XO6lSD1y6Jg6Lm6db94Z49V974K4QxZ3zSG9W1A
   implements 6Xshyu98BPKD0Kj2ysQ0pQPP3OrJj1w2t5T0uPrGog033gntT8UTcBftyFyvZHgyra2lx4a1692nuiLk581IYI8n94RXWk8Ry {
   private final HashMap<61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3, float[]> 0jQxZ1dVC518Y32Z1425p2LEer8Ex9wWwb3RWTp79I88VOPE42N1kQ516HmO = new HashMap<>();

   public void _w1lB4c92lMJbh1WTsqK8RWVdY460iP4FuXe5pstl82DxM6koOm8O527VIZ9/* $VF was: 7w1lB4c92lMJbh1WTsqK8RWVdY460iP4FuXe5pstl82DxM6koOm8O527VIZ9 */(
      61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3 var1, float[] var2
   ) {
      if (var2.length != 1536) {
         throw new IllegalArgumentException("Invalid biome map");
      }

      this.0jQxZ1dVC518Y32Z1425p2LEer8Ex9wWwb3RWTp79I88VOPE42N1kQ516HmO.put(var1, var2);
   }

   public void _AndXWge0Me8Q040iwfs6eu0O3Y09uh0xQI51Sv3WSs5ZG8n7t4xbP8BL96U/* $VF was: 3AndXWge0Me8Q040iwfs6eu0O3Y09uh0xQI51Sv3WSs5ZG8n7t4xbP8BL96U */(
      61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3 var1
   ) {
      this.0jQxZ1dVC518Y32Z1425p2LEer8Ex9wWwb3RWTp79I88VOPE42N1kQ516HmO.remove(var1);
   }

   @Override
   public double _9mJVmq3bl4dbH51995p9tocRB43bFXruO32GkxVTy54fzIxdy5dt9OeTC2A/* $VF was: 39mJVmq3bl4dbH51995p9tocRB43bFXruO32GkxVTy54fzIxdy5dt9OeTC2A */(
      int var1, int var2, 7l3a6Tam0Vxd19KQkT63iCtqNR2h420RA2x95xyu4i9U8W97QPM0DaNLoKy6FxBd5PckYPo6FXaU6UJmb1ywQ83m63215178 var3
   ) {
      int var4 = var1 % 16;
      if (var4 < 0) {
         var4 += 15;
      }

      int var5 = var2 % 16;
      if (var5 < 0) {
         var5 += 15;
      }

      for (Entry var7 : this.0jQxZ1dVC518Y32Z1425p2LEer8Ex9wWwb3RWTp79I88VOPE42N1kQ516HmO.entrySet()) {
         if (((61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3)var7.getKey()).8lC0vu3ZWMb5RN6uf3yOxqcTF6il1w83697KcOEhd66eGI1Wh3lPZPcE05RM
               == var1 / 16
            && ((61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3)var7.getKey()).0bm3C9QEP6bCapmYMP36ISZ8F3a48ODO4a58xz6U9hA99ZZj4RI1S24iD174
               == var2 / 16) {
            return ((float[])var7.getValue())[var3.ordinal() * 16 * 16 * 2 + var4 * 2 + var5 * 16 * 2];
         }
      }

      return 0.0;
   }

   @Override
   public double _hoZRS129yUan88AHp1ksCfja1h93mYKfFda82Qtd8pqKm7G4bgpnYsijiMu/* $VF was: 4hoZRS129yUan88AHp1ksCfja1h93mYKfFda82Qtd8pqKm7G4bgpnYsijiMu */(
      int var1, int var2, 7l3a6Tam0Vxd19KQkT63iCtqNR2h420RA2x95xyu4i9U8W97QPM0DaNLoKy6FxBd5PckYPo6FXaU6UJmb1ywQ83m63215178 var3
   ) {
      int var4 = var1 % 16;
      if (var4 < 0) {
         var4 += 16;
      }

      int var5 = var2 % 16;
      if (var5 < 0) {
         var5 += 16;
      }

      for (Entry var7 : this.0jQxZ1dVC518Y32Z1425p2LEer8Ex9wWwb3RWTp79I88VOPE42N1kQ516HmO.entrySet()) {
         if (((61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3)var7.getKey()).8lC0vu3ZWMb5RN6uf3yOxqcTF6il1w83697KcOEhd66eGI1Wh3lPZPcE05RM
               == var1 / 16
            && ((61bqrHDP9YdMp07z5iABWtMK66t4gcvjql3dTcp0J4v61Wuvvw3MdEOM7lNr9AGis7r2odCsX9s05wc3f7aM3l1ogYNoot3)var7.getKey()).0bm3C9QEP6bCapmYMP36ISZ8F3a48ODO4a58xz6U9hA99ZZj4RI1S24iD174
               == var2 / 16) {
            return ((float[])var7.getValue())[var3.ordinal() * 16 * 16 * 2 + var4 * 2 + var5 * 16 * 2 + 1];
         }
      }

      return 0.0;
   }

   @Override
   public 5ivWu5fw81lFMju719L22Mulv8zG27JoVOLR8YJ449815zjXt9yq6P1W2j4mAr7cr5vz8iYBvRPyA8oeO7yrs5U8vBW888dl _j1lR4019pucW00n7wn38afjBd62vEMB6B6SVB9068f4kyPzw4E6wI65ufr8/* $VF was: 7j1lR4019pucW00n7wn38afjBd62vEMB6B6SVB9068f4kyPzw4E6wI65ufr8 */(
      int var1, int var2, 7l3a6Tam0Vxd19KQkT63iCtqNR2h420RA2x95xyu4i9U8W97QPM0DaNLoKy6FxBd5PckYPo6FXaU6UJmb1ywQ83m63215178 var3
   ) {
      return 5ivWu5fw81lFMju719L22Mulv8zG27JoVOLR8YJ449815zjXt9yq6P1W2j4mAr7cr5vz8iYBvRPyA8oeO7yrs5U8vBW888dl._dCM22Pc7rV0IQo46JM3ja84x9AHCGNPeSCDVFoTi3969B8hv2sM7nr6o61r/* $VF was: 2dCM22Pc7rV0IQo46JM3ja84x9AHCGNPeSCDVFoTi3969B8hv2sM7nr6o61r */(
         this._9mJVmq3bl4dbH51995p9tocRB43bFXruO32GkxVTy54fzIxdy5dt9OeTC2A/* $VF was: 39mJVmq3bl4dbH51995p9tocRB43bFXruO32GkxVTy54fzIxdy5dt9OeTC2A */(
            var1, var2, var3
         ),
         this._hoZRS129yUan88AHp1ksCfja1h93mYKfFda82Qtd8pqKm7G4bgpnYsijiMu/* $VF was: 4hoZRS129yUan88AHp1ksCfja1h93mYKfFda82Qtd8pqKm7G4bgpnYsijiMu */(
            var1, var2, var3
         ),
         var3
      );
   }
}
