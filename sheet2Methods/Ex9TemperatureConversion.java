package sheet2Methods;

public class Ex9TemperatureConversion {

	public static void main(String[] args) {

		Ex9TemperatureConversion ex9 = new Ex9TemperatureConversion();
		double fah = 90;
		double cel = 32.22;
		ex9.celToFaren(cel);
		ex9.farenToCel(fah);
	}

	public void celToFaren(double cel){
		double fah = (9 / 5.0 * cel) + 32;
		System.out.printf("%.2f in Celcius is %.2f in Fahrenheit\n",cel,fah);

	}

	public void farenToCel(double fah){
		double celcius = (fah - 32)* 5 / 9;
		System.out.printf("%.2f in Fahrenheit is %.2f in Celcius\n",fah,celcius);
	}

}