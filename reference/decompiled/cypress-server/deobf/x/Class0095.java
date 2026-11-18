package x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Class0095 extends Class0297 {
   public Class0095() {
   }

   public Class0095(int var1, byte var2, byte var3, byte var4) {
      super(var1);
      this.0bSe8QukB10a9hkfqFP6r3ORWu572TY0ln7ZITi1ZZq87fHYXs382fSQa39W = var2;
      this.5l263ov3j3DZIu4i4160zNdx1FcGOt5zB7QAkppeFi5vk0cb5fnj3k7FEwLi = var3;
      this.2j7r5j8JV6au68j2Fcm5YT7bXkxKc9aOsWF8w6t31CXeRfe6hMI99j0LZmXG = var4;
   }

   @Override
   public void _qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(
      DataInputStream var1
   ) throws IOException {
      super._qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7/* $VF was: 8qhw6A4EslqpVZ63e42sD0REgup92H2zUcQWpaOE1StQ9Kdk5791Xo4GB3X7 */(var1);
      this.0bSe8QukB10a9hkfqFP6r3ORWu572TY0ln7ZITi1ZZq87fHYXs382fSQa39W = var1.readByte();
      this.5l263ov3j3DZIu4i4160zNdx1FcGOt5zB7QAkppeFi5vk0cb5fnj3k7FEwLi = var1.readByte();
      this.2j7r5j8JV6au68j2Fcm5YT7bXkxKc9aOsWF8w6t31CXeRfe6hMI99j0LZmXG = var1.readByte();
   }

   @Override
   public void _1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(
      DataOutputStream var1
   ) throws IOException {
      super._1Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p/* $VF was: 41Miq5T44663q6NA3206qDn48g30EA5MBLWwRcJYSz4pD3H1YBZF53hLMY5p */(var1);
      var1.writeByte(this.0bSe8QukB10a9hkfqFP6r3ORWu572TY0ln7ZITi1ZZq87fHYXs382fSQa39W);
      var1.writeByte(this.5l263ov3j3DZIu4i4160zNdx1FcGOt5zB7QAkppeFi5vk0cb5fnj3k7FEwLi);
      var1.writeByte(this.2j7r5j8JV6au68j2Fcm5YT7bXkxKc9aOsWF8w6t31CXeRfe6hMI99j0LZmXG);
   }

   @Override
   public int _30Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw/* $VF was: 130Zt153KN5e52LOL9qGnlh9YFuyDXFo2JRDr4eU7fNS5QX1t9g730RYlwbw */() {
      return 7;
   }
}
