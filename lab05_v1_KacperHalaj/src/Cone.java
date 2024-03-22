public class Cone {

    private String name;
    private double r,l,h;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    private double polepodstawy(double r){
        return (Math.PI*Math.pow(r,2));
    }

    private double poleboczne(double r, double l){
        return (Math.PI*r*l);
    }

    private double polecalkowite(double r, double l){
        double v = Math.PI * Math.pow(r, 2) + (Math.PI * r * l);
        return v;
    }

    private double objetosc(double r, double h){
        return ((Math.PI*Math.pow(r,2)*h)/3);
    }

    public void view(){
        System.out.format("Figura: %s, promien: %.2f, wysokosc %.2f, tworzaca: %.2f, pole podstawy: %.2f,pole boczne: %.2f,pole calkowite: %.2f, objetosc %.2f",
                name,r,h,l,polepodstawy(r),poleboczne(r,l),polecalkowite(r,l),objetosc(r,h));
    }


}
