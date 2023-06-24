import java.util.ArrayList;

public class Estudiante extends Persona{
    public int notaFinal = 0;
    public ArrayList<Integer> notas = new ArrayList<Integer>();
    public boolean beca;

    public Estudiante(){
        super();
    }

    public void setDatos(String nombre, String residencia, String nacionalidad, int codigo, boolean beca){
        super.setDatos(nombre, codigo, nacionalidad, residencia);
        this.beca = beca;
    }

    public void setNotas(int[] notas){
        this.notas.clear();
        this.notaFinal = 0;

        for (int i = 0; i < notas.length; i++) {
            this.notaFinal += notas[i];
            this.notas.add(notas[i]);
        }
        this.notaFinal /= notas.length;
    }

    public String getNotas(){
        return this.notas.toString();
    }

    public int getNotaFinal(){
        return this.notaFinal;
    }

}
