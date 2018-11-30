
import java.io.*;

public class estudiante implements Serializable{
    
    private int cedula;
    public String nombreCompleto;
    public String correo;

    public estudiante(int cedula, String nombreCompleto, String correo) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }//constructor

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
}//class
