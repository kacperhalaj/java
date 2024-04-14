class Trojkat extends Figura implements IFigury,RuchFigury{
    int wys=0;
    int podst=0;
    Trojkat(int wys,int podst,String kolor){
        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }
    public String opis(){
        return "Trojkat o wymiarach: "+wys+" x "+podst+" i kolorze: "+kolor;
    }


    @Override
    void skaluj(float skala) {
        this.wys*=skala;
        this.podst*=skala;
    }

    @Override
    public float getPowierzchnia() {
        return (float)(0.5*wys*podst) ;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return (p.x>=0 && p.y>=0 && (p.x+p.y)<=podst && p.x<=wys);
    }

    @Override
    public void przesun(int x, int y) {

    }
}