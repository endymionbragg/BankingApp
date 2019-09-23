
public class Savings extends Account {
	/**
	 * Setting of the variables for the Savings Method
	 * 
	 * @author endymionbragg
	 */
	private double serviceFee;
	private double annualInterestRate;
	private double minBalance;

	// Savings constructor that sets the minBalance, ServiceFee and AnnualInterest
	// Rate
	public Savings(double balance, String account) {
		setBalance(balance);
		setAccountNumber(account);
		setMinBalance(200.00);
		setServiceFee(25.00);
		setAnnualInterestRate(.06);

	}

	// Getter and Setter for minBalance, serviceFee, annualIneterestRate
	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public double getAnnualIntrestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualIntrestRate) {
		this.annualInterestRate = annualIntrestRate;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

}
