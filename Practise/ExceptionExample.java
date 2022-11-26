package Practise;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionExample {
    public static void main(String[] args) {
        file();
    }
    public static void file(){
        try{
            var reader = new FileReader("Stocks.txt");
            System.out.println("File found");
        }catch (FileNotFoundException e){
            System.out.println("Sorry! The file doesn't exist.");
        }

    }
}
