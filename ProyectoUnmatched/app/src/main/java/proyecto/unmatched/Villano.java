package proyecto.unmatched;

public class Villano {
    private String nombre;

    public Villano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Villano{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
