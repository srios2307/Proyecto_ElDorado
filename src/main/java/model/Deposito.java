package model;

import java.time.LocalDate;

public class Deposito extends Transaccion{

    public Deposito(String idTransaccion, LocalDate fecha, double monto){
        super(idTransaccion,fecha,monto);
    }

}
