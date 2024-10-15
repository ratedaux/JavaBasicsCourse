package homework24.task2;

public class BankMAin {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);
        System.out.println(bankAccount.withdrawMoney(40));
        System.out.println(bankAccount.checkBalance());
        System.out.println(bankAccount.depositTransfer(20));
        System.out.println("===========================");

        ElectronicWallet electronicWallet = new ElectronicWallet(500);
        System.out.println(electronicWallet.withdrawMoney(50));
        System.out.println(electronicWallet.depositTransfer(35));
        System.out.println(electronicWallet.checkBalance());


    }
}
