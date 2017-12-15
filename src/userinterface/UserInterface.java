package userinterface;

import java.util.List;

import person.Employee;

public interface UserInterface {

	public void message(String message);
	
	public void printList(List<Employee> list);
	
	public int getInput();
	
}
