package person;

public class Employee implements Person {

	private int ID;
	
	private String info;
	
	
	public Employee(int ID, String info){
		
		this.ID = ID;
		this.info = info;
		
	}


	
	public int getID() {
		
		return ID;
	}

	public String getInfo(){
		return info;
	}
	
	public String toString(){
		return "" + ID + " " + info;
	}
	
	
}
