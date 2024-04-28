public class Kangur {

    private int nrKangura;

    public Kangur(int nrKangura) {
        this.nrKangura = nrKangura;
    }

    public String skok(){
        return "Kangur o numerz: "+ nrKangura+" wykonuje podskok";
    }


    public int getNrKangura() {
        return nrKangura;
    }

    public void setNrKangura(int nrKangura) {
        this.nrKangura = nrKangura;
    }
}
