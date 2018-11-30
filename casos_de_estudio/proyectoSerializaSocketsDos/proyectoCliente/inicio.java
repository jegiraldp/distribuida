
import java.io.IOException;


public class inicio {
    
    public static void main(String[] r) throws IOException, ClassNotFoundException{
        clienteTCP.conectar();
        clienteTCP.enviar("3");
    
    }
    
}
