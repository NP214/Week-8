package Week8;
/* Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.

 */

public class P13SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int frstnum, int secndnum) {
        if ((frstnum >= 10 && frstnum <= 99) && (secndnum >= 10 && secndnum <= 99)) {
            int firstnumlastdigit = frstnum % 10;
            int secondnumlastdigit = secndnum % 10;
            int firstnumfirstdigit = frstnum / 10;
            int secondnumfirstdigit = secndnum / 10;

            return (firstnumfirstdigit == secondnumfirstdigit) || (firstnumfirstdigit == secondnumlastdigit) || (firstnumlastdigit == secondnumfirstdigit) || (firstnumlastdigit == secondnumlastdigit);
        }
        return false;

    }
}
