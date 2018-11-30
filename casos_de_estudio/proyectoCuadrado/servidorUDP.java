import java.net.*;
import java.io.*;

public class servidorUDP{
    static DatagramPacket packet, packetEnviar;
    static DatagramSocket s;
    static byte[] msg, msgEnviar;
    static int tam;
    static String dato, datoEnviar;

public static void main(String[] arg) throws IOException {
    s = new DatagramSocket(Integer.parseInt(arg[0]));
    msg=new byte[1024];
    packet = new DatagramPacket(msg,1024);
    System.out.println("server Ok..");
       
    while(true){
    recibirDatagramas();
    }
}//iniciar



public static void recibirDatagramas() throws IOException{
        s.receive(packet);
        tam=packet.getLength();
        dato = new String(packet.getData());
        dato=limpiar(dato,tam);
        System.out.println(dato+"-"+packet.getAddress());
        enviar("El cuadrado");
        
        ////
}//recibir

public static void enviar(String datoEnviar) throws SocketException, IOException{
///Enviar
        
        msgEnviar=new byte[datoEnviar.length()];
        msgEnviar=datoEnviar.getBytes();
        packetEnviar = new DatagramPacket(msgEnviar, msgEnviar.length,
            new InetSocketAddress(packet.getAddress(), packet.getPort()));
        s.send(packetEnviar);
}///

public static String limpiar(String dato, int tam){
    dato= dato.substring(0,tam);
    dato=dato.trim();
    return dato;
}//limpiar

}//clase