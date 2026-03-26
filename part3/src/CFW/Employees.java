package CFW;
import java.util.*;

public class Employees {

	
		
		public static void giveHike(List<Employee> emps) {
			for(Employee emp : emps) {
				int mon = Integer.parseInt(emp.doj.substring(3,5));
				int year = Integer.parseInt(emp.doj.substring(6));
				
				if(year < 2024 || year == 2024 && mon < 8) {
					double sal = emp.salary;
					sal = sal + sal * 0.15;
					emp.salary = sal;
				}
			}
		}
}
