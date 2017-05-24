package sheet4ATwoDimernsionalArrays;

public class Ex4TotalSales {

	public static void main(String[] args) {
		//1D Array
		int[] salesPerson = {1,2,3,4,2};
		//Array
		int[] product = {1,2,3,4,5};
		//2D Array
		int[][] productPrice = {{100,200,300,400,500},{150,250,350,450,550},{125,225,325,425,525},
				{145,245,345,445,545},{275,375,475,575,675}};
		//1D Array
		int [] sales1 = {100,200,300,400,500};
		// 1D Array
		int [] sales2 = {150,250,350,450,550};
		// 1D Array
		int [] sales3 = {125,225,325,425,525};
		// 1D Array
		int [] sales4 = {145,245,345,445,545};
		// 1D Array
		int [] totalEachSalesPerson = {520,920,1320,1720,2120};

		// Used to print The sales slips.
		System.out.println("The sales slips:");
		// Used to print SalesPerson #,Product # and total €.
		System.out.printf("%-15s%-12s%s", "SalesPerson #", "Product # ", "Total € ");
		
		// System.out.printf("%-15s%-12s%2$s","\n---------------", "-------------" , "--");
		// Prints new line.
		System.out.println();
		// For loop
		for (int i = 0; i < productPrice.length; i++) {
			// For loop inside another for loop.
			for (int j = 0; j < productPrice[i].length; j++) {
				// Prints everything from salesPerson using salesPerson[i], d represents the numbers as int values.
				System.out.printf("%-10d", salesPerson[i]);
				// Prints everything from product using product[j], % represents a special character.
				System.out.printf("%6d", product[j]);
				// Prints everything from product Price using productPrice[i][j],(15) represents the line spacing (Where you would like your int to be placed).
				System.out.printf("%15d", productPrice[i][j]);
				// Prints new line.
				System.out.println();

		}

		}
		// Prints out numbers 1,2,3,4 and total.
		System.out.printf("\n%10d%7d%7d%7d%10s",1,2,3,4,"Total");
		// Prints out ---------- ----------- ----------.
		System.out.printf("%-15s%-12s%2$s","\n---------------", "-------------" , "---------------");
		// For loop
		for(int i = 0;i < product.length;i++){
			System.out.printf("\n%d%3s%8d%7d%7d%7d%8d", product[i],"|",sales1[i],sales2[i],sales3[i],sales4[i],totalEachSalesPerson[i]);

		}
		// Prints out ----------- -------- --------. "s" represents String.
		System.out.printf("%-15s%-12s%2$s","\n---------------", "-------------" , "---------------");
		// Print String "Totals",followed by the 5 numbers.
		System.out.printf("\n%s%7d%7d%7d%7d%7d","Totals",1500,1750,1625,1725,6600);

	}

}


