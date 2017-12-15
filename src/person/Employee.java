package person;

public class Employee implements Person {

	private int ID;
	
	private String name;
	
	private String companyName;
	
	
	public Employee(int ID, String name, String companyName){
		
		this.ID = ID;
		this.name = name;
		this.companyName = companyName;
		
	}


	
	public int getID() {
		
		return ID;
	}


	
	public String getName() {
		
		return name;
	}


	
	public String getCompanyName() {
		
		return companyName;
	}
	
	public String toString(){
		return "" + ID + " " + name + " " + companyName;
	}
	
	
}
