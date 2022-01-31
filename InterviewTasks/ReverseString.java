import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String [] word = {"Adam","Muhtar","Asya"};

        String [] result = new String[word.length];

       for(int i = word.length -1,j=0;i>=0;i--,j++){
           //   i                    j
           result[j]=word[i];
       }

        System.out.println(Arrays.toString(result));

       //                                           Asya   Muhtar Adam     0   1    2


    }
}
