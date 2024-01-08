import java.util.*;
public class MainMenu {
    private final MainFunctions obj = new MainFunctions();

    public void displayMenu() {
        System.out.println("***** Welcome To Your Dictionary Menu *****");
        System.out.println("1. Insert Words");
        System.out.println("2. Print Dictionary");
        System.out.println("3. Get Words for a Key");
        System.out.println("4. Remove a Word");
        System.out.println("5. Remove a Key");
        System.out.println("6. Search for Words");
        System.out.println("7. Exit");
        System.out.println("***************************");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            try {
                System.out.print("Enter your choice (1-7): ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter words separated by spaces: ");
                        String inputWords = scanner.nextLine();
                        String[] wordsToAdd = inputWords.split("\\s+");
                        obj.insert(wordsToAdd);
                        break;
                    case 2:
                        obj.printDictionary();
                        break;
                    case 3:
                        System.out.print("Enter the key character: ");
                        char keyForGetWords = scanner.next().charAt(0);
                        obj.getWords(keyForGetWords);
                        break;
                    case 4:
                        System.out.print("Enter the word to remove: ");
                        String wordToRemove = scanner.nextLine();
                        obj.removeWord(wordToRemove);
                        break;
                    case 5:
                        System.out.print("Enter the key character to remove it with it's values: ");
                        char keyForRemoveAll = scanner.next().charAt(0);
                        obj.removeAllKey(keyForRemoveAll);
                        break;
                    case 6:
                        System.out.print("Enter the regex pattern for search: ");
                        String regexPattern = scanner.nextLine();
                        obj.search(regexPattern);
                        break;
                    case 7:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            }
            catch (java.util.InputMismatchException e){
                System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 7);

        scanner.close();
    }
}
