package day_16_ForLoopPractice;

public class DigitsLetterSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School) (!@#$%WoodenSpoon";

        String digits = "";//12345
        String letters = "";//CydeoSchoolWoodenSpoon
        String specialChar = "";//!@#$%

        for (int i = 0; i <str.length() ; i++) { // i: index numbers of str (0~last index)
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;

            } else {
                if (ch != ' ') {
                    specialChar += ch;
                }

                ;// ch:each character that we have in str
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);
    }
}
