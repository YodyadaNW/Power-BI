import java.util.Scanner;

public class ExampleStringMethond {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter First Name = ");
		String fname = input.next();
		System.out.print("Enter Last Name = ");
		String lname = input.next();
		String FullName = getName(fname, lname);
		System.out.println("Fullname is " + FullName);
		inputGender(); //void method
	}
	public static void inputGender() {
		System.out.print("Enter gender: ");
		String gender = input.next();
		
	}
	
	public static String getName(String firstname, String lastname) {
		String _fname = lastname.charAt(0) + "." + firstname.toLowerCase();
		return _fname;
	}
	
	//public static String checkGender() {	
	//}
}
