import java.time.LocalDate;
import java.time.LocalDateTime;

public class Budynek {
    private String name;
    private int rok_budowy, liczba_pieter;
    public Budynek(String name, int rok_budowy, int liczba_pieter) {
        this.name = name;
        this.rok_budowy = rok_budowy;
        this.liczba_pieter = liczba_pieter;
    }
    private int wiek_budynku(){
        int rok_obecny = LocalDate.now().getYear();

        return rok_obecny-rok_budowy;
    }
    public void view(){
        System.out.format("\nNazwa budynku: %s, Rok budowy: %d, Liczba pięter: %d, Wiek budynku: %d lat",
                name,rok_budowy,liczba_pieter,wiek_budynku());
    }

}
