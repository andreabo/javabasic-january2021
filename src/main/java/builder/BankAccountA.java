package builder;

public class BankAccountA {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public BankAccountA(long accountNumber, String owner, String branch, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //Getters and setters omitted for brevity.
}
