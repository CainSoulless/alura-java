package com.bytebank.modelo;
/** 
 * @author Rodrigo Hormazabal
 * @version 1.0
 * Clase hecha abstracta para ser tratada como superclase para
 * los demas tipos de cuenta (CuentaAhorros.java y CuentaBonificacion.java).
 */
public abstract class AbstractCuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public AbstractCuenta() {

    }

    /**
     * Javadoc de ejemplo.
     * @param agencia
     * @param numero
     */
    public AbstractCuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        AbstractCuenta.total ++;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return AbstractCuenta.total;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } 
        return false;
    }

    public boolean transfiere(double valor, AbstractCuenta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } 
        return false;
    }

}
