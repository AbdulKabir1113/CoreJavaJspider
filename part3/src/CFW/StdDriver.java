package CFW;
import java.util.ArrayList;
import java.util.Scanner;
public class StdDriver {

	
		public static void main(String[] args) {

			
			ArrayList<Student> students = new ArrayList();
			Boolean check = true;
			while (check) {
				System.out.println(" 1. Add Student\n 2.Show the Student Details \n 3. Exit");
				int ch = Students.sc.nextInt();
				switch (ch) {
				case 1 -> {
					System.out.println(" ---------------   Add Student  ---------------");
					Students.addStudent(students);
				}
				
				case 2 -> {
					System.out.println(" ---------------   Show the Student Details ---------------");
					for (Object o : students) {
						System.out.println(o);
					}
					for (Student s : students) {
						System.out.println(s.name);
					}
				}
				case 3 -> {
					System.out.println(" ---------------   Thank You  ---------------");
					check = false;
					break;
				}
				}

			}

		}
	
}
