//: VowelsAndConsonants.java

public class VowelsAndConsonants {
    public static void main(String[] args) {
        double d = Math.random() * 26;
        System.out.println(d);
        double e = d + 'a';
        System.out.println(e);
        char a = (char)(84);
        System.out.println(a);
        char b = (char)(84.67);
        System.out.println(b);
        //----------------------------------------
        char c = (char)(Math.random() * 26 + 'a');
        System.out.print(c + ": ");
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("phonetic vowel");
                break;
            default: 
                System.out.println("consonant");
        }
    }
}