
public class TestBank {
	/**
	 * Test file to run parameters and test our banking app
	 * 
	 * @author endymionbragg
	 * 
	 */
	public static void main(String[] args) {

		Bank bank = new Bank("GCU Credit Union");
		Savings savings = new Savings(5000.00, "191923");
		Checking checking = new Checking(5000.00, "991773");

		bank.displayMenu(checking, savings);

	}

}
