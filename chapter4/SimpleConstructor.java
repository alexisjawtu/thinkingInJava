//: SimpleConstructor.java

class Rock {
    Rock(int i) {
        System.out.println("Creating Rock " + i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Rock r = new Rock(i);
        }
    }
}