import java.io.*;
import java.util.Scanner;

public class zadanie4 {

    /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Podaj nazwę plik: ");
            String plik = scanner.nextLine();

            DataInputStream inputStream = new DataInputStream(new FileInputStream(plik));
            int day = inputStream.readInt();
            int month = inputStream.readInt();
            int year = inputStream.readInt();
            inputStream.close();

            System.out.printf("Data urodzenia: ");
            System.out.printf(" Dzień: "+ day);
            System.out.printf(" Miesiąc: "+ month);
            System.out.printf(" Rok: "+ year);
        }catch (IOException e){
            System.out.printf("Wystąpił błąd");
            e.printStackTrace();
        }

    }
    private static String getUserInput(String prompt){
        System.out.println(prompt);
        return System.console().readLine();
    }
    */

/*
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prośba o nazwę pliku wyjściowego
            System.out.print("Podaj nazwę pliku wyjściowego: ");
            String filename = scanner.nextLine();

            // Prośba o podanie daty urodzenia
            System.out.println("Podaj swoją datę urodzenia:");
            System.out.print("Dzień: ");
            int day = scanner.nextInt();
            System.out.print("Miesiąc: ");
            int month = scanner.nextInt();
            System.out.print("Rok: ");
            int year = scanner.nextInt();

            try {
                // Zapis daty urodzenia do pliku binarnego
                DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filename));
                outputStream.writeInt(day);
                outputStream.writeInt(month);
                outputStream.writeInt(year);
                outputStream.close();
                System.out.println("Dane zostały zapisane do pliku binarnego.");
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas zapisu do pliku.");
                e.printStackTrace();
            }
        }
 */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj nazwę pliku wyjściowego: ");
            String filename = scanner.nextLine();

            // Odczyt danych z pliku binarnego
            DataInputStream inputStream = new DataInputStream(new FileInputStream(filename));
            int day = inputStream.readInt();
            int month = inputStream.readInt();
            int year = inputStream.readInt();
            inputStream.close();

            // Wyświetlenie danych na ekranie
            System.out.println("Data urodzenia:");
            System.out.println("Dzień: " + day);
            System.out.println("Miesiąc: " + month);
            System.out.println("Rok: " + year);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
            e.printStackTrace();
        }
    }







}
