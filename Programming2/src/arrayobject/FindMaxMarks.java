package arrayobject;

public class FindMaxMarks {

	String name;
	int id;
	double marks;
	
	public FindMaxMarks(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\n Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
}
