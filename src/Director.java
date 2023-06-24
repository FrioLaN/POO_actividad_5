public class Director extends Persona{
    public String nivel;

    public Director(){
        super();
    }

    public void setDatos(String nombre, String residencia, String nacionalidad, int codigo, String nivel){
        super.setDatos(nombre, codigo, nacionalidad, residencia);
        this.nivel = nivel;
    }
}
