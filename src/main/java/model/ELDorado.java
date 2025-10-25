package model;

public class ELDorado {
    private String nombre;
    public ELDorado(String nombre) {
        if(nombre == null){
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
