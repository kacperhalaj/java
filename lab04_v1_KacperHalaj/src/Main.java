import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //zadanie1
/*
        System.out.println("podaj rozmiar tablicy: ");
        int rozmiar = inputInt();
        System.out.println("podaj zakre - minimum: ");
        int min = inputInt();
        System.out.println("podaj zakre - maximum: ");
        int max = inputInt();

        int[] tablica = losujtablice(rozmiar,min,max);
        wyswietltablice(tablica);

        System.out.println("srednia elementów tablicy (for) wynosi: "+sumafor(tablica));
        System.out.println("srednia elementów tablicy (foreach) wynosi: "+sumaforeach(tablica));
*/


        //zadanie2

/*
        System.out.println("podaj rozmiar 1 tablicy: ");
        int rozmiar = inputInt();
        System.out.println("podaj zakre - minimum: ");
        int min = inputInt();
        System.out.println("podaj zakre - maximum: ");
        int max = inputInt();

        int[] tablica1 = losujtablice(rozmiar,min,max);
        wyswietltablice(tablica1);

        System.out.println("podaj rozmiar 2 tablicy: ");
        int rozmiar2 = inputInt();
        System.out.println("podaj zakre - minimum: ");
        int min2 = inputInt();
        System.out.println("podaj zakre - maximum: ");
        int max2 = inputInt();
        int[] tablica2 = losujtablice(rozmiar2,min2,max2);
        wyswietltablice(tablica2);
*/


            //zadanie3

        //slowa();


            //zadanie4

        //slowa();

            //zadanie5

        //sortowanie();


            //zadanie6

/*
        System.out.println("podaj pięć elementów");
        int[] tablica = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.println("podaj element nr "+(i+1));
            tablica[i]=inputInt();
            if (tablica[i]<0){
                System.out.println("niepoprawna liczba");
                break;
            }
        }
        for (int liczba : tablica){
            System.out.println("silnia z "+ liczba+" = "+silnia(liczba));
        }
*/

                //zadanie7

        slowa();


    }//koniec main

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba =scanner.nextInt();
        return liczba;
    }

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();
        return slowo;
    }

                //zadanie1
/*
    public static int[] losujtablice(int rozmiar, int min, int max){
        int[] tablica= new int[rozmiar];
        Random random = new Random();
        for (int i=0; i<rozmiar; i++){
            tablica[i] = random.nextInt(max-min+1)+min;
        }
        return tablica;
    }

    public static void wyswietltablice(int[] tablica){
        for (int i=0; i<tablica.length; i++){
            System.out.println(tablica[i] + " ");
        }
        System.out.println();
    }

    public static double sumafor(int[] tablica){
        int suma = 0;
        for (int i=0; i<tablica.length;i++){
            suma+=tablica[i];
        }
        double srednia =0;
        srednia=suma/tablica.length;
        System.out.println("suma elementow tablicy wynosi: "+suma);
        return srednia;
    }

    public static double sumaforeach(int[] tablica){
        int suma=0;
        for (int element : tablica){
            suma+=element;
        }
        double srednia=0;
        srednia=suma/tablica.length;
        System.out.println("\nsuma elementow tablicy wynosi: "+suma);
        return srednia;
    }
*/


            //zadanie2
/*
    public static int[] losujtablice(int rozmiar, int min, int max){
        int[] tablica = new int[rozmiar];
        Random random = new Random();
        for (int i=0; i<tablica.length; i++){
            tablica[i]= random.nextInt(max-min+1)+min;
        }
        return tablica;
    }

    public static void wyswietltablice(int[] tablica){
        for (int i=0; i<tablica.length;i+=2){
            System.out.println(tablica[i] + " ");
        }
    }
*/

            //zadanie3
/*
    public static void slowa(){
        System.out.println("podaj liczbe slow do wpisania: ");
        int liczba = inputInt();
        String[] tablica = new String[liczba];
        for (int i=0;i<liczba;i++){
            System.out.println("Podaj "+(i+1)+" słowo: ");
            tablica[i] = inputString();
        }
        System.out.println("Zawartość tablicy z zmienionnymi znakami na duże: ");
        for (String slowo: tablica){
            System.out.println(slowo.toUpperCase());
        }
    }
*/


            //zadanie4
/*
    public static void slowa(){
        System.out.println("podaj pięć słów: ");
        String[] tablica = new String[5];
        for (int i=0; i<tablica.length;i++){
            System.out.println("podaj słowo nr "+(i+1)+" ");
            tablica[i]=inputString();
        }

        System.out.println("\npodane słowa: ");
        for (int i=0; i<tablica.length; i++){
            System.out.println(tablica[i]);
        }

        System.out.println("słowa od ostatniego, literami od końca");
        for (int i=4;i>=0;i--){
            String slowo = tablica[i];
            System.out.println(odwroc(slowo));
        }
    }


    public static String odwroc(String slowo){
        StringBuilder odwrocone = new StringBuilder();
        for (int i=slowo.length()-1;i>=0;i--){
            odwrocone.append(slowo.charAt(i));
        }
        return odwrocone.toString();
    }
*/


            //zadanie5

/*
    public static void sortowanie(){
        System.out.println("podaj osiem liczb");
        int[] tablica = new int[8];
        for (int i=0; i<8;i++){
            System.out.println("podaj liczbe nr "+(i+1));
            tablica[i]=inputInt();
        }

        int n= tablica.length;
        for (int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if (tablica[j]>tablica[j+1]){
                    int temp=tablica[j];
                    tablica[j]=tablica[j+1];
                    tablica[j+1]=temp;
                }
            }
        }

        System.out.println("posortowane liczby: ");
        for (int liczba : tablica){
            System.out.println(liczba+" ");
        }

    }
*/


            //zadanie6

/*
    public static int silnia(int n){
            if (n==0 || n==1){
                return 1;
            }else {
                int wynik=1;
                for (int i=2;i<=n;i++){
                    wynik*=i;
                }
                return wynik;
            }

    }
*/

            //zadanie7


    public static void slowa(){
        System.out.println("podaj liczbe elementów 1 tablicy to zapisania");
        int liczba1=inputInt();
        String[] tablica1 = new String[liczba1];
        for (int i=0;i<liczba1;i++) {
            System.out.println("podaj element nr "+(i+1));
            tablica1[i]=inputString();
        }

        System.out.println("podaj liczbe elementów 2 tablicy to zapisania");
        int liczba2=inputInt();
        String[] tablica2 = new String[liczba2];
        for (int i=0;i<liczba2;i++) {
            System.out.println("podaj element nr "+(i+1));
            tablica2[i]=inputString();
        }

        /*
        boolean takiesame= Arrays.equals(tablica1,tablica2);
        if (takiesame){
            System.out.println("tablice sa takie same");
        }else {
            System.out.println("tablice nie sa takie same");
        }
        */

        if (tablica1.length==tablica2.length){
            for (int i=0;i<tablica1.length; i++){
                if (!tablica1[i].equals(tablica2[i])){
                    System.out.println("tablice nie sa takie same");
                    break;
                }
                System.out.println("tablice sa takie same");
            }
        }else {
            System.out.println("tablice nie sa takie same");
        }
    }



}//koniec klasy