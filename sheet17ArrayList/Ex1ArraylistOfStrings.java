package sheet17ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1ArraylistOfStrings {

	public static void main(String[] args) {
	
		ArrayList<String> arraylist = new ArrayList<String>(5);
		arraylist.add("John");
		arraylist.add("Mike");
		arraylist.add("Ben");
		arraylist.add("Shane");
		arraylist.add("Stephen");

		System.out.println(arraylist);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name below : ");
		String text = sc.nextLine();

	}

}
