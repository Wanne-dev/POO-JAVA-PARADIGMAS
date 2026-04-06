public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("El valor a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El retiro debe ser mayor que cero.");
        } else if (valor > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= valor;
            System.out.println("Retiro realizado correctamente.");
        }
    }
}
