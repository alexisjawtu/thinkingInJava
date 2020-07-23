//: OrderOfInitialization.java
// first all the member variables, then de constructor,
// no matter where they are in the code

class Tag {
    Tag(int marker) {
        System.out.println("Tag(" + marker + ")");
    }
}

class Card {
    Tag t1 = new Tag(1); // befor Card constructor
    Card() {
        // we are in the constructor
        System.out.println("Card()");
        t3 = new Tag(33); // re-initialize t3
    }
    Tag t2 = new Tag(2); // after constructor
    void f() {
        System.out.println("f()");
    }
    Tag t3 = new Tag(3); // at end
}

class OrderOfInitialization {
    public static void main(String[] args) {
        Card c = new Card();
        c.f(); // construction is done
    }
}