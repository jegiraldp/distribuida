import java.io.*;
import java.net.*;
public class cliente {
    
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dos;
    
    public static void iniciar() throws IOException{
        s = new Socket("127.0.0.1", 12345);
        System.out.println("Conectado");
    }//iniciar
    public static void enviar(String num) throws IOException{
       dos= new DataOutputStream(s.getOutputStream());
       dos.writeUTF(num);
       recibir();
    }//enviar
    public static void recibir() throws IOException{
        dis = new DataInputStream(s.getInputStream());
        String cua= dis.readUTF();
        System.out.println("Cuadrado= "+cua);
    }//recibir
    public static void cerrar() throws IOException{
        s.close();
    }
}//class
