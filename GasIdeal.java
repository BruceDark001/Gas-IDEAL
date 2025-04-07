
package com.mycompany.gasideal;


public class GasIdeal {

  
    private double temperatura;
    private double numerodeMoles;
    private double volumen; 

    public GasIdeal(double temperatura, double numerodeMoles, double volumen){
        this.temperatura = temperatura;
        this.numerodeMoles = numerodeMoles;
        this.volumen = volumen;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getNumerodeMoles() {
        return numerodeMoles;
    }
    public void setNumerodeMoles(double numerodeMoles) {
        this.numerodeMoles = numerodeMoles;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public double calcularPresion(){
        return this.numerodeMoles * 0.0821 * this.temperatura/this.volumen;
    }
    
    public static void main(String[] args) {
        GasIdeal gas = new GasIdeal(100,5,5);
        System.out.println("La presion de gas ideal es:" + gas.calcularPresion());
    }
}
