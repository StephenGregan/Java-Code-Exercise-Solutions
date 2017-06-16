package sheet16StringsAndStringBuilder;

public class Ex3UpdateTheMenuStringBuilder {

	public static void main(String[] args) {
		
		String todaysMenu = "Wednesday's Menu : Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		
		StringBuilder sb = new StringBuilder(todaysMenu);
		//sb.append(sb);
		System.out.println(sb.replace(0,10, "Thursday"));
		sb.append(todaysMenu);
		System.out.println(todaysMenu.replaceAll("turkey", "beef"));
		sb.append(sb);
		System.out.println(todaysMenu.concat(", jelly and icecream for dessert."));
		sb.append(sb);
		System.out.println(todaysMenu.concat(", jelly for dessert."));
		/*sb.append("Thursday's Menu : Roast turkey with homemade turkey gravy, potatoes and veg of the day");
		System.out.println(sb);*/
		}
	
}
