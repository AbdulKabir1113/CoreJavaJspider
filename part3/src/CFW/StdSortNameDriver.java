package CFW;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StdSortNameDriver {

	public static void main(String[] args) {
		List<StdSortName> std = Arrays.asList(new StdSortName("Kabir",234,67),
	            new StdSortName("Maaz",223,89),
	            new StdSortName("Hai",145,90));

	     Collections.sort(std);
	     System.out.println(std);
	}

}

