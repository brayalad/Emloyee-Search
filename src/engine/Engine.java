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
	
	public Engine(){
		listOfAllEmployees = new HashMap<>();
	}
	
	public Engine(UserInterface ui){
		this.ui = ui;
		listOfAllEmployees = new HashMap<>();
	}
	
	public void start(){
		scanEmployeeFile();
		run(45);
	}
	
	public String run(int ID){
		scanEmployeeFile();
		return getList(ID);
	}
	
	private void run(){
		
		while(true){
			ui.message("getInput");
			try {
				int input = -1;
				try {
					input = ui.getInput();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				ui.printList(listOfAllEmployees.get(input));
			} catch (Exception e) {
				ui.message("idError");
			}
		}
	}
	
	private void scanEmployeeFile(){
		try {
			readFile = new Scanner(new File("id.txt"));
		} catch (FileNotFoundException e) {
			ui.message("fileNotFound");
		}
		while(readFile.hasNextLine()){

			int ID = Integer.parseInt(readFile.next());
			String info = readFile.nextLine();
		
			
			putObjects(listOfAllEmployees, ID, new Employee(ID,info));
			
			
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
	
	public String getList(int input){
	
		String returnList = "";
		List<Employee> list = listOfAllEmployees.get(input);
		
		for(int i = 0; i < list.size(); i++)
			returnList = "" + returnList + "\n"+ list.get(i);
		
		System.out.println(returnList);
		
		return returnList;
		
	}
}
