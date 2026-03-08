package arrayobject;

public class EmployeesDriver {

	public static void main(String[] args) {
		Employees emp[] = new Employees[7];
		
		emp[0] = new Employees(1,"Zafer",1000);
		emp[1] = new Employees(2,"Arbaz",2000);
		emp[2] = new Employees(3,"Shazeb",3000);
		emp[3] = new Employees(4,"Kabir",4000);
		emp[4] = new Employees(5,"Zaid",5000);
		emp[5] = new Employees(6,"Talha",6000);
		emp[6] = new Employees(7,"Umer",7000);
		
//		for(int i=0; i<emp.length; i++) {
//			System.out.println(emp[i]);
//		}
		
		
		
		double sum=0;
		for(int i=0; i<emp.length; i++) {
			sum+=emp[i].sal;
		}
		
		double avg = sum/emp.length;
		System.out.println(avg);
		
		
		for(int i=0; i<emp.length; i++) {
			if(emp[i].sal>avg) {
				System.out.println(emp[i]);
			}
		}
	
	}
}
