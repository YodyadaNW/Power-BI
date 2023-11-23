import java.io.*;
import java.util.*;

public class Lab1203 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("src//student.txt"));
		int i = 1;
		Head();
		while (read.hasNext()) {
			String id = read.next();
			String fist = read.next();
			String fname = read.next();
			String lname = read.next();
			double gpx = read.nextDouble();
			int section = read.nextInt();
			String level = Level(id);
			System.out.println(i + ".\t" + id + "\t" + level + "\t" + fname.charAt(0) + "." + lname 
					+ "\t" + gpx + "\t" + Status(gpx));
			i++;
			
		}
		read.close();
	}

	public static String Level(String id){
		int year = 22 - Integer.parseInt(id.substring(0, 2));
		if(year == 1) return year + "st";
		else if(year == 2) return year + "nd";
		else if(year == 3) return year + "rd";
		else return year + "th";
	}
	
	public static String Status(double gpx) {
		if(gpx >= 2.00) return "Pass";
		else if( gpx >= 1.00) return "Critical";
		else return "Retired";
	}
	
	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("****************************************************************");
	}

}
