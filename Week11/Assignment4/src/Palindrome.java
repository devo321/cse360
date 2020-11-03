/**
 * Author: Deven Pile
 * Class: CSE360
 * Instructor: JGS
 */


public class Palindrome {

    private String testString;
    
    /**
     * Construtor for Palindrome class
     * Sets testString = the passed in argument
     * @param word
     */
    public Palindrome(String word){
        testString = word;

    }

    /**
     * Checks if testString is a palindrome
     * @return true if the string is a palindrome, false otherwise
     * 
     */
    public boolean isPalindrome(){
        boolean itIs = true;
        if(testString.matches("[a-zA-Z .,!?\'\"]*")){
            int start = 0;
            int mid = testString.length() /2;
            int end = testString.length() - 1;
            while(start < mid && end > mid){
                if(testString.toLowerCase().charAt(start) == ' '){
                    start++;
                }

                if(testString.toLowerCase().charAt(end) == ' '){
                    end--;
                }

                if(testString.charAt(start) == '.' || testString.charAt(start) == ',' || testString.charAt(start) == '\'' || testString.charAt(start) == '\"' || testString.charAt(start) == '!' || testString.charAt(start) == '?'){
                    start++;
                }

                if(testString.charAt(end) == '.' || testString.charAt(end) == ',' || testString.charAt(end) == '\'' || testString.charAt(end) == '\"' || testString.charAt(end) == '!' || testString.charAt(end) == '?'){
                    end --;
                }

                if(testString.toLowerCase().charAt(start) != testString.toLowerCase().charAt(end)){
                    itIs = false;
                }
                start++;
                end--;

            }
        }

        else if(!testString.matches("[a-zA-Z ]*")){
            itIs = true;
        }

        else{
            itIs = false;
        }
        return itIs;
    }


}
