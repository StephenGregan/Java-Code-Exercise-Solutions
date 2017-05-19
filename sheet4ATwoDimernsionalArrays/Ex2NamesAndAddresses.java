package sheet4ATwoDimernsionalArrays;
// Imports Scanner class
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ex2NamesAndAddresses {

	public static void main(String[] args) {
		// 2D String Array 
		String [][] nameAddress1 = {{"Joe Murphy","12 Main Street","Finglas","Dublin 11"},
				{"Mary Jones","36 Amiens Street","Dublin 1"," "},
				{"Pat O'Conner","26 South Main Street","Wexford","Co.Wexford"}};
		// User can input from the scanner class (java.util.Scanner).
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Search for address.  Please enter name below:\n ");
		String name = scanner.nextLine();
		scanner.close();
		boolean isFound = false;

		for(int i = 0; i < nameAddress1.length;i++){
			if(nameAddress1[i][0].equalsIgnoreCase(name)){
				isFound = true;
				System.out.println("Address for : " + nameAddress1[i][0]);

				for(int j = 1;j < nameAddress1[i].length;j++){
					System.out.println(nameAddress1[i][j]);

				}
				break;

			}
		if(!isFound){
			System.out.println(nameAddress1 + "Not Found");
		}



		}

	}

}



	
	


