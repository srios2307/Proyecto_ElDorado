package model;

import java.util.List;

public abstract class Monedero {
    protected String idMonedero;
    protected double saldo;
    //protected List<Transaccion> transacciones;
public Monedero (String idMonedero, double saldo) {
    if(idMonedero==null || idMonedero.isBlank() || idMonedero.isEmpty()|| saldo < 0 ) {
throw new IllegalArgumentException("datos invalidos o insuficientes ");
    }
    this.idMonedero=idMonedero;
    this.saldo=saldo;
}
}
