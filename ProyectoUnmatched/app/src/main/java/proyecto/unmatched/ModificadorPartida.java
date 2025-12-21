package proyecto.unmatched;

public class ModificadorPartida {
    private String nombre;
    private String efecto;
    private Boolean activo;

    public ModificadorPartida(String nombre, String efecto) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
