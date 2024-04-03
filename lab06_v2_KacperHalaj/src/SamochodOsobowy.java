import java.util.Scanner;

public class SamochodOsobowy extends Samochod{

   private double waga;
   private double pojemnoscSilnika;
   private int iloscOsob;


    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    @Override
    public void view(){
        super.view();
        System.out.format(" Waga: %.4f, Pojemnosc silnika: %.4f, Liczba miejsc w samochodzie %d",
                getWaga(),getPojemnoscSilnika(),getIloscOsob());
    }

    public void ustaw() {
        super.ustaw();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę samochodu: w zakresie (2.0-4.5t):");
        this.waga=scanner.nextDouble();
        while (waga>4.5||waga<2){
            System.out.println("Podaj poprawna wage: ");
            this.waga=scanner.nextDouble();
        }
        System.out.println("Podaj pojemnosc silnika (0.8-3.0): ");
        this.pojemnoscSilnika= scanner.nextDouble();
        while (pojemnoscSilnika>3||pojemnoscSilnika<0.8){
            System.out.println("Podaj poprawna pojemnosc silnika: ");
            this.pojemnoscSilnika=scanner.nextDouble();
        }
        System.out.println("Podaj liczbę miejsc w samochodzie: ");
        this.iloscOsob= scanner.nextInt();
    }

    public SamochodOsobowy(){

    }


    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }



}
