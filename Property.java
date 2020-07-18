//: Property.java
import java.util.*;

/** The first Thinking in Java example program.
 * Lists system information on current machine.
 * @author Bruce Eckel
 * @author http://www.BruceEckel.com
 * @version 1.0
*/
public class Property {
    /** Sole entry point to class & application
     * @param args array of string arguments
     * @return No return value
     * @exception exceptions No exceptions thrown
    */
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties(); // static
        p.list(System.out);
        System.out.println("--- Mem Usage:");
        Runtime rt = Runtime.getRuntime();     // static
        System.out.println("Total Mem = "
                           + rt.totalMemory() + "\n" //strings and numbers!
                           + "Free Mem = "
                           + rt.freeMemory());
        System.out.println(args[0]);
        System.out.println(args.length);
        System.out.println("alexis " + 3);
    }
} ///:~