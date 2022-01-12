package day_17_While_DoWhile;

public class BranchingStatementsContinue {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {

            if (i=='C'){
                continue;
            }

            System.out.println(i);// A B D E

        }

        System.out.println("-----------------------------");

        for (int i = 0; i <= 10; i++) {// skip the odd numbers 1,3,5,7,9
            if (i%2==1){
                continue;
            }
            System.out.print(i);

        }
        System.out.println("------------------------------------");
        for (int i = 0; i < 10; i++) {//skip the even numbers 2,4,6,8,10
            if(i%2==0){
                continue;
            }
            System.out.print(i);

        }
    }
}
