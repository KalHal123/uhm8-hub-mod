package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Class0366 {
   public static final Object 5hAyh9dKrWl1OV1h3Vuad0Ll6T9Q6nj2tQ5qQ1s0401LoTUKiPn5919s6CNn = new Object();
   public static int 3rPk1hy2D3LvhQLLDOpK4790R2akAtnOY8SXoq9arqybimd70Ro5LJ1asAE2;
   public static int 2EI2J3VymF7rQ7zsv83iWWfcRXAo95mM6XsHJM274GGo1u3E6mBu9clpqBcL;
   private Object 3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U = new Object();
   private Socket 9CN5CnEsb3oMtlo3h0jDt6ywkZo4E3vvHR1TtkMjKAawrz040vMX2Hf7Djqs;
   private DataInputStream 8E78oO4a8O06RMNSHRr52XmD1nGXP6o79MBoykk1E49400d6878bNPpLGVnb;
   private DataOutputStream 4OPGC94Ard0RP7g3nF7InOWjfoDx3TwjMLB2T0F9BWaOg7Z9NtRZU6aqS4my;
   private boolean 5j7u09RG3XDWYxh0I9124m0MfFDbXUnLz01Rjm6vHIJFli9G7Xam40vDlOe6 = true;
   private List 0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm = Collections.synchronizedList(new LinkedList());
   private List 9h9dDlf0f0W7w0gp5e2c8rsYm4093eu0dZ3FzmBGY406g9m094SzxOfY8ipC = Collections.synchronizedList(new LinkedList());
   private List 5npfIV6AjuSlNMHW7iuA1o36N26IIA242X0636K4fx91f67PbbZKsD1URTQD = Collections.synchronizedList(new LinkedList());
   private Class0193 7WH2g68hBla2Horj6ba0kTIh8Ajn94Tw785D54duj5tv5HF0uCtmd3u0m7mn;
   private boolean 8V6qn5ABlxG27N2dj74M76Fdekvy6Bc5Y8Bt75ua8WG6cLr93ShB0uzO78b8 = false;
   private Thread 9N75Xhz3trd12041V3iJO8o2K9iM3um00oV1I2dxG6vBAxd6K6Lq66WJeArp;
   private Thread 8Ud2P94B6X1iOrQ3PIQT5Z3c40xfhO15XV46MG41nCYQ8J47oc42jHzO4Bg4;
   private boolean 3KckVbxS0M491Tl0oy58QJ54wMB5V8e8szeTiFo8YXHniW1RQSjW68af7YWe = false;
   private String 3lr36oohRz4e3245F4Gs0X5FJ45418o12ZaH4lS88OQfHy2ayF87ny9TId7J = "";
   private int 02zBM2fo92Ux4QJ0jSefiBkUm89vW06kA5S64jW7o5Zj2tS8Sp5msJoK2K34 = 0;
   private int 81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD = 0;
   private int 50IE5Kou04aG4N28Zs31lK3SklU68J73IAThUp3U4XFpT4j04desBtm6VfxL = 0;

   public Class0366(Socket var1, String var2, Class0193 var3) throws IOException {
      this.9CN5CnEsb3oMtlo3h0jDt6ywkZo4E3vvHR1TtkMjKAawrz040vMX2Hf7Djqs = var1;
      this.7WH2g68hBla2Horj6ba0kTIh8Ajn94Tw785D54duj5tv5HF0uCtmd3u0m7mn = var3;
      var1.setTrafficClass(24);
      this.8E78oO4a8O06RMNSHRr52XmD1nGXP6o79MBoykk1E49400d6878bNPpLGVnb = new DataInputStream(var1.getInputStream());
      this.4OPGC94Ard0RP7g3nF7InOWjfoDx3TwjMLB2T0F9BWaOg7Z9NtRZU6aqS4my = new DataOutputStream(var1.getOutputStream());
      this.8Ud2P94B6X1iOrQ3PIQT5Z3c40xfhO15XV46MG41nCYQ8J47oc42jHzO4Bg4 = new Class0205(this, var2 + " read thread");
      this.9N75Xhz3trd12041V3iJO8o2K9iM3um00oV1I2dxG6vBAxd6K6Lq66WJeArp = new Class0110(this, var2 + " write thread");
      this.8Ud2P94B6X1iOrQ3PIQT5Z3c40xfhO15XV46MG41nCYQ8J47oc42jHzO4Bg4.start();
      this.9N75Xhz3trd12041V3iJO8o2K9iM3um00oV1I2dxG6vBAxd6K6Lq66WJeArp.start();
   }

   public void _qWuT99Pjc0B5P4ji4h22jXAN6xCCEBlvOuHM5j7e9d7uIZ0k9c23g38u4Mu/* $VF was: 7qWuT99Pjc0B5P4ji4h22jXAN6xCCEBlvOuHM5j7e9d7uIZ0k9c23g38u4Mu */(
      Class0193 var1
   ) {
      this.7WH2g68hBla2Horj6ba0kTIh8Ajn94Tw785D54duj5tv5HF0uCtmd3u0m7mn = var1;
   }

   public void _1aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4/* $VF was: 31aY8z9qOy3v8605D7c19org81tpyDz87v493oYcpxYZyb371ko3RG0YMjH4 */(
      Class0321 var1
   ) {
      if (!this.8V6qn5ABlxG27N2dj74M76Fdekvy6Bc5Y8Bt75ua8WG6cLr93ShB0uzO78b8) {
         Object var3 = this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U;
         synchronized (this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U) {
            this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD = this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD
               + var1._30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */()
               + 1;
            if (var1.1E562P8qZ2018R02dmQAAVbr42qL73I7mrDJ42HmbP9VEA4CqLbaVmJ4Wk53) {
               this.5npfIV6AjuSlNMHW7iuA1o36N26IIA242X0636K4fx91f67PbbZKsD1URTQD.add(var1);
            } else {
               this.9h9dDlf0f0W7w0gp5e2c8rsYm4093eu0dZ3FzmBGY406g9m094SzxOfY8ipC.add(var1);
            }
         }
      }
   }

   private void _feCNKdM8rk7hx6HUbAI9JRO8UkQCGlJ39Cj0m6UBfilH64kAtJkqzR7S9Fn/* $VF was: 6feCNKdM8rk7hx6HUbAI9JRO8UkQCGlJ39Cj0m6UBfilH64kAtJkqzR7S9Fn */() {
      try {
         boolean var1 = true;
         if (!this.9h9dDlf0f0W7w0gp5e2c8rsYm4093eu0dZ3FzmBGY406g9m094SzxOfY8ipC.isEmpty()) {
            var1 = false;
            Object var4 = this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U;
            Class0321 var2;
            synchronized (this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U) {
               var2 = (Class0321)this.9h9dDlf0f0W7w0gp5e2c8rsYm4093eu0dZ3FzmBGY406g9m094SzxOfY8ipC.remove(0);
               this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD = this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD
                  - (
                     var2._30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */()
                        + 1
                  );
            }

            Class0321._Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s/* $VF was: 4Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s */(
               var2, this.4OPGC94Ard0RP7g3nF7InOWjfoDx3TwjMLB2T0F9BWaOg7Z9NtRZU6aqS4my
            );
         }

         if ((var1 || this.50IE5Kou04aG4N28Zs31lK3SklU68J73IAThUp3U4XFpT4j04desBtm6VfxL-- <= 0)
            && !this.5npfIV6AjuSlNMHW7iuA1o36N26IIA242X0636K4fx91f67PbbZKsD1URTQD.isEmpty()) {
            var1 = false;
            Object var13 = this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U;
            Class0321 var11;
            synchronized (this.3OEg6N6yyQkZ2w1V0c14bDIoUGp5ZS8v48MO4TJ0D5H43Kz6hua361XpvX5U) {
               var11 = (Class0321)this.5npfIV6AjuSlNMHW7iuA1o36N26IIA242X0636K4fx91f67PbbZKsD1URTQD.remove(0);
               this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD = this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD
                  - (
                     var11._30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */()
                        + 1
                  );
            }

            Class0321._Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s/* $VF was: 4Xv53069pU1648B2gnWLqA0wYE2iw3K7AxyOYT1K05OF5bsly085F7XS736s */(
               var11, this.4OPGC94Ard0RP7g3nF7InOWjfoDx3TwjMLB2T0F9BWaOg7Z9NtRZU6aqS4my
            );
            this.50IE5Kou04aG4N28Zs31lK3SklU68J73IAThUp3U4XFpT4j04desBtm6VfxL = 50;
         }

         if (var1) {
            Thread.sleep(10L);
         }
      } catch (InterruptedException var9) {
      } catch (Exception var10) {
         if (!this.3KckVbxS0M491Tl0oy58QJ54wMB5V8e8szeTiFo8YXHniW1RQSjW68af7YWe) {
            this._fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG/* $VF was: 3fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG */(var10);
         }
      }
   }

   private void _eN1uet7t6482Y80TM8979deRBqgnffmz6H92O77U1GNg7epr40H4IB4XQ47/* $VF was: 2eN1uet7t6482Y80TM8979deRBqgnffmz6H92O77U1GNg7epr40H4IB4XQ47 */() {
      try {
         Class0321 var1 = Class0321._RYY3XUmz5D5Vu8x8yhpuZ29o49wm517IjA934H1VB1j4N39CJqt9bY8ed7D/* $VF was: 8RYY3XUmz5D5Vu8x8yhpuZ29o49wm517IjA934H1VB1j4N39CJqt9bY8ed7D */(
            this.8E78oO4a8O06RMNSHRr52XmD1nGXP6o79MBoykk1E49400d6878bNPpLGVnb
         );
         if (var1 != null) {
            this.0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm.add(var1);
         } else {
            this._sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812/* $VF was: 7sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812 */(
               "End of stream"
            );
         }
      } catch (Exception var2) {
         if (!this.3KckVbxS0M491Tl0oy58QJ54wMB5V8e8szeTiFo8YXHniW1RQSjW68af7YWe) {
            this._fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG/* $VF was: 3fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG */(var2);
         }
      }
   }

   private void _fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG/* $VF was: 3fuSA004I9Mx0eL0Wmt8lH5C5JsfcYVBDzyhS7Z1f14b70af5aN10NFdS6FG */(
      Exception var1
   ) {
      var1.printStackTrace();
      this._sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812/* $VF was: 7sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812 */(
         "Internal exception: " + var1.toString()
      );
   }

   public void _sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812/* $VF was: 7sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812 */(
      String var1
   ) {
      if (this.5j7u09RG3XDWYxh0I9124m0MfFDbXUnLz01Rjm6vHIJFli9G7Xam40vDlOe6) {
         this.3KckVbxS0M491Tl0oy58QJ54wMB5V8e8szeTiFo8YXHniW1RQSjW68af7YWe = true;
         this.3lr36oohRz4e3245F4Gs0X5FJ45418o12ZaH4lS88OQfHy2ayF87ny9TId7J = var1;
         new Class0140(this).start();
         this.5j7u09RG3XDWYxh0I9124m0MfFDbXUnLz01Rjm6vHIJFli9G7Xam40vDlOe6 = false;

         try {
            this.8E78oO4a8O06RMNSHRr52XmD1nGXP6o79MBoykk1E49400d6878bNPpLGVnb.close();
         } catch (Throwable var5) {
         }

         try {
            this.4OPGC94Ard0RP7g3nF7InOWjfoDx3TwjMLB2T0F9BWaOg7Z9NtRZU6aqS4my.close();
         } catch (Throwable var4) {
         }

         try {
            this.9CN5CnEsb3oMtlo3h0jDt6ywkZo4E3vvHR1TtkMjKAawrz040vMX2Hf7Djqs.close();
         } catch (Throwable var3) {
         }
      }
   }

   public void _0dBA7OKcXTpd7j9k146T2jOo12fnJN6p76S0V155de51HR68fMXS3CR1181/* $VF was: 00dBA7OKcXTpd7j9k146T2jOo12fnJN6p76S0V155de51HR68fMXS3CR1181 */() {
      if (this.81Lo3nGb295X9xM3P3896IG2HXxm0OCPxk4giokm1oZlA39ggpz4OmA6HgSD > 1048576) {
         this._sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812/* $VF was: 7sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812 */(
            "Send buffer overflow"
         );
      }

      if (this.0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm.isEmpty()) {
         if (this.02zBM2fo92Ux4QJ0jSefiBkUm89vW06kA5S64jW7o5Zj2tS8Sp5msJoK2K34++ == 1200) {
            this._sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812/* $VF was: 7sg51W4062569Mf7bd1Qhwx8159uTcLQFqB206a3TlJ2Lq8P757s22XgY812 */(
               "Timed out"
            );
         }
      } else {
         this.02zBM2fo92Ux4QJ0jSefiBkUm89vW06kA5S64jW7o5Zj2tS8Sp5msJoK2K34 = 0;
      }

      int var1 = 100;

      while (!this.0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm.isEmpty() && var1-- >= 0) {
         Class0321 var2 = (Class0321)this.0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm.remove(0);
         var2._qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6/* $VF was: 9qD22FHg0yXPs6fq6hdlNfCi5doE5I9298rGh0f19hdB4145HM0a03O6j9V6 */(
            this.7WH2g68hBla2Horj6ba0kTIh8Ajn94Tw785D54duj5tv5HF0uCtmd3u0m7mn
         );
      }

      if (this.3KckVbxS0M491Tl0oy58QJ54wMB5V8e8szeTiFo8YXHniW1RQSjW68af7YWe && this.0ypHkkWln4NOSDdH4f5DfZ7RHXQb2PzbOo2r4zfqL4j9k1tOVb1Ucc9cKZcm.isEmpty()) {
         this.7WH2g68hBla2Horj6ba0kTIh8Ajn94Tw785D54duj5tv5HF0uCtmd3u0m7mn
            ._QMm4XgN8SE3b2P88hWTauf4I0x8127wD5x6SE34LXO2hnW42Gol63Q5NloW/* $VF was: 0QMm4XgN8SE3b2P88hWTauf4I0x8127wD5x6SE34LXO2hnW42Gol63Q5NloW */(
               this.3lr36oohRz4e3245F4Gs0X5FJ45418o12ZaH4lS88OQfHy2ayF87ny9TId7J
            );
      }
   }

   public SocketAddress _X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu/* $VF was: 7X9b8r72BvOR3oV29e7sy83m5IZd3Tn9SzP3Gqbwic8UJ7F0A94DcZu70wIu */() {
      return this.9CN5CnEsb3oMtlo3h0jDt6ywkZo4E3vvHR1TtkMjKAawrz040vMX2Hf7Djqs.getRemoteSocketAddress();
   }

   public void _21OCAf8i8OS41zYcTM59dxL4K7TY99010779bHMoqW8cRsVqh0Qui91emr0/* $VF was: 921OCAf8i8OS41zYcTM59dxL4K7TY99010779bHMoqW8cRsVqh0Qui91emr0 */() {
      this.8V6qn5ABlxG27N2dj74M76Fdekvy6Bc5Y8Bt75ua8WG6cLr93ShB0uzO78b8 = true;
      this.8Ud2P94B6X1iOrQ3PIQT5Z3c40xfhO15XV46MG41nCYQ8J47oc42jHzO4Bg4.interrupt();
      new Class0170(this).start();
   }

   public int _2a3CE5q7xCM0OZtf1hV1QvPqRT7njEnZ0ut62YMcC79kwsDSx2rOkf4HHT8/* $VF was: 02a3CE5q7xCM0OZtf1hV1QvPqRT7njEnZ0ut62YMcC79kwsDSx2rOkf4HHT8 */() {
      return this.5npfIV6AjuSlNMHW7iuA1o36N26IIA242X0636K4fx91f67PbbZKsD1URTQD.size();
   }

   static boolean _u9QN21tU0c9r769j6vruI7rVOs6H52vj7D46UfxdJHM2KoW1v9wam4xtCnq/* $VF was: 4u9QN21tU0c9r769j6vruI7rVOs6H52vj7D46UfxdJHM2KoW1v9wam4xtCnq */(
      Class0366 var0
   ) {
      return var0.5j7u09RG3XDWYxh0I9124m0MfFDbXUnLz01Rjm6vHIJFli9G7Xam40vDlOe6;
   }

   static boolean _0uhc25M0h8k5E0LgwjDBcxfHOH0t0gbRK95rZNWGZhwAxnPuXfB2mx834xL/* $VF was: 20uhc25M0h8k5E0LgwjDBcxfHOH0t0gbRK95rZNWGZhwAxnPuXfB2mx834xL */(
      Class0366 var0
   ) {
      return var0.8V6qn5ABlxG27N2dj74M76Fdekvy6Bc5Y8Bt75ua8WG6cLr93ShB0uzO78b8;
   }

   static void _yy85E6tKv0h9SiwJ65701363937A4EOMfoB89zEEI1nqt2xx4VrRnOlzyhj/* $VF was: 8yy85E6tKv0h9SiwJ65701363937A4EOMfoB89zEEI1nqt2xx4VrRnOlzyhj */(
      Class0366 var0
   ) {
      var0._eN1uet7t6482Y80TM8979deRBqgnffmz6H92O77U1GNg7epr40H4IB4XQ47/* $VF was: 2eN1uet7t6482Y80TM8979deRBqgnffmz6H92O77U1GNg7epr40H4IB4XQ47 */();
   }

   static void _zUg528OHzkkC6ZRi4ePkUR3x1AZg8960A4WOanh78HaZS5Gs75Ry9mtK4kT/* $VF was: 3zUg528OHzkkC6ZRi4ePkUR3x1AZg8960A4WOanh78HaZS5Gs75Ry9mtK4kT */(
      Class0366 var0
   ) {
      var0._feCNKdM8rk7hx6HUbAI9JRO8UkQCGlJ39Cj0m6UBfilH64kAtJkqzR7S9Fn/* $VF was: 6feCNKdM8rk7hx6HUbAI9JRO8UkQCGlJ39Cj0m6UBfilH64kAtJkqzR7S9Fn */();
   }

   static Thread _278Psad56wynla1kmD6wLG09D0rzuk04KM3D8Z336E5LS462iBvO4Mh0v80/* $VF was: 1278Psad56wynla1kmD6wLG09D0rzuk04KM3D8Z336E5LS462iBvO4Mh0v80 */(
      Class0366 var0
   ) {
      return var0.8Ud2P94B6X1iOrQ3PIQT5Z3c40xfhO15XV46MG41nCYQ8J47oc42jHzO4Bg4;
   }

   static Thread _dGTASn0UkVLGO5kBlm6F0ab6WjSgKR9CZ2EQX0KPP0D45Y0gY803Ox49c83/* $VF was: 9dGTASn0UkVLGO5kBlm6F0ab6WjSgKR9CZ2EQX0KPP0D45Y0gY803Ox49c83 */(
      Class0366 var0
   ) {
      return var0.9N75Xhz3trd12041V3iJO8o2K9iM3um00oV1I2dxG6vBAxd6K6Lq66WJeArp;
   }
}
