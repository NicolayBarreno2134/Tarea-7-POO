package Ejercicio2;
import java.util.Scanner;

public class Main2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        DocenteInvestigar di = new DocenteInvestigar();

        System.out.print("Ingrese código: ");
        di.setCodigo(sc.nextLine());

        System.out.print("Ingrese nombre: ");
        di.setNombre(sc.nextLine());

        System.out.print("Ingrese edad: ");
        di.setEdad(sc.nextInt());

        System.out.print("Ingrese horas de clase: ");
        di.setHorasClase(sc.nextInt());

        System.out.print("Ingrese valor por hora: ");
        di.setValorHora(sc.nextDouble());

        System.out.print("Ingrese publicaciones: ");
        di.setPublicaciones(sc.nextInt());

        PersonaAcademica pa = di;

        System.out.println("--- DATOS DEL COLABORADOR ---");
        pa.mostrarDatos();
        pa.describirRol();
        System.out.println("Pago final: $" + pa.calcularPago());
        System.out.println("Pago con bono extra: $" + pa.calcularPago(50));

        sc.close();
        }
    }

