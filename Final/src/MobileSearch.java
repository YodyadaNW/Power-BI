import java.io.*;
import java.util.*;
public class MobileSearch extends MobileData{
	private String name;
	private String phone;
	private int mainPro;
	private int[] extraPro;
	private String _name;
	private String _phone;
	
	void MobileData(String search){
		name = search;
		phone = search;
	}
	
	public boolean searchData() throws IOException{
		Scanner read = new Scanner(new File("src//CustomerData.txt"));
		while(read.hasNext()) {
			_name = read.next();
			_phone = read.next();
		}
		read.close();
		if(_name.equals(name) && _phone.equals(phone)) {
			return true;
		}
		else return false;
	}
	
	public void show() throws IOException{
		Scanner read = new Scanner(new File("src//CustomerData.txt"));
		while(read.hasNext()) {
			_name = read.next();
			_phone = read.next();
			mainPro = read.nextInt();
		}
		if(searchData() == true) {
			System.out.println("NAME	 : " + _name);
			System.out.println("PHONE	 : " + _phone);
			System.out.println("MAIN PRO : " + mainPro);
			System.out.println("EXTRA PROMOTION" + "\n");
		}
		else if(searchData() == false) {
			try {
				System.out.println("NO DATA FOUND.");
			}
			catch(Exception e) {
				System.out.println("Sorry, file not found...");
			}
		}
		read.close();
	}
}
