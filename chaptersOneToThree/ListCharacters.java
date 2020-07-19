//: ListCharacters.java

public class ListCharacters {
    public static void main(String[] args) {
        char d = 70;
        System.out.println(d);
        ++d;
        if (100>d)
            System.out.println(d);
        for (char c = 0; c < 128; c++) {
            if (c != 26) // ANSI clear screen
                System.out.println("value: " + (int)c + " character: " + c);
        }
        for (int i = 0, j = 1, k = 3; (i < 5) && (j + k != 3); i++, j--, k += 2) {
            j = k;
            k--;
            System.out.println(i + " " + j + " " + k);
        }
    }
}