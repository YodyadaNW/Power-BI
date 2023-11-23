import java.util.Scanner;
public class FictionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Book Title:");
		String title = scan.nextLine();
		
		System.out.print("Book public year:");
		int publicYear = scan.nextInt();
		FictionBook book = new FictionBook(title,publicYear);
		
		scan.nextLine();
		System.out.print("Author Book name:");
		String name = scan.nextLine();
		book.setAuthorName(name);
		//The scan.nextLine();
		System.out.print("Author Book email:");
		String email = scan.nextLine();
		book.setEmail(email);
		while(book.checkEmaill() == false) {
			System.out.print("Author Book email,again:");
			email = scan.nextLine(); 
			book.setEmail(email);
		}
		
		System.out.println(book);
		
	}

}
