public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        // 'super' llama al constructor del padre (Vehiculo)
        super("Motocicleta", marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        // Podemos acceder a 'tipo' y 'marca' porque son protected
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}
