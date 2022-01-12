package SecondOfficeHour;

public class CountWord {
    public static void main(String[] args) {
        String word = "Java is Java";
        String result= "Java";
        int count =0;
        for (int i = 0; i < word.length()-3; i++) {
String temp = word.substring(i,i+word.length());
if (temp.contains(result));
    count++;


        }
        System.out.println(count);
    }
}
/*String sentence = "Java Is Java";
        String word1 = "Java";
        int count = 0;
        for (int i = 0; i <= sentence.length() - word1.length(); i++) {
            String temp = sentence.substring(i,i + word1.length());
            if (temp.equals(word1))
            count++;
        }
        System.out.println("count = " + count);*/