package Week8;
/* Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) */

public class P9FibonacciNumber {
    static int n1 = 0, n2 = 1, n3 = 0, count = 10, i;

    public static void main(String[] args) {

        System.out.print(n1 + " " + n2);
        m9();
    }

    public static void m9() {
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }
    }
}

