package Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        String [] words = {"java","java","C#","Python","Python"};

        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int freq = 0;

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals(element)){
                    freq++;

                }
            }

            if (freq==1){
                System.out.println(element);
            }


        }

    }
}
