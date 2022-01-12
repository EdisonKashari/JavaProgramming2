package day_17_While_DoWhile.day_21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String [] classmates = {"Steve Nash","Lebron James","Anthony Davis ","Klay Thompson","Stephen Curry","Lionel Messi"};

        for (String each : classmates) {

            String initial = each.charAt(0)+ "." + each.charAt(each.indexOf(" ") +1);
            System.out.println(initial);

        }
    }
}
