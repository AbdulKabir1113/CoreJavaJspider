package CFW;

public class Employee {

	String name;
	long eid;
	double salary;
	String doj;
	
	
	public Employee(String name, long eid, double salary, String doj) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Name : "+this.name + "\nEmp ID :"+this.eid + "\nSal : "+this.salary+"\nDOJ : "+this.doj;
	}
	
    
    
	
	
	
	
	
	
}
