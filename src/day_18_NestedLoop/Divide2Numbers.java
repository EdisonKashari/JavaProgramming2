package day_18_NestedLoop;

public class Divide2Numbers {
    public static void main(String[] args) {
      int a=54;
      int b =5;
      int result=0;
       while (a>b){
           a-=b;
           result++;
       }
        System.out.println(result+" remainder is "+a);
    }
}
