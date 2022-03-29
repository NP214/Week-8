package Week8;
/*
. Write a programme to input any number and check if it is prime or not.
 */
import java.util.Scanner;

public class P12PrimeNumber {
    public static void main(String[] args) {
        primenumber();
    }
    public static void primenumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number");
        int number = sc.nextInt();
boolean prime = false;
for (int i =2; i<=number /2; i++){
    // condition for nonprime number
    if(number % 2 ==0){
        prime = true;

    }
}
if (!prime){
    System.out.println(number + "is prime nuber");
} else {
    System.out.println(number + "is not prime number");
}

    }
    }

