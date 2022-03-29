package Week8;
/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value
 */
public class P7FirstNLastDgtSum {
    public static void sumFirstAndLastDigit(int number) {
        if (number <=0) {
            System.out.println("-1");
        } else if (number > 0) { //253
            int lastdigit = number % 10; // 3

            int totalDigits=findDigits(number);
            int divisor= (int)Math.pow(10, totalDigits-1);
            int firstdigit =  number/ divisor;
            int sum = (firstdigit + lastdigit);
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(123);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }
    public static int findDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number=number/10;
        }
        return count;
    }
}
