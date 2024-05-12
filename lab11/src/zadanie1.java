import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String line;
        System.out.println("Podaj ścieżkę do pliku: ");
        try {
            output=new FileWriter(input.nextLine());
            System.out.printf("Podaj zawartosc pliku: ");
            while (true){
                line=input.nextLine();
                if (line.equals("-")) break;
                output.write(line);
                output.write(System.lineSeparator());


            }
            System.out.printf("Liczba linii w pliku: " );

        }
        finally{
            if (output != null)
                output.close();
        }


    }
}
