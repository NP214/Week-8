package Week8;
/*
Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 */
public class P6Triangle {
    public static void m6(){

    for( int i= 0; i<=10 ; i++){

        for(int j = 1; j <=i; j++){
            System.out.print(j);


        }
        System.out.println();

    }

}

    public static void main(String[] args) {
        m6();
    }
}
