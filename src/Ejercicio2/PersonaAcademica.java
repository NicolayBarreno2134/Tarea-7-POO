package Ejercicio2;


    public abstract class PersonaAcademica {
        private String codigo;
        private String nombre;
        private int edad;

        public void setCodigo(String codigo) {
            if (codigo == null || codigo.isBlank()) {
                System.out.println("Código inválido. Se asignara 'Null'.");
                this.codigo = "Null";
            } else {
                this.codigo = codigo;
            }
        }

        public void setNombre(String nombre) {
            if (nombre == null || nombre.isBlank()) {
                System.out.println("Nombre inválido. Se asignara 'Null'.");
                this.nombre = "Null";
            } else {
                this.nombre = nombre;
            }
        }

        public void setEdad(int edad) {
            if (edad >= 18) {
                this.edad = edad;
            } else {
                System.out.println("Edad inválida. Se asignara 18.");
                this.edad = 18;
            }
        }

        public String getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public abstract void mostrarDatos();

        public abstract void describirRol();

        public abstract double calcularPago();

        public abstract double calcularPago(double bonoExtra);
    }


