package model;

import java.time.LocalDate;

public class Retiro extends Transaccion{

    public Retiro(String idTransaccion, LocalDate fecha, double monto){
        super(idTransaccion,fecha,monto);
    }
}
