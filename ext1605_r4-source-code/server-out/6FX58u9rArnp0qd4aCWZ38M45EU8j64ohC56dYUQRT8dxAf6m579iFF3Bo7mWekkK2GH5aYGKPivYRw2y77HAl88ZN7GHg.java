public class 6FX58u9rArnp0qd4aCWZ38M45EU8j64ohC56dYUQRT8dxAf6m579iFF3Bo7mWekkK2GH5aYGKPivYRw2y77HAl88ZN7GHg {
   public final byte[] 1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau;

   public _FX58u9rArnp0qd4aCWZ38M45EU8j64ohC56dYUQRT8dxAf6m579iFF3Bo7mWekkK2GH5aYGKPivYRw2y77HAl88ZN7GHg/* $VF was: 6FX58u9rArnp0qd4aCWZ38M45EU8j64ohC56dYUQRT8dxAf6m579iFF3Bo7mWekkK2GH5aYGKPivYRw2y77HAl88ZN7GHg */(
      int var1
   ) {
      this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau = new byte[var1 >> 1];
   }

   public _FX58u9rArnp0qd4aCWZ38M45EU8j64ohC56dYUQRT8dxAf6m579iFF3Bo7mWekkK2GH5aYGKPivYRw2y77HAl88ZN7GHg/* $VF was: 6FX58u9rArnp0qd4aCWZ38M45EU8j64ohC56dYUQRT8dxAf6m579iFF3Bo7mWekkK2GH5aYGKPivYRw2y77HAl88ZN7GHg */(
      byte[] var1
   ) {
      this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau = var1;
   }

   public int _90o5Z9D4JI68KCAcN2VCvtli1n4BA68iFb2FHvPSEfo7lOZq7TZU83o0S71/* $VF was: 590o5Z9D4JI68KCAcN2VCvtli1n4BA68iFb2FHvPSEfo7lOZq7TZU83o0S71 */(
      int var1, int var2, int var3
   ) {
      int var4 = var1 << 11 | var3 << 7 | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0
         ? this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var5] & 15
         : this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var5] >> 4 & 15;
   }

   public void _B5Gr55T17R4k8Fugsopa0K6YfTQ19Vqq4lprpPuXkm2x37qE5XD88F8Sgju/* $VF was: 4B5Gr55T17R4k8Fugsopa0K6YfTQ19Vqq4lprpPuXkm2x37qE5XD88F8Sgju */(
      int var1, int var2, int var3, int var4
   ) {
      int var5 = var1 << 11 | var3 << 7 | var2;
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      if (var7 == 0) {
         this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var6] = (byte)(
            this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var6] & 240 | var4 & 15
         );
      } else {
         this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var6] = (byte)(
            this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau[var6] & 15 | (var4 & 15) << 4
         );
      }
   }

   public boolean _NtMKhFqXWBbsv88sotYOEKzI2z53zPM22XNo4X54r2tg3Ht78e94WEUvJ6e/* $VF was: 1NtMKhFqXWBbsv88sotYOEKzI2z53zPM22XNo4X54r2tg3Ht78e94WEUvJ6e */() {
      return this.1QUA7X27IXBim1648S61cy8jAYQSZLDTtElc0pM409u4TLOR1229lcAT0iau != null;
   }
}
