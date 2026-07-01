import java.util.Scanner;

/**
 * PairSum.java
 *
 * Interactive console program that searches for a unique pair of
 * numbers in an array whose sum equals a user-provided target value.
 *
 * Algorithm: Brute Force (Nested Loop) Search
 * Time Complexity: O(n^2) - every pair (i, j) with i < j is checked.
 * Space Complexity: O(n) - for storing the input array.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 1) {
            System.out.print("Array size must be at least 2. Please enter again: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array and collect its elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force nested-loop search for a matching pair
        boolean found = false;
        int indexA = -1;
        int indexB = -1;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    indexA = i;
                    indexB = j;
                    found = true;
                    break;
                }
            }
        }

        // Step 5: Display results in a clean, professional format
        System.out.println("\n===== Pair Sum (Brute Force): Results =====");
        if (found) {
            System.out.println("Pair Found!");
            System.out.println("Index A: " + indexA + "  ->  Value: " + numbers[indexA]);
            System.out.println("Index B: " + indexB + "  ->  Value: " + numbers[indexB]);
            System.out.println("Equation: " + numbers[indexA] + " + " + numbers[indexB]
                    + " = " + target);
        } else {
            System.out.println("No pair was found that sums to " + target + ".");
        }
        System.out.println("=============================================");

        scanner.close();
    }
}
