//: MathOps.java
import java.util.*;

public class MathOps {
    static void prt(String s) {
        System.out.println(s);
    }
    static void pInt(String s, int i) {
        prt(s + " = " + i);
    }
    static void pFlt(String s, float f) {
        prt(s + " = " + f);
    }
    static void pChr(String s, char c) {
        prt(s + " = " + c);
    }
    static void pByte(String s, byte b) {
        prt(s + " = " + b);
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        j = rand.nextInt() % 100;
        int stop = 0;
        while (j == 0 && stop < 100) {
            j = rand.nextInt() % 100;
            stop += 1;
        }
        k = rand.nextInt() % 100;
        pInt("j",j); pInt("k",k);
        i = k / j; pInt("k / j", i);
        i = k % j; pInt("k % j", i);
        j %= k; pInt("j %= k", j);
        int r = 27;
        int s = 4;
        r %= s;
        pInt("r %= s", r);
        // Floating point tests
        float u,v,w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        pFlt("v", v); pFlt("w", w);
        u = v / w; pFlt("v / w", u);
        u /= v; pFlt("u /= v", u);
        System.out.println("\n");

        char c1 = 'y'; char c2 = 'q';
        c1 += c2;
        pChr("c1 += c2", c1);

        char c3 = 'y' + 'q';
        System.out.println(c3);

        System.out.println("erf " + c3);

        c1 /= c2;
        pChr("c1 /= c2", c1);

        c1 *= c2;
        pChr("c1 *= c2", c1);

        char c4 = 'y'; char c5 = 'q';
        c4 -= c5;
        pChr("c4 -= c5", c4);

        System.out.println('y'+'q'); // an int!
        System.out.println('y'-'q');

        String s2 = Character.toString(c3);
        System.out.println("toString");
        System.out.println(s2);
        String s3 = "" + (c3);
        System.out.println("empty string");
        System.out.println(s3);
        byte b1 = 34;
        byte b2 = 4;
        b1 -= b2;
        pByte("b1 -= b2", b1);
    }
} ///:~