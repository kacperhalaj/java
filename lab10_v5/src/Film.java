public class Film {

    private int czasTrwania;
    private String tytul;
    private boolean czyObejrzany;


    public Film(int czasTrwania, String tytul, boolean czObejrzany) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czObejrzany;
    }


    public void info(){
        System.out.println("Tytuł: "+tytul
                +"Czas trwania: "+czasTrwania+" minut."
                +"Obejrzny: "+(czyObejrzany ? "tak":"nie"));
    }


    public int getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public boolean isCzObejrzany() {
        return czyObejrzany;
    }

    public void setCzObejrzany(boolean czObejrzany) {
        this.czyObejrzany = czObejrzany;
    }

    public String getTyp() {
        return getTyp();
    }
}
