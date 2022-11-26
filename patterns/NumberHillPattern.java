package patterns;

public class NumberHillPattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1,p=1; row<=n; row++,p++){
            for(int space=row; space<=n; space++){
                System.out.print("  ");
            }
            for(int col=1; col<row; col++){
                System.out.print(p+" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
