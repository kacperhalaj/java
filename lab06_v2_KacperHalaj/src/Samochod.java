import java.util.Scanner;

public class Samochod {

    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private int przebieg;

    public void ustaw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj marke samochodu: ");
        this.marka = scanner.next();
        System.out.println("Podaj model samochodu: ");
        this.model = scanner.next();
        System.out.println("Podaj rodzaj nadwozia: ");
        this.nadwozie = scanner.next();
        System.out.println("Podaj kolor samochodu: ");
        this.kolor = scanner.next();
        System.out.println("Podaj rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();
        System.out.println("Podaj przebieg samochodu:");
        this.przebieg = Math.abs(scanner.nextInt());
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public Samochod(){
        setKolor("Czarny");
        setMarka("Volkswagen");
        setModel("Passat");
        setRokProdukcji(2003);
        setPrzebieg(723333);
    }

    public void view(){
        System.out.format("Marka: %s, Model: %s, Rodzaj nadwozia: %s, Kolor: %s, Rok produkcji: %d, Przebieg: %d km",
                getMarka(),getModel(),getNadwozie(),getKolor(),getRokProdukcji(),getPrzebieg());
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}
