package patterns;
//Question 1 : write a code to print this below pattern
/*

 1
 12         // printing this format
 123
 1234

 */
public class PatternExample4 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row =1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

