package sheet5PracticeCreatingClasses;

public class Ex4MainEmailAccount {

	public static void main(String[] args) {

		Ex4EmailAccount vv = new Ex4EmailAccount();

		vv.setEmailAddress("Jonee@gmail.com");
		vv.setPassword("1233desert");
		vv.setMaximumStoragelimit(100);

		System.out.println("Email Address: " + vv.getEmailAddress());
		System.out.println("Password: " + vv.getPassword());
		System.out.println("Storage: " +vv.getMaximumStorageLimit());

		//System.out.println("-------------------------------------------");

		System.out.println("Number of Email objects created: " + Ex4EmailAccount.emailCounter);
		System.out.println("-------------------------------------------");

		//System.out.println();

		Ex4EmailAccount vv3 = new Ex4EmailAccount("bob01234@live.com\n","4g5ht0hg4h4\n",200);
		System.out.println(vv3);
		System.out.println("Number of Email objects created: " + Ex4EmailAccount.emailCounter);
		System.out.println("-------------------------------------------");
		
		Ex4EmailAccount vv4 = new Ex4EmailAccount("bbbbgbgbgbgb\n","54hhyjjjjjgh\n",500);
		System.out.println(vv4);
		System.out.println("Number of Email objects created: " + Ex4EmailAccount.emailCounter);
		System.out.println("-------------------------------------------");

	}

}

