package day_52_Map_Continue;

public class Test2 {
    public static void main(String[] args) {

        // function1: create a function that can display a number is odd or even
        MySecondFunctionalInterface<String > printEach;

        printEach = s -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };

        printEach.test("Wooden Spoon");

        MySecondFunctionalInterface<Integer > cube =  n ->{
            System.out.println(n*n*n);
        };
        cube.test(5);
    }
}
