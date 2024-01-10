public class LoopExample {
    public static void main(String[] args) {
        // Example 1: for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        System.out.println("------------------------");

        // Example 2: while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Loop iteration: " + j);
            j++;
        }

        System.out.println("------------------------");

        // Example 3: do-while loop
        int k = 1;
        do {
            System.out.println("Loop iteration: " + k);
            k++;
        } while (k <= 5);
    }
}