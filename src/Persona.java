import java.util.ArrayList;
import java.util.Arrays;

public class Persona extends Unidad_educativa{

    public String nombre;
    public String nacionalidad;
    public String residencia;
    public int codigo;

    public Persona(){
    }

    public void setDatos(String nombre, int codigo, String nacionalidad, String residencia){
        this.nombre = nombre;
        this.codigo = codigo;
        this.nacionalidad = nacionalidad;
        this.residencia = residencia;
    }
}
