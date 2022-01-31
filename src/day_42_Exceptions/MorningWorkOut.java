package day_42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("------------------Push up started-----------");
        for (int i = 1; i <= 100; i++) {
            System.out.println("\rPush up "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("-------------------------Push up started-----------------------------");

        for (int i = 1; i <=  20; i++) {

            System.out.println("\rPull up "+i);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }




    }
}
