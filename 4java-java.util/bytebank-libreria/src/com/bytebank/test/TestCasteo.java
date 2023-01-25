/* El casteo es posible unicamente si los objetos 
 * tienen alguna relacion de herencia, y si la 
 * referencia es guardada en un objeto Object.
 * Pero recordar que Object es una mala practica
 * al ser demasiado ambigua.
 */

package com.bytebank.test;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cliente;

public class TestCasteo {
    public static void main(String[] args) {
        Object[] cuentas = new Object[5];

        CuentaCorriente cc = new CuentaCorriente(3, 13);
        Cliente cliente = new Cliente();

        cuentas[0] = cc;
        cuentas[1] = (Object) cliente;
    }
}
