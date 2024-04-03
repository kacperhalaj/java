import java.util.ArrayList;

public class Ksiegarnia {

    private ArrayList<Ksiazka> ksiazki;

    public Ksiegarnia(){
        ksiazki = new ArrayList<>();
    }

    public void dodaj(Ksiazka ksiazka){
        ksiazki.add(ksiazka);
    }

    public void info(){
        for (Ksiazka ksiazka: ksiazki){
            ksiazka.view();
            System.out.println();
        }
    }


}
