import java.util.Objects;

public class Uczestnik {

    private int id;
    private String imie;
    private int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public String toString(){
        return "Uczestnik id: "+id+" imie: "+imie+" wiek: "+wiek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    public int hashCode(){
        return Objects.hash(id,imie,wiek);
    }

}
