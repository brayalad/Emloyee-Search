package engine;

import userinterface.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.print.PrinterJob;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{

	Button button;
	TextField textField;
	StackPane layout;
	GridPane grid;
	Scene scene;
	Text text;
	TextArea textArea;
	Engine engine;
	
	public static void main(String[] args) {
		
		while(true)
		launch(args);
		
		

	}


	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		engine = new Engine();
		textField = new TextField();
		button = new Button("Search");
		layout = new StackPane();
		grid = new GridPane();
		text = new Text();
		textArea = new TextArea();
		button.setTranslateX(50);
		button.setTranslateY(-122);
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5,5,5,5));
		grid.add(new Label("ID: "), 2, 3);
		grid.add(textField, 3, 3);
		textArea.setPrefRowCount(10);
		textArea.setPrefColumnCount(20);
		textArea.setWrapText(true);
		
		layout.getChildren().addAll(grid, button);
		scene = new Scene(layout,400, 300);
		
		button.setOnAction(e -> print(layout,engine.run(Integer.parseInt(textField.getText()))));
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
		
	}

	@Override
	public void handle(ActionEvent event) {
		
		
	}

	
	public void print(Node node, String list){
		
		
		text.setText(list);
		layout.getChildren().add(text);
		
	}
}
