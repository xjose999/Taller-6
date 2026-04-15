public class Empleado {
    // 1. Propiedades protegidas
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}