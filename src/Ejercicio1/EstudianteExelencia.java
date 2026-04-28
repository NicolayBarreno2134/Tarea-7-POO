package Ejercicio1;

public class EstudianteExelencia extends EstudianteBecado {
    private double bonoExelencia;

    public EstudianteExelencia(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca, double bonoExelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExelencia(bonoExelencia);
    }
    public void setBonoExelencia(double bonoExelencia) {
        if (bonoExelencia > 0) {
            this.bonoExelencia = bonoExelencia;
        } else {
            System.out.println("El bono de excelencia debe ser mayor que 0. Se asigna 0.");
            this.bonoExelencia = 0;
        }
    }
    public double getBonoExelencia() {
        return bonoExelencia;
    }
    @Override
    public boolean validarPromedio() {
        if (getPromedio() > 9) {
            System.out.println("El estudiante sí posee bono de excelencia.");
            return true;
        } else {
            System.out.println("El estudiante no posee bono de excelencia.");
            return super.validarPromedio();
        }
    }
    @Override
    public double calcularPagoFinal() {
        if (validarPromedio()) {
            return super.calcularPagoFinal() - bonoExelencia;
        } else {
            return super.calcularPagoFinal();
        }
    }
    @Override
    public double calcularPagoFinal(double precio) {
        return calcularPagoFinal() - precio;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("========== REPORTE DE ESTUDIANTE EXCELENCIA ==========");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Valor matrícula: " + getValorMatricula());
        System.out.println("Porcentaje beca: " + getPorcentajeBeca());
        System.out.println("Bono excelencia: " + bonoExelencia);
        System.out.println("Pago final: " + calcularPagoFinal());
        System.out.println("======================================================");
    }
}
