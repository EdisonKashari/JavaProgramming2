public class Hello {
    public static void main(String[] args) {
        String str = "Hello";

        String result=str.substring(1,4);
     //   String svar = str.substring(1,str.length()-1);
       System.out.println(result);

        System.out.println("---------------------------------------------");

        char firstchar = str.charAt(0);
        char lastchar= str.charAt(str.length()-1);
        str=str.replace(firstchar ,' ');
        str = str.replace(lastchar,' ');



        System.out.println(str.trim());


        /**
         * write a method that can print out the full name of a person in regular format
         *             ex:
         *                fullName("cYdEo", "SCHOOL");
         *
         *                 output:
         *                     "Cydeo School"
         *
         */
        String word1="cYdEo";
        String word2="SCHOOL";
      String result1=  word1.substring(0,1).toUpperCase()+word1.substring(1).toLowerCase();
      String result2 = word2.substring(0,1).toUpperCase()+word2.substring(1).toLowerCase();
        System.out.println(result1+" "+result2);



        String word = "Hello World";

        int lastIndex= word.indexOf(" ",2);
         result = word.substring(0,1)+word.substring(lastIndex);
        System.out.println(result);




        String str1 ="AABCCD";

         String count = "";
        for (int i = 0; i < str1.length(); i++) {
           char ch= str1.charAt(i);

            if (str1.indexOf(ch)==str1.lastIndexOf(ch)){
                count+=ch;
            }
        }
        System.out.println(count);
    }
}
