import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Examen examen = new Examen();
        Persona persona;

        persona = new Persona("Valentina", 26, 1.61);
        persona.mostrar();
        persona = new Persona("Jero", 1, 75.0);
        persona.mostrar();
        persona = new Persona("Adde", 33, 1.85);
        persona.mostrar();

    }
}