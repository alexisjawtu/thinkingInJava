//: PassObject.java

class Letter {
    char c;
} 

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter l = new Letter();
        l.c      = 'a';
        System.out.println(l.c);
        f(l);
        System.out.println(l.c);
    }
} ///:~