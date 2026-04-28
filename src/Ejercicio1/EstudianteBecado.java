package Ejercicio1;

abstract class EstudianteBecado extends Estudiante{
    private double porcentajeBeca;
    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula,  double porcentajeBeca) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }
    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 || porcentajeBeca >=100) {
            this.porcentajeBeca = porcentajeBeca;
        }else{
            System.out.println("Porcentaje de beca fuera de rango.Se le asignara por defecto 0");
            this.porcentajeBeca = 0;
        }
    }
    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }
    @Override
    public boolean validarPromedio() {
        if (getPromedio()>8){
            System.out.println("El estudiante si esta becado");
            return true;
        }else{
            System.out.println("El estudiante no esta becado");
            return false;
        }
    }
    @Override
    public double calcularPagoFinal() {
        if (validarPromedio() == true) {
            double precioFinal = getValorMatricula() * getPorcentajeBeca();
            return precioFinal;
        } else {
            double precioFinal = getValorMatricula();
            return precioFinal;
        }
    }

    public abstract double calcularPagoFinal(double precio);
    public abstract void mostrarDatos();


}
