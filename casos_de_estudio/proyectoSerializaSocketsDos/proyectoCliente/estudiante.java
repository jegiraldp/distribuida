import java.io.Serializable;


public class estudiante implements Serializable{
    public int codigo;
    public String nombre;

    public estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
}