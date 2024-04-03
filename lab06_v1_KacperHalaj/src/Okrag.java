

public class Okrag extends Figura{

    Point srodekokregu;
    double r;

    public double getPowierzchnia(){
        return Math.PI*Math.pow(r,2);
    }
    public double srednia(){
        return 2*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void wSrodku(Point p){
        //(x-a)^2
        double lewaStrona = Math.pow(p.x-srodekokregu.x,2)+Math.pow(p.y-srodekokregu.y,2);
        double prawaStrona = Math.pow(r,2);
        if (lewaStrona<=prawaStrona){
            System.out.format("\nPunkt o wpspółrzędnych (%.2f,%.2f), "+
                    "znajduje sie w srodku okregu S = (%.2f,%.2f)",
                    p.x,p.y,srodekokregu.x,srodekokregu.y);
        }else System.out.println("Punkt lezy poza okregiem.\n");

    }

    public Okrag() {
        this.srodekokregu.x=0.0;
        this.srodekokregu.y=0.0;
        this.r=0;
    }

    public Okrag(Point srodekokregu, double r) {
        this.srodekokregu = srodekokregu;
        this.r = r;
    }



    public String opis(){
        System.out.println("okrag o srodku w punkcie: ("+srodekokregu.x+";"+srodekokregu.y+") i promieniu "+r);
        return null;
    }


}
