package Week8;
/*
Write a program in Java to display the pattern like a diamond.
 While loop
 */
public class P14Diamond {
    public static void main(String[] args) {


    int rows = 6;
    int i=1;
while(i<=6){
        int j=1;    //print upper part
        while(j<=6-i){
            System.out.print(" ");//print space
            j++;
        }
        int k=i;
        while(k>=1){
            System.out.print("*");//print number
            k--;
        }
        int l=2;
        while(l<=i){
            System.out.print("*");//print number
            l++;
        }
        System.out.println();
        i++;
    }
    i=rows-1;
while(i>=1){  //print lower part
        for(int j=0; j<=rows-1-i; j++){
            System.out.print(" ");//print space
        }
        int k=i;
        while(k>=1){
            System.out.print("*");
            k--;
        }
        int l=2;
        while(l<=i){
            System.out.print("*");
            l++;
        }
        System.out.println();
        i--;
    }
}
}




