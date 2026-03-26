package CFW;
import java.util.*;
public class EmployeeDriver {

	public static void main(String[] args) {
//		ArrayList<Employee> emps = new ArrayList();
//		
//		emps.add(new Employee("kabir",101,100000,"10/07/2004"));
//		emps.add(new Employee("Maaz",102,10000,"10/07/2024"));
//		emps.add(new Employee("Hai",103,1000,"10/07/2027"));
		
		
       List<Employee> emps = Arrays.asList(new Employee("kabir",101,100000,"10/07/2004"),
		                                        new Employee("Maaz",102,10000,"10/07/2024"),
		                                        new Employee("Hai",103,1000,"10/07/2027"));
		
		
		
		Employees.giveHike(emps);
		
		for(Employee e : emps) {
			System.out.println(e);
			System.out.println("========");
		}
	}
}
