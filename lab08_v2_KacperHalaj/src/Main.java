
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BlednaWartoscDlaSilniException blednaWartoscDlaSilniException = new BlednaWartoscDlaSilniException();

        boolean czywyjsc=false;
        while (!czywyjsc){
        try {
            System.out.println("Podaj liczbe z ktorej chcesz policzyc silnie: ");
            int liczba= scanner.nextInt();
            blednaWartoscDlaSilniException.Checker(liczba);
            if (liczba<0){
                czywyjsc=false;
                continue;
            }
            int wynik = silnia(liczba);
            System.out.println("Silnia z "+liczba+" wynosi: "+wynik);

        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.err.println("Wprowadzono bledne dane sprobuj ponownie");
            scanner.nextLine();
        }
        finally {
            System.out.println("Zakończono prace kalkulatora");
        }
    }

    }

    public static int silnia(int liczba){
        if (liczba==0 || liczba==1){
            return 1;
        }
        return liczba*silnia(liczba-1);
    }



}