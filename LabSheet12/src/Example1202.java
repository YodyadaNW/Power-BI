import java.io.*;
import java.util.*;

public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = scan.nextInt();
		Header(section);
		showListStudent(section);

	}

	public static void showListStudent(int section) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("src//List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			int _section = Integer.parseInt(data[3]);
			float mid = Float.parseFloat(data[4]);
			float Final = Float.parseFloat(data[5]);
			if (section == _section) {
				System.out.println(data[0] + " " + data[2] + "\t" + data[4] + "\t" + data[5] + "\t"+ findResult(mid, Final));
			}
			// double totalScore;
		}
		read.close();
	}

	public static String findResult(float Mid, float Final) {
		double totalScore = Mid + Final;
		return totalScore >= 40 ? "PASS" : "FAIL";
	}
	
	public static void Header(int sec) {
		System.out.println("*******************************************");
		System.out.println("\tList of Data for Section " + sec);
		System.out.println("*******************************************");
	}

}
