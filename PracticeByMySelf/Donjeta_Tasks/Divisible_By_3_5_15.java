package Donjeta_Tasks;

public class Divisible_By_3_5_15 {

    public static void divisible(int a,int b){
String divisibleBy_15 = "";
        String divisibleBy_5 = "";
        String divisibleBy_3 = "";
        for(int i = a;i <= b;i++){
            if (i%15==0){
              divisibleBy_15 += i+" ";

            }else if (i%5==0 ){

          divisibleBy_5+=i+" ";
            }else if (i%3==0){
            divisibleBy_3 +=i+" ";
            }
        }
       System.out.println("divisibleBy_15 = " + divisibleBy_15+" ");
       System.out.println("divisibleBy_5 = " + divisibleBy_5);
       System.out.println("divisibleBy_3 = " + divisibleBy_3);
    }

    public static void main(String[] args) {
        divisible(1,100);
    }

}
