public class Curso {
    private String nombreCurso;
    private Profesor profesor;
    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }
    public void mostrarCurso() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Profesor: " + profesor.getNombre());
    }
}
