package ext;

import java.util.Random;

public class Class229 extends Class407 {
   protected Class229(int var1, int var2) {
      super(var1, var2, Class160.field_1787);
      this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   @Override
   public Class630 method_1250(Class454 var1, int var2, int var3, int var4) {
      return null;
   }

   @Override
   public boolean method_143() {
      return false;
   }

   @Override
   public Class366 method_489(Class454 var1, int var2, int var3, int var4, Class214 var5, Class214 var6) {
      this.method_547(var1, var2, var3, var4);
      return super.method_489(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_547(Interface698 var1, int var2, int var3, int var4) {
      int var5 = var1.method_1110(var2, var3, var4);
      if (var5 >= 2 && var5 <= 5) {
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.method_1930(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }
   }

   @Override
   public int method_1411(int var1, int var2) {
      return var2 >= 6 ? this.field_2119 - 16 : this.field_2119;
   }

   @Override
   public boolean method_607() {
      return false;
   }

   @Override
   public int method_178() {
      return 9;
   }

   @Override
   public int method_806(Random var1) {
      return 1;
   }

   @Override
   public boolean method_1531(Class454 var1, int var2, int var3, int var4) {
      return var1.method_768(var2, var3 - 1, var4);
   }

   @Override
   public void method_1592(Class454 var1, int var2, int var3, int var4) {
      var1.method_518(var2, var3, var4, 15);
      this.method_914(var1, var2, var3, var4);
   }

   @Override
   public void method_1300(Class454 var1, int var2, int var3, int var4, int var5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Constructor ext/Class236.<init>(Lext/Class229;Lext/Class454;III)V not found
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExprUtil.getSyntheticParametersMask(ExprUtil.java:49)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:982)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:462)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:592)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:594)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.IfExprent.toJava(IfExprent.java:95)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:210)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:860)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:251)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:860)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
      //
      // Bytecode:
      // 00: aload 1
      // 01: iload 2
      // 02: iload 3
      // 03: iload 4
      // 05: invokevirtual ext/Class454.method_1110 (III)I
      // 08: istore 6
      // 0a: bipush 0
      // 0b: istore 7
      // 0d: aload 1
      // 0e: iload 2
      // 0f: iload 3
      // 10: bipush 1
      // 11: isub
      // 12: iload 4
      // 14: invokevirtual ext/Class454.method_768 (III)Z
      // 17: ifne 1d
      // 1a: bipush 1
      // 1b: istore 7
      // 1d: iload 6
      // 1f: bipush 2
      // 20: if_icmpne 33
      // 23: aload 1
      // 24: iload 2
      // 25: bipush 1
      // 26: iadd
      // 27: iload 3
      // 28: iload 4
      // 2a: invokevirtual ext/Class454.method_768 (III)Z
      // 2d: ifne 33
      // 30: bipush 1
      // 31: istore 7
      // 33: iload 6
      // 35: bipush 3
      // 36: if_icmpne 49
      // 39: aload 1
      // 3a: iload 2
      // 3b: bipush 1
      // 3c: isub
      // 3d: iload 3
      // 3e: iload 4
      // 40: invokevirtual ext/Class454.method_768 (III)Z
      // 43: ifne 49
      // 46: bipush 1
      // 47: istore 7
      // 49: iload 6
      // 4b: bipush 4
      // 4c: if_icmpne 5f
      // 4f: aload 1
      // 50: iload 2
      // 51: iload 3
      // 52: iload 4
      // 54: bipush 1
      // 55: isub
      // 56: invokevirtual ext/Class454.method_768 (III)Z
      // 59: ifne 5f
      // 5c: bipush 1
      // 5d: istore 7
      // 5f: iload 6
      // 61: bipush 5
      // 62: if_icmpne 75
      // 65: aload 1
      // 66: iload 2
      // 67: iload 3
      // 68: iload 4
      // 6a: bipush 1
      // 6b: iadd
      // 6c: invokevirtual ext/Class454.method_768 (III)Z
      // 6f: ifne 75
      // 72: bipush 1
      // 73: istore 7
      // 75: iload 7
      // 77: ifeq 98
      // 7a: aload 0
      // 7b: aload 1
      // 7c: iload 2
      // 7d: iload 3
      // 7e: iload 4
      // 80: aload 1
      // 81: iload 2
      // 82: iload 3
      // 83: iload 4
      // 85: invokevirtual ext/Class454.method_1110 (III)I
      // 88: invokevirtual ext/Class229.method_1227 (Lext/Class454;IIII)V
      // 8b: aload 1
      // 8c: iload 2
      // 8d: iload 3
      // 8e: iload 4
      // 90: bipush 0
      // 91: invokevirtual ext/Class454.method_1481 (IIII)Z
      // 94: pop
      // 95: goto c6
      // 98: iload 5
      // 9a: ifle c6
      // 9d: getstatic ext/Class407.field_495 [Lext/Class407;
      // a0: iload 5
      // a2: aaload
      // a3: invokevirtual ext/Class407.method_3 ()Z
      // a6: ifeq c6
      // a9: new ext/Class236
      // ac: dup
      // ad: aload 0
      // ae: aload 1
      // af: iload 2
      // b0: iload 3
      // b1: iload 4
      // b3: invokespecial ext/Class236.<init> (Lext/Class229;Lext/Class454;III)V
      // b6: invokestatic ext/Class236.method_1658 (Lext/Class236;)I
      // b9: bipush 3
      // ba: if_icmpne c6
      // bd: aload 0
      // be: aload 1
      // bf: iload 2
      // c0: iload 3
      // c1: iload 4
      // c3: invokespecial ext/Class229.method_914 (Lext/Class454;III)V
      // c6: return
   }

   private void method_914(Class454 var1, int var2, int var3, int var4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Constructor ext/Class236.<init>(Lext/Class229;Lext/Class454;III)V not found
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExprUtil.getSyntheticParametersMask(ExprUtil.java:49)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:982)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:462)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:813)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:925)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:87)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
      //
      // Bytecode:
      // 00: new ext/Class236
      // 03: dup
      // 04: aload 0
      // 05: aload 1
      // 06: iload 2
      // 07: iload 3
      // 08: iload 4
      // 0a: invokespecial ext/Class236.<init> (Lext/Class229;Lext/Class454;III)V
      // 0d: aload 1
      // 0e: iload 2
      // 0f: iload 3
      // 10: iload 4
      // 12: invokevirtual ext/Class454.method_266 (III)Z
      // 15: invokevirtual ext/Class236.method_687 (Z)V
      // 18: return
   }
}
