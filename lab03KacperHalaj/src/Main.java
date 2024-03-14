import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      System.out.println(zadanie1());
//      zadanie2();
//      System.out.println(zadanie3());
//      System.out.println("suma liczb parzystych wynosi: "+zadanie4());

        System.out.println("podaj słowo: ");
        String slowo = inputString();
        if(palindrom(slowo)){
            System.out.println("jest palindromem");
        }else {
            System.out.println("nie jest palindromem");
        }


    }//koniec main


    public static double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static int losuj(){
        Random random = new Random();
        int liczba = random.nextInt(56)-10;
        return liczba;
    }

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();
        return slowo;
    }

            //zadanie1
/*
    public static double zadanie1(){

    System.out.println("Podaj liczbe n studentów: ");
    int liczbastudentow = inputInt();

    int i = 0;
    double suma = 0;
        while (i < liczbastudentow) {
        System.out.println("Podaj liczbe punktów: " + (i + 1) + " studenta");
        double liczbapunktow = inputDouble();
        suma += liczbapunktow;
        i++;
    }

    double srednia = 0;
        if (liczbastudentow > 1) {
        srednia = suma / liczbastudentow;

    } else {
        System.out.println("Nie podano liczby studentów ");
        //main(args);
    }
    return srednia;
        //System.out.println(srednia);
    }
*/

        //zadanie2
/*
    public static void zadanie2(){

        int iledodatnich=0;
        int ileujemnych = 0;
        int sumadodatnich=0;
        int sumaujemnych=0;

        for (int i=0; i<10; i++){
            System.out.println("Podaj liczbe dodatnią/ujemną nr "+(i+1)+": ");
            double liczba = inputDouble();

            if (liczba<0){
                ileujemnych++;
                sumaujemnych+=liczba;
            }

            if (liczba>0){
                iledodatnich++;
                sumadodatnich+=liczba;
            }
        }
        System.out.println("liczba ujemnych: "+ileujemnych+"\nsuma ujemnych: "+sumaujemnych+"\nliczba dodatnich: "+iledodatnich+"\nsuma dodatnich: "+sumadodatnich);

    }
*/

            //zadanie3
/*
    public static int zadanie3(){
        System.out.println("Ile liczb: ");
        int ile=inputInt();

        int i=0;
        int suma=0;
        while (i<ile){
            System.out.println("Podaj liczbe nr: "+(i+1));
            int liczba=inputInt();
            if (liczba%2==0){
                suma+=liczba;
            }
            i++;
        }
        return suma;
    }
*/

            //zadanie4
/*
    public static int zadanie4(){
        System.out.println("Ile liczb: ");
        int ile=inputInt();
        int i=0;
        int suma=0;

        while (i<ile){
            int liczba=losuj();
            if (liczba%2==0){
                suma+=liczba;
            }
            System.out.println("wylosowano liczbe: "+liczba);
            i++;

        }
        return suma;
    }
*/

    //zadanie5

    public static boolean palindrom(String slowo){
        int dlugosc = slowo.length();
        for (int i=0;i<dlugosc;i++){
            if (slowo.charAt(i)!=slowo.charAt(dlugosc-i-1)){
                return false;
            }
        }return true;

    }

}//koniec klasy