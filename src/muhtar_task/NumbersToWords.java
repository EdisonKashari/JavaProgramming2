package muhtar_task;

public class NumbersToWords {

    public static void main(String[] args) {
        int number = 7;



        String word= (number >=1 && number <=9)?  (number==1)?  "one" :(number==2)? "two" :(3==number)? "three" :(4==number)?
               "four" :(number==5)? "five" :(number==6)?  "six" :(number==7)?  "seven" :(number==8)? "eigt" : "nine"
                :  "invalid";

        System.out.println(word);

    }
}
