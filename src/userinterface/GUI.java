package userinterface;

import java.util.List;
import userinterface.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import person.Employee;

public class GUI implements UserInterface,EventHandler<ActionEvent> {

	Button button;
	TextField textField;
	StackPane layout;
	GridPane grid;
	Scene scene;
	
	public GUI(Stage primaryStage){
		textField = new TextField();
		button = new Button("Search");
		layout = new StackPane();
		grid = new GridPane();
		button.setTranslateX(50);
		button.setTranslateY(-122);
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5,5,5,5));
		grid.add(new Label("ID: "), 2, 3);
		grid.add(textField, 3, 3);
		layout.getChildren().addAll(grid, button);
		scene = new Scene(layout,400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public GUI(Button button, TextField textField){
		this.button = button;
		this.textField = textField;
		button.setOnAction(this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int getInput() {
		//int input = -1;
		button.setOnAction(e ->{
			int input = Integer.parseInt(textField.getText());
		});
		 return 0;
		
	}

	@Override
	public void message(String Message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList(List<Employee> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle(ActionEvent event) {
		System.out.println(textField.getText());
		
	}

}
