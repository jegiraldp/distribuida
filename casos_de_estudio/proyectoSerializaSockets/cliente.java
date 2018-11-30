import java.io.*;
import java.net.*;

public class cliente {

    public static void main(String[] arg) throws IOException, ClassNotFoundException{
        
        Socket sc=new Socket("127.0.0.1",12345);
        ObjectOutputStream oos = new ObjectOutputStream(sc.getOutputStream());
        oos.writeObject("1");
        
        //recibir
        ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
        estudiante[] ee= (estudiante[])ois.readObject();
        
        for (int i = 0; i < ee.length; i++) {
            System.out.println(ee[i].getCedula()+"-"+ee[i].nombreCompleto+"-"+ee[i].correo);
        }//for
        
                
        System.in.read();
        System.out.println("Fin");
    
    }//main
    
}//class
