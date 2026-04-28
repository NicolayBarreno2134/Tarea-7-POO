package Ejercicio1;

abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void setCodigo(String codigo) {
        if (codigo != null && codigo.isBlank()) {
            System.out.println("El codigo es obligatorio. Se le asignara por defecto como null");
            this.codigo = "null";
        }else{
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.isBlank()) {
            System.out.println("El nombre es obligatorio. Se le asignara por defecto como null");
            this.nombre = "null";
        }else{
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >=0 && promedio <=10){
            this.promedio = promedio;
        }else{
            System.out.println("Rango no valido de promedio. Se le asignara 0.");
            this.promedio = 0;
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula >0){
            this.valorMatricula = valorMatricula;
        }else{
            System.out.println("Valor matricula no valido. Se le adignara 1");
            this.valorMatricula = 1;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public abstract void mostrarDatos();
    public abstract boolean validarPromedio();
    public abstract double calcularPagoFinal();
    public abstract double calcularPagoFinal(double precio);
}
