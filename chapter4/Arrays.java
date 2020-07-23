//: Arrays.java

public class Arrays {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2; // just the handle
        short[] s1 = new short[14];
        a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i]++;
        }
        for (int i = 0; i < a1.length; i++) {
            prt("a1[" + i + "] = " + a1[i]);
        }
        int[] a3 = new int[13];
        prt("l: " + a3.length);
        for  (int i = 0; i < a3.length; i++) {
            prt("a3[" + i + "] = " + a3[i]);
        }

        Integer[] arr = new Integer[17];
        prt("l arr: " + arr.length);
        for  (int i = 0; i < arr.length; i++) {
            arr[i] = i-8;
            //arr[i] = new Integer(i-8);
            prt("arr[" + i + "] = " + arr[i]);
        }

        Integer[] arr3 = { 1, 4, 5};

        Integer[] arr2 = {
            new Integer(1),
            new Integer(2),
            new Integer(3),
        };

        Integer[] arr4 = new Integer[] {
            new Integer(1),
            new Integer(2),
            new Integer(3),
        };

        Integer[] arr5 = new Integer[] { 3, 7, 19};

        prt("arr5 " + arr5[1]);

    }
    static void prt(String s) {
        System.out.println(s);
    }
}