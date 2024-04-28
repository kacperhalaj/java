import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        //lista
/*
        List<String> names = new ArrayList<>();//tablica wewnetrzna, rozszerza sie tablica i skonczy sie miejsce
        List<String> names1 = new LinkedList<>();// Lista dwukierunkowa, kazdy element ma referencje do poprzedniego i nastepnego

        names.isEmpty();
        names.add("jan");
        names.add("jan1");
        names.add("jan2");
        names.add("jan3");
        names.add("jan4");

        System.out.println("Lista imion: "+names);
        names.remove(3);
        System.out.println("Lista imion: "+names.get(0));

        for (int i=0; i<names.size(); i++) {
            System.out.println(i);
        }

        for (String item: names){
            System.out.println(item);
        }


        names1.add("jan");


        Set<String> uniqueNames = new HashSet<>(); //unikalne nazwy
        Set<String> uniqueNames1 = new LinkedHashSet<>();
        Set<String> uniqueNames2 = new TreeSet<>();

        uniqueNames.add("Anna");
        uniqueNames.add("Jan");
        uniqueNames.add("Maria");
        uniqueNames.add("Anna");

        System.out.println("Zbiór unikalnych imion: "+uniqueNames);
        uniqueNames.remove("Jan");
        System.out.println("Zbiór unikalnych imion: "+uniqueNames);


        HashMap<String,Integer> age = new HashMap<>();  //unikalny klucz przypisany do danej mapy
        age.put("Anna",15);
        age.put("Jan",18);
        age.put("Maria",23);
        System.out.println("Wiek osób: "+age);
        System.out.println("Wiek Anny: "+ age.get("Anna"));

        //klucz
        for (String name : age.keySet()){
            System.out.println(name);
        }
        //wartosci
        for (Integer name : age.values()){
            System.out.println(name);
        }
        // klucz i wartosc
        for (Map.Entry<String,Integer> entry : age.entrySet()){
            System.out.println("Imie: "+entry.getKey()+ " wiek "+ entry.getValue());
        }
*/

        //zadanie1();

        //zadanie2();

        // zadanie 4

        /*
        Klient[] klienci = new Klient[5];
        klienci[0]=new Klient(1,"Jan","Kowalski");
        klienci[1] = new Klient(2, "Anna", "Nowak");
        klienci[2] = new Klient(3, "Michał", "Wiśniewski");
        klienci[3] = new Klient(4, "Alicja", "Kwiatkowska");
        klienci[4] = new Klient(5, "Piotr", "Dąbrowski");

        List<Klient> lista = new ArrayList<>();
        for (Klient klient:klienci){
            lista.add(klient);
        }
        System.out.println("Lista przed usunieciem: ");
        for (Klient klient: lista){
            System.out.println(klient);
        }


        List<Klient> podlista = lista.subList(1,3);
        lista.removeAll(podlista);
        System.out.println("lista po usunieciu: ");
        for (Klient klient: lista){
            System.out.println(klient);
        }
         */

        //zadanie 5

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        List<Integer> lista2 = new ArrayList<>();
        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());
        while (iterator.hasPrevious()){
            Integer element = iterator.previous();
            lista2.add(element);
        }

        System.out.println("Lista 1: "+lista1);
        System.out.println("Lista 2: "+lista2);

    }


        //Zadanie 1

        public static void zadanie1(){
            Scanner scanner = new Scanner(System.in);
            Set<String> names = new HashSet<>();

            System.out.println("Podaj imie (jezeli chcesz zakonczyc '-')");
            while (true){
                String input = scanner.nextLine();
                if (input.equals("-")){
                    break;
                }

                names.add(input);
            }
            System.out.println("Liczba unikalnych imion: "+ names.size());
        }


        //Zadanie 2

        public static void zadanie2(){
            Scanner scanner = new Scanner(System.in);
            HashMap<String,String> paryImion = new HashMap<>();
            System.out.println("Podaj pary imion, jezeli chcesz zakończyc '-' ");
            while (true){
                System.out.println("Podaj imie 1: ");
                String imie1 = scanner.nextLine();
                if (imie1.equals("-")){
                    break;
                }
                System.out.println("Podaj imie2: ");
                String imie2 = scanner.nextLine();
                if (imie2.equals("-")){
                    break;
                }
            }


            System.out.println("Wybierz imie: ");
            String wybrane = scanner.nextLine();

            for (Map.Entry<String,String> entry: paryImion.entrySet()){
                if (entry.getKey().equals(wybrane)){
                    String partner = entry.getValue();
                    System.out.println("Partner: "+wybrane+" to "+partner );
                    return;
                }
            }

        }



        // zadanie 3

        public class Wydarzenie{

        List<Uczestnik> uczestnicy = new ArrayList<>();
        public void dodajUczestnika(Uczestnik uczestnik){
            uczestnicy.add(uczestnik);
        }
        public void usunUczetnika(Uczestnik uczestnik){
            uczestnicy.remove(uczestnik);
        }

        public void view(){
            for (Uczestnik uczestnik: uczestnicy){
                System.out.println(uczestnik);
            }
        }

        public List<Uczestnik> filtrowanie(){
            List<Uczestnik> nieletni = new ArrayList<>();
            for (Uczestnik uczestnik: uczestnicy){
                if (uczestnik.getWiek()<18){
                    nieletni.add(uczestnik);
                }
            }
            return nieletni;
        }


        }







}