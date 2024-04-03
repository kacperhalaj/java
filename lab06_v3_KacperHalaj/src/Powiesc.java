import org.w3c.dom.DOMImplementationSource;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Powiesc extends Ksiazka{

    private String gatunek;


    public Powiesc(String tytul, String autor, double cena, String gatunke) {
        super(tytul, autor, cena);
        this.gatunek = gatunke;
    }

    public Powiesc(){

    }

    public void ustaw(){
        super.ustaw();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj gatunek powiesci: ");
        this.gatunek=scanner.next();
    }

    public void view(){
        super.view();
        System.out.format(" Gatunek powiesci: %s",getGatunke());
    }

    public String getGatunke() {
        return gatunek;
    }

    public void setGatunke(String gatunke) {
        this.gatunek = gatunek;
    }


}
