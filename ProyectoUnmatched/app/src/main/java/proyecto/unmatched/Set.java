package proyecto.unmatched;

import java.util.ArrayList;

public class Set extends ArrayList<Personaje> {
    String nombre;
    boolean activo = true;

    public Set(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonajes(){
        String texto = "";
        for (int i = 0 ; i < this.size() ; i++){
            texto+=this.get(i).getNombre()+"\n";
        }
        return texto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
