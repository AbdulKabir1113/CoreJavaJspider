package CFW;

import java.util.Comparator;

public class Emp {

	String ename;
	int eid;
	double sal;
	
	public Emp(String ename, int eid, double sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
	
}

class Test implements Comparator<Emp>{
	
	public int compare(Emp o1,Emp o2) {
		
		return o1.ename.compareTo(o2.ename);
	}
}