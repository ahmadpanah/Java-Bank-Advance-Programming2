import java.util.Scanner;

public class Account {

	// Class Variable
	int balance;
	int prevTransaction;
	String customerName;
	String customerId;
	
	// Class Constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}
	
	void getPrevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Deposited: " + prevTransaction);
		} else if (prevTransaction <0) {
			System.out.println("Withdrawn: " + Math.abs(prevTransaction));
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your id is: " + customerId);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("A. Check Your Balance");
		System.out.println("B. make a Deposit");
		System.out.println("C. make a Withdraw");
		System.out.println("D. Show Previous Tranaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("");
			System.out.println("Please Enter an option:");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			case 'A':
				System.out.println("=============");
				System.out.println("Balance = $" + balance);
				System.out.println("=============");
				break;
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			case 'C':
				System.out.println("Enter an amount to Withdraw: ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				break;
			case 'D':
				getPrevTransaction();
				break;
			case 'E':
				System.out.println("==========");
				break;
			default:
				System.out.println("Error: invalid option. Please Enter a,b,c,d");
				break;
			}
		} while (option != 'E');
		
		
		System.out.println("Thank you for banking with us ♥  ");
	}
}
