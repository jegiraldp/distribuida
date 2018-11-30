import java.io.*;
import java.net.*;


public class servidor {

    public static void main(String[] arg) throws IOException, ClassNotFoundException{
        
        ServerSocket ss = new ServerSocket(12345);
        Socket sc=ss.accept();
        ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(sc.getOutputStream());
        String val = (String) ois.readObject();
        
        //serializar
        if(val.equals("1")){
            //estudiante e1= new estudiante(123, "Jorge_Giraldo", "jegiraldo@elpoli.edu.co");
            estudiante[] es= reporte.crear();
            oos.writeObject(es);
        }//
        
        System.in.read();
        System.out.println("Fin");
    
    }//main
    
}//class
