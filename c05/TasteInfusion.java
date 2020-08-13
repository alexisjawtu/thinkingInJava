//: TasteInfusion.java
// chapter 5 exercise 1

class TasteInfusion {
    public static void main(String[] args) {
        Infusion mate = new Infusion();
        mate.name = "mate";
        //mate.volume = 3.32;
        mate.i = 3; // protected implies friendly
        mate.b = (32 < 4);
        //String color = mate.Color();
        mate.foo();
        int n = mate.points('r');
    }
}