import java.util.*;

public class AnExperiment {

    boolean flag() {
        return true;
    }

    float naturalLogBase() {
        return 2.718f;
    }

    void nothing() {
        return;
    }

    void nothing2() {}

    public static void main(String[] args) {

        int x = 0;
        {
            int q = 2;
            System.out.println("las dos!");
            System.out.println(x);
            System.out.println(q);

            String s = new String ("alexis boris");

            System.out.println(s);

        }

        System.out.println("una!");
        System.out.println(x);
        ATypeName a = new ATypeName ();
        a.i = 3;
        //a.b = true;
        a.f = 3.4f;
        System.out.println(a.b);
        System.out.println('\u0000'); // <-- null
        System.out.println(a.storage("abracadabra"));

        StaticTest s1 = new StaticTest ();
        StaticTest s2 = new StaticTest ();
        s2.i = 32;
        StaticTest.i = 86;
        StaticTest.i++;
        System.out.println(s1.i);
        System.out.println(s2.i);

        //StaticFun sf = new StaticFun();
        //sf.incr();
        System.out.println(StaticTest.i);
        StaticFun.incr();
        System.out.println(StaticTest.i);
    }
}
