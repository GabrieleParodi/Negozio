import model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro(2.22, 4.50, "9_788865_893708", "Soul Eater 5", "Fumetto", 192 );
        Libro l2 = new Libro(2.22, 4.50, "9_788865_893707", "Soul Eater 6", "Fantasy", 200 );
        Dvd d1 = new Dvd(1, 10, "Re Leone", "Animazione", 89);
        Dvd d2 = new Dvd(1, 15, "Inception", "Thriller", 148);
        TipoRacchetta t1 = new TipoRacchetta("Rotonda");
        TipoRacchetta t2 = new TipoRacchetta("A Goccia");
        TipoRacchetta t3 = new TipoRacchetta("A Diamante");
        RacchettaDaPadel r1 = new RacchettaDaPadel(5, 101, "Head", t1);
        RacchettaDaPadel r2 = new RacchettaDaPadel(4.8, 150, "Dunlop", t2);

        Negozio amazon = new Negozio();


        amazon.addObjInventario(l1);
        amazon.addObjInventario(l2);
        amazon.addObjInventario(d1);
        amazon.addObjInventario(d2);
        amazon.addObjInventario(r1);
        amazon.rmvObjInventario(r1);
        amazon.addObjInventario(r1);
        amazon.addObjInventario(r2);

        System.out.println(amazon.numeroProdotti());//numero di prodotti in negozio
        System.out.println(amazon.pesoTotale());//peso totale dei prodotti
        System.out.println(amazon.costoMaggiore());//prodotto più costoso
        RacchettaDaPadel r3 = new RacchettaDaPadel(5.2, 90, "Amazonbasics", t3);
        amazon.addObjInventario(r3);//aggiunge un nuovo prodotto
        System.out.println(amazon.libriFantasy());//numero libri categoria fantasy
        List<Oggetti> goccia = amazon.racchetteGoccia();//crea ArrayList con dentro racchette da più di 100 euro e a forma di goccia
        System.out.println(goccia.size());

    }
}