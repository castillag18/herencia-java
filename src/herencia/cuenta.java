package herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlando
 */
public abstract class cuenta {
    
    protected int numerocuenta;
    protected double saldo;
    protected cliente cliente1;

    public cuenta(int numererocuenta, double saldo, cliente cliente1) {
        this.numerocuenta = numererocuenta;
        this.saldo = saldo;
        this.cliente1 = cliente1;
    }

    public cuenta() {
    }
    
    public void setNumerocuenta(int numerocuenta){
        this.numerocuenta = numerocuenta;
    }
    
    public int getNumerocuenta(){
        return numerocuenta;
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(cliente cliente1) {
        this.cliente1 = cliente1;
    }
    public abstract void retirar(double retiro);
    
    public abstract void actualizarsaldo();
    
}
