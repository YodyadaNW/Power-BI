//import java.time.LocalDateTime;
public class FictionBook implements Author, Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String firstname;
	private String LastName;
	private int i;
	
	//LocalDateTime now = LocalDateTime.now();
	FictionBook(String title, int publicYear){
		this.title =  title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
		/*for(int i = 0; i < author_name.length(); i++) {
			if(author_name.indexOf(i) == ' ') {
				firstname = author_name.substring(0, i);
				LastName = author_name.substring(i + 1);
			}
		}*/
		
		i = author_name.indexOf(' ');
		firstname = author_name.substring(0, i);
		LastName = author_name.substring(i + 1);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean checkEmaill() {
		if(email.endsWith("@hotmail.com")) {return true;}
		else {return false;}
	}
	@Override
	public String getLastName() {
		LastName = LastName.toUpperCase();
		return LastName.substring(0,1);
	}
	@Override
	public String getFirstname() {
		return firstname.toUpperCase();
	}

	public String toString() {
		return getTitle() + " write by " + getLastName() + "." +getFirstname() + "(" + email + ")" + "\n"
				+ "Published for " + totalPublicYear() + " years.";
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public int totalPublicYear() {
		return 2022 - publicYear;
	}
	

}
