package CFW;

public class StudentSort implements Comparable<StudentSort> {

	String name;
	int sid;
	double marks;
	
	
	public StudentSort(String name, int sid, double marks) {
		
		this.name = name;
		this.sid = sid;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "name=" + name + "\nsid=" + sid + "\nmarks=" + marks + "\n\n";
	}
	
//	@Override
	public int compareTo(StudentSort s) {
	    
	    if (this.marks - s.marks == 0) {
	        return this.sid - s.sid;
	    } else {
	        return (int) (this.marks - s.marks);
	    }
	}


	// assecnding order
//	public int compareTo(Object o) {
//		StudentSort s = (StudentSort) o;
//		return this.sid - s.sid;
//	}
	
	// decending order
//	public int compareTo(StudentSort o) {
//		StudentSort s = (StudentSort) o;
//		return this.sid - s.sid;
//	}
}
