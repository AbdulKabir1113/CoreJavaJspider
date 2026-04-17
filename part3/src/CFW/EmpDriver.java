package CFW;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpDriver {

	public static void main(String[] args) {
		
		List<Emp> list = Arrays.asList(new Emp("Kabir",121,40000),
				                          new Emp("Maaz",122,50000),
				                          new Emp("Hai",123,60000));
		
		System.out.println(list);
		Collections.sort(list,new Test());
		System.out.println(list);
	}
}
