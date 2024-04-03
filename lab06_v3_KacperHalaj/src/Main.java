
public class Main {

    public static void main(String[] args) {

        Klient klient = new Klient();
        klient.ustaw();
        klient.info();

        System.out.println(" ");
        Ksiazka ksiazka = new Ksiazka();
        ksiazka.ustaw();
        ksiazka.view();

        System.out.println(" ");
        Podrecznik podrecznik = new Podrecznik();
        podrecznik.ustaw();
        podrecznik.view();

        System.out.println(" ");
        Powiesc powiesc = new Powiesc();
        powiesc.ustaw();
        powiesc.view();

        Ksiegarnia ksiegarnia = new Ksiegarnia();
        ksiegarnia.dodaj(ksiazka);
        ksiegarnia.dodaj(podrecznik);
        ksiegarnia.dodaj(powiesc);

        System.out.println("\nKsiazki w ksiegarni dla klienta: "+klient.getImie()+" "+ klient.getNazwisko());
        ksiegarnia.info();


    }//koniec main

}//koniec klasy