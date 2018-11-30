
import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloSembrador extends Thread{
    public sembrador s;
    
    public hiloSembrador(String nombre, sembrador s){
        this.setName(nombre);
        this.s = s;
    }//const
    
    public void run(){
        try {
         
            this.s.sembrar(this.getName());
        } catch (InterruptedException ex) {
           
        }
    
    
    }//run
    
}//
