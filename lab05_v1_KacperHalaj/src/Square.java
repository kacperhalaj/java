public class Square {

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


    private double pole(double a){
        return (a*a);
    }

    private double obwod(double a){
        return (4*a);
    }

    public void view(){
        System.out.format("Figura: %s, bok: %.2f, pole: %.2f, obwod: %.2f",name,a,pole(a),obwod(a));
    }



}
