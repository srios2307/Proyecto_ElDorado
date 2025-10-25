package model;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private Usuario propietario;
    private String idCuenta;
    private List<Monedero> Listamonederos;
    private int puntos;
    private Rango rango;
    public Cuenta(String idCuenta, Usuario propietario, int puntos) {
        if(propietario==null || idCuenta==null || idCuenta.isEmpty() || puntos < 0   ) {
            throw new IllegalArgumentException("datos invalidos");
        }

        this.idCuenta = idCuenta;
        this.propietario = propietario;
        this.Listamonederos = new ArrayList<>();
        this.puntos = puntos;
        this.rango= rango;
    }
    public Rango getRango() {return rango;}
    public void setRango(Rango rango) {this.rango = rango;}
    public String getIdCuenta() {return idCuenta;}
    public void setIdCuenta(String idCuenta) {this.idCuenta = idCuenta;}
    public Usuario getPropietario() {return propietario;}
    public void setPropietario(Usuario propietario) {this.propietario = propietario;}
}
