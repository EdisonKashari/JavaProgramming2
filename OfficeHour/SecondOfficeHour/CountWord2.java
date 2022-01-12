package SecondOfficeHour;

public class CountWord2 {
    public static void main(String[] args) {
        String sentence="Java is Java";
        String word ="Java";
        int count =0;

        while (sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");
        }
        System.out.println("count = " + count);
    }
}
