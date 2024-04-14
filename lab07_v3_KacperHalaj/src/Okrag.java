public class Okrag extends Figura implements RuchFigury{

    double promien;
    Punkt srodek;

    public Okrag(double promien,String kolor,Punkt srodek) {
        this.promien=promien;
        this.kolor=kolor;
        this.srodek=srodek;
    }

    @Override
    String opis() {
        return "Okrag o promieniu: "+promien+" i kolorze: "+ kolor;
    }

    @Override
    void skaluj(float skala) {

    }

    @Override
    public float getPowierzchnia() {
        return 0;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }

    @Override
    public void przesun(int x, int y) {
        this.srodek.x+=x;
        this.srodek.y+=y;
    }


}
