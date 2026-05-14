package apoorv.practice;

public class BankAccount {
    private long accountNumber;
    private double balance;
    public void setBankAccount(long ac, double bl){
        accountNumber = ac;
        balance = bl;
    }
    public double getBalance(){
        return balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
}
