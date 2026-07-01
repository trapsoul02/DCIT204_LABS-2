import java.util.Scanner;

/**
 * FindMax.java
 *
 * Interactive console program that finds the maximum value in an
 * array of integers, along with the index at which it occurs.
 *
 * Algorithm: Linear Search
 * Time Complexity: O(n) - the array is scanned exactly once.
 * Space Complexity: O(n) - for storing the input array.
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Basic validation: array must have at least one element
        while (size <= 0) {
            System.out.print("Array size must be greater than 0. Please enter again: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array and collect its elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("  Element[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Linear search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 4: Display results in a clean, professional format
        System.out.println("\n===== Find Maximum: Results =====");
        System.out.print("Array Entered: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("==================================");

        scanner.close();
    }
}
