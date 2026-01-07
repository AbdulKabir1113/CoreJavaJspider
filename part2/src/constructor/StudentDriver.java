package constructor;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		
		System.out.println("1) Without Data \n 2) Enter Name \n 3) Enter Name & Sid \n 4) Enter Name, Sid & Phone No \n 5) Enter Name, Sid, Phone No & Email");
		 Scanner sc = new Scanner(System.in);
		 int ch = sc.nextInt();
		 
		 
		switch(ch) {
		case 1->{
		   Student s = new Student();  
		}
        case 2->{
           
 		   System.out.println("Enter Name: ");
 		   String name = sc.next();
 		   Student s = new Student(name);
 		   System.out.println("Name : "+s.name);
		}
        case 3->{
           
  		   System.out.println("Enter Name: ");
  		   String name = sc.next();
  		   System.out.println("Enter sid: ");
		   int sid = sc.nextInt();
		   Student s = new Student(name,sid);
  		   System.out.println("Name : "+s.name);
  		   System.out.println("sid : "+s.sid);
        }
        case 4->{
        	
           System.out.println("Enter Name: ");
    	   String name = sc.next();
    	   System.out.println("Enter sid: ");
  		   int sid = sc.nextInt();
  		   System.out.println("Enter Phone Number: ");
		   long ph = sc.nextLong();
  		   Student s = new Student(name,sid,ph);
    	   System.out.println("Name : "+s.name);
    	   System.out.println("sid : "+s.sid);
    	   System.out.println("Phone No : "+s.ph);
        }
        
        case 5->{
        	
           System.out.println("Enter Name: ");
 		   String name = sc.next();
 		   System.out.println("Enter sid: ");
		   int sid = sc.nextInt();
		   System.out.println("Enter Phone Number: ");
		   long ph = sc.nextLong();
		   System.out.println("Enter Email Id: ");
		   String email = sc.next();
		   Student s = new Student(name,sid,ph,email);
 		   System.out.println("Name : "+s.name);
 		   System.out.println("sid : "+s.sid);
 		   System.out.println("Phone No : "+s.ph);
 		   System.out.println("Email : "+s.email);
        } 
	  }
		System.out.println("Registraion Successful");
		sc.close();
	}
}
