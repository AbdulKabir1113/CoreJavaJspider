package object;

public class Test {

	
	public static void main(String[] args) {
		System.out.println(new Demo());
		System.out.println(new Demo());
		System.out.println(new Test());
		
		Demo student = new Demo();
		student.rollno=10;
		student.name="kabir";
		System.out.println(student.rollno);
		System.out.println(student.name);
	}
	
}
