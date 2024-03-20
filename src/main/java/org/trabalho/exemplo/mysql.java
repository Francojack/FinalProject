package org.trabalho.exemplo;
import java.sql.*;
import java.util.Date;


public class mysql {
	

	public Connection getConection() {
		    
		    try {
		        Class.forName("com.mysql.jdbc.Driver");
		        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "11223344");
		        new mysql().CriarTabela(con);
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
			String Stm3="CREATE TABLE IF NOT EXISTS paciente(NumDocumento INT(15) NOT NULL PRIMARY KEY,TipoDocumento VARCHAR(6) NOT NULL,NomePaciente VARCHAR(100) NOT NULL,dt_nascimento VARCHAR(20) NOT NULL,NomeEnfermeiro VARCHAR(100) NOT NULL,CodEnfermeiro INT(10),Observacao VARCHAR(200) NOT NULL)";
			Statement stmt=cnt.createStatement();
			stmt.execute(Stm1);
			stmt.execute(Stm2);
			stmt.execute(Stm3);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void gravar(int NumDoc, String nomePaciente,String tipoDoc,String dataNascimento,String NomeEnfermeiro,int codEnfermeiro,String observacao) {
		try { 
			Connection cnt=new mysql().getConection();
			System.out.println(cnt);
			PreparedStatement prstm=cnt.prepareStatement("insert into paciente values (?,?,?,?,?,?,?)");
			prstm.setInt(1,NumDoc);
			prstm.setString(2, tipoDoc);
			prstm.setString(3, nomePaciente);
			prstm.setString(4, dataNascimento);
			prstm.setString(5,NomeEnfermeiro);
			prstm.setInt(6, codEnfermeiro);
			prstm.setString(7, observacao);
			prstm.executeUpdate();  
			cnt.close();
	    }
	    catch(SQLException e) {
 	
	    }
	
   }
  
}