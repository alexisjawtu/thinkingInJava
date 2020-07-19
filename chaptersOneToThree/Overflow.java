//: Overflow.java

public class Overflow {
    public static void main(String[] args) {
        int big = 0x7fffffff; // 2^31 - 1 
        prt("big " + big);
        int bigger = big * 4;
        prt("bigger " + bigger);
    }
    static void prt(String s) {
        System.out.println(s);
    }
}