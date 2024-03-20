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
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import java.time.LocalDate;
import java.time.format.*;

public class FormularioCadastro  extends Application  {  
  
    @Override  
    public void start(Stage palco) throws Exception {  
    	
    	Menu mn=new Menu();
        palco.setResizable(false);
        palco.setMaximized(true);
        palco.setFullScreen(true);
        palco.setTitle("inicio");
        
        Pane  pane  = new Pane();
        pane.setId("paneCadastro");
        
    	Button bt1=new Button("Iniciar");
    	bt1.setId("btCadastro");
    	bt1.setMinSize(100, 75);
    	Image img = new Image("imagemBotao.png");
        ImageView viewButton = new ImageView(img);
        viewButton.setFitHeight(80);
        viewButton.setPreserveRatio(true);
        bt1.setGraphic(viewButton);
        bt1.setLayoutX(900);
        bt1.setLayoutY(700);
        pane.getChildren().add(bt1);

    	
    	Button bt2=new Button("Cancelar");
    	bt2.setId("btCadastro");
    	bt2.setMinSize(100, 75);
    	Image img2 = new Image("imagemBotao.png");
        ImageView viewButton2 = new ImageView(img2);
        viewButton2.setFitHeight(80);
        viewButton2.setPreserveRatio(true);
        bt2.setGraphic(viewButton2);
        bt2.setLayoutX(600);
        bt2.setLayoutY(700);
        pane.getChildren().add(bt2);
    	  
        TextField paciente = new TextField();
        pane.getChildren().add(paciente);
        paciente.setMinSize(500, 20);
        paciente.setLayoutX(400);
        paciente.setLayoutY(200);
        
        Text pacienteNome = new Text(); 
        pacienteNome.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        pacienteNome.setText("Nome Paciente:");
        pane.getChildren().add(pacienteNome);
        pacienteNome.setLayoutX(150);
        pacienteNome.setLayoutY(220);

        Text pacienteDataNascimento = new Text(); 
        pacienteDataNascimento.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        pacienteDataNascimento.setText("Data Nascimento:");
        pane.getChildren().add(pacienteDataNascimento);
        pacienteDataNascimento.setLayoutX(950);
        pacienteDataNascimento.setLayoutY(220);
        
        DatePicker dataNacnimento=new DatePicker();
        pane.getChildren().add(dataNacnimento);
        dataNacnimento.setMinSize(150, 20);
        dataNacnimento.setLayoutX(1200);
        dataNacnimento.setLayoutY(200);
          
        Text Documento = new Text(); 
        Documento.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        Documento.setText("Documento:");
        pane.getChildren().add(Documento);
        Documento.setLayoutX(150);
        Documento.setLayoutY(300);
        
        ToggleGroup tg = new ToggleGroup();
        RadioButton r1 = new RadioButton("CPF");
        RadioButton r2 = new RadioButton("RG");
        RadioButton r3 = new RadioButton("CNH");
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        pane.getChildren().add(r1);
        pane.getChildren().add(r2);
        pane.getChildren().add(r3);
        
        r1.setLayoutX(370);
        r1.setLayoutY(280);
        r1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        r2.setLayoutX(470);
        r2.setLayoutY(280);
        r2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        r3.setLayoutX(570);
        r3.setLayoutY(280);
        r3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        Text NDocumento = new Text(); 
        NDocumento.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        NDocumento.setText("Número:");
        pane.getChildren().add(NDocumento);
        NDocumento.setLayoutX(800);
        NDocumento.setLayoutY(300);
        
        TextField documento = new TextField();
        pane.getChildren().add(documento);
        documento.setMinSize(400, 20);
        documento.setLayoutX(970);
        documento.setLayoutY(280);
        
   
        Text NomeEnfermeiro1 = new Text(); 
        NomeEnfermeiro1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        NomeEnfermeiro1.setText("Enfermeiro:");
        pane.getChildren().add(NomeEnfermeiro1);
        NomeEnfermeiro1.setLayoutX(150);
        NomeEnfermeiro1.setLayoutY(380);
        
        TextField NomeEnfermeiro = new TextField();
        pane.getChildren().add(NomeEnfermeiro);
        NomeEnfermeiro.setMinSize(450, 20);
        NomeEnfermeiro.setLayoutX(360);
        NomeEnfermeiro.setLayoutY(360);
        
        
        Text codEnfermeiro = new Text(); 
        codEnfermeiro.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        codEnfermeiro.setText("Cod. Enfermeiro:");
        pane.getChildren().add(codEnfermeiro);
        codEnfermeiro.setLayoutX(850);
        codEnfermeiro.setLayoutY(380);
        
        TextField CodEnfermeiro1 = new TextField();
        pane.getChildren().add(CodEnfermeiro1);
        CodEnfermeiro1.setMinSize(250, 20);
        CodEnfermeiro1.setLayoutX(1130);
        CodEnfermeiro1.setLayoutY(360);
        
        Text observacao = new Text(); 
        observacao.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));
        observacao.setText("Observação:");
        pane.getChildren().add(observacao);
        observacao.setLayoutX(150);
        observacao.setLayoutY(500);
        
        TextArea Observacao1 = new TextArea();
        pane.getChildren().add(Observacao1);
        Observacao1.setMinSize(1000, 100);
        Observacao1.setLayoutX(380);
        Observacao1.setLayoutY(480);
        
        Scene scene = new Scene(pane); 
    	scene.getStylesheets().add(FormularioCadastro.class.getResource("/styles/Styles.css").toExternalForm());  
        palco.setScene(scene);
        palco.show();
    	
        
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	mysql ql=new mysql();
            	String numeroDoc=documento.getText();
                String nomePaciente=paciente.getText();
                LocalDate data=dataNacnimento.getValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                String DataFormatada = data.format(formatter);
                String tipoDoc;
                if(r1.isSelected()) {
                	 tipoDoc=r1.getText();
                }
                else if(r2.isSelected()) {
                	 tipoDoc=r2.getText();
                }
                else {
                	 tipoDoc=r3.getText();
                }
                String NomeEnferm=NomeEnfermeiro.getText();
            	String codEnfermeiro=CodEnfermeiro1.getText();
            	String obs=Observacao1.getText();
            	ql.gravar(Integer.parseInt(numeroDoc), nomePaciente,tipoDoc,DataFormatada,NomeEnferm, Integer.parseInt(codEnfermeiro), obs);
                 try {
					mn.start(palco);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 	
            }
         });
    }  
}  