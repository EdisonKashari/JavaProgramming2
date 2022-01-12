package day_25_CustomMethods_OverLoading;

import java.util.Arrays;

public class MainMethodOverLoading {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};

        numbers=addElement(numbers,5);
        System.out.println(Arrays.toString(numbers));
        String[] words ={"edi","alan"};
        words=addElement(words,"jenny");
        System.out.println(Arrays.toString(words));

    }


        public static int[] addElement(int[] array, int element) {
            int[] result = new int[array.length + 1];
            int i = 0;
            for (int each : array) {
                result[i++] = each;
            }
            result[i] = element;
            return result;
        }

        public static String[] addElement(String[] array, String element) {
            String[] result = new String[array.length + 1];

            int j = 0;
            for (String each : array) {
                result[j++] = each;

            }
            result[j] = element;
            return result;

        }

        public static char[] addElement(char[] array, char element) {
            char[] result = new char[array.length + 1];

            int j = 0;
            for (char each : array) {
                result[j++] = each;

            }
            result[j] = element;
            return result;


        }
        public static double[] addElement(double[] array, double element) {
            double[] result = new double[array.length + 1];

            int j = 0;
            for (double each : array) {
                result[j++] = each;

            }
            result[j] = element;
            return result;


        }


}
