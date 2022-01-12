package day_17_While_DoWhile.day_21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String [] words = {"Layan","Layan","Alan"};

        for (String each : words) {//each



        int count = 0;
        for (String element: words) {//element
            if (element.contains(each)){
                count++;
            }
        }
        if (count==1){
            System.out.println(each);
        }
        }
    }
}
