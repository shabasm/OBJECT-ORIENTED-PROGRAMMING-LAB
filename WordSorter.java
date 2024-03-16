import java.util.Arrays;
import java.util.Scanner;

public class WordSorter {
    public static void main(String args[]) {
        int arraySize;
        // Using try-with-resources to automatically close the Scanner object
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter the size of the array: ");
            arraySize = scanner.nextInt();
            System.out.print("Enter words: ");
            String[] wordArray = new String[arraySize];
            for (int i = 0; i < arraySize; i++) {
                wordArray[i] = scanner.next();
            }

            Arrays.sort(wordArray);
            System.out.println("Sorted words:");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(wordArray[i] + ", ");
            }
        }
    }
}
