public class Banco {
    // 1. Atributo totalmente privado
    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // 2. Método para LEER el saldo (Solo lectura)
    public double getSaldo() {
        return saldo;
    }

    // 3. Métodos con lógica de negocio (Sustituyen al 'set' directo)
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }
}