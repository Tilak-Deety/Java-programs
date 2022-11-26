package patterns;
//Right sided decreasing triangle
public class PatternExample7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row;space++){
                System.out.print("  ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
