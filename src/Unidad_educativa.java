public class Unidad_educativa {

    public Unidad_educativa(){

    }

    public static Unidad_educativa getCargo(String tipo){

        switch(tipo.toLowerCase()){
            case "estudiante" :
                return new Estudiante();
            case "docente":
                return new Docente();
            case "director":
                return new Director();
            default:
                return null;
        }

    }

}
