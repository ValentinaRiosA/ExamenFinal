import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examen {
    public void uno() {
        String nombre = "antony";
        String edad = "15";
        String profesion = "Ingeniero de sistemas";
        System.out.println(nombre.toUpperCase() + " tiene " + edad + " años y su profesion es " + profesion);
    }

    public void dos(int valor) {
        try {
            switch (valor) {
                case 1:
                    System.out.println("Su cuenta es corriente");
                    break;
                case 2:
                    System.out.println("Su cuenta es ahorros");
                    break;
                case 3:
                    System.out.println("Su cuenta es nomina");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Cuenta errada");
        }
    }

    public void tres() {
        double uno = 2.4;
        double dos = 3.5;
        double tres = 4.4;
        try {

            System.out.println("La suma es: " + (uno + dos + tres));
            System.out.println("La resta es: " + (uno - dos - tres));
            System.out.println("La multiplicacion es: " + (uno * dos * tres));
            System.out.println("La division de (a+b)/c " + (uno + dos) / tres);
        } catch (Exception e) {
            System.out.println("Operacion no valida");
        }

    }

    public void cuatro() {
        int total = 0;
        for (int i = 0; i < 100; i += 2) {
            total += i;
        }
        System.out.println(total);
    }

    public void cinco(int valor) {
        Double des = 0.0;
        if (valor >= 1000) {
            des = valor * 0.2;
            System.out.println("Tiene un 20% de descuento, su total es: " + (valor - des));
        } else if (valor >= 500 && valor <= 1000) {
            des = valor * 0.1;
            System.out.println("Tiene un 10% de descuento, su total es: " + (valor - des));
        } else if (valor < 500) {
            System.out.println("Lo sentimos, no tiene descuento");
        }
    }

    public void seis(int valor) {
        int con = 1;
        while (con <= 20) {
            System.out.println(valor + " * " + con + " = " + (valor * con));
            con++;
        }
    }

    public void siete() {
        Scanner scanner = new Scanner(System.in);
        Double num = 0.0;
        Double con = 0.0;
        Double acum = 0.0;
        do {
            num = scanner.nextDouble();
            if(num != -1){
                acum += num;
                con++;
            }
        } while (num != -1);
        System.out.println("El promedio de sus notas es: " + (acum / con));
    }

    public void ocho() {
        String cad = "antony|fredy|julian|marcos";
        String[] partes = cad.split("|");
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < partes.length; i++) {
            lista.add(partes[i]);
        }
        System.out.println(lista);
    }

    public void nueve() {
        String datos = "antony,32,fredy,45,maria,23";
        String[] partes = datos.split(",");
        List<String> nombre = new ArrayList<>();
        List<String> edad = new ArrayList<>();
        int con=0;
        for (int i = 0; i < partes.length; i++) {
            nombre.add(partes[i]);
            i++;
            edad.add(partes[i]);
        }
        System.out.println(nombre);
        System.out.println(edad);

    }
}
