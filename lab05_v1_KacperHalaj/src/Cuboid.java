public class Cuboid {

    private double a,b,c;
    private String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double polecalkowite(double a, double b, double c){
        return ((2*a*b)+(2*b*c)+(2*a*c));
    }

    private double objetosc( double a, double b, double c){
        return (a*b*c);
    }

    public void view(){
        System.out.format("Figura: %s, bok a: %.2f, bok b: %.2f, bok c: %.2f, pole calkowite: %.2f, objetosc %.2f",
                name,a,b,c,polecalkowite(a,b,c),objetosc(a,b,c));
    }

}
