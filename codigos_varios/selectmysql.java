import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;	


public class selectmysql{
	
	public static void main (String arg[])throws ClassNotFoundException, SQLException, InstantiationException,IllegalAccessException{
		
	String url = "jdbc:mysql://127.0.0.1:3306/jorge?user=jorge&password=jorge";
    Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection(url);
	
	String  SQLSelect = "select * from claves where usuario='jegiraldo'";
	Statement s = conn.createStatement();
	ResultSet resultado = s.executeQuery(SQLSelect);
	String str = "xx",str2 = "xx";
	
	while(resultado.next()) {
    str = resultado.getString("usuario");
    str2 = resultado.getString("perfil");
    
   	System.out.println(str + " | " + str2);
   
	}//while
	
	if(str.equals("xx")||str2.equals("xx")){
	
		System.out.println("Usuario no Existe"); 
	}
	
	conn.close();
		
	}//main
	}
