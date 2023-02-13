package model;

public class Dvd extends Oggetto {
    private String titolo;
    private String categoria;
    private double durata;

    public Dvd(){

    }
    public Dvd(double peso, double costo, String titolo, String categoria, double durata){
        super(peso, costo);
        this.titolo = titolo;
        this.categoria = categoria;
        this.durata = durata;
    }

    public String getTitolo(){
        return titolo;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getDurata(){
        return durata;
    }
}
