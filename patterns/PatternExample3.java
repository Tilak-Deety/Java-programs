package patterns;
//Question 3 : write a code to print this below pattern
/*

 *****
 ****  // printing this format
 ***
 **
 *

 */
public class PatternExample3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

