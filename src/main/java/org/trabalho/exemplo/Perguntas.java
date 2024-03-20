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
import javafx.scene.control.Label;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Perguntas  extends Application  {  
	
	static String opcao;
	private int i=0,tamanho;
	private String []perguntas=new String[9];
	private String []respostas=new String[9];
  
	String [] Cardio={"00101-Sua família tem histórico de colesterol alto?",
			"00201-Você está com pernas inchadas ou os tornozelos?",
			"00301-Você já teve problema cardíaco antes?",
			"00401-Você sentiu alguma dor no peito recentemente?",
			"00501-Você sente falta de ar ou sente falta de ar sempre?",
			"00601-Você tem histórico familiar de doenças cardíacas?",
			"00701-Você tem pressão alta?",
			"00801-Você tem problemas cardíacos anormais ou palpitação no coração?",
			"00901-Você fuma ou já fumou no passado?"};
	
	String[] gastro= {"00102-Você está com azia ou refluxo?",
			"00202-Você está com diarreia ou constipação?",
			"00302-Você está com dor no ânus ou já teve no passado?",
			"00402-Você já teve problemas de estômago ou tem na família histórico?",
			"00502-Você sente náusea ou enjoo recentemente?",
			"00602-Você tem sangue nas fezes ou alguma alteração de cor?",
			"00702-Você usa medicamentos para o estômago?",
			"00802-Você tem dor de estômago com frequência ou já teve recentemente?"};
	
	String [] Infec= {"00103-Tomou alguma vacina recentemente?",
			"00203-Você está com diarreia ou vômito?",
			"00303-Você está com dor de cabeça, dor de garganta,tosse ou coriza?",
			"00403-Você está com dor no corpo ou fadiga ?",
			"00503-Você teve febre recentemente?",
			"00603-Você teve feridas na pele recentemente?",
			"00703-Você viajou para local com doenças infecciosas?",
			"00803-Você teve contato com alguém doente recentemente?",
			"00903-Você trabalha ou tem contato com pessoal de clínica e hospitais?"};
	
	String [] DST= {"00104-Já teve relações sexuais sem o uso de preservativo?",
			"00204-Já teve esses sintomas anteriormente?",
			"00304-Já usou outro método contraceptivo como diu ou pílula?",
			"00404-Possui alguma lesão na região genital?",
			"00504-Qual o gênero do seu parceiro(a)?",
			"00604-Você já teve relações sexuais?",
			"00704-Você ou seu parceiro foi diagnosticado com dst?", 
			"00804-Você tem alguma condição preexistente?",
			"00904-Você tem único parceiro sexual ou múltiplos?"};
	
	String [] Respira= {"00105-Você já teve ou tem dor no peito e dificuldades para expirar?",
			"00205-Você tem dificuldades para respirar ou sente falta de ar para fazer atividades do dia a dia?",
			"00305-Você tem febre, ou outros sintomas como coriza, espirros ou dor de garganta?",
			"00405-Você tem histórico de alergias respiratórias?",
			"00505-Você tem histórico de asma na família?",
			"00605-Você tem tosse com frequência ou já teve recentemente?",
			"00705-Você teve pneumonia ou bronquite no passado?",
			"00805-Você trabalha em local com pó ou fumaça?",
			"00905-Você já teve doença respiratória antes?"};
	
	String [] Pele= {"00106-A lesão na pele está piorando?",
			"00206-Faz uso de medicamentos para doenças de pele?",
			"00306-Há vermelhidão ou inchaços?",
			"00406-Onde está localizado a lesão?",
			"00506-Quanto tempo você está com essas lesões?",
			"00606-Teve doenças de pele anteriormente?",
			"00706-Você sente coceira na região da lesão?",
			"00806-Voce sente febre ou outros sintomas?",
			"00906-Voce teve contato com alguma substância?"};


	public void escolha(String opc) {
		
		opcao=opc;		
	}
	
	public void chamarVideo(Button bt1,Text tx) {
		
		
		if(opcao.equals("Cardio")) {
			
			tamanho=Cardio.length;
			String pergunta=Cardio[i];
			String [] codigo=pergunta.split("-");
			this.perguntas[i]=codigo[1];
			System.out.println(perguntas[i]);
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();
	    	System.out.printf("%d - %s %s",tamanho,codigo[0],codigo[1]);}
		    
		else if(opcao.equals("gastro")) {
			tamanho=gastro.length;
			String pergunta=gastro[i];
			String [] codigo=pergunta.split("-");
			this.perguntas[i]=codigo[1];
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();}
		else if(opcao.equals("Infec")) {
			tamanho=Infec.length;
			String pergunta=Infec[i];
			this.perguntas[i]=pergunta;
			String [] codigo=pergunta.split("-");
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();}
		else if(opcao.equals("DST")) {
			tamanho=DST.length;
			String pergunta=DST[i];
			String [] codigo=pergunta.split("-");
			this.perguntas[i]=codigo[1];
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();}
		else if(opcao.equals("Respira")) {
			tamanho=Respira.length;
			String pergunta=Respira[i];
			this.perguntas[i]=pergunta;
			String [] codigo=pergunta.split("-");
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();}
		else {
			tamanho=Pele.length;
			String pergunta=Pele[i];
			this.perguntas[i]=pergunta;
			String [] codigo=pergunta.split("-");
			String path = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/"+codigo[0]+".MP4"; 
			tx.setText(codigo[1]);
			Media media = new Media(new File(path).toURI().toString());   
			MediaPlayer mediaPlayer = new MediaPlayer(media);   
			MediaView mediaView = new MediaView(mediaPlayer);
	    	bt1.setGraphic(mediaView);
	    	mediaPlayer.play();}
	}
	
    @Override  
    public void start(Stage palco) throws Exception {    
 
    	
    	palco.setResizable(false);
        palco.setMaximized(true);
        //palco.setFullScreen(true);
        palco.setTitle("inicio");
        
        String path1 = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/Sim.mp4";  
        Media media1 = new Media(new File(path1).toURI().toString());   
        MediaPlayer mediaPlayer1 = new MediaPlayer(media1);   
        MediaView mediaView1 = new MediaView(mediaPlayer1);
        
        String path2 ="/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/Nao.mp4";    
        Media media2 = new Media(new File(path2).toURI().toString());   
        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);   
        MediaView mediaView2 = new MediaView(mediaPlayer2);
        
		String path3 = "/Users/ander/eclipse-workspace/exemplo/src/main/resources/videos/nãoSeiInformar.mp4";  
	    Media media3 = new Media(new File(path3).toURI().toString());   
		MediaPlayer mediaPlayer3 = new MediaPlayer(media3);   
		MediaView mediaView3 = new MediaView(mediaPlayer3);
		mediaPlayer1.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);
		mediaPlayer2.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);
		mediaPlayer3.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);

        Button bt1=new Button("");
    	bt1.setId("bt01");
    	bt1.setMinSize(300, 300);
    	bt1.setMaxSize(300, 300);
    	
    	Button bt2=new Button("");
    	bt2.setId("bt02");
    	bt2.setMinSize(300, 300);
    	
    	Button bt3=new Button("");
    	bt3.setId("bt03");
    	bt3.setMinSize(300, 300);
    	
    	Button bt4=new Button("");
    	bt4.setId("bt04");
    	bt4.setMinSize(300, 300);
    	
    	Button bt5=new Button("Próxima");
     	bt5.setId("btpergunta");
     	bt5.setVisible(false);
    	
     	Button bt6=new Button("Finalizar");
     	bt6.setId("btpergunta");
     	bt6.setVisible(false);
     	
     	//bt1.setGraphic(mediaView);
        bt2.setGraphic(mediaView1);
        bt3.setGraphic(mediaView2);
        bt4.setGraphic(mediaView3);
        
    	
    	Pane  pane  = new Pane();
    	pane.setId("panePerguntas");
        Scene scene = new Scene(pane); 
        scene.getStylesheets().add(Perguntas.class.getResource("/styles/Styles.css").toExternalForm());
    	
    	
    	Text text = new Text(); 
    	text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
    	text.setText("");
        pane.getChildren().add(text);
        text.setLayoutX(450);
        text.setLayoutY(380);
    	
        scene.setFill(Color.BLUE);
        pane.getChildren().add(bt1);
        bt1.setLayoutX(600);
        bt1.setLayoutY(50);
        
        pane.getChildren().add(bt2);
        bt2.setLayoutX(100);
        bt2.setLayoutY(400);
        
        pane.getChildren().add(bt3);
        bt3.setLayoutX(550);
        bt3.setLayoutY(400);
        
        pane.getChildren().add(bt4);
        bt4.setLayoutX(1000);
        bt4.setLayoutY(400);
        
        
        pane.getChildren().add(bt5);
        bt5.setLayoutX(1050);
        bt5.setLayoutY(700);
        
        pane.getChildren().add(bt6);
        bt6.setLayoutX(1050);
        bt6.setLayoutY(700);
              
        ToggleGroup tg = new ToggleGroup();
        RadioButton r1 = new RadioButton("");
        RadioButton r2 = new RadioButton("");
        RadioButton r3 = new RadioButton("");
        
        pane.getChildren().add(r1);
        pane.getChildren().add(r2);
        pane.getChildren().add(r3);
        
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        
        r1.setLayoutX(100);
        r1.setLayoutY(730);
        r1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        r2.setLayoutX(600);
        r2.setLayoutY(730);
        r2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        r3.setLayoutX(1000);
        r3.setLayoutY(730);
        r3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
       
      
        palco.setScene(scene);
        palco.show();
    	
        new Perguntas().chamarVideo(bt1,text);

        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	new Perguntas().chamarVideo(bt1,text);
            }
         });
        
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	respostas[i]="Sim";
            	r1.setSelected(true);
            	bt5.setVisible(true);
            	mediaPlayer1.play();
            	mediaPlayer2.stop();
            	mediaPlayer3.stop();
            	
            }
         });
        
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	respostas[i]="Não";
            	r2.setSelected(true);
            	bt5.setVisible(true);
            	mediaPlayer2.play();
            	mediaPlayer1.stop();
            	mediaPlayer3.stop();	
            }
         });
        
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	respostas[i]="Não sei informar";
            	r3.setSelected(true);
            	bt5.setVisible(true);
            	mediaPlayer3.play();
            	mediaPlayer1.stop();
            	mediaPlayer2.stop();
            }
         });
        
        bt5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
            public void handle(ActionEvent event) {
				if(i<tamanho-1) {
					i++;
					bt5.setVisible(false);
					r1.setSelected(false);
					r2.setSelected(false);
					r3.setSelected(false);
					new Perguntas().chamarVideo(bt1,text);
					
				}
				else {
					bt6.setVisible(true);
				}
            }
         });
        
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	MysqlPergustas msq=new MysqlPergustas();
            	//msq.gravar(i, perguntas[0], perguntas[1], perguntas[2], perguntas[3], perguntas[4], perguntas[5], perguntas[6], perguntas[7], perguntas[8],respostas[0], respostas[1], respostas[2], respostas[3], respostas[4], respostas[5], respostas[6], respostas[7], respostas[8]);
            	msq.gravar(123,"aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa","aaaa" );
            }
         });
        
       
    }   
      
}  