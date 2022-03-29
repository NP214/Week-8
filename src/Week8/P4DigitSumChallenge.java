package Week8;
/* Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.

 */
public class P4DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(333);
        sumDigits(125);
        sumDigits(-10);
        sumDigits(0);
        sumDigits(9);


    }

    public static void sumDigits(int number) {
        int sum = 0;
        if (number < 10 && number >= 0) {
            System.out.println("-1");
        } else {
            for (sum = 0; number != 0; number = number / 10) {
                sum = sum + number % 10;


            }
            System.out.println(sum);
        }
    }
}