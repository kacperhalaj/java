import java.util.Scanner;

public class Ksiazka {
    private String tytul,autor;
    private double cena;

    public Ksiazka(String tytul, String autor, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    public Ksiazka(){
        setTytul("Dziady");
        setAutor("Adam Mickiewicz");
        setCena(20);
    }

    public void ustaw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł: ");
        this.tytul = scanner.next();
        System.out.println("Podaj autora: ");
        this.autor = scanner.next();
        System.out.println("Podaj cene: ");
        this.cena = Math.abs(scanner.nextDouble());
    }

    public void view(){
        System.out.format("Tytuł: %s, Autor: %s, Cena: %.2f",getTytul(),getAutor(),getCena());
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
