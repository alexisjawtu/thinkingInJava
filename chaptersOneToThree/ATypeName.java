/** A class documentation */
public class ATypeName {
    /** A field documentation */
    int i;
    float f;
    boolean b;
    char c;
    /** A method documentation */
    int storage (String s) {
        return s.length() * 2;
    }

}
/** Another class documentation */
class StaticTest {

    static int i = 47;

}
/** And yot Another class  */
class StaticFun {
    /** Another method documentation */
    static void incr() {
        StaticTest.i++;
    }
}