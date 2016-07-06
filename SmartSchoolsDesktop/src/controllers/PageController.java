package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PageController implements Initializable{
	@FXML
	protected void preferencesQuit(Event event) {
	     System.out.println("ap press");
	}
	
	@FXML
	protected void quitPress(Event event) {
		Platform.exit();
	    System.exit(0);
	}
	
	@FXML
	protected void usersPress(Event event) {
		System.out.println("user press");
	}
	
	@FXML
	protected void locationsPress(Event event) {
		if(Main.getInstance().getAdminUser().isSignedIn()){
	    	 Main.getInstance().changeScene("LocationsPage");
	     }
	}
	
	@FXML
	protected void fitbitPress(Event event) {
	     System.out.println("fitbit press");
	}
	
	@FXML
	protected void viewHelpPress(Event event) {
	     System.out.println("view help press");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	}
}