class Value {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value n = new Value();
        Value m = new Value();

        n.i = m.i = 100;

        System.out.println(n == m);
        System.out.println(n != m);

        System.out.println(n.equals(m));
    }
}