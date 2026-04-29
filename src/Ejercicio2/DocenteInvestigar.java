package Ejercicio2;

public class DocenteInvestigar extends Docente{
    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        } else {
            System.out.println("Publicaciones inválidas. Se asignara 0.");
            this.publicaciones = 0;
        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    @Override
    public double calcularPago() {
        return super.calcularPago() + (publicaciones * 20);
    }

    @Override
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Publicaciones: " + publicaciones);
    }
}
