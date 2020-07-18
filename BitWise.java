// BitWise.java
import java.util.*;

public class BitWise {
    public static void main(String[] args) {
    /*  System.out.println(13 & 7);
        int a = 13;
        a &= 7;
        System.out.println(a);
        a ^= 7;
        System.out.println(a);
        a |= 7;
        System.out.println(a);*/

        Random rand = new Random();
        long i = rand.nextLong();
        long j = rand.nextLong();
        long z = 454L;
        pBinLong("a ver", z);
        pBinLong("a ver", 382174L);
        pBinLong("a ver", 831247L);
        pBinLong("a ver", 124387L);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        System.out.println(Integer.toBinaryString(-0));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Integer.toBinaryString(-4));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(Integer.toBinaryString(-7));
        System.out.println(Integer.toBinaryString(-8));
        System.out.println(Integer.toBinaryString(-9));
        System.out.println(~(-8));
        System.out.println("---x---");
        System.out.println(Integer.toBinaryString(-9));
        System.out.println(Integer.toBinaryString(-9>>1));
        System.out.println(-9>>1);
        System.out.println(Integer.toBinaryString(-9<<1));
        System.out.println(-9<<1);
        System.out.println("---x---");
        System.out.println(Integer.toBinaryString(-9));
        System.out.println(Integer.toBinaryString(-9>>>1));
        System.out.println(-9>>>1);

    }
    static void pBinLong(String s, long l) {
        System.out.print(
            s + ", long: " + l + ", binary: ");
        for(int i = 63; i >= 0; i--) {
            if(((1L << i) & l) != 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }
}
// 11111111111111111111111111111101 repŕesents -3