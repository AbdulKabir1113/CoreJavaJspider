package CFW;

public class StdSortName implements Comparable<StdSortName> {

	String name;
	int sid;
	double marks;
	
	
	public StdSortName(String name, int sid, double marks) {
		
		this.name = name;
		this.sid = sid;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "name=" + name + "\nsid=" + sid + "\nmarks=" + marks + "\n\n";
	}
	

	
	// decending order
	@Override
	public int compareTo(StdSortName s) {
	    return this.name.compareTo(s.name);
	}
}
