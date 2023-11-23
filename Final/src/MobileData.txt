import java.io.IOException;
import java.util.*;

public class MobileData {
	private static String search;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name or phone : ");
		search = scan.next();
		System.out.println();
		MobileSearch mobile = new MobileSearch();
		mobile.MobileData(search);
		mobile.show();
	}

}
