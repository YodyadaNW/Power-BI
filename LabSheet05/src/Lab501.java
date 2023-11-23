import javax.swing.JOptionPane;

public class Lab501 {
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Input your e-mail");
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail, again");
		}
		JOptionPane.showMessageDialog(null, checkEmail(email)? "Your e-mail is " + 
										email : "Your email is not hotmail or gmail dot com" );
		
	}

	public static boolean checkEmail(String _email) {
		if(_email.endsWith("@gmail.com") || _email.endsWith("@hotmail.com")) {
			return true;
		}
		else return false;
	}
}
