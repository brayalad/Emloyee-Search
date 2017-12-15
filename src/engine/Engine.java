package engine;

import person.*;
import userinterface.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Engine {

	private Scanner readFile;
	private UserInterface ui;
	private Map<Integer,List<Employee>> listOfAllEmployees;
	private List<Employee> listOfEmployeesWithSameID;
	public Engine(UserInterface ui){
		this.ui = ui;
		listOfAllEmployees = new HashMap<>();
	}

	public void start(){
		scanEmployeeFile();
		run();
	}
	
	private void run(){
		
		while(true){
			ui.message("getInput");
			try {
				ui.printList(listOfAllEmployees.get(ui.getInput()));
			} catch (Exception e) {
				ui.message("idError");
			}
		}
	}
	
	
	
	private void scanEmployeeFile() {
		try {
			readFile = new Scanner(new File("employee.txt"));
		} catch (FileNotFoundException e) {
			ui.message("fileNotFound");
		}
		while(readFile.hasNext()) {
			int ID = Integer.parseInt(readFile.next());
			String name = readFile.next();
			String companyName = readFile.next();
	
			putObjects(listOfAllEmployees, ID, new Employee(ID,name,companyName));
		}
	}

	private void putObjects(Map<Integer, List<Employee>> employeeList, int ID, Employee employee) {
		
		listOfEmployeesWithSameID = employeeList.get(ID);
		
		if(listOfEmployeesWithSameID == null){
			listOfEmployeesWithSameID = new ArrayList<>();
			employeeList.put(ID, listOfEmployeesWithSameID);
		}
		
		listOfEmployeesWithSameID.add(employee);
		
	}
	
	
}
