/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author orlando
 */
public class CuentaAhorro extends cuenta{

    public CuentaAhorro(int numererocuenta, double saldo, cliente cliente1) {
        super(numererocuenta, saldo, cliente1);
    }

    public CuentaAhorro() {
    }

    @Override
    public void retirar(double retiro) {
        
    }

    @Override
    public void actualizarsaldo() {
        
    }
    
    
    
    
    
}
