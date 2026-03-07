package Array;

public class _29SumofRows {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		
		for(int i[]:a) {
			int sum=0;
			for(int j:i) {
				sum+=j;
			}
			System.out.println(sum);
		}
	}
}
