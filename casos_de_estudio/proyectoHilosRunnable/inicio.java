public class inicio {
    
    public static void main(String[] arg) {
            sembrador s1= new sembrador(12, "x");
            sembrador s2= new sembrador(13, "y");
            hilo h1= new hilo(1000,s1);
            hilo h2= new hilo(5000,s2);
            
            Thread elHiloUno = new Thread(h1,"hiloUno");
            Thread elHiloDos = new Thread(h2,"hiloDos");
            elHiloUno.start();
            elHiloDos.start();
   
    
        
    }//main
    
}//class
