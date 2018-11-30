
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;




public class hiloSocket extends Thread{
    public Socket s;
    
    public hiloSocket(Socket s) {
       this.s=s;
    }//const
    
    public void run(){
        try {
            recibir();
        } catch (IOException ex) {}
    }
    
    public void recibir() throws IOException{
    String cadena;
    try{
    DataInputStream entrada = new DataInputStream(s.getInputStream());
    while(true){
    cadena = entrada.readUTF();
    System.out.println("Servidor-> "+cadena);
    }//while
    }catch(Exception ioe){
        System.out.println("Servidor-> Cliente desconectado");
       // escuchar();
    }
  
}//recibir
}
