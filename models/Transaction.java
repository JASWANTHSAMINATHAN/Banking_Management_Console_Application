package models;
import java.util.*;
import java.text.SimpleDateFormat;
public class Transaction {
    private String transactionid;
    private String type;
    private double amount;
    private String timestamp;
     public Transaction(String type,double amount)
     {
        this.transactionid=UUID.randomUUID().toString();
        this.type=type;
        this.amount=amount;
        this.timestamp= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
     }
    public String getTransactionDetails()
    {
        return "[ "+timestamp+" ]"+type+" | Amount : $"+amount+" | Transaction ID : "+transactionid;
    }
}
