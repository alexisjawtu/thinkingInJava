// ShortCircuit
// short-circuiting with logical 
public class ShortCircuit {
    static boolean test(int val, int nTest) {
        System.out.println("test"+nTest+"(" + val + ")");
        System.out.println("result: " + (val < nTest));
        return val < nTest;
    }
    public static void main(String[] args) {
        if(test(0,1) && test(2,2) && test(2,3))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }
}