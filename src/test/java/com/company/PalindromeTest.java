package com.company;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void getStringForBase() {
        assertEquals("1", Palindrome.getStringForBase(1, 2));
        assertEquals("10", Palindrome.getStringForBase(2, 2));
        assertEquals("100", Palindrome.getStringForBase(4, 2));
        assertEquals("1000", Palindrome.getStringForBase(8, 2));

        assertEquals("0", Palindrome.getStringForBase(0, 3));
        assertEquals("1", Palindrome.getStringForBase(1, 3));
        assertEquals("2", Palindrome.getStringForBase(2, 3));
        assertEquals("10", Palindrome.getStringForBase(3, 3));
        assertEquals("11", Palindrome.getStringForBase(4, 3));
        assertEquals("1211", Palindrome.getStringForBase(49, 3));

        assertEquals("33", Palindrome.getStringForBase(69, 22));
        assertEquals("55", Palindrome.getStringForBase(75, 14));
        assertEquals("161", Palindrome.getStringForBase(188, 11));
        assertEquals("1A1", Palindrome.getStringForBase(417, 16));

        assertEquals("1000", Palindrome.getStringForBase(1000, 10));
        assertEquals("13000", Palindrome.getStringForBase(1000, 5));
        assertEquals("1331", Palindrome.getStringForBase(1000, 9));
        assertEquals("46A", Palindrome.getStringForBase(1000, 15));

        assertEquals("11", Palindrome.getStringForBase(19, 18));
    }

    @Test(expected = InputMismatchException.class)
    public void testBaseLessThanTwo() {
        Palindrome.getStringForBase(1000, 1);
    }

    @Test
    public void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("0"));
        assertTrue(Palindrome.isPalindrome("010"));
        assertTrue(Palindrome.isPalindrome("0880"));
        assertTrue(Palindrome.isPalindrome("110707011"));
        assertFalse(Palindrome.isPalindrome("100707011"));
    }

    @Test
    public void getMinPalindromeBase() {
        assertEquals(2, Palindrome.getMinPalindromeBase(1));
        assertEquals(3, Palindrome.getMinPalindromeBase(2));
        assertEquals(2, Palindrome.getMinPalindromeBase(3));
        assertEquals(3, Palindrome.getMinPalindromeBase(4));
        assertEquals(2, Palindrome.getMinPalindromeBase(5));
        assertEquals(5, Palindrome.getMinPalindromeBase(6));
        assertEquals(2, Palindrome.getMinPalindromeBase(7));
        assertEquals(3, Palindrome.getMinPalindromeBase(8));
        assertEquals(2, Palindrome.getMinPalindromeBase(9));
        assertEquals(3, Palindrome.getMinPalindromeBase(10));
        assertEquals(10, Palindrome.getMinPalindromeBase(11));
        assertEquals(5, Palindrome.getMinPalindromeBase(12));
        assertEquals(3, Palindrome.getMinPalindromeBase(13));
        assertEquals(6, Palindrome.getMinPalindromeBase(14));
        assertEquals(2, Palindrome.getMinPalindromeBase(15));
        assertEquals(3, Palindrome.getMinPalindromeBase(16));
        assertEquals(2, Palindrome.getMinPalindromeBase(17));
        assertEquals(5, Palindrome.getMinPalindromeBase(18));
        assertEquals(18, Palindrome.getMinPalindromeBase(19));
        assertEquals(3, Palindrome.getMinPalindromeBase(20));
    }

}
