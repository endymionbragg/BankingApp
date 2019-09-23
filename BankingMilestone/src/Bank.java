import java.util.Scanner;

/**
 * 
 * @author endymionbragg
 *
 */

/**
 * This is our constructor for the Bank
 * 
 * @author endymionbragg
 *
 */
public class Bank {
	private String name = "GCU Bank";
	Scanner sc = new Scanner(System.in);

	// Bank constructor
	public Bank(String name) {

	}

	// Display Menu will display the menu f
	protected void displayMenu(Checking checking, Savings savings) {

		int option;
		do {
			System.out.println("===================================");
			System.out.println(" MAIN MENU");
			System.out.println(" " + this.name.toUpperCase());
			System.out.println("===================================");
			System.out.println("Pick an option: ");
			System.out.println("---------------------");
			System.out.println(" 1: : Deposit to Checking");
			System.out.println(" 2: : Deposit to Savings");
			System.out.println(" 3: : Write a Check");
			System.out.println(" 4: : Withdraw from Savings");
			System.out.println(" 5: : Get balance");
			System.out.println(" 6: : Close month");
			System.out.println("---------------------");
			System.out.println(" 9: : Exit");

			// Translating input as an integer
			option = sc.nextInt();
			this.doMenuAction(option, checking, savings);
		} while (option != 9);
	}

	// The beginning of our switch statement for the menu
	protected void doMenuAction(int option, Checking checking, Savings savings) {

		switch (option) {
		case 1:
			displayDepositChecking(checking);
			break;
		case 2:
			displayDepositSavings(savings);
			break;
		case 3:
			displayWithdrawChecking(checking);
			break;
		case 4:
			displayWithdrawSavings(savings);
			break;
		case 5:
			displayBalanceScreen(checking, savings);
			break;
		case 6:
			doEndMonth(checking, savings);
			break;

		case 9:
			displayExitScreen();
			break;

		default:
			System.out.println("INPUT ERROR");
			break;
		}
	}

	// Our methods for to call upon and have menus displayed

	protected void displayDepositChecking(Checking checking) {
		double checkingDeposit;

		System.out.println("Deposit into your Checking " + checking.getAccountNumber());
		System.out.println("Your Balance is : $" + checking.getBalance());
		System.out.print("How Much Would You Like to Deposit?");
		checkingDeposit = sc.nextDouble();
		checking.doDeposit(checkingDeposit);

		System.out.println("Your new balance is $" + checking.getBalance());

	}

	protected void displayWithdrawChecking(Checking checking) {

		double doCheckingWithdraw;

		System.out.println("\n WITHDRAW FROM CHECKING: " + checking.getAccountNumber());
		System.out.println("\n Your Checking Balance is $" + checking.getBalance());
		System.out.println("\n You will have a Service Fee of $" + checking.getOverDraft()
				+ " if your withdraw is greater than $" + checking.getBalance());
		System.out.println("\n How much would you like to withdraw?");
		doCheckingWithdraw = sc.nextDouble();
		checking.doWithdraw(doCheckingWithdraw);

		System.out.println("\n Your new balance is $" + checking.getBalance());

	}

	protected void displayWithdrawSavings(Savings savings) {

		double doSavingsWithdraw;

		System.out.println("WITHDRAW FROM SAVINGS: " + savings.getAccountNumber());
		System.out.println("Your Savings Balance is $" + savings.getBalance());
		System.out.println("You will have a Service Fee of $" + savings.getServiceFee() + "if your balance is below "
				+ savings.getMinBalance() + "at the end of the month.");
		System.out.println("How much would you like to withdraw?");
		doSavingsWithdraw = sc.nextDouble();
		savings.doWithdraw(doSavingsWithdraw);

		System.out.println("Your new balance is $" + savings.getBalance());

	}

	protected void displayBalanceScreen(Checking checking, Savings savings) {
		System.out.println("Your balance for your Checking Is: $" + checking.getBalance());
		System.out.println("Your balance for your Savings Is: $" + savings.getBalance());

	}

	protected void displayDepositSavings(Savings savings) {
		double savingsDeposit;

		System.out.println("\n Deposit into your Savings " + savings.getAccountNumber());
		System.out.println("\n Your Balance is : $" + savings.getBalance());
		System.out.print("\n How Much Would You Like to Deposit?");
		savingsDeposit = sc.nextDouble();

		savings.doDeposit(savingsDeposit);

		System.out.println("Your new Savings balance is $" + savings.getBalance());

	}

	protected void doEndMonth(Checking checking, Savings savings) {
		if (savings.getBalance() < savings.getMinBalance()) {
			System.out.println("\n You will have a " + savings.getServiceFee() + "Service fee if balance is below $"
					+ savings.getMinBalance() + "at the end of the month.");

			System.out.println(
					"\n Your new balance after the Service Fee " + (savings.getBalance() - savings.getServiceFee()));
		}

		if (savings.getBalance() > 0) {
			double amount = savings.getBalance() * savings.getAnnualIntrestRate() / 12;
			System.out.println("Your interest for this month is " + amount);
			savings.balance = amount + savings.getBalance();
			System.out.println("\n Your new amont is : $" + savings.balance);

		}

	}

	// The Exit Screen
	protected void displayExitScreen() {
		System.out.println("Thank you for using GCU Bank \"LOPES UP!\" ");

	}

}
