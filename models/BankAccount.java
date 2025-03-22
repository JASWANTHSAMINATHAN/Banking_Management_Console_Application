package models;
import java.util.*;
public abstract class BankAccount {
    protected String accnumber;
    protected String accholder;
    protected double balance;
    protected ArrayList<Transaction> tranhis;

    public BankAccount(String accnumber,String accholder,double balance)
    {
        this.accnumber=accnumber;
        this.accholder=accholder;
        this.balance=balance;
        this.tranhis=new ArrayList<>();
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            tranhis.add(new Transaction("Deposit", amount));
            System.out.println("Succesfully deposited $"+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(double amount)
    {
        if(amount<=balance && amount>0)
        {
            balance-=amount;
            tranhis.add( new Transaction("Withdraw", amount));
            System.out.println("Succesfully withdrawn $"+amount);
            return true;
        }
        else{
            System.out.println("Invalid withdrawn amount");
            return false;
        }
    }
    public void transfer(double amount,BankAccount receiver)
    {
        if(withdraw(amount))
        {
            receiver.deposit(amount);
            tranhis.add(new Transaction("Transfer ", amount));
            System.out.println("Succesfully transfered $"+amount);
        }
        else{
            System.out.println("Invalid amount for transfering");
        }
    }
    public void balancecheck()
    {
        System.out.println("Balance is : "+balance);
    }
    public abstract void showAccDetails();
    public void showTransactionHistory()
    {
        System.out.println("Transaction History for"+accnumber+":");
        for(Transaction transaction:tranhis)
        {
            System.out.println(transaction.getTransactionDetails());
        }
       }
    }

