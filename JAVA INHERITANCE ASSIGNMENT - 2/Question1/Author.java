
public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	
	public Author(String name, String email, char gender) 
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() { return name;}
	public char getGender() { return gender;}
	public String getEmail() {return email;}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return name + " (" + gender + ") at " + email;
		}

		
	public static void main(String args[]) {	
		Author x = new Author("Ebenezer Ashong", "eash@gmail.org", 'm');
		System.out.println(x);
		
		x.setEmail("eashong@yahoo.com");
		System.out.println(a);
		
	}
}


