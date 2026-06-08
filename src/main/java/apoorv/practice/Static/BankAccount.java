package apoorv.practice.Static;

public class BankAccount {
    private long accountNumber;
    private long balance;
    static String bankName;
    static double interestRate;
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public long getBalance() {
        return balance;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1);
        bankAccount.setBalance(500);
        BankAccount.bankName = "SBI";
        BankAccount.interestRate = 100;
        System.out.println("Bank Name: " + BankAccount.bankName+"\n"+"Account Number: " + bankAccount.getAccountNumber()+"\n"+"Balance: " + bankAccount.getBalance()+"\n"+"Interest: "+BankAccount.interestRate);

    }
}

