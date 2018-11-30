import java.io.*;
import java.net.*;

public class servidorTCP {
    static Socket s;
    
public static void main(String[] arg) throws IOException{
ServerSocket ss = new ServerSocket(12345);
System.out.println("Esperando Cliente...");
s = ss.accept();
System.out.println("Cliente Conectado "+s.getInetAddress());
recibir();
    }//main
    
static void recibir() throws IOException{
DataInputStream  en;
String cadena;
while(true){
en = new DataInputStream(s.getInputStream());
cadena = en.readUTF();
System.out.println("s-> "+cadena);
enviar("el_cuadrado "+cadena);
}//while
}//recibir

static void enviar(String dato) throws IOException{
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
dos.writeUTF(dato);
}//enviar


}//main
