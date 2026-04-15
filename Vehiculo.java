public class Vehiculo {
    // Protected: Solo visible para hijos y clases en el mismo paquete
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}
