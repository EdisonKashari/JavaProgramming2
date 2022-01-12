package day_27_WrapperClasses;

public class RetrieveLetters {
    public static void main(String[] args) {
       String str = "Wooden Spoon!";
String result="";
String digit="";
String specialCharacter="";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                result+=Character.valueOf(each);
            }

            if (Character.isDigit(each)){
                digit+=Character.valueOf(each);
            }
            if (!Character.isLetter(each)){
                specialCharacter+=Character.valueOf(each);
            }
        }
        System.out.println(result);
        System.out.println("\""+digit+"\"");
        System.out.println("\""+specialCharacter+"\"");
    }
}
/*Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";*/