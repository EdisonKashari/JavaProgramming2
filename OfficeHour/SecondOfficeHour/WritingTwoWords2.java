package SecondOfficeHour;

public class WritingTwoWords2 {
    public static void main(String[] args) {

        String str = "Code";

       String result= ""+str.charAt(0) +str.charAt(1)+str.charAt(2)+str.charAt(3);
String temp = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <=i; j++) {
                temp+=""+str.charAt(j);
            }
temp+="-";
        }
        temp=temp.substring(0,temp.length()-1);
        System.out.println(temp);



    }
}
/* Given a non-empty string like "Code" print a string like below output.
                                (do with substring  first)
                                Code → "CCoCodCode"
                                abc → "aababc"
                                ab → "aab"
                                (do with replaceFirst())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"*/