package sheet11InheritancePayRollSystem;

import java.time.LocalDate;
import java.time.Month;

public class MainTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Neo\n","Anderson\n",LocalDate.of(1960,Month.AUGUST,5));
		System.out.println(e1);
	}

}
