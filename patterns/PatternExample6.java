package patterns;
//Right sided triangle
public class PatternExample6 {
    public static void main(String[] args) {
        patter(5);
    }
    static void patter(int n){
        for(int row = 1 ; row <=n ; row++){
            for(int space=row ; space <=n; space++){
                System.out.print("  ");
            }
            for(int col=1 ; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
