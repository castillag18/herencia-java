/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import herencia.CuentaAhorro;
import herencia.CuentaCorriente;
import javax.swing.JOptionPane;
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cliente c1 = new cliente() ;
        cuenta c3= new CuentaCorriente();
        cuenta c2 = new CuentaAhorro();
        c2.retirar(0);
        c3.retirar(0);
        
        
        String nombre;
        String apellido;
        String cedula;
        
        
        
    }
    
}
