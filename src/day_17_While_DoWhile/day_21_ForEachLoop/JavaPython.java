package day_17_While_DoWhile.day_21_ForEachLoop;

import java.util.Arrays;

public class
JavaPython {
    public static void main(String[] args) {

        String  languages = "java is the best programing language. java is better than Python";

        String [] words = languages.split(" ");
        int countJava = 0;
        int countPython = 0;

        for (String each : words) {
            if (each.equalsIgnoreCase("Java")){
                countJava ++;
            }
            if (each.equalsIgnoreCase("python")){
                countPython++;
            }
        }
        System.out.println(Arrays.toString(words));
        System.out.println("java counted: "+countJava);
        System.out.println("python counted: "+countPython);

    }
}
