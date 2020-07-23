//: MultiDimArray.java

import java.util.*;

public class MultiDimArray {
    static Random rand = new Random();
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod;
    }
    public static void main(String[] args) {
        int[][] a1 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 4, 5, 6, 7, 8 },
        };
        int[][][] a2 = new int[4][3][8];
        Integer[][] a5;
        a5 = new Integer[3][];
        System.out.println(a5.length);
        for  (int i = 0; i < a5.length; i++) {
            a5[i] = new Integer[3*i+i*i];
            for (int j = 0; j < a5[i].length; j++) {
                a5[i][j] = i*j;
                System.out.println(a5[i][j]);
            }
            System.out.println(a5[0].length);
        }
    }
}