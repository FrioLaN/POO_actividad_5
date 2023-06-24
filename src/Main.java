
public class Main {
    public static void main(String[] args) {

        Unidad_educativa unidadEducativa = new Unidad_educativa();

        Estudiante estudiante = (Estudiante) unidadEducativa.getCargo("estudiante");
        Docente docente = (Docente) unidadEducativa.getCargo("docente");
        Director director = (Director) unidadEducativa.getCargo("director");

        estudiante.setDatos("Froilan",  "Vicente Macias", "Ecuatoriana", 164528, false);
        docente.setDatos("Fulano", "anywere", "anything",  990909);
        director.setDatos("Julanito", "anywere","anything", 12324, "decano");

        estudiante.setNotas(new int[]{23, 32,90,90,20,90});
        int notaFinal = estudiante.getNotaFinal();
        String notas = estudiante.getNotas();

        System.out.println("la nota final del estudiante "+estudiante.nombre+", es de: "+notaFinal+", cuyas notas son: "+notas);

    }
}