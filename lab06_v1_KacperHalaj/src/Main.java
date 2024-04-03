

public class Main {

    public static void main(String[] args) {

        Point[] points = new Point[]{
                new Point(),
                new Point(2.4,8),
                new Point(-2.5,3),
                new Point(-5.1,9)

        };


        Figura figura = new Figura();
        System.out.println(figura.opis());

        Prostokat prostokat = new Prostokat(3,4);
        System.out.println("Pole prostokata: "+prostokat.getPowierzchnia());

        Trojkat trojkat = new Trojkat(23,56);

        prostokat.przesun(3,5);

        Kwadrat kwadrat = new Kwadrat(5);
        System.out.println("Długość boku kwadratu "+kwadrat.getA());
        System.out.println("Pole powierzni kwadratu: "+ kwadrat.getPowierzchnia());

        Point srodek = new Point(3.4,4.1);
        Okrag okrag = new Okrag(srodek,4.1);

        System.out.println(" ");
        prostokat.opis();
        kwadrat.opis();
        trojkat.opis();
        okrag.opis();





    }//koniec main


}//koniec klasy