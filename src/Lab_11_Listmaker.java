import inputValidation.SafeInput;


public class Lab_11_Listmaker{

    public static void main(String[] args) {

        String menuChoice;

        do {
            displayMenu();
            menuChoice = SafeInput.getRegExString("Enter a menu choice: ", "[AaDdPpQq]");
            executeMenuChoice(menuChoice);
        } while (!menuChoice.equalsIgnoreCase("Q"));

        System.out.println("Goodbye!");

    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("A - Add an item to the list");
        System.out.println("D - Delete an item from the list");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");
    }

    private static void executeMenuChoice(String choice) {
        switch (choice.toUpperCase()) {
            case "A":
                addItemToList();
                break;
            case "D":
                deleteItemFromList();
                break;
            case "P":
                printList();
                break;
            case "Q":
                quitProgram();
                break;
        }
    }

    private static void addItemToList() {
        // code for adding an item to the list
    }

    private static void deleteItemFromList() {
        // code for deleting an item from the list
    }

    private static void printList() {
        // code for printing the list
    }

    private static void quitProgram() {
        boolean confirmed = SafeInput.getYNConfirm("Are you sure you want to quit?");
        if (confirmed) {
            System.exit(0);
        }
    }

}
