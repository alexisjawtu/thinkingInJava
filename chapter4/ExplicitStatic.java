//: ExplicitStatic.java

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");  // printed only for Cups x!
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
    Cups() {  // printed twice!! non static, for Cups x and Cups y.
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99);
    }
    static Cups x = new Cups(); // Remember static members are initialized only the FIRST TIME
    static Cups y = new Cups();
}