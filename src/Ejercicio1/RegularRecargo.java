package Ejercicio1;

public class RegularRecargo extends EstudianteRegular{
    private double recargo;
    public RegularRecargo(String codigo, String nombre, double promedio, double valorMatricula, int horasClase, double valorHora, double recargo) {
        super(codigo, nombre, promedio, valorMatricula, horasClase, valorHora);
        setRecargo(recargo);
    }
    public void setRecargo(double recargo) {
        if (recargo >= 0) {
            this.recargo = recargo;
        } else {
            System.out.println("Recargo inválido. Se asignara 0.");
            this.recargo = 0;
        }
    }
    public double getRecargo() {
        return recargo;
    }
    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargo;
    }
    @Override
    public double calcularPagoFinal(double precio) {
        return calcularPagoFinal() + precio;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("========== ESTUDIANTE REGULAR CON RECARGO ==========");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Horas de clase: " + getHorasClase());
        System.out.println("Valor por hora: " + getValorHora());
        System.out.println("Recargo: " + recargo);
        System.out.println("Pago final con recargo: " + calcularPagoFinal());
        System.out.println("====================================================");
    }
}

