import java.io.*;
import java.util.Scanner;

public class zadanie2 {

        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            System.out.printf("podaj sciezke do pliku");
            BufferedReader fileReader = null;
            String filePath = scanner.nextLine();
            try {
                fileReader = new BufferedReader(new FileReader(filePath));
                String line;
                int lineCount = 0;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println(line);
                    lineCount++;
                }
                System.out.println("Liczba linii w pliku: " + lineCount);
            } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
            }
        }







}
