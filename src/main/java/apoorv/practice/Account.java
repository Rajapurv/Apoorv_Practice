package apoorv.practice;

public class Account {
    private long accountNumber;
    private float balance;
    private String accountHolder;
    public void account(long accountNumber,float balance, String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public  float getBalance(){
        return balance;
    }

    public float deposit(float deposit){
        return balance + deposit;
    }
    public float withdraw(float withdraw){
        return balance - withdraw;
    }

}
