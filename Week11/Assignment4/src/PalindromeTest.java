/**
 * Author: Deven Pile
 * Class: CSE360
 * Instructor: JGS
 */


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class PalindromeTest {

    /**
     * Tests for palindrome with no space
     */
    @Test
    public void checkPalindromeNoSpace(){
        Palindrome test = new Palindrome("racecar");

        assertTrue(test.isPalindrome());
        
    }
    /**
     * Tests if theres a palindrome when theres no space but punctuation
     */
    @Test
    public void checkPalindromeNoSpaceWithPunct(){
        Palindrome test = new Palindrome("racecar?");

        assertTrue(test.isPalindrome());
    }

    /**
     * Checks for palindrome when there isnt a palindrome
     */
    @Test
    public void checkStringNotAPalindrome(){
        Palindrome test = new Palindrome("racecars");

        assertFalse(test.isPalindrome());
    }

    /**
     * Checks for palindrome when theres punctuation
     */
    @Test
    public void checkStringNotAPalindromeWithPunct(){
        Palindrome test = new Palindrome("racecars!");

        assertFalse(test.isPalindrome());
    }

    /**
     * Checks for a palindrome when theres spaces
     */
    @Test
    public void checkPalindromeWithSpaces(){
        Palindrome test = new Palindrome("Evil olive");

        assertTrue(test.isPalindrome());

    }

    /**
     * Checks case if the word is a space
     */
    @Test
    public void checkPalindromeIfItsASpace(){
        Palindrome test = new Palindrome(" ");
        
        assertTrue(test.isPalindrome());
    }
    
    /**
     * Check if the palindrome is only nonalphanumeric characters
     */
    @Test
    public void checkPalindromIfOnlyNonAlpha(){
        Palindrome test = new Palindrome("$%*");

        assertTrue(test.isPalindrome());
    }

    /**
     * Checks case if empty string is passed
     */
    @Test
    public void checkPalindromeIfEmptyString(){
        Palindrome test = new Palindrome("");

        assertTrue(test.isPalindrome());
    }



    
}
