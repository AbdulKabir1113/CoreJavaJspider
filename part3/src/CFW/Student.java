package CFW;

public class Student {

	String name;
	long ph;
	String gender;
	long sid;
	String email;
	String course;
	
	
	
	public Student(String name, long ph, String gender, long sid, String email, String course) {
	
		this.name = name;
		this.ph = ph;
		this.gender = gender;
		this.sid = sid;
		this.email = email;
		this.course = course;
	}






	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + "]";
	}
	
	
	
}
