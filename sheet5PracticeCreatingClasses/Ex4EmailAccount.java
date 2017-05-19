package sheet5PracticeCreatingClasses;


public class Ex4EmailAccount {

	private String emailAddress;
	private String password;
	private int maximumStorageLimit;
	private String userStorage;
	
	public static int emailCounter;
	
	public static final int Max_Stroage_100_Gb = 100;
	public static final int Max_Storage_500_Gb = 500;
	public static final int Max_Storage_1_Tb = 1000;

	public Ex4EmailAccount(){
		emailCounter++;

	}

	public Ex4EmailAccount(String emailAddress,String password,int maximumStorageLimit){
		this();
	//	this.password = password;
	//	this.maximumStorageLimit = maximumStorageLimit;
		//this.userStorage = userStorage;
		setEmailAddress(emailAddress);
		setMaximumStoragelimit(maximumStorageLimit);
		//setUserStorage(userStorage);
		setPassword(password);
		
	}

	public void setEmailAddress(String emailAddress){
		if(emailAddress.contains("@") && emailAddress.contains(".")){
			if(emailAddress.indexOf("@") < emailAddress.lastIndexOf(".")){
				this.emailAddress = emailAddress;
			}else{
				System.out.println("Email is invalid");

			}
			
		}

	}

	public void setPassword(String password){
		if(password.length() >= 8 && password.length() <= 20){
			this.password = password;	
		}else{
			System.out.println("Password is invalid");

		}

	}

	public void setMaximumStoragelimit(int maximumStorageLimit){
		switch(maximumStorageLimit){
		case Max_Stroage_100_Gb:
		case Max_Storage_500_Gb:
		case Max_Storage_1_Tb:
			this.maximumStorageLimit = maximumStorageLimit;
			break;
		default:
			System.out.println(maximumStorageLimit + " : is not valid");
			break;
		}

	}

	public void setuserStorage(String userStorage){
		if(userStorage.length() >= 1 && userStorage.length() <= 10){
			this.userStorage = userStorage;
		}

		else{
			System.out.println("Storage invalid");

		}

	}

	public String getEmailAddress(){
		return emailAddress;

	}

	public String getPassword(){
		return password;

	}

	public int getMaximumStorageLimit(){
		return maximumStorageLimit;

	}

	public String getUserStorage(){
		return userStorage;

	}

	public String toString(){
		return "Email Address: " + emailAddress +
				"Password: " + password + 
				"Storage: " + maximumStorageLimit;

	}

}
