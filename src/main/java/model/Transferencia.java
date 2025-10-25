package model;

import java.time.LocalDate;

public class Transferencia extends Transaccion{
    public Transferencia(String idTransaccion, LocalDate fecha, double monto){
        super(idTransaccion,fecha,monto);
    }
}
