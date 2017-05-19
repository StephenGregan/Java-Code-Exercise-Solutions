package sheet5PracticeCreatingClasses;

public class Ex3MainGymMembership {

	public static void main(String[] args) {

		Ex3GymMembership gm1 = new Ex3GymMembership();
		gm1.setMembersname("John Smith");
		gm1.setMembershipNumber(1234);
		gm1.setMembershipCost(20.00);
		gm1.setPaymentFrequency(1);

		System.out.println("Members Name: " + gm1.getMembersName());
		System.out.println("Membership Number: " + gm1.getMembershipNumber());
		System.out.println("Membership Cost: " + gm1.getMembershipCost());
		System.out.println("Payment Type: " + gm1.getPaymentFrequency());

		System.out.println("-------------------------");

	}

}

