public class Cube {

    private double a;
    private String name;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double polesciany(double a){return (a*a);}

    private double polecalkowite(double a){
        return (6*(a*a));
    }

    private double objetosc(double a){
        return Math.pow(a,3);
    }

    public void view(){
        System.out.format("Figura: %s, bok: %.2f, pole sciany: %.2f, pole calkowite: %.2f, objetosc: %.2f",
                name,a,polesciany(a),polecalkowite(a),objetosc(a));
    }

}
