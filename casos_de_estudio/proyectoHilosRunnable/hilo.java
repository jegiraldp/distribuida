
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class hilo implements Runnable{
    int vel;
    sembrador s;
    
    public hilo(int vel, sembrador s) {
        this.vel=vel;
        this.s=s;
     
        
    }
    
    
    
    public void run() {
           System.out.println("Hilo iniciado "+Thread.currentThread().getName());   
        for (int i = 0; i < 10; i++) {
            
            System.out.println(Thread.currentThread().getName()+"Sembrando "+this.s.id+"--"+this.s.semilla);
            try {
                
                Thread.sleep(this.vel);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
    
}
