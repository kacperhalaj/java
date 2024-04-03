
public class Main {

    public static void main(String[] args) {


      // SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Audi","S4","Sedan","zielony",2012,120321,1.800,3.000,5);
      // Samochod samochod1 = new Samochod("Fiat", "Panda", "hatchback", "czerwony", 2015, 80000);
       //Samochod samochod2 = new Samochod("BMW", "3 Series", "sedan", "czarny", 2018, 60000);



        Samochod samochod1 = new Samochod();
        System.out.println("\nInformacje o samochodzie: ");
        samochod1.view();

        Samochod samochod2 = new Samochod();
        System.out.println("\n\nInformacje o samochodzie: ");
        samochod2.ustaw();
        samochod2.view();

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        System.out.println("\n\nInformacje o samochodzie osobowym: ");
        samochodOsobowy.ustaw();
        samochodOsobowy.view();

    }

}