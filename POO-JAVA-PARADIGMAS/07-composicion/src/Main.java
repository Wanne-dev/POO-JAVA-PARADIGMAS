public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Calle 10 # 15-20");
        casa.agregarHabitacion("Sala");
        casa.agregarHabitacion("Cocina");
        casa.agregarHabitacion("Habitación principal");
        casa.mostrarHabitaciones();
    }
}
