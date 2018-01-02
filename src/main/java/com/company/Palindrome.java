package com.company;

import java.util.InputMismatchException;

public class Palindrome {

    private static final int MIN_BASE = 2;

    public static void main(String[] args) {
        System.out.println("\"decimal\", \"smallest base in which the number is a palindrome\"");
        for (int i = 1; i <= 1000; i++) {
            System.out.println(String.format("%d, %d", i, getMinPalindromeBase(i)));
        }
    }

    public static int getMinPalindromeBase(int input) throws InputMismatchException {
        for (int base = MIN_BASE; ; base++) {
            if (isPalindrome(getStringForBase(input, base))) {
                return base;
            }
        }
    }

    public static String getStringForBase(int input, final int base) throws InputMismatchException {
        if (base < MIN_BASE) {
            String errMsg = String.format("Specified base '%d' not >= %d", base, MIN_BASE);
            throw new InputMismatchException(errMsg);
        }

        StringBuilder builder = new StringBuilder();
        while (true) {
            int remainder = input % base;
            input = input / base;
            if (input > 0 || remainder > 0 || builder.length() == 0) {
                if (remainder < 10) {
                    builder.append(remainder);
                } else {
                    // Convert '10' to 'A', etc
                    builder.append((char) (remainder + 55));
                }
            }
            if (input <= 0) {
                break;
            }
        }
        return builder.reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }

}
