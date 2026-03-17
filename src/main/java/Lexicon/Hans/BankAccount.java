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
            throw new IllegalArgumentException("AccountHolder can not be null or empty!");
        }
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
