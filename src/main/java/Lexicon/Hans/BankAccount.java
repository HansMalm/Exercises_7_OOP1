package Lexicon.Hans;

public class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Accountholder can not be null or empty!");
        }
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //deposit and setBalance do the same job.
    public void deposit(int deposit) {
        balance += deposit;
    }

    public void withdraw(int withdraw) {
        balance -= withdraw;
    }
}
