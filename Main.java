
import java.util.*;
import models.CurrentAccount;
import models.SavingsAccount;

class Main {
    public static void main(String[] args) {
        // Create Savings Account
        Scanner sc=new Scanner(System.in);
        SavingsAccount savings=null;
        CurrentAccount current =null;
        while(true)
        {
            System.out.println("\nchoose an operation:\n"+
            "1 . Open Savings Account\n"+"2 . Open Current Account\n"+"3 . Deposit Money\n"+
            "4 . Withdraw Money\n"+"5 . Transfer Money\n"+
            "6 . Show Account Details\n"+
            "7 . Exit");
            int choice;
            while(true)
            {
                System.out.println("Enter your choice");
                if(sc.hasNextInt())
                {
                choice =sc.nextInt();
                break;
                }
                else{
                    System.out.println("Invalid Input ! Please enter a number .");
                    sc.next();
                }
            }
            switch(choice)
            {
                case 1:
                String accnumbers,accholders;
                double balances,interestrates;
                System.out.println("Give accountNumber : ");
                accnumbers=sc.next();
                System.out.println("Give accountHolderName :");
                accholders=sc.next();
                System.out.println("Give account balance :");
                balances=sc.nextDouble();
                System.out.println("Give InterstRate :");
                interestrates=sc.nextDouble();
                savings = new SavingsAccount(accnumbers, accholders,balances, interestrates);
                System.out.println("Savings Account Created Successfully");
                savings.calculateinterest();
                System.out.println("\n-----------------------------\n");
                break;
            case 2:
                System.out.println("Enter Account Number: ");
                String accnumberc=sc.next();
                System.out.println("Give AccountHolderName :");
                String accholderc=sc.next();
                System.out.println("Give account balance :");
                Double balancec=sc.nextDouble();
                System.out.println("Give OverDraftLimit :");
                Double overdraftlimit=sc.nextDouble();
                current = new CurrentAccount(accnumberc, accholderc,balancec,overdraftlimit);;
                System.out.println("Current Account Created Succesfully . \n"+"-----------------------------\n");
                break;
            case 3:
                System.out.println("Choose account type:\n"+"1 : Savings Account\n"+"2 : Current Account \n"+"3 : Exit");
                int acctype=sc.nextInt();
                if(acctype==3)
                {
                    break;
                }
                System.out.println("Enter the amount to be deposit : ");
                Double depamount=sc.nextDouble();
                if(acctype==1 && savings!=null)
                {
                    savings.deposit(depamount);
                    savings.calculateinterest();
                }
                else if(acctype==2 && current!=null)
                {
                    current.deposit(depamount);
                    current.balancecheck();
                }
                else{
                    System.out.println("Account not found !! Open an account first . ");
                }
                break;
            case 4:
            System.out.println("Choose account type:\n"+"1 : Savings Account\n"+"2 : Current Account\n3 : Exit");
            int withtype=sc.nextInt();
            if(withtype==3)
            {
                break;
            }
            System.out.println("Enter the amount to be withdrawn : ");
            Double withamount=sc.nextDouble();
            if(withtype==1 && savings!=null)
            {
                savings.withdraw(withamount);
                savings.balancecheck();
            }
            else if(withtype==2 && current!=null)
            {
                current.withdraw(withamount);
                current.balancecheck();
            }
            else{
                System.out.println("Account not found !! Open an account first . ");
            }
            break;
        case 5:
            if(savings==null || current==null)
            {
                System.out.println("Both accounts must be created before transfering money !!");

            }
            else{
                System.out.println("Enter amount to transfer:");
                double trnsamount=sc.nextDouble();
                System.out.println("1.Savings Account \n2.Current Account \n Enter the account to be sender :");
                int ac=sc.nextInt();
                if(ac==1)
                {
                savings.transfer(trnsamount,current);
                }
                else
                {
                    current.transfer(trnsamount,savings);
                }
            }
            break;
        case 6:
            if(savings !=null)
            {
                System.out.println("Savings Account details: ");
                savings.showAccDetails();
                savings.showTransactionHistory();
            }
            if(current!=null)
            {
                System.out.println("Current Account details: ");
                current.showAccDetails();
                current.showTransactionHistory();
            }
            else{
                System.out.println("No Current Account Found! ");
            }
            break;
        case 7:
            System.out.println("Exiting program \n"+"... !! ThankYou !!.....");
            sc.close();
            return;
        default:
            System.out.println("Invalid choice ! please Enter a valid number from 1 -  7");
            }
        }
    }
}

