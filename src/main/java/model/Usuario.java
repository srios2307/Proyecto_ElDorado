package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;
    private String cedula;
    private List<Cuenta> Listacuentas;

    public Usuario (String nombre, String apellido, String email, String telefono, String cedula, int edad) {
        if (nombre == null || apellido == null || email == null || telefono == null || cedula == null || edad<18){
            throw new IllegalArgumentException("datos invalidos o insuficientes para la creaciion de su cuenta ");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.cedula = cedula;
        this.Listacuentas = new ArrayList<>();
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEmail(String email) {this.email = email;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getCedula() {return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    public List<Cuenta> getListacuentas() {return Listacuentas;}
    public List<Cuenta> setListacuentas(Cuenta cuenta){return Listacuentas;}

}
