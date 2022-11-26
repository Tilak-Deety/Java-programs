package patterns;

public class NumberPattern1 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1, p=1; row<=n; row++, p++){
            for(int col=1; col<=row; col++){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
