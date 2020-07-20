//: Flower.java

public class Flower {
    private int petalCount = 0;
    private String s       = new String("null");
    Flower(int petals) {
        this.petalCount = petals;
        System.out.println("Constr int arg only: " + petals);
    }
    Flower(String ss) {
        System.out.println("Constr Str arg only: " + ss);
    }
    Flower(String s, int petals) {
        this(petals);
        //! this(s); // can't call two!
        this.s = s; // another need of this
        System.out.println("Str and int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("default, no args");
    }
    void print() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }
}