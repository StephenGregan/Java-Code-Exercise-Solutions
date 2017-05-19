package sheet5PracticeCreatingClasses;

public class Ex3GymMembership {

	private String membersName;
	private int membershipNumber;
	private double membershipCost;
	private int paymentFrequency;
	public static int defaultMembershipNumber = 100;



	public static int gymCounter;


	public static final int MonthlyPayment = 1;
	public static final int YearlyPayment = 2;
	double totalCost = 0;

	public Ex3GymMembership() {
		gymCounter++;
		membershipNumber = defaultMembershipNumber++;


	}

	public Ex3GymMembership(String membersName,int membershipNumber, double membershipCost, int paymentFrequency){

		this();
		this.membersName = membersName;
		this.membershipNumber = membershipNumber;
		this.membershipCost = membershipCost;
		setPaymentFrequency(paymentFrequency);

	}


	public void setMembersname(String membersName){
		this.membersName = membersName;

	}
	public void setMembershipNumber(int membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public void setMembershipCost(double membershipCost) {

		this.membershipCost = membershipCost;
	}

	public void setPaymentFrequency( int paymentFrequency){
		if(paymentFrequency == 1){
			this.paymentFrequency = paymentFrequency;
		}else if
		(paymentFrequency == 2)
			this.paymentFrequency = paymentFrequency;
		else{
			System.out.println("Invalid membership type");

		}

	}

	public void setDefaultMembershipNumber(int defaulMembershipNumber) {
		if(membershipNumber >= 1 && membershipNumber <= 1000){		
		}else{
			System.out.println("Invalid membership number default membership number added" + defaultMembershipNumber);

		}

	}

	public String getMembersName(){
		return membersName;

	}

	public int getMembershipNumber() {
		return membershipNumber;

	}

	public double getMembershipCost() {
		return membershipCost;

	}

	public int getPaymentFrequency() {
		return paymentFrequency;

	}

	public static int getDefaultMembershipNumber() {
		return defaultMembershipNumber;

	}
	public String getPaymentFrequencyAsString(){
		switch(paymentFrequency){
		case MonthlyPayment:
			return "Monthly Payment";
		case YearlyPayment:
			return "Yearly Payment";
		default:
			return "Payment frequency not set";

		}
	}	
	public String toString(){
		return "\nMembers Name: " + membersName +
				"\nMembership Number: " +  membershipNumber +
				String.format("\nMembership Cost: €.2f" + membershipCost) +
				String.format("\nPayment Frequency: " + getPaymentFrequencyAsString());

	}

}
