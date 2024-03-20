package org.trabalho.exemplo;
import java.sql.*;
import java.util.Date;


public class MysqlPergustas {
	

	public Connection getConection() {
		    
		    try {
		        Class.forName("com.mysql.jdbc.Driver");
		        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "11223344");
		        new MysqlPergustas().CriarTabela(con);
		        return con;
		    }
		    catch (Exception exception) {
		        System.out.println(exception);
		        return null;
		    }  
	}
	
	public void CriarTabela(Connection cnt) {
		try {
			String Stm1="CREATE DATABASE IF NOT EXISTS paciente";
			String Stm2="USE paciente";
			String Stm3="CREATE TABLE IF NOT EXISTS respostas(NumDocumento INT(15) NOT NULL PRIMARY KEY,pergunta1 VARCHAR(100),pergunta2 VARCHAR(100),pergunta3 VARCHAR(100),pergunta4 VARCHAR(100),pergunta5 VARCHAR(100),pergunta6 VARCHAR(100),pergunta7 VARCHAR(100),pergunta8 VARCHAR(100),pergunta9 VARCHAR(100),resposta1 VARCHAR(30),resposta2 VARCHAR(30),resposta3 VARCHAR(30),resposta4 VARCHAR(30),resposta5 VARCHAR(30),resposta6 VARCHAR(30),resposta7 VARCHAR(30),resposta8 VARCHAR(30),resposta9 VARCHAR(30))";
			Statement stmt=cnt.createStatement();
			stmt.execute(Stm1);
			stmt.execute(Stm2);
			stmt.execute(Stm3);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void gravar(int NumDoc,String pg1,String pg2,String pg3,String pg4,String pg5,String pg6,String pg7,String pg8,String pg9,String rsp1,String rsp2,String rsp3,String rsp4,String rsp5,String rsp6,String rsp7,String rsp8,String rsp9) {
		try { 
			Connection cnt=new MysqlPergustas().getConection();
			System.out.println(cnt);
			PreparedStatement prstm=cnt.prepareStatement("insert into respostas values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			prstm.setInt(1,NumDoc);
			prstm.setString(2, pg1);
			prstm.setString(3, pg2);
			prstm.setString(4, pg3);
			prstm.setString(5,pg4);
			prstm.setString(6,pg5);
			prstm.setString(7, pg6);
			prstm.setString(8, pg7);
			prstm.setString(9, pg8);
			prstm.setString(10, pg9);
			prstm.setString(11, rsp1);
			prstm.setString(12, rsp2);
			prstm.setString(13, rsp3);
			prstm.setString(14, rsp4);
			prstm.setString(15, rsp5);
			prstm.setString(16, rsp6);
			prstm.setString(17, rsp7);
			prstm.setString(18, rsp8);
			prstm.setString(19, rsp9);
			prstm.executeUpdate();  
			cnt.close();
	    }
	    catch(SQLException e) {
 	
	    }
	
   }
  
}

