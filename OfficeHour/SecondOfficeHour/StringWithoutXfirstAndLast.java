package SecondOfficeHour;

public class StringWithoutXfirstAndLast {
    public static void main(String[] args) {
        String word ="Hxix";
        String temp = "";

        if (word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x'){
/*
            for (int i = 1; i < word.length()-1; i++) {
                temp+=word.charAt(i);

            }
            /*
 */

            temp=word.substring(1,word.length()-1);
        }else if (word.charAt(0)=='x'){
            for (int i = 1; i < word.length(); i++) {
                temp += word.charAt(i);
            }
        }else if (word.charAt(word.length()-1)=='x'){
            for (int i = 0; i < word.length()-1; i++) {
                temp += word.charAt(i);
            }
        }
        System.out.println(temp);


    }
}
