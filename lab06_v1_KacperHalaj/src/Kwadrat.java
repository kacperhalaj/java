

public class Kwadrat extends Prostokat {

    double a;

    Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(double bok){
        super(bok,bok);
        this.a=bok;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String opis(){
        System.out.println("Kwadrat o wymiarach: "+a+" x "+a);
        return null;
    }

}
