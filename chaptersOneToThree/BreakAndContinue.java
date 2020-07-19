//: BreakAndContinue.java

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.println(i);
        }
        int i = 0; // different scope and lyfecycle
        // An infinite (?) loop
        int z = 0; 
        while (true && z <= 1000) {
            z ++;
            int j = i * 27;
            if(j == 1269) break;
            if(i % 10 != 0) continue; // Be aware. Continue goes back to 
                                      // the TOP of the compound statement
            System.out.println(i);
            i ++;
        }
        System.out.println(z);
        // ProjectEuler #1 without inclusion--exclusion
        int sum = 0; int k = 0;
        while (k < 1000) {
            if ((k % 3 == 0) || (k % 5 == 0)) {
                sum += k;
            }
            k++;
        }
        System.out.println(sum);
    }
}