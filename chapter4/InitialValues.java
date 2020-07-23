//: InitialValues.java
//  member primitives initialization is guaranteed with default primitive values.

class Depth {
    int depth;
}

class Measurement {
    boolean v = true; // we can initialize at this point! Not in C ++
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    Depth delta = new Depth();
    Depth delta2; // <--  this is null!

    void print() {
        System.out.println(
            "type\tvalue\n" + 
            "boolean\t" + v + "\n" +
            "char\t" + c + "\n" + // char default is a null! Not an "empty char".
            "byte\t" + b + "\n" +
            "short\t" + s + "\n" +
            "int\t" + i + "\n" +
            "long\t" + l + "\n" +
            "float\t" + f + "\n" +
            "double\t" + d);
    }
}

public class InitialValues {
    public static void main(String[] args) {
        Measurement m = new Measurement();
        m.delta.depth = 4;
        System.out.println(m.delta.depth);
        m.print();
        m.l = 1234L;
        m.print();
        new Measurement().print(); // another way! Object without handle.
        Measurement w;             // object handle not referenced to any object.
                                   // this one is given the value of null!
    }
}