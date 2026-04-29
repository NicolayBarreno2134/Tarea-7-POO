package Ejercicio2;

public class Docente extends PersonaAcademica{

    private int horasClase;
    private double valorHora;

    public void setHorasClase(int horasClase) {

        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            System.out.println("Horas inválidas. Se asignara 1.");
            this.horasClase = 1;
        }
    }
    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("Valor hora inválido. Se asignara 1.");
            this.valorHora = 1;
        }
    }

    public int getHorasClase() {
        return horasClase;
    }
    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }
}
