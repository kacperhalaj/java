class Prostokat extends Figura implements IFigury,RuchFigury{
    int wys=0;
    int szer=0;

    Prostokat(int wys,int szer,String kolor){
        this.wys = wys;
        this.szer = szer;
        super.kolor = kolor;
    }
    public String opis(){
        return "Prostokat o wymiarach: "+szer+" x "+wys+" i kolorze: "+kolor;
    }
    @Override
    void skaluj(float skala) {
        this.wys*=skala;
        this.szer*=skala;
    }
    @Override
    public float getPowierzchnia() {
        return wys*szer;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return (p.x>=0 && p.x<=szer && p.y>=0 && p.y<=wys);
    }

    @Override
    public void przesun(int x, int y) {

    }
}