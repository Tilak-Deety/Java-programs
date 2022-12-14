package patterns;

public class PatternExample12 {
    public static void main(String[] args) {
        pattern(15);
    }
    static void pattern(int n){
        for(int row=1; row<n; row++){
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            for(int space=1; space<row; space++){
                System.out.print("  ");
            }
            for(int space=1; space<row; space++){
                System.out.print("  ");
            }
            for(int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            for(int space=row; space<n; space++){
                System.out.print("  ");
            }
            for(int space=row; space<n; space++){
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
