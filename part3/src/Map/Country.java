package Map;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,String> map = new HashMap();
		
		map.put("Maharashtra", "Mumbai");
		
		System.out.println("Enter state");
		String state = sc.nextLine();
		boolean check = false;
		for(Entry entry : map.entrySet()) {
			if(state.equalsIgnoreCase((String)entry.getKey())) {
				System.out.println(entry.getKey()+"-> "+ entry.getValue());
				check=true;
				break;
			}
		}
		if(!check) {
			System.out.println("wrong state");
		}
	}
}
