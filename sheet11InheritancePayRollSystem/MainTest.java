package sheet11InheritancePayRollSystem;

import java.time.LocalDate;
import java.time.Month;

public class MainTest {

	public static void main(String[] args) {
		//Used for testing object creation
		/*Employee e1 = new Employee("Neo\n","Anderson\n",LocalDate.of(1960,Month.AUGUST,5));
		System.out.println(e1);*/
		
		Boss b1 = new Boss("Vincent\n"," Benedict\n",LocalDate.of(1960,Month.AUGUST,5),2000);
		System.out.println(b1);
		
		CommisionWorker c1 = new CommisionWorker("Vincent\n"," Benedict\n",LocalDate.of(1960,Month.AUGUST,5),1000,30,10);
		System.out.println(c1);
		
		HourlyWorker h1 = new HourlyWorker("Vincent\n"," Benedict\n",LocalDate.of(1960,Month.AUGUST,5),500,15);
		System.out.println(h1);
		
		PieceWorker p1 = new PieceWorker("Vincent\n"," Benedict\n",LocalDate.of(1960,Month.AUGUST,5),15,42);
		System.out.println(p1);
	}

}
