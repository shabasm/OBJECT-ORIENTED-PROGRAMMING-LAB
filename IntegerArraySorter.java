import java.util.Scanner;

public class IntegerArraySorter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int temp, j, i;

            System.out.print("Enter the size of array:");
            int size = input.nextInt();
            int a[] = new int[size];

            System.out.println("Enter array elements:");
            for (i = 0; i < size; i++) {
                System.out.print("At index " + i + ":");
                a[i] = input.nextInt();
            }

            System.out.print("Array is:");
            for (i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
            for (i = 0; i < size; i++) {
                for (j = 0; j <= i; j++) {
                    if (a[i] < a[j]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }

            System.out.print("\nSorted array is:");
            for (i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
