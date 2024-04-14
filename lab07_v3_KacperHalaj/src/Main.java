class main{
    public static void main(String[] arg)
    {



        Figura[] tablicaFigur = new Figura[10];
        tablicaFigur[0] = new Prostokat(3,6,"czerwony");
        tablicaFigur[1] = new Trojkat(7,4,"biały");
        tablicaFigur[3] = new Kwadrat(4,"czarny");


        for (Figura figura : tablicaFigur){
            if (figura != null){
                System.out.println(figura.opis());
                System.out.println("Powierzchnia: "+figura.getPowierzchnia());
                System.out.println("Punkt (2,2) w polu figury: "+figura.wPolu(new Punkt(2,2)));
                System.out.println();
            }
        }


        Punkt srodek = new Punkt(2,4);
        Okrag okrag = new Okrag(5,"zielony",srodek);
        okrag.przesun(4,5);
        System.out.println("Srodek nowego okregu: ("+okrag.srodek.x+","+okrag.srodek.y+")");






    }
}