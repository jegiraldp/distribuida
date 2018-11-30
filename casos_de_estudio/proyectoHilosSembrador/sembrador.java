public class sembrador {
    public String nombre;
    public String semilla;

    public sembrador(String nombre, String semilla) {
        this.nombre = nombre;
        this.semilla = semilla;
    }//const
    
    public void sembrar(String nHilo) throws InterruptedException{
        for (int i = 0; i < 30; i++) {
System.out.println(nHilo+"::"+nombre+":sembrando:"+semilla);
          Thread.sleep(500);
        }//for
    }//sembrar
 }//class
