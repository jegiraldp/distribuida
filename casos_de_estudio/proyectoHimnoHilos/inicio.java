
public class inicio {
    static String[] p;
    static int pos;
    public static void iniciar() throws InterruptedException {
        //miHilo h1 = new miHilo(10,"h1",1000);
        //miHilo h2 = new miHilo(10,"h2",500);
        pos=-1; 
        p=new String[4];
        p[0]="uno";
        p[1]="dos";
        p[2]="tres";
        p[3]="cuatro";
       
       hiloHimno h1 = new hiloHimno("h1");
       hiloHimno h2 = new hiloHimno("h2");
       
      // h1.setPriority(10);
      // h2.setPriority(1);
       
       
       h1.start();
       h2.start();
       System.out.println("----------------hilos Ok");
       h1.join();
       h2.join();
       
       ver();
        
        
    }
    
    static int getPos(){
        pos++;
        return pos; 
    }
    
    static void ver(){
        System.out.println("----------------himno");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
            
        }
       
        
    }//ver    

}//class
