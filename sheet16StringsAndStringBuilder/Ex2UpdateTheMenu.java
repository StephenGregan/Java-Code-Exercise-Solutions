package sheet16StringsAndStringBuilder;

public class Ex2UpdateTheMenu {

	public static void main(String[] args) {
	
		/*String todaysMenu = "Wednesday's Menu : Roast turkey with homemade turkey gravy, potatoes and veg of the day";
		
		String text = "Thursday";
		//text = todaysMenu.replace("Wednesday's", "Thursday's");
		System.out.println(todaysMenu.replace("Wednesday's", "Thursday's")); // A
		
		String text1 = "beef";
		//text1 = todaysMenu.replace("turkey","beef");
		System.out.println(todaysMenu.replace("turkey", "beef")); // B
		
		System.out.println(todaysMenu + ", jelly and icecream for desert.");
		System.out.println(todaysMenu + ", jelly for desert");
		System.out.println(todaysMenu.replace(", jelly and icecream for desert.", ", jelly for dessert."));*/
		String todaysMenu = "Wednesday's Menu : Roast turkey with homemade gravy, potatoes and veg of the day.";
		
		todaysMenu = todaysMenu.replace("Wednesday's","Thursday's");
		System.out.println(todaysMenu);
		todaysMenu = todaysMenu.replaceFirst("turkey", "beef");
		System.out.println(todaysMenu);
		todaysMenu = todaysMenu.concat(" jelly and icecream for dessert.");
		System.out.println(todaysMenu);
		todaysMenu = todaysMenu.substring(0, todaysMenu.indexOf(" and icecream ")) + "for dessert";
		System.out.println(todaysMenu);
		
	}

}
