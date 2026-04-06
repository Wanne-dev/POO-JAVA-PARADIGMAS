public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luis");
        Jugador j2 = new Jugador("Pedro");
        Equipo equipo = new Equipo("Tigres");
        equipo.agregarJugador(j1);
        equipo.agregarJugador(j2);
        equipo.mostrarJugadores();
    }
}
