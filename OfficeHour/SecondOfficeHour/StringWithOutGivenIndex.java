package SecondOfficeHour;

public class StringWithOutGivenIndex {
    public static void main(String[] args) {

        String word = "kitchen";
        int index = 0;

         String temp = word.substring(0,index)+word.substring(index+1)+"";
         System.out.println(temp);
         String temp2 = "";
        for (int i = 0; i < index; i++) {
        temp2+=word.charAt(i);
        }
        for (int i = index+1; i <word.length() ; i++) {
            temp2+=word.charAt(i);

        }
        System.out.println(temp2);

       String temp3="";


        for (int i = 0; i <word.length() ; i++) {
            if (i==2){
                continue;
            }
            temp3+=word.charAt(i);
        }

        System.out.println(temp3);
    }
}


/*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (do with for loop)
 * input:  kitchen and 2
 * output: kichen
 * input:  kitchen and 0
 * output: itchen*/