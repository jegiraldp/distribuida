
import java.io.IOException;


public class inicio {
    static estudiante[] losE;
   public static void main(String[] arg) throws IOException{
       losE = new estudiante[4];
       //llenar arreglo
       losE[0]= new estudiante(1, "jorge1");
       losE[1]= new estudiante(2, "jorge2");
       losE[2]= new estudiante(3, "jorge3");
       losE[3]= new estudiante(4, "jorge4");
       ///    
       
      servidorTCP.iniciar();
             
   }//main
   
   static estudiante buscarE(int codigo){
       estudiante es=null;
        for (int i = 0; i < losE.length; i++) {
           if(losE[i].codigo==codigo){
              es=losE[i]; 
           }//if
        }//for
        return es;
    }
}//class
