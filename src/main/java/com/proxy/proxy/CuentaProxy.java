package com.proxy.proxy;


import com.proxy.implementacion.CuentaBancoAImpl;
import com.proxy.interfaz.ICuenta;
import com.proxy.model.Cuenta;

public class CuentaProxy implements ICuenta {

    private CuentaBancoAImpl cuentaReal;

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        } else {
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        } else {
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        } else {
            cuentaReal.mostrarSaldo(cuenta);
        }
    }
}
