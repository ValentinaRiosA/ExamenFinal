public class Persona {
    String nombre;
    int edad;
    Double altura;

    public Persona(String nombre, int edad, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Altura: " + altura);
    }
}
