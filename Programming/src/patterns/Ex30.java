package patterns;

public class Ex30 {
	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || (i<=4 && i+j==6) || (i-j==2 && i>=5) ) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==4 || j-i ==2 || i==4 || j==1  && i>=3 || j==5 && i>=3)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || i==1 && j<5 || i==2 && j==5 || i==3 && j==5 || i==4 && j<5 || (i==7 && j<=4) || (i==5 && j==5) || (i==6 && j==5) )
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(i==1 || i==7 || j==3 )
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || i==1 && j<5 || i==2 && j==5 || i==3 && j==5 || i==4 && j<5 || i-j==2 )
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
