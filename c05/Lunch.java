//: Lunch.java

class Soup {

    private static int howMany;

    private Soup() {

    }
    // option 1:

    // TODO think this
    public static Soup makeSoup() {
        // if (howMany < 11) {
        //     howMany++;
        //     return new Soup();
        // }
        return new Soup();
    }

    // option 2. Make a singleton:
    private static Soup ps1 = new Soup();
    public static Soup access() {
        return ps1;              // reference to the same singleton over and over.
    }
    public void f() {

    }
}

class Sandwich {
    void f() {
        new Lunch();
    }
}

public class Lunch {
    void test() {
        // Soup priv1 = new Soup(); // not allowed
        Soup priv2 = Soup.makeSoup(); // allowed
        Sandwich f1 = new Sandwich();

        Soup priv3 = Soup.access();

        Soup.access().f();

    }
}