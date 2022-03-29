package Week8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */
public class P2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() {
        int max = 0;
        int min = 0;
        boolean ismin = false,ismax = false;
        Scanner sc = new Scanner(System.in);

while (true){
    System.out.println("Please enter the number");
    if(sc.hasNextInt()){
        int num = sc.nextInt();
        if(num>max || !ismax){
            max = num;
            ismax = true;
        }if (num < min || !ismin){
            min = num;
            ismin = true;
        }

    }else{
        System.out.println("minimum number is " +min);
        System.out.println("miximum number is " +max);
        break;

       }
    }
    }
        }
