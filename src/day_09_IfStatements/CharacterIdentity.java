package day_09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {



       int characterNumber = 65;

       if (characterNumber >=65 && characterNumber <=90){
           System.out.println("Alphabetic Character");
       }else if (characterNumber >= 48 && characterNumber<=57){
           System.out.println("Numeric Character");
       }else{
           System.out.println("Special Character");
       }

        /*Create a class called Character Identity, and write a program that can identify if the given character is a digit or
        Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
*/
    }
}
