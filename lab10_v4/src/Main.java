import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] produkty = {"Chleb", "Mleko", "Jajka", "Masło", "Ser", "Szynka", "Pomidor", "Ogórek", "Papryka", "Banany"};


        Stos<String> koszyk = new Stos<>();
        Random random = new Random();
        int iloscproduktow = random.nextInt(15)+1;

        for (int i = 0; i <iloscproduktow; i++) {
            int indeks = random.nextInt(produkty.length);
            koszyk.push(produkty[indeks]);
        }

        Queue<String> kolejka = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            kolejka.add("Osoba "+i);
        }

        List<String> kolejkalist = new ArrayList<>(kolejka);
        Collections.shuffle(kolejkalist);;
        kolejka = new LinkedList<>(kolejkalist);

        while (!kolejka.isEmpty()){
            String osoba = kolejka.poll();
            System.out.println(osoba+" przychodzi do kasy.");
            Stos<String> kopia = new Stos<>();
            while (!koszyk.empty()){
                String produkt = koszyk.pop();
                kopia.push(produkt);
                System.out.println(produkt);
            }
            koszyk=kopia;
            System.out.println();
        }

    }
}