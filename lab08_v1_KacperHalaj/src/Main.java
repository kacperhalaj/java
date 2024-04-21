import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        /*
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("podaj licznik: ");
            int licznik = scanner.nextInt();
            System.out.println("podaj mianownik: ");
            int mianownik = scanner.nextInt();


            int wynik = licznik/mianownik;
            System.out.println("Wynik dzielenia: "+wynik);
        }
        catch (ArithmeticException e){
            System.err.println("Nie można dzielić przez zero");
        }
        catch (InputMismatchException e){
            System.err.println("Wprowadzono nieprawidłowe dane. "+
                    "Proszę wprowadzić liczbę.");
        }
        finally{
            scanner.close();
            System.out.println("Zakończono działanie kalkulatora.");
        }
        */



        /*
        AgeChecker ageChecker = new AgeChecker();
        try {
            ageChecker.checkAge(15);
        }
        catch (NotAdultException e){
            System.err.println("Wyjątek: "+e.getMessage());
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj liczbe: ");
            double liczba = scanner.nextDouble();

            if (liczba<0){throw new IllegalArgumentException();}
            double wynik = Math.sqrt(liczba);
            System.out.format("Wynik pierwiastkowania: %.2f",wynik);
        }
        catch (IllegalArgumentException e){
            System.err.println("Podana liczba nie może być ujemna.");
        }
        catch (InputMismatchException e){
            System.err.println("Wprowadzono niepoprawne dane.");
        }
        finally {
            scanner.close();
            System.out.println("\nZakończono działanie programu.");
        }

        */


        Scanner scanner = new Scanner(System.in);
        negativeChecker NegativeChecker = new negativeChecker();
        try{
            System.out.println("Podaj liczbe: ");
            double liczba = scanner.nextDouble();
            NegativeChecker.checkDouble(liczba);
            double wynik = Math.sqrt(liczba);
            System.out.format("Wynik pierwiastkowania: %.2f",wynik);
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.err.println("podano niepoprwane dane");
        }




    }
}