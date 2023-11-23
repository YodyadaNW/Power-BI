import java.util.*;
import java.io.*;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("src//MemberLogin.txt"));
		while (read.hasNext()) {
			String fname = read.next();
			String lname = read.next(); // lastname
			read.next(); // password
			String email = read.next().toUpperCase();

			// System.out.println(fname + " (" + email + ")");
			System.out.println(lname.charAt(0) + "." + fname + " (" + email + ")");
		}

		read.close();

	}

}
