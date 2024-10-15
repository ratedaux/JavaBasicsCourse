package homework24.task2;

public class ElectronicWallet implements PaymentSystem {

    double startAmount;

    public ElectronicWallet(double startAmount) {
        this.startAmount = startAmount;
    }

    @Override
    public String withdrawMoney(double amount) {
        startAmount = startAmount - amount;
        return "You have got: " + amount + " from electronic wallet. Current balance: " + startAmount + "$";
    }

    @Override
    public String depositTransfer(double amount) {
        startAmount = startAmount + amount;
        return "You deposited " + amount + "to electronic wallet. Current balance: " + startAmount + "$";
    }

    @Override
    public String checkBalance() {
        return "Current balance: " + startAmount + "$";
    }
}
