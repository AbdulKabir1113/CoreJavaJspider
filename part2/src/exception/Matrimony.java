package exception;
import java.util.*;
public class Matrimony {

	public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		if(age<21) {
			try {
				throw new InvalidAgeException("you are under age to get merry");
			}catch(InvalidAgeException e) {
				System.out.println(e);
				System.out.println("Come after "+(21-age)+" Years");
			}
		}else {
			System.out.println("Congratulations! yor are eligible to die miserabily");
		}
		sc.close();
	}
}
