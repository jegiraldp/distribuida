import java.io.*;
import java.net.*;

public class clienteUDP {
    static byte[] msg, msgRecibir;
    static DatagramPacket packet, packetRecibir; 
    static DatagramSocket socket;
    static int tam, pto;
    static String dato,laIp;

    public static void main(String[] arg) throws SocketException, IOException{
      //socket = new DatagramSocket(Integer.parseInt(arg[0]));
      laIp=arg[0];
      pto=Integer.parseInt(arg[1]);
      socket = new DatagramSocket();
      msg=new byte[1024];

      //
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\nDigite Número ->");
      String num=br.readLine();
      //
      enviar(num);
      recibir();

    }
  
  
  public static void enviar(String data) throws IOException{
      msg = new byte[data.length()];
      msg = data.getBytes();
      packet = new DatagramPacket(msg, msg.length,new InetSocketAddress(laIp, pto));
      socket.send(packet);
  }//enviar
  
  public static void recibir() throws IOException{
  /////Recibir
      msgRecibir = new byte[1024];
      packetRecibir=new DatagramPacket(msgRecibir,1024);
     
      socket.receive(packetRecibir);
      tam=packetRecibir.getLength();
      dato = new String(packetRecibir.getData());
      dato=limpiar(dato,tam);
      System.out.println("s-> "+dato);
  }//recibir
  
  
  
  public static String limpiar(String dato, int tam){
    dato= dato.substring(0,tam);
    dato=dato.trim();
    return dato;
}//limpiar
}//class 