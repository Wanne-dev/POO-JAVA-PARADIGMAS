public class Gerente extends Empleado {
    private String area;
    public Gerente(String nombre, double salario, String area) {
        super(nombre, salario);
        this.area = area;
    }
    public void mostrarArea() {
        System.out.println("Área: " + area);
    }
}
