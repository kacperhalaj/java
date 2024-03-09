import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*  //zadanie1
        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b = inputInt();
        System.out.println("Podaj c: ");
        int c = inputInt();

        System.out.println("wynik delty: "+ zadanie1(a,b,c));
*/

        //zadanie2
/*
        System.out.println("Podaj x: ");
        int x =  inputInt();
        System.out.println("a(x) = "+zadanie1a(x));

        System.out.println("b(x) = "+zadanie1b(x));
        System.out.println("c(x) = "+zadanie1c(x));
*/
/*
        //zadanie3
        System.out.println("Podaj x: ");
        int x = inputInt();
        System.out.println("Podaj y: ");
        int y = inputInt();
        System.out.println("Podaj z: ");
        int z = inputInt();

        zadanie3(x,y,z);
*/


        //zadanie4
/*
        System.out.println("Czy pada deszcz? true/false");
        boolean padadeszcz = inputBoolean();
        System.out.println("Czy jest autobus na przystanku? true/false");
        boolean autobus = inputBoolean();

        check(padadeszcz,autobus);
*/

        //zadanie5
/*
        System.out.println("Czy jest zniżka? true/false");
        boolean znizka = inputBoolean();
        System.out.println("Czy otrzymałeś premię? true/false");
        boolean podwyzka = inputBoolean();
        znizka(znizka,podwyzka);
*/


        //zadanie6

        System.out.println("Wybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Reszta z dzielenia"+"\n");

        int i = inputInt();
        switch (i){
            case 1:
                System.out.println("\nWynik dodawania: " + dodawanie());
                break;
            case 2:
                System.out.println("\nWynik odejmowania: " + odejmowanie());
                break;
            case 3:
                System.out.println("\nWynik iloczynu: " + iloczyn());
                break;
            case 4:
                System.out.println("\nWynik ilorazu: " + iloraz());
                break;
            case 5:
                System.out.println("\nWynik reszty z dzielenia: " + reszta());
                break;
            default:
                System.out.println("Zły wybór");
        }

    }//koniec main

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean inputBoolean(){
        Scanner scanner = new Scanner(System.in);
        boolean zmienna = scanner.nextBoolean();
        return zmienna;
    }

    public static float inputFloat(){
        Scanner scanner = new Scanner(System.in);
        float liczba = scanner.nextFloat();
        return liczba;
    }

/*      //zadanie1

    public static int zadanie1(int a, int b, int c) {
        double delta = (b*b)-(4*a*c);
        if (delta>0){
            double x1 = ((-b-Math.sqrt(delta)/(2*a)));
            double x2 = ((-b+Math.sqrt(delta)/(2*a)));
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = (-b/(2*a));
            System.out.println("Równanie ma jeden pierwiastek rzeczywisty");
            System.out.println("x = " + x);
        }else {
            System.out.println("Równanie nie ma rozwiązań");
        }
        return (int) delta;
    }
*/


    //zadanie2
/*
    public static int zadanie1a(int x){
        if (x>0){
            return (2*x);
        } else if (x==0) {
            return 0;
        }else {
            return (-3*x);
        }
    }

    public static int zadanie1b(int x){
        if (x>=1){
            return x^2;
        }else {
            return x;
        }
    }

    public static int zadanie1c(int x){
        if (x>2){
            return (2+x);
        } else if (x<2) {
            return (x-4);
        }else {
            return 8;
        }
    }
*/

    //zadanie3
/*
    public static int zadanie3(int x, int y, int z){
      int temp=0;
      if (x>y){
          temp=x;
          x=y;
          y=temp;
      }
      if (x>z){
          temp=x;
          x=z;
          z=temp;
      }
      if (y>z){
          temp=y;
          y=z;
          z=temp;
      }
      System.out.println("Liczby rosnąco: "+x+" , "+y+" , "+z);
      return temp;
    }
*/

    //zadanie4
/*
    public static boolean check(boolean padadeszcz, boolean autobus){
        if (padadeszcz && autobus){
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        } else if (padadeszcz && !autobus) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (!padadeszcz && autobus) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
        return true;
    }
*/

    //zadanie5

/*
    public static boolean znizka(boolean znizka, boolean podwyzka){
        if (!znizka || podwyzka){
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!znizka || !podwyzka) {
            System.out.println("Zakup samochód trzeba odłożyć na później..."+"\nZniżki na samochód nie ma" );
        } else if (znizka || podwyzka) {
            System.out.println("Możesz kupić samochód!");
        }
        return true;
    }
*/

    //zadanie6

    public static int dodawanie(){
        System.out.println("\n"+"podaj pierwszą liczbę");
        int liczba1 = inputInt();
        System.out.println("\n"+"podaj drugą liczbę");
        int liczba2 = inputInt();
        int wynik = liczba1 + liczba2;
        return wynik;
    }
    public static int odejmowanie(){
        System.out.println("\n"+"podaj pierwszą liczbę");
        int liczba1 = inputInt();
        System.out.println("\n"+"podaj drugą liczbę");
        int liczba2 = inputInt();
        int wynik = liczba1 - liczba2;
        return wynik;
    }
    public static int iloczyn(){
        System.out.println("\n"+"podaj pierwszą liczbę");
        int liczba1 = inputInt();
        System.out.println("\n"+"podaj drugą liczbę");
        int liczba2 = inputInt();
        int wynik = liczba1 * liczba2;
        return wynik;
    }
    public static float iloraz(){
        System.out.println("\n"+"podaj pierwszą liczbę");
        float liczba1 = inputFloat();
        System.out.println("\n"+"podaj drugą liczbę");
        float liczba2 = inputFloat();
        float wynik = liczba1 / liczba2;
        return wynik;
    }

    public static int reszta(){
        System.out.println("\n"+"podaj pierwszą liczbę");
        int liczba1 = inputInt();
        System.out.println("\n"+"podaj drugą liczbę");
        int liczba2 = inputInt();
        int wynik = liczba1 % liczba2;
        return wynik;
    }



}//koniec klasy


