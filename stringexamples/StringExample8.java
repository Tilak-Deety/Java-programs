package stringexamples;
//Remove all the white spaces in a given string
public class StringExample8 {
    public static void main(String[] args) {
        String s = "My Name is Tilak !";
        String r ="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isWhitespace(c))
                r = r+c;
        }
        System.out.println("After removing spaces : "+r);
    }
}
