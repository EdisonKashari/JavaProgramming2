package day_27_WrapperClasses;

public class EqualCharacters {

    public static void main(String[] args) {
        String str = "JAVA java";
        int sum1=0;
        int sum2=0;

        for (char each:str.toCharArray()){

            if (Character.isDigit(each)){
                sum1+=Integer.parseInt(""+each);


            }
            if (Character.isDigit(each)){
                sum2+=Integer.parseInt(""+each);


            }


        }
        boolean result=(sum1==sum2);
        System.out.println(result);
    }
}
