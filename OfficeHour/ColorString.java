public class ColorString {
    public static void main(String[] args) {

        String word = "red";

      /*  if (word.substring(0,3).equals("red")){
            System.out.println(word.substring(0,3));
        }else if (word.substring(0,4).equals("blue")){
            System.out.println(word.substring(0,4));
        }else {
            System.out.println("\"\"");
        }
        */
       String temp ="";
       if (word.startsWith("red")){
           temp="red";
       }else
       if (word.startsWith("blue")){
           temp = "blue";

       }else {
           temp="";
       }
        System.out.println(temp
        );
    }
}
