
public class Gatunek {

    private String rodzaj;
    private String gatunek;
    private int liczba_chromosomow2n;
    private int liczba_chromosomowX;
    private String opis;


    public Gatunek(String rodzaj, String gatunek, int liczba_chromosomow2n, int liczba_chromosomowX, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.liczba_chromosomow2n = liczba_chromosomow2n;
        this.liczba_chromosomowX = liczba_chromosomowX;
        this.opis = opis;
    }

    public String pelnanazwa(){
        return "Rodzaj: "+ rodzaj +"\tgatunek: "+ gatunek;
    }

    public int haploidalnaLCH(){
        return liczba_chromosomow2n/2;
    }

    public void view(){
        System.out.println("Rodzaj: "+rodzaj+
                "\ngatunek: "+gatunek+
                "\nliczba chromosomów 2n: "+liczba_chromosomow2n+
                "\nliczba chromosomów x: "+liczba_chromosomowX+
                "\nopis: "+opis);
    }

    public Gatunek klonuj(){
        return new Gatunek(rodzaj,gatunek,liczba_chromosomow2n,liczba_chromosomowX,opis);
    }

}
