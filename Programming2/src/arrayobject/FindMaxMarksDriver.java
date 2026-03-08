package arrayobject;

public class FindMaxMarksDriver {

	public static void main(String[] args) {
         FindMaxMarks st[] = new FindMaxMarks[4];
		
		st[0] =new FindMaxMarks("Kabir",01,89);
		st[1] =new FindMaxMarks("Maaz",02,90);
		st[2] =new FindMaxMarks("Zubair",01,78);
		st[3] =new FindMaxMarks("Tuba",01,97);
		
		double max = st[0].marks;
		for(int i=0; i<st.length; i++) {
			if(max<st[i].marks) {
				max=st[i].marks;
			}
	    }
		System.out.println(max);
	}
}
