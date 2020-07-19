public class HelloWorld {

    static int ternary(int i) {
        return i < 10 ? i : 10;
    }

    public static void main(String[] args) {

        System.out.println("Hello, world!");
        System.out.println(ternary(4));
        System.out.println(ternary(14));

        int x = 0, y = 1, z = 2;
        String sString = "x, y, z ";

        //First print!
        System.out.println(sString + x + y + z);
        //First add!
        System.out.println(8 + x + y + z + sString);

        // Castings
        int r = (int)(char)101;
        System.out.println(r);
        float b = (float)(char)101;
        System.out.println(b);

        int k = 0xffff;
        System.out.println("k: " + k);

        // hexa
        char c = 0xffff;
        char s = (char)101;
        char t = 101;
        System.out.println(s  + "  " + t);

        // base eight, just put a leading 0
        int i3 = 0177;
        System.out.println(i3);

        System.out.println(Math.E);
        System.out.println(Math.PI);
        byte aByte = (byte)14;
        System.out.println(aByte);

    }
}