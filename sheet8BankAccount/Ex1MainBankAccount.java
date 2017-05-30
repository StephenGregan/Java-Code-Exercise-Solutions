package sheet8BankAccount;

public class Ex1MainBankAccount {

	public static void main(String[] args) {
		
		Ex1BankAccount ee = new Ex1BankAccount();
		System.out.println(ee);
		
		System.out.println("Deposit 200, new balance : " + ee.depositMoney(200));
		System.out.println("New balnce " + ee.getBalance());
		System.out.println("Number of Accounts " + Ex1BankAccount.accountNumberCounter);
		
		ee.addIntrest();
		System.out.println("New Balance " + ee.getBalance());
		ee.depositMoney(200);
		System.out.println("New Balance " + ee.getBalance());
		ee.withdrawmoney(500);
		System.out.println("New Balance " + ee.getBalance());
		ee.withdrawAllmoney();
		System.out.println("New Balance " + ee.getBalance());
		
		Ex1BankAccount ee1 = new Ex1BankAccount("John","raheny",5000);
		ee1.depositMoney(1000);
		ee1.addIntrest();
		ee1.withdrawmoney(400);
		System.out.println(ee1);
		System.out.println("Number of accounts : " + Ex1BankAccount.accountNumberCounter);
		
	}	
}
