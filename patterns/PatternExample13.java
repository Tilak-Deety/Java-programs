package patterns;

public class PatternExample13 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int row=1; row<n; row++){
            for(int space=row; space<n; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=1; col++){
                System.out.print("*");
            }
            for(int space=1; space<row; space++){
                System.out.print(" ");
            }
            for(int space=1; space<row;space++){
                System.out.print(" ");
            }
            for(int col=1; col<=1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1; row<=n; row++){
            for(int space=1; space<row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=1; col++){
                System.out.print("*");
            }
            for(int space=row; space<n; space++){
                System.out.print(" ");
            }
            for(int space=row; space<n; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
