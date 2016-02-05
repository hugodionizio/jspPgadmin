package jspPgAdmin;

import java.sql.Connection;
import java.sql.DriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String User = null;     
        String Pass = null;
        String Host = null;
        String Port = null;     		
        try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver selecionado");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	Connection con=null;
    	
        try {
        		User = "postgres";
        		Pass = "123456";
                Host = "localhost";
                Port = "5432/postgres";
          	    con=DriverManager.getConnection("jdbc:postgresql://"+Host +":" + Port,User,Pass);
          	    System.out.print("Conexão feita.");
		} catch (Exception e){
			System.out.print(e);
		}
	}

}
