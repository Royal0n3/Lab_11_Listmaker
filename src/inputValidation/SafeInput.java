package inputValidation;

import java.util.Scanner;

public class SafeInput {
    //Part A: getNonZeroLenString

    /**
     * Prompts the user to input a non-zero length string. This method loops until the user enters a non-zero length string.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt the prompt message to display for the user
     * @return a non-zero length String response from the user
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    //Part B: getInt

    /**
     * Prompts the user to input an integer value. This method loops until the user enters a valid integer value.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt the prompt message to display for the user
     * @return an integer value entered by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int num = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                num = pipe.nextInt();
                valid = true;
            } else {
                String trash = pipe.nextLine(); // read the trash
            }
        } while (!valid);
        pipe.nextLine(); // clear the pipe
        return num;
    }
    //Part C: getDouble

    /**
     * Prompts the user to input a double value. This method loops until the user enters a valid double value.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt the prompt message to display for the user
     * @return a double value entered by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double num = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                num = pipe.nextDouble();
                valid = true;
            } else {
                String trash = pipe.nextLine(); // read the trash
            }
        } while (!valid);
        pipe.nextLine(); // clear the pipe
        return num;
    }
    // Part D: getRangedInt

    /**
     * Prompts the user to input an integer value within a specified inclusive range. This method loops until the user enters a valid integer value within the specified range.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt the prompt message to display for the user
     * @param low    the low value of the range (inclusive)
     * @param high   the high value of the range (inclusive)
     * @return an integer value entered by the user within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int num = 0;
        boolean valid = false;
        String rangePrompt = prompt + " [" + low + " - " + high + "]: ";
        do {
            System.out.print("\n" + rangePrompt);
            if (pipe.hasNextInt()) {
                num = pipe.nextInt();
                if (num >= low && num <= high) {
                    valid = true;
                } else {
                    System.out.println("Error: Input out of range.");
                }
            } else {
                String trash = pipe.nextLine(); // read the trash
            }
        } while (!valid);
        pipe.nextLine(); // clear the pipe
        return num;
    }
//getYNConfirm
    /**
     * Gets a Yes or No [Y/N] response from the user, returning true for Yes and false for No.
     * Accepts yYnN as valid responses and loops until it gets one of them.
     *
     * @param prompt Prompt to display for user
     * @return true if user enters Y or y, false if user enters N or n
     */
    public static Scanner pipe = new Scanner(System.in);
    public static boolean getYNConfirm(String prompt) {

        String response;
        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine();
        } while (!response.matches("[yYnN]"));

        return response.matches("[yY]");
    }
//getRegExString
    /**
     * Prompts the user to input a string that matches the given regular expression pattern.
     *
     * @param prompt Prompt to display for user
     * @param regEx  Regular expression pattern to match input against
     * @return String input that matches the given regular expression pattern
     */
    public static String getRegExString(String prompt, String regEx) {
        String response;
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
        } while (!response.matches(regEx));

        return response;
    }
}

