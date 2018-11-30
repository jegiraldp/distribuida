import java.net.*;
import java.io.*;

public class servidorTCP {
static ServerSocket ss;

public static void iniciar() throws IOException{
     ss = new ServerSocket(12345,30000);
     escuchar();
}//iniciar

public static void escuchar() throws IOException{
    Socket s;
    while(true){
    System.out.println("Servidor-> Esperando cliente...");
    s=ss.accept();
    System.out.println("Servidor-> Cliente conectado - "+s.getInetAddress());
    //////////////////
    new hiloSocket(s).start();
    }//while    
   }//inicio
   

        
  
}//clase