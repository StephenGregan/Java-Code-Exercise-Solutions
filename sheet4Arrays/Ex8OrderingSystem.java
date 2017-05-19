package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex8OrderingSystem {

	public static void main(String[] args) {

		// Prints out String "Enter a reference number".
		System.out.println("Enter a reference number");
		// 1D int Array
		int [] refNums = new int [] {1000,1001,1002,1003,1004};
		// 1D String Array
		String [] productNames = new String [] {"Keyboard","Mouse","Monitor","Mouse mat","Speakers"};
		// 1D double Array
		double [] prices = new double [] {49.99,15.50,124.99,3.99,23.50};
		// boolean
		boolean isRefNumFound = false;
		System.out.printf("%-15s%-15s%s\n","Ref Number","Produced Name","Price");
		//System.out.printf("%15s%15s%s\n","-------------","---------");
		for(int i = 0;i < refNums.length;i++){
			System.out.printf("%-15d%-15s€%-15.2f\n",refNums[i],productNames[i],prices[i]);
		}

		String refNum  = JOptionPane.showInputDialog("Enter a reference number",JOptionPane.QUESTION_MESSAGE);
		int reference = Integer.parseInt(refNum);
		isRefNumFound = false;
		for(int i = 0;i < refNums.length;i++){
			if(refNums[i] == reference){
				JOptionPane.showMessageDialog(null , String.format("The reference number is:\n%d\nThe product name is:\n%s\nThe price is:\n%.2f\n", refNums[i], productNames[i],prices[i]));
				//System.out.printf("%-15d%-15s€%9.2f\n",refNums[i],productNames[i],prices[i]);
				String userQty  = JOptionPane.showInputDialog("How many would you like to order");
				int ref = Integer.parseInt(userQty);
				isRefNumFound = true;
				double total = ref *  prices[i];
				//int quantity = 0;
				JOptionPane.showMessageDialog(null, String.format("The total over your order will be: €%.2f ", total));
				//break;
			}/*else{
			JOptionPane.showMessageDialog(null, "Invalid reference number please try again");
			System.out.printf("%-15d%-15s€%9.2f\n",refNums[i],productNames[i],prices[i]);
			}*/



			//reference = 0;
		}

		if(! isRefNumFound){
			JOptionPane.showMessageDialog(null,"Reference number invalid");
			JOptionPane.showMessageDialog(null,"Please try again");

		}

	}

}
