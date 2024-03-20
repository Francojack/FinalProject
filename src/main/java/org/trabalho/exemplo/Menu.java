package org.trabalho.exemplo;
import java.io.File;  
import javafx.application.Application;  
import javafx.scene.layout.*; 
import javafx.scene.Scene;  
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  
import javafx.scene.control.Button;
import javafx.scene.effect.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Menu  extends Application  {  
  
    @Override  
    public void start(Stage palco) throws Exception {  
    	Perguntas pg=new Perguntas();
        palco.setResizable(false);
        palco.setMaximized(true);
        palco.setFullScreen(true);
        palco.setTitle("inicio");
    	
        Pane  pane  = new Pane();
        pane.setId("paneMenu");
        Scene scene = new Scene(pane); 
        scene.getStylesheets().add(Menu.class.getResource("/styles/Styles.css").toExternalForm());
    	
        Button bt1=new Button("");
        bt1.setId("BotaoMenu");
    	//bt1.setMinSize(200, 200);
    	//bt1.setMaxSize(200, 200);
    	Image img = new Image("DoencaCoracao.jpg");
        ImageView viewButton = new ImageView(img);
        viewButton.setFitHeight(200);
        viewButton.setPreserveRatio(true);
        bt1.setGraphic(viewButton);
        pane.getChildren().add(bt1);
        bt1.setLayoutX(400);
        bt1.setLayoutY(200);
        
        
        Button bt2=new Button("");
        bt2.setId("BotaoMenu");
    	//bt2.setMinSize(200, 200);
    	//bt2.setMaxSize(200, 200);
    	Image img2 = new Image("doencontagiosa.jpg");
        ImageView viewButton2 = new ImageView(img2);
        viewButton2.setFitHeight(200);
        viewButton2.setPreserveRatio(true);
        bt2.setGraphic(viewButton2);
        pane.getChildren().add(bt2);
        bt2.setLayoutX(700);
        bt2.setLayoutY(200);
        
        
        Button bt3=new Button("");
        bt3.setId("BotaoMenu");
    	//bt3.setMinSize(200, 200);
    	//bt3.setMaxSize(200, 200);
    	Image img3 = new Image("estomago.jpg");
        ImageView viewButton3 = new ImageView(img3);
        viewButton3.setFitHeight(200);
        viewButton3.setPreserveRatio(true);
        bt3.setGraphic(viewButton3);
        pane.getChildren().add(bt3);
        bt3.setLayoutX(1000);
        bt3.setLayoutY(200);
        
        
        Button bt4=new Button("");
        bt4.setId("BotaoMenu");
    	//bt4.setMinSize(200, 200);
    	//bt4.setMaxSize(200, 200);
    	Image img4 = new Image("fratura.jpg");
        ImageView viewButton4 = new ImageView(img4);
        viewButton4.setFitHeight(200);
        viewButton4.setPreserveRatio(true);
        bt4.setGraphic(viewButton4);
        pane.getChildren().add(bt4);
        bt4.setLayoutX(400);
        bt4.setLayoutY(500);
        
        Button bt5=new Button("");
        bt5.setId("BotaoMenu");
    	//bt5.setMinSize(200, 200);
    	//bt5.setMaxSize(200, 200);
    	Image img5 = new Image("resfriado.jpg");
        ImageView viewButton5 = new ImageView(img5);
        viewButton5.setFitHeight(200);
        viewButton5.setPreserveRatio(true);
        bt5.setGraphic(viewButton5);
        pane.getChildren().add(bt5);
        bt5.setLayoutX(700);
        bt5.setLayoutY(500);
        
        Button bt6=new Button("");
        bt6.setId("BotaoMenu");
    	//bt6.setMinSize(200, 200);
    	//bt6.setMaxSize(200, 200);
    	Image img6 = new Image("gripe.jpg");
        ImageView viewButton6 = new ImageView(img6);
        viewButton6.setFitHeight(200);
        viewButton6.setPreserveRatio(true);
        bt6.setGraphic(viewButton6);
        pane.getChildren().add(bt6);
        bt6.setLayoutX(1000);
        bt6.setLayoutY(500);
    	
    	
        
        palco.setScene(scene);
        palco.show();
    	
        
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("Cardio");
					pg.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
         });
        
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("Infec");
					pg.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
         });
        
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("gastro");
					pg.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
         });
        
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("Pele");
					pg.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
         });
        
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("Respira");
					pg.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
         });
        
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  
            	try {
            		pg.escolha("DST");
					pg.start(palco);
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
