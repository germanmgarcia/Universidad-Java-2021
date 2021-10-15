package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Germán";
        persona1.apellido = "García";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);

        persona2.nombre = "Karen";
        persona2.apellido = "Barrera";
        persona2.desplegarInformacion();
    }
}
