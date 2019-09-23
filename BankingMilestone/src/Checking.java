
public class Checking extends Account {
	/**
	 * Checking Method will include the constructor and getters and setters
	 * 
	 * @author endymionbragg
	 */
	private double overDraft;

	// Constructor for the Checking Method
	public Checking(double balance, String account) {
		setOverDraft(45.00);
		setAccountNumber(account);
		setBalance(balance);

	}

	// This method will prompt for Withdraw
	public void doWithdraw(double amount) {
		balance = balance - amount;
		if (balance < 0) {
			balance = balance - overDraft;
			System.out.println("\n OVERDRAFT NOTICE: $" + overDraft + " fee assessed!");
		}
	}

	// Getter and Setter for Over Draft
	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

}
