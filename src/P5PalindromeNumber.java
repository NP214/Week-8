public class P5PalindromeNumber {
    /* Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes. */

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reversenumber = 0;
        while (number != 0) {// 121,65
          int  remainder = number % 10;//12,6
            reversenumber = reversenumber * 10;
            reversenumber = reversenumber + remainder;
          number =   number /10;
        }

        if (temp == reversenumber) {
            System.out.println("true" + temp + " is palindrome");
            return true;
        } else {
            System.out.println("true" +temp + " is not palindrome");
        }
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(123);
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }
}
