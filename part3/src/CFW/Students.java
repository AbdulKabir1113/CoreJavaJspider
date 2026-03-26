package CFW;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {

	

		public static Scanner sc = new Scanner(System.in);

		public static void addStudent(ArrayList<Student> students) {
			System.out.println("Name : ");
			String name = sc.next();
			System.out.println("Phone : ");
			long ph = sc.nextLong();
			System.out.println("Gender : ");
			String gender = sc.next();
			System.out.println("Sid : ");
			int sid = sc.nextInt();
			System.out.println("email : ");
			String email = sc.next();
			System.out.println("course : ");
			String course = sc.next();
			
			Student s = new Student(name, ph, gender, sid, email, course);
			students.add(s);

			System.out.println("Student Added Successfully ... ");
		}
	
}
