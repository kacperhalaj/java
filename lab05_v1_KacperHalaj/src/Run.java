public class Run {

    Input input =  new Input();
    public void runing() {

        int wybor;
        while (true){
            Menu(); //menu programu
            wybor = input.inputInt(); //metoda do wczytania int
            switch (wybor){
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewOrb();
                case 7 -> viewCone();
                case 8 -> Close();
                default -> defaultInstructioon();
            }//koniec switch
        }//koniec while

    }//koniec run

    private void viewCone() {
        Cone stozek = new Cone();
        System.out.println("Stozek:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        stozek.setName(name);
        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        stozek.setR(r);
        System.out.println("Podaj wysokosc: ");
        double h = input.inputDouble();
        stozek.setH(h);
        System.out.println("Podaj tworzaca: ");
        double l = input.inputDouble();
        stozek.setL(l);
        if (r<0 || h<0 || l<0){
            System.out.println("Podano ujemna wartosc, zastosowano wartosc bezwzgledna");
            r=Math.abs(r);
            h=Math.abs(h);
            l=Math.abs(l);
            stozek.setH(h);
            stozek.setL(l);
            stozek.setR(r);
        }
        stozek.view();
    }

    private void viewOrb() {
        Orb kula = new Orb();
        System.out.println("Kula:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        kula.setName(name);
        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        kula.setR(r);
        if (r<0){
            System.out.println("Podano ujemna wartosc, zastosowano wartosc bezwzgledna");
            r=Math.abs(r);
            kula.setR(r);
        }
        kula.view();
    }

    private void viewCuboid() {
        Cuboid prostopadloscian = new Cuboid();
        System.out.println("Prostopadloscian:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        prostopadloscian.setName(name);
        System.out.println("Podaj bok a: ");
        double a = input.inputDouble();
        prostopadloscian.setA(a);
        System.out.println("Podaj bok b: ");
        double b = input.inputDouble();
        prostopadloscian.setB(b);
        System.out.println("Podaj bok c: ");
        double c = input.inputDouble();
        prostopadloscian.setC(c);
        if (a<0 || b<0 || c<0){
            System.out.println("Podano ujemna wartosc, zastosowano wartosc bezwzgledna");
            a=Math.abs(a);
            b=Math.abs(b);
            c=Math.abs(c);
            prostopadloscian.setA(a);
            prostopadloscian.setB(b);
            prostopadloscian.setC(c);
        }
        prostopadloscian.view();
    }

    private void viewCube() {
        Cube szescian = new Cube();
        System.out.println("Szescian:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        szescian.setName(name);
        System.out.println("Podaj bok a:");
        double a = input.inputDouble();
        if (a>0){
            //a=Math.abs(a);
            szescian.setA(a);
        }else {
            System.out.println("Podano ujemna wartosc, sproboj ponownie");
        }
        szescian.view();
    }

    private void viewRectangle() {
        Rectangle prostokat = new Rectangle();
        System.out.println("Prostokat:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        prostokat.setName(name);
        System.out.println("Podaj bok a: ");
        double a = input.inputDouble();
        //prostokat.setA(a);
        System.out.println("Podaj bok b: ");
        double b = input.inputDouble();
        //prostokat.setB(b);
        if (a>0 || b>0){
            prostokat.setA(a);
            prostokat.setB(b);
        }else {
            System.out.println("Podano ujemna wartosc, sproboj ponownie");
        }
        prostokat.view();
    }

    private void viewCircle() {
        //utworzenie obiektu danej klasy
        /*
        * podanie nazwy figury
        * podanie niezbędnych wartości
        * sprawdzenie czy podano poprawna wartość if lub abs
        * wywolanie metody view()*/
        Circle kolo = new Circle();
        System.out.println("Kolo:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        kolo.setName(name);
        System.out.println("Podaj promien: ");
        double r = input.inputDouble();
        if (r<0){
            System.out.println("Podano ujemna wartosc, zastosowano wartosc bezwzgledna");
            r=Math.abs(r);
            kolo.setR(r);
        }
        kolo.view();
    }

    private void viewSquare() {
        Square kwadrat = new Square();
        System.out.println("Kwadrat:");
        System.out.println("Podaj nazwe figury: ");
        String name = input.inputString();
        kwadrat.setName(name);
        System.out.println("Podaj bok a: ");
        double a = input.inputDouble();
        if (a>0){
            //a=Math.abs(a);
            kwadrat.setA(a);
        }else {
            System.out.println("Podano ujemna wartosc, sproboj ponownie");
        }
        kwadrat.view();
    }

    private void Menu(){
        System.out.println("\n\n\nKalkulator figur geometrycznych");
        System.out.println("1. Kolo\n"+
                "2. Kwadrat\n"+
                "3. Prostokat\n"+
                "4. Szescian\n"+
                "5. Prostopadloscian\n"+
                "6. Kula\n"+
                "7. Stozek\n"+
                "8. Wyjscie");
        System.out.println("\n\nWybirz opcje: ");
    }

    private void Close(){
        System.out.println("Czy na pewno chcesz wyjść? t || n");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1)|| znak.equals(str2)) System.exit(0);
    }

    private void defaultInstructioon() {
        System.out.println("Bledne dane, koniec programu");
        System.exit(0);
    }

}
