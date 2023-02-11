package model;

import java.util.ArrayList;

public class Negozio {
    private ArrayList<Oggetti> inventario;

    public Negozio(){
        this.inventario = new ArrayList<>();
    }

    public void addObjInventario(Oggetti o){
        inventario.add(o);
    }
    public void rmvObjInventario(Oggetti o){
        inventario.remove(o);
    }
    public int numeroProdotti(){
        int count = 0;
        for(Oggetti o : inventario){
            count++;
        }
        return count;
    }
    public double pesoTotale(){
        double pesoTot = 0;
        for(Oggetti o : inventario){
            pesoTot += o.getPeso();
        }
        return pesoTot;
    }
    public double costoMaggiore(){
        double piuCostoso = 0;
        for(Oggetti o : inventario){
            if(o.getCosto() > piuCostoso){
                piuCostoso = o.getCosto();
            }
        }
        return piuCostoso;
    }
    public int libriFantasy(){
        int count = 0;
        for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i) instanceof Libro){
                if (((Libro) inventario.get(i)).getCategoria().equalsIgnoreCase("Fantasy")){
                    count++;
                }
            }
        }
        return count;
    }
    public ArrayList<Oggetti> racchetteGoccia(){
        ArrayList<Oggetti> rackGoccia = new ArrayList<>();
        for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i) instanceof RacchettaDaPadel){
                if(((RacchettaDaPadel)inventario.get(i)).getCosto() > 100 && ((RacchettaDaPadel)inventario.get(i)).getTipo().getType().equalsIgnoreCase("A Goccia")){
                    rackGoccia.add(inventario.get(i));
                }
            }
        }
        return rackGoccia;
    }
}


