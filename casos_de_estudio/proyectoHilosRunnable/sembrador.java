

public class sembrador {
    public int id;
    public String semilla;

    public sembrador(int id, String semilla) {
        this.id = id;
        this.semilla = semilla;
    }
    
    public void sembrar() throws InterruptedException {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(this.id+":sembrando:"+this.semilla+":"+i);
           
                Thread.sleep(1000);
           
        }
        
    }//
}
