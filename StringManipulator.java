import java.util.Scanner;

class StringOperations {
    Scanner scanner = new Scanner(System.in);

    String string1, string2;

    public StringOperations(String inputString1, String inputString2) {
        string1 = inputString1;
        string2 = inputString2;
    }

    void length() {
        System.out.println("Length of string 1: " + string1.length());
        System.out.println("Length of string 2: " + string2.length());
    }

    void concat() {
        System.out.println("Concatenated string: " + string1.concat(string2));
    }

    void extraction() {
        int position;
        System.out.println("Enter the position:");
        position = scanner.nextInt();
        if (position >= 0 && position < string1.length()) {
            System.out.println(
                    "Character at position " + position + ": "
                            + string1.charAt(position));
        } else {
            System.out.println("Invalid position.");
        }

    }

    void comparison() {
        System.out.println("Enter the string to compare:");
        String searchString = scanner.next();
        System.out.println("Strings are equal? " + string1.equals(searchString));
    }

    void modification() {
        System.out.println("Enter the substring you want to replace(String1):");
        String oldSubstring1 = scanner.next();
        System.out.println("Enter the new substring:");
        String newSubstring1 = scanner.next();
        String modifiedString1 = string1.replace(oldSubstring1, newSubstring1);
        System.out.println("Modified string: " + modifiedString1);

        System.out.println();

        System.out.println("Enter the substring you want to replace(String2):");
        String oldSubstring2 = scanner.next();
        System.out.println("Enter the new substring:");
        String newSubstring2 = scanner.next();
        String modifiedString2 = string2.replace(oldSubstring2, newSubstring2);
        System.out.println("Modified string: " + modifiedString2);
    }

    void search() {
        System.out.println("Enter the substring to search for:");
        String searchString = scanner.next();
        int index = string1.indexOf(searchString);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}

class StringManipulator {
    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter string 1:");
            String inputString1 = scanner.next();
            System.out.println("Enter string 2:");
            String inputString2 = scanner.next();
            StringOperations stringOps = new StringOperations(inputString1, inputString2);

            int choice;
            char continueChoice;
            System.out.println("----MENU----");
            System.out.println("1. Length\n2. Concatenation\n3. Extraction\n4. Comparison\n5. Modification\n6. Search");
            do {
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        stringOps.length();
                        break;
                    case 2:
                        stringOps.concat();
                        break;
                    case 3:
                        stringOps.extraction();
                        break;
                    case 4:
                        stringOps.comparison();
                        break;
                    case 5:
                        stringOps.modification();
                        break;
                    case 6:
                        stringOps.search();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println("Do you wish to continue(y/n)?:");
                continueChoice = scanner.next().charAt(0);
            } while (continueChoice == 'y');
        }
    }
}
