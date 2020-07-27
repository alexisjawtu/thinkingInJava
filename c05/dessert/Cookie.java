//: Cookie.java
/* chain of accessibility
# private
# friendly: adds package access to previous
# protected: adds inheritor access to previous
# public: adds everyone acces to previous
*/

package c05.dessert;
import com.alexisjawtuschenko.tools.P;

public class Cookie {
    public Cookie() {
        P.rintln("Cookie constr.");
    }
    //void foo() {               // friendly
    protected void foo() {       // friendly & inheritor-friendly
        P.rintln("foo");
    }
}