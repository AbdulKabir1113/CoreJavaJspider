package arrayobject;

import java.util.Arrays;

public class School {

	public static void main(String[] args) {
		
		Student st[] = new Student[4];
		
		st[0] =new Student("Kabir",01,100);
		st[1] =new Student("Kabir",01,100);
		st[2] =new Student("Kabir",01,100);
		st[3] =new Student("Kabir",01,100);
		
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i]);
	    }
		
		for(Student s:st) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(st));
	}
}
