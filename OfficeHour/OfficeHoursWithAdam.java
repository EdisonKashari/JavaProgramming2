public class OfficeHoursWithAdam {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + i);//all the numbers
            System.out.println();
            
        }
        for (int i = 0; i < 100; i+=2) {//even numbers
            System.out.print( "-"+i);
            System.out.println();
        }
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(" " + i);//odd numbers
            System.out.println();
            
        }

        for (int i = 0; i < 100; i+=5) {// divide numbers with 5,from zero to 100
            
            System.out.print(" " + i);
            System.out.println();
        }

        for (int i = 100; i >=0 ; i-=2) {
            System.out.println(" " + i);
        }
    }
}
