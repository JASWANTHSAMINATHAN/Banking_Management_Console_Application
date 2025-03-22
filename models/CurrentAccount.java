package models;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accnumber, String accholder, double balance, double overdraftLimit) {
        super(accnumber, accholder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            tranhis.add(new Transaction ("Withdraw (Overdraft Allowed)" ,amount));
            System.out.println("Withdrawal successful! New balance: $" + balance);
            return true;
        } else {
            System.out.println("Withdrawal failed! Overdraft limit reached.");
            return false;
        }
    }

    @Override
    public void showAccDetails() {
        System.out.println("Current Account: " + accnumber + " | Holder: " + accholder + " | Balance: $" + balance + " | Overdraft Limit: $" + overdraftLimit);
    }
}

