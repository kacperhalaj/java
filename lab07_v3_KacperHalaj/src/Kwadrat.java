class Kwadrat extends Prostokat implements IFigury,RuchFigury{

    int bok;
    Kwadrat(int bok,String kolor){
        super(bok,bok,kolor);
        this.bok=bok;
        this.kolor=kolor;

    }

    public String opis(){
        return "kwadrat o boku: "+ bok+" i kolorze: "+kolor;
    }

    public void skaluj(float skala){
        bok*=skala;
    }

    public float getPowierzchnia() {
        return bok*bok;
    }

    public boolean wPolu(Punkt p) {
        return (p.x>=0 && p.x<=bok && p.y>=0 && p.y<=bok);
    }


    @Override
    public void przesun(int x, int y) {
        super.przesun(x, y);
    }

}