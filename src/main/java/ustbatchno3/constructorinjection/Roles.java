package ustbatchno3.constructorinjection;

public class Roles {
	public String charactername;
	public String responsibility;
	public Roles(String charactername, String responsibility) {
		super();
		this.charactername = charactername;
		this.responsibility = responsibility;
	}
	public void display() {
		System.out.println("My name is " + charactername);
		System.out.println("\nMY responsibility is " + responsibility);
	}
	
}
