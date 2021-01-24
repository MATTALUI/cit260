package io.mattalui.cit260;

import java.util.Scanner;

public class W4dot1 {
    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a single hexadecimal digit.
     * 3) Gets the user's input and saves it. If the value is not a valid
     *    hexadecimal digit tell the user and terminate the program.
     * 4) Converts the hexadecimal digit into a four digit binary number.
     *    You may not use any of the conversion methods built into Java, such
     *    as toBinaryString( ), to do this.
     * 5) Outputs the four digit binary number, including any leading zeros.
     * 6) Outputs a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
        char hex = getHexChar();
        if (!checkValidHex(hex)) {
            System.out.println("\n" + hex + " is not a valid hexadecimal digit.");
        } else {
            int decimal = convertHexToDecimal(hex);
            String binary = convertDecimalToBinary(decimal);
            System.out.println("\nThe binary value is " + binary + ".");
        }
        sayGoodbye();
    }

    /**
     * Prompts the user for a single character hex
     *
     * @return single character entered by the user
     */
    public static char getHexChar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        int firstIndex = 0;

        return input.next().charAt(firstIndex);
    }

    /**
     * Determines whether or not a single character is a valid hex number
     *
     * @param hex the char to be evaluated
     * @return boolean of whether or not the char is a valid hex
     */
    public static boolean checkValidHex(char hex) {
        if (Character.isDigit(hex)) {
            // We don't need to check a range or anything since any single-digit
            // is a-good
            return true;
        }
        char[] validChars = {
                'A',
                'B',
                'C',
                'D',
                'E',
                'F',
                'a',
                'b',
                'c',
                'd',
                'e',
                'f'
        };
        for (char letter: validChars) {
            if (letter == hex) {
                return true;
            }
        }


        return false;
    }

    /**
     * Converts a single character hex number into a decimal integer
     *
     * @param hex the hex character that should be converted to a decimal
     * @return the decimal number equivialnt of the hex number
     */
    public static int convertHexToDecimal(char hex) {
        if (Character.isDigit(hex)) {
            return Integer.parseInt(String.valueOf(hex));
        }
        char[] ups = {
                'A',
                'B',
                'C',
                'D',
                'E',
                'F'
        };
        char[] downs = {
                'a',
                'b',
                'c',
                'd',
                'e',
                'f'
        };
        for (int i = 0; i < ups.length; i++) {
            if (hex == ups[i] || hex == downs[i]) {
                return i + 10;
            }
        }

        // If our validations succeed, then we should never reach this point,
        // but we have to have some kind of default...
        return 0;
    }

    /**
     * Converts a decimal single-byte number into a binary number
     *
     * @param decimal the decimal number to be converted to binary
     * @return a single-byte binary number as a string
     */
    public static String convertDecimalToBinary(int decimal) {
        StringBuilder builder = new StringBuilder();
        int[] binColumns = {
                8,
                4,
                2,
                1
        };
        for (int col: binColumns) {
            boolean match = (decimal & col) == col;
            builder.append(match ? '1' : '0');
        }

        return builder.toString();
    }

    /**
     * Displays a basic explanation of the program to the user.
     */
    public static void displayIntro() {
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
    }

    /**
     * "Now I only want you gone..."
     *      ~ GLaDOS
     */
    public static void sayGoodbye() {
        System.out.println("Goodbye.");
    }
}