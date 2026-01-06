package constructor;

public class Student {

	String name;
	int sid;
	long ph;
	String email;
	
	public Student() {
		this.name=null;
		this.sid=0;
		this.ph=0;
		this.email=null;
	}
	public Student(String name) {
		this.name=name;
		this.sid=0;
		this.ph=0;
		this.email=null;
	}
	public Student(String name,int sid) {
		this.name=name;
		this.sid=sid;
		this.ph=0;
		this.email=null;
	}
	public Student(String name,int sid,long ph) {
		this.name=name;
		this.sid=sid;
		this.ph=ph;
		this.email=null;
	}
	public Student(String name,int sid,long ph,String email) {
		this.name=name;
		this.sid=sid;
		this.ph=ph;
		this.email=email;
	}
}
