package model;

public abstract class Oggetti {
    protected double peso;
    protected double costo;

    public Oggetti(){

    }
    public Oggetti(double peso, double costo){
        this.peso = peso;
        this.costo = costo;
    }
    public double getPeso(){
        return peso;
    }
    public double getCosto(){
        return costo;
    }
}
