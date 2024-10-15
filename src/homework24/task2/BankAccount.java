package homework24.task2;

public class BankAccount implements PaymentSystem {

    double startAmount;

    public BankAccount(double startAmount) {
        this.startAmount = startAmount;
    }

    @Override
    public String withdrawMoney(double amount) {
        startAmount = startAmount - amount;
        return "You got: " + amount + " from bank account. Current balance: " + startAmount + " eur";
    }

    @Override
    public String depositTransfer(double amount) {
        startAmount = startAmount + amount;
        return "You deposited " + amount + ". Current balance is " + startAmount + " eur";
    }

    @Override
    public String checkBalance() {
        return "Current balance: " + startAmount + " eur";
    }
}
