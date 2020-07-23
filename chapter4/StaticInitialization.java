//: StaticInitialization.java
//  here we see those "automagic" stuffs happening

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Table {
    static Bowl b1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        b2.f(1);
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl b2 = new Bowl(2);
}

class Cupboard {
    Bowl b3 = new Bowl(3);
    static Bowl b4 = new Bowl(4); // statics initialized first!!
    Cupboard() {
        System.out.println("Cupboard()");
        b4.f(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl b5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("new Cupboard() in main");
        new Cupboard(); // first the non static members AND THEN the constructor, and not the statics
        System.out.println("new Cupboard() in main");
        new Cupboard();
        t2.f2(1);
        c3.f3(1);
    }
    static Table t2 = new Table();
    static Cupboard c3 = new Cupboard();
    static Table t3 = new Table(); // Table.b1 and Table.b2 are not initialized again!
                                   // static members are initialized only once for the 
                                   // entire class.
}