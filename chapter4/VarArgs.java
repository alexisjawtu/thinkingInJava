//: VarArgs.java

class A { 
    int i; 
}

public class VarArgs {
    static void f(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args) {
        f(new Object[] {
            new Integer(47), new VarArgs(), new Float(4.13) });
        f(new Object[] { "oine", "two", "three"});
        f(new Object[] { new A(), new A(), new A() });
    }
}