package conditionalstatements;

public class NumberAsWord {
    public String convertNumberToWord(int num) {
        if(num > 10) {
            return "-1";
        }
        else if(num < 0) {
            return "-2";
        }
        else if(num == 0) {
            return "-3";
        }
        else {
            return convertNumberToWord(num);
        }


    }
}
