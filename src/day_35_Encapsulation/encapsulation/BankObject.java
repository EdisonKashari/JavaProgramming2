package day_35_Encapsulation.encapsulation;

public class BankObject {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Edison",2545454,10);
        bankAccount1.deposit(25);
        bankAccount1.withdraw(10);
        bankAccount1.getBalance();

        System.out.println(bankAccount1);

    }
}
