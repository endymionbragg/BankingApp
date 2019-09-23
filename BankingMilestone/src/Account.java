
public class Account {
	/**
	 * 
	 * @author endymionbragg
	 * 
	 */

	// Crate Variables, assign to data types
	protected String accountNumber;
	protected double balance;

	// Account Method

	public void doWithdraw(double amount) {
		balance = balance - amount;
	}

	public void doDeposit(double amount) {
		balance = balance + amount;

	}

	// Setting Getters and Setters for AccountNumber and Balance
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
