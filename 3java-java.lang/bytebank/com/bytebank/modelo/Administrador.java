package com.bytebank.modelo;

public class Administrador extends AbstractFuncionario implements InterfaceAutenticar{
    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }
    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    } 
}
