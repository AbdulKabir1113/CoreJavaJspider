package arrayobject;

public class Student {

	String name;
	int id;
	double marks;
	
	public Student(String name, int id, double marks) {
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
