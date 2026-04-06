import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }
    public void agregarHabitacion(String nombreHabitacion) {
        habitaciones.add(new Habitacion(nombreHabitacion));
    }
    public void mostrarHabitaciones() {
        System.out.println("Casa ubicada en: " + direccion);
        for (Habitacion h : habitaciones) {
            System.out.println("- " + h.getNombre());
        }
    }
}
