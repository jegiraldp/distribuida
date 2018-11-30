


public class hiloHimno extends Thread{

    public hiloHimno(String n) {
        this.setName(n);
    }//
    
    public /*synchronized*/ void saludar() throws InterruptedException{
               
        if(this.getName().equals("h1")){
            inicio.p[inicio.getPos()]="1.Oh libertad que perfumas";
            inicio.p[inicio.getPos()]="2.las montañas de mi tierra";
                        
        } 
        
        if(this.getName().equals("h2")){
            inicio.p[inicio.getPos()]="3.deja que aspiren mis hijos";
            inicio.p[inicio.getPos()]="4.tus olorosas esencias!";
                        
        }
    }//saludar
    
    public void run(){
        try {
            this.sleep(1500);
            saludar(); 
        } catch (InterruptedException ex) {}
    }//run
    
}
