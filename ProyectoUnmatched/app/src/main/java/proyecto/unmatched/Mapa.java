package proyecto.unmatched;

public class Mapa {
    private int jugadores;
    private String nombre;
    private int fileName;
    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFileName() {
        return fileName;
    }

    public void setFileName(int fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "jugadores=" + jugadores +
                ", nombre='" + nombre + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public Mapa(int jugadores, String nombre, int fileName) {
        this.jugadores = jugadores;
        this.nombre = nombre;
        this.fileName = fileName;
    }
}
