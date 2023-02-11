package model;

public class Libro extends Oggetti{
    private String isbn;
    private String titolo;
    private String categoria;
    private int pagine;

    public Libro(){

    }
    public Libro(double peso, double costo, String isbn, String titolo, String categoria, int pagine){
        super(peso, costo);
        this.isbn = isbn;
        this.titolo = titolo;
        this.categoria = categoria;
        this.pagine = pagine;
    }

    public String getIsbn(){
        return String.format("%s", isbn);
    }
    public String getTitolo(){
        return titolo;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getPagine(){
        return pagine;
    }
}
