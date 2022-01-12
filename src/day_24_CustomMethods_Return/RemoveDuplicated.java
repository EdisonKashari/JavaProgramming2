package day_24_CustomMethods_Return;

public class RemoveDuplicated {
    public static void main(String[] args) {
        String str = "cccccccccdddddddddddaaaaaaaaabbbbbbbb";
      str=  duplicates(str);
        System.out.println(str);
    }
    //create a method that can remove duplicated characters from a string and returns the new value
    public static String duplicates(String str){// "aaabbcc ==>"abc"

        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

            if (!result.contains("" + each)){
                result+=each;
            }

        }

return result;
    }
}
