public class Desarrollador extends Empleado {
    private String lenguaje;
    public Desarrollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }
    public void mostrarLenguaje() {
        System.out.println("Lenguaje principal: " + lenguaje);
    }
}
