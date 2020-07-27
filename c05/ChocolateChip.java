//: ChocolateChip.java
import c05.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constr");
    }
    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.foo();          // access denied unless declared protected
    }
}