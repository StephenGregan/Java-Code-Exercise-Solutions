package sheet8BankAccount;

public class Ex1BankAccount {
	//Member variables
	private String name;
	private String address;
	private int accountnumber;
	private double balance;
	
	//Static/Class variables
	public static final double intrestRate = 1.6;
	//Cannot increase if final
	/*private static int countbankAccounts = 0;
	private static int accountNumberIncrement = 1000;
	private static final double withdrawMoney = 20.00;
	private static final double depositMoney = 20.00;*/
	
	public static int accountNumberCounter;
	private static int   accountNumberUser= 5000;
	
		Ex1BankAccount() {
		accountNumberCounter++;
		accountnumber = accountNumberUser++;	
	}
	
	public Ex1BankAccount(String name,String address) {
		this();
		this.name = name;
		this.address = address;
		/*setBalance(balance);
		this.depositMoney(depositMoney);
		addIntrest(balance,intrestRate);
		withdrawmoney(balance);
		checkBalance(balance);*/
	}
	
	public Ex1BankAccount(String name,String address, double balance){
		this();
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		/*switch(name){
		case "John Jones":
		case "Peter Knowles":
		case "Alex Reily":
		case "Robert Hill":
		break;
		default:
		}*/
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		/*if(address.contains("Ireland") && address.contains("Dublin")){
		}else{
			System.out.println("Invalid address, address not located in  Dublin Ireland");
		}*/
		this.address = address;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	/*public void setAccountnumber(int accountnumber) {
		if(accountnumber >= 1 && accountnumber <= 1000) {
		this.accountnumber = accountnumber;
		}else{
			System.out.println("Invalid account number, must be number between 1 to 1000, inclusive");	
		}
	}*/

	public double getBalance() {
		return balance;
	}

	/*public void setBalance(double balance) {
		if(balance > 1){
		this.balance = balance;
		}else{
			System.out.println("Invalid funds, please deposit money into your bank account!!");
		}
	}*/

	/*public static double getIntrestrate() {
		return intrestRate;
	}

	public static int getCountbankaccounts() {
		return countbankAccounts;
	}

	public static int getaccountNumberIncrement() {
		return accountNumberIncrement;
	}*/
	
	public double depositMoney(double depositMoney) {
		if(depositMoney > 0){
			balance += depositMoney;
			System.out.println("Insufficient funds");
		}else{
			System.out.println(depositMoney + "can not be negitive");
		return balance;
		}
		return depositMoney;
	}
	
	public double withdrawmoney(double withdrawMoney) {
		if(withdrawMoney > balance){
			balance += withdrawMoney;
			System.out.println("Insufficient funds");
		}else{
			balance = balance - withdrawMoney;
		}
		return balance;
	}
	
	/*public double checkBalance(double balance) {
		System.out.println(balance);
		return balance;
	}*/
	
	public double addIntrest() {
		balance = balance + (balance * (intrestRate / 100));
			return balance;
	}
	
	public void withdrawAllmoney() {
	System.out.printf("Your about to withdraw all,your current balance is " + "%.2f\n", balance);
	balance = 0.0;
	}

	@Override
	public String toString() {
		return "Ex1BankAccount [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber
				+ String.format("Balance = %.2f", balance);
	}	
}
