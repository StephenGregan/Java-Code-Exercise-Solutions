package sheet17ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex1ArraylistOfStrings {

	public static void main(String [] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		String s1 = "Stephen";
		String s2 = "Agnus";
		String s3 = "Gabi";
		String s4 = "Emmanuel";
		String s5 = "Sean";
		String s6 = "Pat";
		String s7 = "Luca";
		String s8 = "Vitali";
		String s9 = "Jay";
		String s10 = "Darius";
		String s11 = "Kev";
		String s12 = "Shane";
		String s13 = "Ben";
		String s14 = "Yanosh";
		String s15 = "James";
		String s16 = "Evelina";
		String s17 = "Asen";
		String s18 = "Damien";
		String s0 = "Santa";
		
		String [] all = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,
				s16,s17,s18};

		arrayList.addAll(Arrays.asList(all));
		System.out.println(arrayList + "\n");
		System.out.println("------------------------------------------------------------------------------------------------------------------");

		String name = JOptionPane.showInputDialog("Enter name from the list");

		boolean namenotFound = false;
		for(int i = 0;i < all.length;i++){
			if(name.equals(all[i])){
				System.out.println(name + "\nName was found at postion : " + i + "\n");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				namenotFound = false;
				break;
			}else{
				namenotFound = true;
			}

		}
		if(namenotFound == true){
			System.out.println("Invalid name please try again\n");
			System.out.println("--------------------------------------------------------------------------------------------------------------");

		}

		String name1 = JOptionPane.showInputDialog("Enter name to delete from the list!!");
		//boolean namenotFound1 = false;
		for(int i = 0;i < all.length;i++){
			if(name.equals(all[i])){
				arrayList.remove(i);
				System.out.println(name + " was deleted\n");
				//System.out.println("--------------------------------------------");
				System.out.println(arrayList + "\n");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				break;
			}else{

			}

		}
		s1 = arrayList.set(12, "Janos");
		System.out.println(arrayList);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("Number of names in the array list : " + arrayList.size() + "\n");

		Collections.sort(arrayList);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("Sorted list alphabethacilly A to Z : " + arrayList + "\n");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println(s8);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		/*
*/
		System.out.println("\n" + arrayList);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		arrayList.add(s0);
		System.out.println("\n" + arrayList);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n" + arrayList.isEmpty() + " array is not empty");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n" + arrayList.removeAll(arrayList) + " array is empty");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println(arrayList);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}
	
}	



