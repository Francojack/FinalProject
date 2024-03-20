package org.trabalho.exemplo;
import java.io.File;  
import javafx.application.Application; 
import javafx.css.converter.*;
import javafx.scene.layout.*; 
import javafx.scene.Scene;  
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainApp  extends Application  {  
  
    @Override  
    public void start(Stage palco) throws Exception {  
    	
    	FormularioCadastro fdm=new FormularioCadastro();
        palco.setResizable(false);
        palco.setMaximized(true);
        palco.setFullScreen(true);
        palco.setTitle("inicio");
        
        Pane  pane  = new Pane();
        pane.setId("paneMain");
        Scene scene = new Scene(pane); 
    	scene.getStylesheets().add(MainApp.class.getResource("/styles/Styles.css").toExternalForm()); 
    	
        
        Button bt1=new Button("Iniciar Atendimento");
        bt1.setId("bt1");
    	
        scene.setFill(Color.BLUE);
        pane.getChildren().add(bt1);
        bt1.setLayoutX(650);
        bt1.setLayoutY(600);
        
        palco.setScene(scene);
        palco.show();
    	
        
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    
                 try {
                                        
					 fdm.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 	
            }
         });
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
      
}  
