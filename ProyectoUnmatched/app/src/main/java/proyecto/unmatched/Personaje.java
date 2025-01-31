package proyecto.unmatched;

public class Personaje {
    private String nombre;
    private String tier;
    private boolean activo;

    public Personaje(String nombre, String tier) {
        this.nombre = nombre;
        this.tier = tier;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", tier='" + tier + '\'' +
                '}';
    }
}
