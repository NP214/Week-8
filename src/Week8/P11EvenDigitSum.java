package Week8;
/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class P11EvenDigitSum<evenDigitsum> {
    public static void main(String[] args) {
        evendigit(123456789);
        evendigit(252);
        evendigit(-22);

    }

    public static void evendigit(int number) {
        int originalNumber = number;
        int digit, sum = 0;
        if(number<0){
            System.out.println("-1");
        }
        if(number>0){
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;

            }
            System.out.println("sum of all evendiigt number " + originalNumber + "is :" + sum);
        }

    }}



