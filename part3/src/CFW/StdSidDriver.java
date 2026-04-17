package CFW;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.*;

public class StdSidDriver {

	public static void main(String[] args) {
		List<StudentSort> students = Arrays.asList(new StudentSort("Kabir",234,67),
				                                new StudentSort("Maaz",223,67),
				                                new StudentSort("Hai",145,90));
		
		Collections.sort(students);
		System.out.println(students);
	}
	
}
