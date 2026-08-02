package mod1;
import java.util.Scanner;
public class BankAccount {
	long accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount(long accNo, String holder, double bal) {
		accountNumber = accNo;
		accountHolder = holder;
		balance = bal;
	}
	
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Amount deposited ="+amount);
		}
	void display() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Balance: "+balance);
		}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		long accNo = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter account Holder name: ");
		String holder = sc.nextLine();
		
		System.out.println("Enter balance: ");
		double balance = sc.nextDouble();
		
		BankAccount user = new BankAccount(accNo,holder,balance);
		
		System.out.println("Deposit Amount: ");
		double amount = sc.nextDouble();
		
		user.deposit(amount);
		
		System.out.println("Updated account details: ");
		user.display();
		}
	}
