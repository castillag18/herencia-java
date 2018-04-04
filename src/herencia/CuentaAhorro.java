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
public class CuentaAhorro extends cuenta {

    public CuentaAhorro(int numererocuenta, double saldo, cliente cliente1) {
        super(numererocuenta, saldo, cliente1);
    }

    public CuentaAhorro() {
    }

    @Override
    public void retirar(double retiro) {
        /*  System.out.println("hola");*/
       double saldo = Integer.parseInt(JOptionPane.showInputDialog("digite su saldo actual"));
        if (saldo <= 0) {
            JOptionPane.showMessageDialog(null, "no hay saldo");
        } else
            if(saldo > 0){
            saldo = saldo - retiro;
        }
            
    }

    @Override
    public void actualizarsaldo() {
         saldo =+ saldo;
     System.out.println("el saldo actual es  : " + saldo);
    }

}
