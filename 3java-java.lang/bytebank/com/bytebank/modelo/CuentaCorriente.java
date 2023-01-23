package com.bytebank.modelo;

public class CuentaCorriente extends AbstractCuenta {

	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}
	
}
