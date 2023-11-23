import java.io.*;
import java.util.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rating of book:");
		double rating = scan.nextDouble();
		Head();
		BufferedReader read = new BufferedReader(new FileReader("src//BookData.txt"));
		int i = 0;
		int num = 0;
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			String Title = data[0];
			String Author_fullname = data[1];
			double Rating = Double.parseDouble(data[2]);
			int Reviews = Integer.parseInt(data[3]);
			num++;
			if(Rating >= rating) {
				System.out.println("Book " + num + ":" + Title + " write by " + Author_fullname + " (" + Reviews + ") reviews");
				i++;
			}
		}
		Head();
		System.out.println("There are " + i + " book get rating more than " + rating);
		read.close();
	}
	
	public static void Head() {
		System.out.println("-------------------------------------------------------------------");
	}

}
