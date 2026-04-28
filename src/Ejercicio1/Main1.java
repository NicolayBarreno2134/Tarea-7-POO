package Ejercicio1;

import java.util.Scanner;

public class Main1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Ingreso de datos Estudiante Regular ===");

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Valor matrícula: ");
        double valorMatricula = sc.nextDouble();

        System.out.print("Horas de clase: ");
        int horasClase = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        EstudianteRegular er = new EstudianteRegular(codigo, nombre, promedio, valorMatricula, horasClase, valorHora);
        Estudiante estudiantePoli = er;

        System.out.println("--- Datos Estudiante Regular ---");

        estudiantePoli.mostrarDatos();

        System.out.println("Pago con bono extra (50): " + estudiantePoli.calcularPagoFinal(50));

        System.out.println("=== Ingreso de datos Estudiante Regular con Recargo ===");


        sc.nextLine();

        System.out.print("Código: ");

        String codigoR = sc.nextLine();

        System.out.print("Nombre: ");
        String nombreR = sc.nextLine();

        System.out.print("Promedio: ");
        double promedioR = sc.nextDouble();

        System.out.print("Valor matrícula: ");
        double valorMatriculaR = sc.nextDouble();

        System.out.print("Horas de clase: ");
        int horasClaseR = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valorHoraR = sc.nextDouble();

        System.out.print("Recargo: ");
        double recargo = sc.nextDouble();
        RegularRecargo rr = new RegularRecargo(codigoR, nombreR, promedioR, valorMatriculaR, horasClaseR, valorHoraR, recargo);
        Estudiante estudiantePoli2 = rr;
        System.out.println("--- Datos Estudiante Regular con Recargo ---");
        estudiantePoli2.mostrarDatos();
        System.out.println("Pago con recargo adicional (100): " + estudiantePoli2.calcularPagoFinal(100));

        sc.close();
    }
}
