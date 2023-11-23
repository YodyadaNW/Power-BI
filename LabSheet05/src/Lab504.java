import java.util.Scanner;
public class Lab504 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
		//displayData();
	}
	public static void inputStudent() {
		System.out.print("Enter Student Id: ");
		String idStudent = input.next();
		System.out.print("Enter Subject Id: ");
		String idSubject = input.next();
		
		while(isLength(idStudent,idSubject) == false) {
			System.out.print("Enter Student Id: ");
			 idStudent = input.next();
			System.out.print("Enter Subject Id: ");
			idSubject = input.next();
		}
		boolean _isITStudent = isITStudent(idStudent);
		boolean _isITSubject = isITSubject(idSubject);
		displayData(_isITStudent,_isITSubject,idStudent);
		
	}
	
	public static boolean isLength(String _idStudent, String _idSubject) {
		    if(_idStudent.length() == 10 && _idSubject.length() == 7) {
		    	return true;
		    }else return false;	
	}
	
	public static boolean isITStudent(String _idStudent) {
		if(_idStudent.substring(0,6) == "211311") {
			return true;
		}else return false;
	}
	
	public static boolean isITSubject(String _idSubject) {
		if(_idSubject.substring(0,2) == "21" &&  _idSubject.indexOf('1',5) ==5) {
			return true;
		}else return false;
	}
	
	public static void displayData(boolean _isITStudent, boolean _isITSubject, String idStudent) {
		System.out.println();
		if(_isITStudent == true && _isITSubject == true) {
			System.out.println("Student id: " + idStudent + "1st year student in IT and"
					+"\nEnroll in courses for Year 1");
		}
		else if(_isITStudent == true && _isITSubject == false) {
			System.out.println("Student id: " + idStudent + "1st year student in IT and"
					+"\nnot enroll in courses for Year 1");
		}
		else if(_isITStudent == false && _isITSubject == true) {
			System.out.println("Student id: " + idStudent + "is not 1st year student in IT and"
					+"\nEnroll in courses for Year 1");
		}
		
	}
}
