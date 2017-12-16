package userinterface;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import person.Employee;

public class TextUserInterface implements UserInterface{

	private Scanner input;
	
	public TextUserInterface(){
		input = new Scanner(System.in);
	}
	
	public int getInput(){
		
		int user = -1;
		try {
			user = input.nextInt();
		} catch (InputMismatchException Exception) {
			
			input.nextLine();
		}
		return user;
	}


	public void message(String message) {
		
		switch(message){
		case "getInput": System.out.print("Enter ID: ");
						break;
		case "idError": System.out.println("ID was not found");
						break;
		case "fileNotFound": System.out.println("File Not Found");
						break;
		case "tryAgain": System.out.println("Please Try Again");
						break;
		case "exit": System.out.println("Program has exited");
						break;
		}
		
		
	}

	public void printList(List<Employee> list) {
		
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		
	}
	
}
