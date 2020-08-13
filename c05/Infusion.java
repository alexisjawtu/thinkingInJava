//: Infusion.java
// chapter 5 exercise 1

class Infusion {
    public String name;
    private double volume;
    protected int i;
    boolean b = true;

    public Infusion() {
        System.out.println("im tasty");
    }

    private String Color() {
        return "green";
    }

    protected void foo(){
        System.out.println("foo()");
    }

    int points(char c) {
        return this.i + c;
    }
}