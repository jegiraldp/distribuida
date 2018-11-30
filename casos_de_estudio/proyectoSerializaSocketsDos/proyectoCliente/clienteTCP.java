
import java.io.*;
import java.net.*;

public class clienteTCP {
    static Socket s;
    
    public static void recibirObjeto() throws IOException, ClassNotFoundException{
         
        ObjectInputStream entrada = new ObjectInputStream(s.getInputStream());
        estudiante pp = (estudiante)entrada.readObject();
        
        System.out.println(pp.codigo+"--"+pp.nombre);
        
    }//recibir

    public static boolean conectar(){
            boolean confirm=false;
            try {
                s = new Socket("127.0.0.1",12345); //se crea con: la IP y el puerto
                confirm=true;
                System.out.println("Conectado a: "+s.getInetAddress());
            
            } catch (IOException ex) {
                System.out.println("No hay conexión");
            }
          return confirm;
        }        
        public static void enviar(String dato) throws IOException, ClassNotFoundException{
        DataOutputStream salida = new DataOutputStream(s.getOutputStream());
        salida.writeUTF(dato);
        recibirObjeto();
        }//enviar
        public static void cerrar() throws IOException{
        s.close();        
        }//cerrar
}//class
