package model;

import java.time.LocalDate;

public abstract class Transaccion {
    protected String idTransaccion;
    protected LocalDate fecha;
    protected double monto;
    protected Cuenta cuenta;
   public Transaccion (String idTransaccion, LocalDate fecha, double monto){
       if (idTransaccion == null ||  idTransaccion.isEmpty()  || fecha == null || monto <= 0){
           throw new IllegalArgumentException("datos inconclusos o invalidos");
       }
       this.idTransaccion = idTransaccion;
       this.fecha = fecha;
       this.monto = monto;
   }
    public String getIdTransaccion() {return idTransaccion;}
    public LocalDate getFecha() {return fecha;}
    public double getMonto() {return monto;}
    public void setIdTransaccion(String idTransaccion) {this.idTransaccion = idTransaccion;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setMonto(double monto) {this.monto = monto;}

}
