package com.proxy;

import com.proxy.interfaz.ICuenta;
import com.proxy.model.Cuenta;
import com.proxy.proxy.CuentaProxy;

public class Cliente {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "jose", 100);

        ICuenta cuentaProxy = new CuentaProxy();
        System.out.println("----Cuenta Proxy - Mostrar Dinero Inicial----");
        cuentaProxy.mostrarSaldo(c);
        System.out.println("----Cuenta Proxy - Depositar Dinero----");
        c = cuentaProxy.depositarDinero(c, 50);
        System.out.println("----Cuenta Proxy - Retirar Dinero----");
        c = cuentaProxy.retirarDinero(c, 20);
        System.out.println("----Cuenta Proxy - Mostrar Dinero----");
        cuentaProxy.mostrarSaldo(c);

    }
}