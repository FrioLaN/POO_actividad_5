public class Docente extends Persona{

    public Docente() {
        super();
    }
    public void setDatos(String nombre, String residencia, String nacionalidad, int codigo){
        super.setDatos(nombre, codigo, nacionalidad, residencia);

    }

}
