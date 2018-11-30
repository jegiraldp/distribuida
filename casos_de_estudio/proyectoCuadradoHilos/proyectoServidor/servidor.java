import java.net.*;
import java.io.*;


public class servidor {
    
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dos;
    
    public static void main(String[] a) throws IOException, InterruptedException{
        iniciar();
    }
    
    static void iniciar() throws IOException, InterruptedException{
        ss= new ServerSocket(12345);
        escuchar();
    }//iniciar
    
    static void escuchar() throws InterruptedException {
        hiloServidor hs;
        while(true){
            try {
                System.out.println("waiting...");
                s= ss.accept();
                System.out.println("Connected ip: "+s.getInetAddress());
             hs= new hiloServidor(s);
                hs.start();
              //  recibir();
            } //while
            catch (IOException ex) {
                escuchar();
            }
        }
    }//escuchar
    
    
}//class
