package day_16_ForLoopPractice.day_19_LoopPractices;

public class IndexNumber {
    public static void main(String[] args) {

        String str = "abccdde";
       int result = 0;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char each =str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {
                char each1 = str.charAt(j);
                if (each == each1) {
                    count++;

                }
            }
            if (count>=2) {
                result += each;

                index+=each;
                break;
            }

        }

        System.out.println(index);


      /*  for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
               if (str.indexOf(ch) ==str.indexOf(each)){
                   count++;
               }
            }
            if (count>=2){
                result =" " + str.indexOf(ch);


            }


        }

        System.out.println(result);




        /* Write a program that cna return the index number of the first duplicated character from a string*/
    }
}
