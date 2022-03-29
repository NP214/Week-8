package Week8;
/*. . Display right angle triangle of @ using nested for loops
 */

public class P8RightTriangle {
    public static void main(String[] args) {
        triangle();
    }
    public static void triangle(){


        for(int i = 0; i <= 5; i++ ){
            for(int j = 0; j<i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
