package day_17_While_DoWhile.day_21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String [] classmates = {"Steve Nash","Lebron James","Anthony Davis ","Klay Thompson","Stephen Curry","Lionel Messi"};
        for (String each:classmates){// each: all the names

        String reversed = "";
        for (int i =each.length()-1; i >=0 ; i--) {
       reversed+= each.charAt(i);


        }
            System.out.println(reversed);

        }

    }
}
