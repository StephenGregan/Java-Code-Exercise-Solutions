package sheet16StringsAndStringBuilder;

public class Ex1Equals {

	public static void main(String[] args) {
		
		String strA = "M on day";
		String strB = "Monday";
		String strC = "Tuesday";
		String strD = strC;
		String strE = new String("Tuesday");
		
		System.out.println("strA == strB : " + strA == strB); // False
		System.out.println("strC == strD : " + strC == strD); //False
		System.out.println("strA.equals(strB): " + strA.equals(strB)); //False
		System.out.println("strC.equals(strD): " + strC.equals(strD)); //True
		System.out.println("strD == strE : " + strD == strE); //False
		System.out.println("strC.toUpperCase() == strD :  " + strC.toUpperCase() == strD); //False
		System.out.println("strC.equals(strD): " + strC.equals(strD)); //True
		
		/*String textC = "TUESDAY";
		textC.toUpperCase();
		System.out.println(textC);*/
		
		
	}

}
