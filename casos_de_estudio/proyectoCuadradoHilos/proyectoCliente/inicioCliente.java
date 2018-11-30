
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class inicioCliente {
    public static void main(String[] arg) throws IOException{
      cliente.iniciar();    
        
      InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String n; 
        while(true){
        System.out.println("Digite número");
        n = br.readLine();
        cliente.enviar(n);
        }//while
        
        
        
    }//
}
