package arrayobject;

public class Employees {

	int eId;
	String eName;
	double sal;
	
	public Employees(int eId, String eName, double sal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "\n Employees [eId=" + eId + ", eName=" + eName + ", sal=" + sal + "]";
	}
	
	
	
}
