package Ejercicio1;

public class EstudianteRegular extends Estudiante{
    private int horasClase;
    private double valorHora;

    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int horasClase, double valorHora) {
        super(codigo, nombre, promedio, valorMatricula);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }

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
    public boolean validarPromedio() {
        if (getPromedio() >= 7) {
            System.out.println("El estudiante regular aprueba.");
            return true;
        } else {
            System.out.println("El estudiante regular no aprueba.");
            return false;
        }
    }

    @Override
    public double calcularPagoFinal() {
        return horasClase * valorHora;
    }

    @Override
    public double calcularPagoFinal(double precio) {
        return calcularPagoFinal() + precio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("========== ESTUDIANTE REGULAR ==========");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Pago final: " + calcularPagoFinal());
        System.out.println("========================================");
    }
}
