public class PruebaAcceso {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Yamaha", 250);

        // Intento de acceso a miembro protected desde fuera
        // Esto generará un ERROR DE COMPILACIÓN
        // System.out.println(miMoto.marca);

        // El error dirá algo como: "marca has protected access in Vehiculo"

        // La forma correcta de ver los datos es a través de un método público:
        miMoto.mostrarDetalles();
    }
}