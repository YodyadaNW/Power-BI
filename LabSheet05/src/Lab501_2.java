import javax.swing.JOptionPane;

public class Lab501_2 {

	public static void main(String[] args) {
		inputEmail();
	}

	public static void inputEmail() {
		String ans = "";
		do {
			String email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmailError(email);
			ans = JOptionPane.showInputDialog("Continute[ y || Y ]");
		} while (ans.equalsIgnoreCase("y"));
	}
	
	public static void checkEmailError(String email) {
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again");
		}
		JOptionPane.showMessageDialog(null, checkEmail(email)? "Your e-mail is " + 
				email : "Your email is not hotmail or gmail dot com" );
	}
	
	public static boolean checkEmail(String _email) {
		if (_email.endsWith("@gmail.com") || _email.endsWith("@hotmail.com")) {
			return true;
		} else
			return false;
	}
}
