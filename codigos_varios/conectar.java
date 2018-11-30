import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectar{
	
	public static void main (String arg[]) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
	
	
	String url = "jdbc:mysql://127.0.0.1:3306/jorge?user=jorge&password=jorge";
    Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);

	if(!conn.isClosed()){
	
	System.out.println("LO FELICITO SE CONECTO!!!");
	}
	//conn.close()
	if(conn.isClosed()){
	
	System.out.println("BYE !!!");
	}
	
	}//main 
	}



