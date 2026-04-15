public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        // Llamamos al constructor del padre
        super(nombre, salario);
        this.departamento = departamento;
    }

    // 3. Sobrescritura del método (Polimorfismo)
    @Override
    public void mostrarInformacion() {
        // Accedemos directamente a nombre y salario porque son protected
        System.out.println("--- Ficha de Gerente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: $" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("------------------------");
    }
}
