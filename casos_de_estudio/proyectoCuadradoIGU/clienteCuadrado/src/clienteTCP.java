import java.io.*;
import java.net.*;

public class clienteTCP {
static Socket s;
    
static void conectar() throws IOException{
s = new Socket("127.0.0.1",12345);
}//conectar

static void enviar(String dato) throws IOException{
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
dos.writeUTF(dato);
recibir();
    }//enviar
  
static void recibir() throws IOException{
DataInputStream en = new DataInputStream(s.getInputStream());
String cadena = en.readUTF();
frmCliente.lblResultado.setText(cadena);
}//recibir


}//class
