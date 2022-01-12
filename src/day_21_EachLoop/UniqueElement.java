package day_21_EachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String [] word = {"java","java","python","C#"};




        for (String each : word) {
            int freq = 0;
            for (String elements : word) {
                if (elements.equals(each)){
                    freq++;
                }

            }
            if (freq==1){
                System.out.println(each);
            }




        }










     /*   for (int i = 0; i < word.length; i++) {
            String element=word[i];
            int freq = 0;
            for (String each : word) {
                if (element.equals(each)){
                    freq++;
                }

                }
            if (freq == 1) {
                System.out.println(element);
            }

        }

      */



    }
}
