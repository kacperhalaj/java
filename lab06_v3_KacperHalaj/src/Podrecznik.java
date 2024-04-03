import java.util.Scanner;

public class Podrecznik extends Ksiazka {

    private String przedmiot;

    public Podrecznik(String tytul, String autor, double cena, String przedmiot) {
        super(tytul, autor, cena);
        this.przedmiot = przedmiot;
    }


    public Podrecznik(){

    }

    public void ustaw(){
        super.ustaw();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj przedmiot: ");
        this.przedmiot=scanner.next();
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void view(){
        super.view();
        System.out.format(" Przedmiot: %s",getPrzedmiot());
    }
}
