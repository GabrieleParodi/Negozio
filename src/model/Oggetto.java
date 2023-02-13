package model;

public abstract class Oggetto {
    protected double peso;
    protected double costo;

    public Oggetto(){

    }
    public Oggetto(double peso, double costo){
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
