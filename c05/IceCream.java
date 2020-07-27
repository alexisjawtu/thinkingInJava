//: IceCream.java
import com.alexisjawtuschenko.tools.*;

class Sundae {
    private Sundae() {

    }
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        // Sundae z = new Sundae(); //! Wrong!
        Sundae x = Sundae.makeASundae();
        P.rintln(x);
    }
}