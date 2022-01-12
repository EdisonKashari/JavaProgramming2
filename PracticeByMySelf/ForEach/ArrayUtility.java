package ForEach;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        String [] names = {"Edison","Mike","John","Smith"};
        String [] earlyBirds = Arrays.copyOf(names,2);//copy starting from begining

        System.out.println(Arrays.toString(earlyBirds));

//                     0   1   2   3   4   5   6
        char [] ch = {'D','S','W','C','E','A','L'};

    char [] ch2=    Arrays.copyOfRange(ch,2,4);
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------------------");

        int [] num = {1,2,3,4,5,8,6,7,6,8,4,8,5,74,8,7,8,7,9,8,47,8,8,};

        int [] num1 = Arrays.copyOfRange(num,5,num.length);

        System.out.println(Arrays.toString(num1));






    }
}
