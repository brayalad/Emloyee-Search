package engine;

import userinterface.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		
		Engine engine = new Engine(new TextUserInterface());
		engine.start();

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
	}

}
