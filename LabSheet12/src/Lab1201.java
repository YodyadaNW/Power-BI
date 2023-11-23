import java.util.*;
import java.io.*;

public class Lab1201 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter email:");
		String email = scan.nextLine().toLowerCase();
		
		Scanner read = new Scanner(new File("src//MemberLogin.txt"));
		//String password = "";
		//String _email = "";
		boolean check = false;
		while(read.hasNext()) {
			read.next();
			read.next();
			String password = read.next();
			String _email = read.next();
			if(email.equals(_email)) {
				System.out.println("Your password is " + password);
				check = true;
					break;
			}
			
		}
		if(!check) {
			System.out.println("Data not found");
		}
			
		read.close();
	}
}
		//System.out.println("Your password is " + password);
		//System.out.println("Data not found");
