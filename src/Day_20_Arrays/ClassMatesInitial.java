package Day_20_Arrays;

public class ClassMatesInitial {
    public static void main(String[] args) {
         String [] classmates = {"Steve Nash","Lebron James","Anthony Davis ","Klay Thompson","Stephen Curry","Lionel Messi"};
        for (int i = 0; i < classmates.length; i++) {

            String result = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(result);


        }


    }
}
