package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private TextField txtParola;

    
    @FXML
    private Button btnReset;

    @FXML
    private TextArea txtRisultato;
    
    @FXML
    void doTranslate(ActionEvent event) {
    	//Leggo imput utente
    	String words = txtParola.getText();
    	
    	String pippo = this.model.traduci(words);
    	  	
    	txtRisultato.setText( pippo + "\n");
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtRisultato.clear(); 
    }
    
    
    @FXML
    void initialize() {
    	 assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
         assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
         assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
         assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
    }


	public void setModel(Model model) {
		this.model = model;
		
	}
}