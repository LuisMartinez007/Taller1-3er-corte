import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        int numeroPaginas = scanner.nextInt();

        Libro libro2 = new Libro(titulo, autor, numeroPaginas);
        libro2.mostrarDetalles();

        // Crear un objeto de la clase CuentaBancaria usando diferentes constructores
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Detalles de la cuenta bancaria predeterminada: " + cuenta1);

        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo de la cuenta: ");
        int saldo = scanner.nextInt();

        CuentaBancaria cuenta2 = new CuentaBancaria(tipoCuenta, saldo, numeroCuenta);
        System.out.println("Detalles de la cuenta bancaria ingresada: " + cuenta2);

        // Crear un objeto de la clase Estudiante usando diferentes constructores
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Detalles del estudiante predeterminado: " + estudiante1);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el curso del estudiante: ");
        String curso = scanner.nextLine();

        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);
        System.out.println("Detalles del estudiante ingresado: " + estudiante2);

    }
}


