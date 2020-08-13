//: Lunch.java

class Soup {                         // package friendly access

    private static int howMany;

    private Soup() {

    }
    // option 1:

    // Here we can control how many instances.
    public static Soup makeSoup() {
        Soup ret;
        if (howMany < 11) {
            howMany++;
            ret = new Soup();
        }
        else {
            ret = ps1;
        }
        return ret; 
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
    public static void main(String[] args) {
        // Soup priv1 = new Soup(); // not allowed
        Soup[] soups = new Soup[14];

        for (int i = 0; i < 14; i++) {
            soups[i] = Soup.makeSoup();
            System.out.println(i + " " + soups[i]);
        }
        Sandwich f1 = new Sandwich();
        Soup priv3 = Soup.access();   // to the singleton
        System.out.println("sigleton: " + priv3);
        Soup.access().f();
    }
}