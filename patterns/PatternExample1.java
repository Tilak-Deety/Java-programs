package patterns;
//Question 1 : write a code to print this below pattern
/*

 *
 **          // printing this format
 ***
 ****

 */
public class PatternExample1 {
    public static void main(String[] args) {
        pattern(10);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
