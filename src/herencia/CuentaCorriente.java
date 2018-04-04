/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author orlando
 */
public class CuentaCorriente extends cuenta{
    

    public CuentaCorriente(int numererocuenta, double saldo, cliente cliente1) {
        super(numererocuenta, saldo, cliente1);
    }

    public CuentaCorriente() {
    }

    @Override
    public void retirar(double retiro) {
        /*System.out.println("holal 2");*/
     JOptionPane.showInputDialog("digite el saldo a retirar : " );
     saldo = saldo - retiro;  
     System.out.println("el saldo actual es 1: " + saldo);
    }
    

    @Override
    public void actualizarsaldo() {
       saldo =+ saldo;
     System.out.println("el saldo actual es 2: " + saldo);
     }
    
    
    
}
