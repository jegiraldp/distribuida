
import java.net.*;
import java.io.*;

public class servidorTCP {
static ServerSocket ss;
static Socket s;

public static void iniciar() throws IOException{
     ss = new ServerSocket(12345,30000);
     escuchar();
}//iniciar

public static void escuchar() throws IOException{
    
    while(true){
    System.out.println("Esperando cliente...");
    s=ss.accept();
    System.out.println(" Cliente conectado - "+s.getInetAddress());
    recibir();
    }//while    
   }//inicio

    
   
public static void recibir() throws IOException{
    String cadena;
    estudiante e;
    try{
    DataInputStream entrada = new DataInputStream(s.getInputStream());
    while(true){
    cadena = entrada.readUTF();
    if((e=inicio.buscarE(Integer.parseInt(cadena)))!=null){
        enviar(e);
    }
    }//while
    }catch(Exception ioe){
        System.out.println("Servidor-> Cliente desconectado");
        escuchar();
    }
  
}//recibir
    
public static void enviar(estudiante e) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(e);
        System.out.println("Estudiante enviado");
        }//enviar
  
}//clase