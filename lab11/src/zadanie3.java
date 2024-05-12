import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie3 {
    /*
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku: ");
        String plik = scanner.nextLine();
        System.out.println("Podaj datę urodzenia: ");

        System.out.println("Podaj rok: ");
        int rok = scanner.nextInt();
        System.out.println("Podaj miesiąc: ");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj dzień: ");
        int dzien = scanner.nextInt();

        String binaryDzien = Integer.toBinaryString(dzien);
        String binaryMiesiac = Integer.toBinaryString(miesiac);
        String binaryRok = Integer.toBinaryString(rok);

        PrintWriter zapis = null;
        try {
            zapis = new PrintWriter(plik);
            zapis.write("Twój dzien binarnie: " + binaryDzien);
            zapis.write(" Twój miesiac binarnie: " + binaryMiesiac);
            zapis.write(" Twój rok binarnie: " + binaryRok);

        } finally {
            zapis.close();
        }

    }
*/


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



 }




