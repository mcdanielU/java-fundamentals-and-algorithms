package Sandbox.CleanArchitecture;

public class DjistraGotoBadExample {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i] == 3 && numbers[j] == 4) {
                        found = true;
                        break; // Breaking out of the inner loop
                    }
                }
                if (found) {
                    break; // Breaking out of the outer loop
                }
            }

            if (found) {
                System.out.println("Found the numbers 3 and 4.");
            } else {
                System.out.println("Numbers 3 and 4 not found.");
            }
        }

}
