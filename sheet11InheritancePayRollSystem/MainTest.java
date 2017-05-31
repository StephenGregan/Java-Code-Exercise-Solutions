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

		CommisionWorker c1 = new CommisionWorker("John\n"," Smith\n",LocalDate.of(1955,Month.JULY,7),1000,30,10);
		System.out.println(c1);

		HourlyWorker h1 = new HourlyWorker("Frank\n"," Sinatra\n",LocalDate.of(1965,Month.NOVEMBER,15),500,15);
		System.out.println(h1);

		PieceWorker p1 = new PieceWorker("Ben\n"," Keane\n",LocalDate.of(1982,Month.DECEMBER,25),15,42);
		System.out.println(p1);

		Employee [] workers = {b1,c1,h1,p1};
		
		for(Employee one : workers){
			System.out.println(one.toString());
			
			if(one instanceof Boss){
				System.out.printf("Boss' salary €%,.2f",((Boss)one).getWeeklySalary());
				
			}

		}

	}

}
