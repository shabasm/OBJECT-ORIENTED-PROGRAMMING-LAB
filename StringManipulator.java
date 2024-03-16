import java.util.Scanner;

class StringOperations {
    String inputString1, inputString2;

    public StringOperations(String str1, String str2) {
        this.inputString1 = str1;
        this.inputString2 = str2;
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

            int choice, continueChoice, position;
            String searchString, modifiedString;
            System.out.println("----MENU----");
            System.out.println("1. Length\n2. Concatenation\n3. Extraction\n4. Comparison\n5. Modification\n6. Search");
            do {
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Length of string 1: " + stringOps.inputString1.length());
                        System.out.println("Length of string 2: " + stringOps.inputString2.length());
                        break;
                    case 2:
                        System.out.println(
                                "Concatenated string: " + stringOps.inputString1.concat(stringOps.inputString2));
                        break;
                    case 3:
                        System.out.println("Enter the position:");
                        position = scanner.nextInt();
                        if (position >= 0 && position < stringOps.inputString1.length()) {
                            System.out.println(
                                    "Character at position " + position + ": "
                                            + stringOps.inputString1.charAt(position));
                        } else {
                            System.out.println("Invalid position.");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the string to compare:");
                        searchString = scanner.next();
                        System.out.println("Strings are equal? " + stringOps.inputString1.equals(searchString));
                        break;
                    case 5:
                        System.out.println("Enter the substring you want to replace:");
                        String oldSubstring = scanner.next();
                        System.out.println("Enter the new substring:");
                        String newSubstring = scanner.next();
                        modifiedString = stringOps.inputString1.replace(oldSubstring, newSubstring);
                        System.out.println("Modified string: " + modifiedString);
                        break;
                    case 6:
                        System.out.println("Enter the substring to search for:");
                        searchString = scanner.next();
                        int index = stringOps.inputString1.indexOf(searchString);
                        if (index != -1) {
                            System.out.println("Substring found at index: " + index);
                        } else {
                            System.out.println("Substring not found.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println("Do you wish to continue(1/0)?:");
                continueChoice = scanner.nextInt();
            } while (continueChoice == 1);
        }
    }
}