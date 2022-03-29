package Week8;

import java.util.Scanner;

/*
Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant

 */
public class P3VowelConsonant {
    public static void main(String[] args) {
        m3();

    }

    public static void m3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter single character from the alphabet");
        String c = sc.next().toLowerCase();
        boolean vowels = c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u");
        if (c.length() > 1) {
            System.out.println("Invalid Entry");

        } else if (!isitletter(c)) {
            System.out.println("Invalid Entry");

        } else if (vowels) {
            System.out.println("Entered alphabet is vowel");
        } else {
            System.out.println("Entered alphabet is consonant");
        }
    }

    public static boolean isitletter(String l) {
        if (l.charAt(0) > 96 && l.charAt(0) < 123) {
            return true;

        } else {
            return false;
        }
    }

}
