public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Laura", 500000);
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(120000);
        cuenta.retirar(80000);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
