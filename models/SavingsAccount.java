package models;

public class SavingsAccount extends BankAccount {
    private double interestrate;
    public SavingsAccount(String accnumber,String accholder,double balance,double interestrate)
    {
        super(accnumber,accholder,balance);
        this.interestrate=interestrate;

    }
    public void calculateinterest()
    {
        double interest=balance*(interestrate/100);
        balance+=interest;
        tranhis.add(new Transaction("Interest added",interest));
        System.out.println("Interest added! New balance : $"+balance);
    }
    @Override
    public void showAccDetails(){
        System.out.println("Savings Account : "+accnumber+" | Holder: "+accholder+" | Balance: $"+balance);
    }
}
