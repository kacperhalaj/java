
public class Main {

    public static void main(String[] args) {

        Gatunek gatunek1 = new Gatunek("Homo sapiens","Ssak",46,23,"człowiek");
        Gatunek gatunek2 = new Gatunek("Platypus","Ssak",52,26,"dziobak");
        Gatunek gatunek3 = new Gatunek("Haliaeetus","Ptak",66,33,"orzeł bielik");


        System.out.println("\n\nPelna nazwa gatunku 1:\t"+gatunek1.pelnanazwa()+
                "\nhapolidalna liczba chromosomów: "+gatunek1.haploidalnaLCH());
        gatunek1.view();


        System.out.println("\n\nPelna nazwa gatunku 2:\t"+gatunek2.pelnanazwa()+
                "\nhapolidalna liczba chromosomów: "+gatunek2.haploidalnaLCH());
        gatunek2.view();

        System.out.println("\n\nPelna nazwa gatunku 3:\t"+gatunek3.pelnanazwa()+
                "\nhapolidalna liczba chromosomów: "+gatunek3.haploidalnaLCH());
        gatunek3.view();


        Gatunek klonowany = gatunek1.klonuj();
        System.out.println("\n\nSklonowany gatunek: ");
        klonowany.view();




    }




}