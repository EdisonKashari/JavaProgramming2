package day_24_CustomMethods_Return;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word ="Java";
int count = frequency(sentence,word);
        System.out.println(count);
    }
public static int  frequency(String sen, String word){
int frequencyOfWord =0;
    for (int i = 0; i < sen.length(); i++) {
        if (sen.contains(word)){
            frequencyOfWord++;
            sen=sen.replaceFirst(word,"");
        }
    }

return frequencyOfWord;
}

}


/* public static int frequencyOfWord(String sentence, String word) {
        String[] newArr = sentence.split(" ");
        int frequency = 0;
        for (String each : newArr) {
            if (each.equalsIgnoreCase(word)) {
                frequency++;
            }
        }
        return frequency;

    }

/*  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3*/