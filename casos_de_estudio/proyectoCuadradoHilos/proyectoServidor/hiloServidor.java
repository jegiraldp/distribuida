import java.io.*;
import java.net.*;


public class hiloServidor extends Thread{
    
    public DataInputStream dis;
    public DataOutputStream dos;
    public Socket s;

    public hiloServidor(Socket s) {
        this.s = s;       
    }

    public void run(){
        try {
            recibir();
        } catch (IOException ex) {
        
        } catch (InterruptedException ex) {
        
        }
    }//run
    
    public void recibir() throws IOException, InterruptedException{
        while(true){
        dis = new DataInputStream(s.getInputStream());
        String num = dis.readUTF();
        enviar(cuadrado.calcular(num));
        }
        
    }
    
    public void enviar(String resultado) throws IOException{
        dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(resultado);
        System.out.println("dato enviado:"+resultado);
    }
    
    
}//class
