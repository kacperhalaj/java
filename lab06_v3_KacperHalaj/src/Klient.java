import java.util.Scanner;

public class Klient {

    private String imie, nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Klient(){

    }

    public void ustaw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię klienta: ");
        this.imie = scanner.next();
        System.out.println("Podaj nazwisko klienta: ");
        this.nazwisko = scanner.next();
    }

    public void info(){
        System.out.format("Imie: %s, Nazwisko: %s",getImie(),getNazwisko());
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


}
