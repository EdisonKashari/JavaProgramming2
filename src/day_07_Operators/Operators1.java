package day_07_Operators;

public class Operators1 {

    public static void main(String[] args) {
        boolean num1  =  100>200;
        boolean num2   = 100>=200;
        boolean num3 = 100<200;
        boolean num4 = 100<=200;
        boolean num5 = 100==200;
        boolean num6 = 100!=200;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);


        int x = 20;
       x += 15;   // 20+15=35

        System.out.println(x);

        int y = 15;
        y -= 7;  //15-7=8

        System.out.println(y);

        int b = 27;
        b *= 5; //27*5=135

        System.out.println(b);

        int d = 35;
        d /= 6;  //  35/6 = 5

        System.out.println(d);

        int c = 24;
        c %= 7;  // 24%7=1

        System.out.println(c);

        int v = 75;

        System.out.println(++v);//76
        System.out.println(v++);//76
        System.out.println(v--);//77
        System.out.println(--v);//75
        System.out.println(-v);//-75
        System.out.println(+v);//75
    }
}
