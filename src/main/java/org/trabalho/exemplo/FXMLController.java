package org.trabalho.exemplo;
import java.net.URL;
import java.io.File;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.media.*;
import java.net.MalformedURLException;

public class FXMLController implements Initializable {
    
    @FXML
    private Button botao1;
    @FXML 
    private MediaView mv1;
  
    
    @FXML
    private void botaoapertado(ActionEvent event) throws MalformedURLException {
    	 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
