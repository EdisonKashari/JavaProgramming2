package Arrays;

public class Twice {
    public static void main(String[] args) {
        char [] ch = {'A','A','D','D','E','B'};
        for (int j = 0; j < ch.length; j++) {//this loop is to repeat the other loop for each index of array

            int freq = 0;
            char cha = ch[j];

            for (int i = 0; i < ch.length; i++) { // this loop is to compare each character
                if (ch[i]==cha){//if characteres are equal
                    freq++; //each char count
                }

            }
            if (freq==1){
                System.out.println(cha);
            }

        }



    }
}
