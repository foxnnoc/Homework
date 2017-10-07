package lesson3.task2;

public class Transformation {
    public static void main(String[] args) {
        toByte();
        toShort();
        toInt();
        toLong();
        toDouble();
        toFloat();
        toChar();
    }

    private static void toByte() {
        short sh = 125;
        int i = 54686239;
        long qlong = 654845269;
        double d = 548.8;
        float f = 2579.5488f;
        char ch = 154;
        byte byte1 = (byte) sh;
        byte byte2 = (byte) i;
        byte byte3 = (byte) qlong;
        byte byte4 = (byte) d;
        byte byte5 = (byte) f;
        byte byte6 = (byte) ch;
        System.out.println("Преобразование short(" + sh + ") toByte: " + byte1);
        System.out.println("Преобразование int(" + i + ") toByte: " + byte2);
        System.out.println("Преобразование qlong(" + qlong + ") toByte: " + byte3);
        System.out.println("Преобразование double(" + d + ") toByte: " + byte4);
        System.out.println("Преобразование float(" + f + ") toByte: " + byte5);
        System.out.println("Преобразование char(" + ch + ") toByte: " + byte6);
        System.out.println();
    }

    private static void toShort() {
        byte b = 125;
        int i = 54686239;
        long qlong = 654845269;
        double d = 548.8;
        float f = 2579.5488f;
        char ch = 259;
        short short1 = b;
        short short2 = (short) i;
        short short3 = (short) qlong;
        short short4 = (short) d;
        short short5 = (short) f;
        short short6 = (short) ch;
        System.out.println("Преобразование byte(" + b + ") to Short: " + short1);
        System.out.println("Преобразование int(" + i + ") to Short: " + short2);
        System.out.println("Преобразование qlong(" + qlong + ") to Short: " + short3);
        System.out.println("Преобразование double(" + d + ") to Short: " + short4);
        System.out.println("Преобразование float(" + f + ") to Short: " + short5);
        System.out.println("Преобразование char(" + ch + ") to Short: " + short6);
        System.out.println();
    }

    private static void toInt() {
        byte b = 125;
        short sh = 5459;
        long qlong = 654845269;
        double d = 548.8;
        float f = 2579.5488f;
        char ch = 259;
        int int1 = b;
        int int2 = sh;
        int int3 = (int) qlong;
        int int4 = (int) d;
        int int5 = (int) f;
        int int6 = ch;
        System.out.println("Преобразование byte(" + b + ") to Int: " + int1);
        System.out.println("Преобразование short(" + sh + ") to Int: " + int2);
        System.out.println("Преобразование qlong(" + qlong + ") to Int: " + int3);
        System.out.println("Преобразование double(" + d + ") to Int: " + int4);
        System.out.println("Преобразование float(" + f + ") to Int: " + int5);
        System.out.println("Преобразование char(" + ch + ") to Int: " + int6);
        System.out.println();
    }

    private static void toLong() {
        byte b = 125;
        short sh = 5459;
        int i = 654845269;
        double d = 548.8;
        float f = 2579.5488f;
        char ch = 259;
        long qlong1 = b;
        long qlong2 = sh;
        long qlong3 = i;
        long qlong4 = (long) d;
        long qlong5 = (long) f;
        long qlong6 = ch;
        System.out.println("Преобразование byte(" + b + ") to Long: " + qlong1);
        System.out.println("Преобразование short(" + sh + ") to Long: " + qlong2);
        System.out.println("Преобразование int(" + i + ") to Long: " + qlong3);
        System.out.println("Преобразование double(" + d + ") to Long: " + qlong4);
        System.out.println("Преобразование float(" + f + ")to Long: " + qlong5);
        System.out.println("Преобразование char(" + ch + ") to Long: " + qlong6);
        System.out.println();
    }

    private static void toDouble() {
        byte b = 125;
        short sh = 5459;
        int i = 654845269;
        long qlong = 548154542;
        float f = 2579.5488f;
        char ch = 259;
        double double1 = b;
        double double2 = sh;
        double double3 = i;
        double double4 = qlong;
        double double5 = f;
        double double6 = ch;
        System.out.println("Преобразование byte(" + b + ") to Double: " + double1);
        System.out.println("Преобразование short(" + sh + ") to Double: " + double2);
        System.out.println("Преобразование int(" + i + ") to Double: " + double3);
        System.out.println("Преобразование qlong(" + qlong + ") to Double: " + double4);
        System.out.println("Преобразование float(" + f + ")to Double: " + double5);
        System.out.println("Преобразование char(" + ch + ") to Double: " + double6);
        System.out.println();
    }

    private static void toFloat() {
        byte b = 125;
        short sh = 5459;
        int i = 654845269;
        long qlong = 548154542;
        double d = 2579.5488;
        char ch = 259;
        float float1 = b;
        float float2 = sh;
        float float3 = i;
        float float4 = qlong;
        float float5 = (float) d;
        float float6 = ch;
        System.out.println("Преобразование byte(" + b + ") to Float: " + float1);
        System.out.println("Преобразование short(" + sh + ") to Float: " + float2);
        System.out.println("Преобразование int(" + i + ") to Float: " + float3);
        System.out.println("Преобразование qlong(" + qlong + ") to Float: " + float4);
        System.out.println("Преобразование double(" + d + ") to Float: " + float5);
        System.out.println("Преобразование char(" + ch + ") to Float: " + float6);
        System.out.println();
    }

    private static void toChar() {
        byte b = 125;
        short sh = 5459;
        int i = 654845269;
        long qlong = 548154542;
        double d = 2579.5488;
        float f = 259.258f;
        char char1 = (char) b;
        char char2 = (char) sh;
        char char3 = (char) i;
        char char4 = (char) qlong;
        char char5 = (char) d;
        char char6 = (char) f;
        System.out.println("Преобразование byte(" + b + ") to Char: " + char1);
        System.out.println("Преобразование short(" + sh + ") to Char: " + char2);
        System.out.println("Преобразование int(" + i + ") to Char: " + char3);
        System.out.println("Преобразование qlong(" + qlong + ") to Char: " + char4);
        System.out.println("Преобразование double(" + d + ") to Char: " + char5);
        System.out.println("Преобразование float(" + f + ") to Char: " + char6);
        System.out.println();
    }
}

