package SecondOfficeHour;

public class EncryptTheCode {
    public static void main(String[] args) {

        String word = "cydeo";
        char ch = 'x';
String temp = "";
        for (int i = 0; i <word.length() ; i++) {


                 temp += word.charAt(i)+"x";

            }
        System.out.println(temp);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < word.length(); i++) {
            temp +=""+word.charAt(i)+ ch;

        }
        System.out.println(temp);





        }


    }

/* Given a string password. Encrypt with "x" a given password
 *                 and print.
 *                 (do with for loop)
 *                 password: cydeo
 *                 encrypt with char :x
 *                 output:cxyxdxexox*/