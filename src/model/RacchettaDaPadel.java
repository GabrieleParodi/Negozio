package model;

public class RacchettaDaPadel extends Oggetto {
    private String marca;
    private TipoRacchetta tipo;

    public RacchettaDaPadel(){

    }
    public RacchettaDaPadel(double peso, double costo, String marca, TipoRacchetta tipo){
        super(peso, costo);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca(){

        return marca;
    }
    public TipoRacchetta getTipo(){
        return tipo;
    }
}
