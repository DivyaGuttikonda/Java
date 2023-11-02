package Arrays;

public class StringCharacterArray{
    public static void main(String[] args) {
        String text = "Hii Good Morning 123";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);

            if(Character.isAlphabetic(ch)){
                System.out.println(ch + " is a Alphabetic. ");
            }
            if (Character.isDigit(ch)){
                System.out.println(ch + " is a digit. ");
            }
            if(Character.isWhitespace(ch)){
                System.out.println(ch + " is a spacechar ");
            }
            if(Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase ");

            }

        }
    }
}
