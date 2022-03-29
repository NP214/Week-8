package Week8;
//  Display left angle triangle of * using nested for loops
public class P15leftAngle {
    public static void main(String[] args) {
        m15();
    }

    public static void m15() {
        //int i = 0, j = 0, k = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}