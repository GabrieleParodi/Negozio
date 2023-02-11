package model;

public class TipoRacchetta {
    private String type;

    public TipoRacchetta(){

    }
    public TipoRacchetta(String tipo){
        this.type = tipo;
    }

    public String getType(){
        if(type.equalsIgnoreCase("Rotonda") || type.equalsIgnoreCase("A Goccia") || type.equalsIgnoreCase("A Diamante")){
            return type;
        }
        return "Tipo inesistente";
    }
}
