package static_hiding_extra_practice;

public class BankAccount {
	
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
		public String getAccountHolder() {
		return accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public BankAccount(String accountHolder, int accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}
	
	public void deposit(int depositedAmount) {
		balance += depositedAmount;
	}
	public void withdraw(int withdrawedAmount) {
		balance -= withdrawedAmount;
	}
	
}
