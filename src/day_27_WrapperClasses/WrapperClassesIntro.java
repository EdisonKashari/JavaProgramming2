package day_27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int  num1 =200;

       // Long n1=num1;
        Integer n1=num1;//autoboxing
        int num2= n1;//unboxing

        System.out.println("-----------------------------");

        Integer integervalue= 100;
        long longValue = integervalue;

        Byte b1 = 25;
        byte a1= b1;
        short d= a1;
        int a3 = d;
        long a4=a3;

        System.out.println("--------------------------------");

        int num3 =200;
     //   Long l2=num3;
       Integer num4 = num3; //autoboxing


        System.out.println("--------------------------------------------");

        Integer z =900;
        Integer x =z;

        System.out.println("----------------------------------------------");

        int[] numbers={1,5,4,8,4};
        Integer [] numbers2={1,5,4,8,7};

    }

}
