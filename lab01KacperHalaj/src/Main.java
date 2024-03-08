import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        //imie();
        //System.out.println(imie() +" lat: "+ wiek());

        System.out.println("Podaj a: ");
        int a = inputInt();
        System.out.println("Podaj b: ");
        int b = inputInt();
        System.out.println("Podaj c: ");
        int c = inputInt();
        System.out.println("Podaj d: ");
        int d = inputInt();
        System.out.println("Podaj e: ");
        int e = inputInt();
        System.out.println("Podaj f: ");
        int f = inputInt();

        zadanie2(a,b);

        System.out.println("Zadanie 3: " +parzysta(c));//zadanie3
        System.out.println("Zadanie 4: " +zadanie4(d));//zadanie4
        System.out.println("Zadanie 5: " +potega(e));//zadanie5
        System.out.println("Zadanie 6: " +pierwiastek(f));//zadanie6

        System.out.println("podaj g i h (zakres)");
        int g = inputInt();
        int h = inputInt();
        System.out.println("Zadanie 7: " + trojkat(losuj(g,h),losuj(g,h),losuj(g,h)));//zadanie 7
    }//koniec main
/*
    public static  String imie(){
        return  "Kacper";
    }
    public static int wiek(){
        return  21;
    }
*/

    public static void zadanie2(int a, int b){
        System.out.println("Suma "+ a+" + "+b+" = " +(a+b));
        System.out.println("Suma "+ a+" - "+b+" = " +(a-b));
        System.out.println("Suma "+ a+" * "+b+" = " +(a*b));
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean parzysta(int c){
        if (c%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean zadanie4(int d){
        if ((d%3==0)&&(d%5==0)){
            return true;
        }else {
            return false;
        }
    }

    public static double potega(double e){
        double wynik=Math.pow(e,3);
        return wynik;
    }

    public static double pierwiastek(double f){
        double wynik=Math.sqrt(f);
        return wynik;
    }

    public static int losuj(int a, int b){
        Random random= new Random();
        int liczba = random.nextInt(b+a+1)+b;// -5 10
        return liczba;
    }

    public static boolean trojkat(int a, int b, int c){
        if ((a+b)>c || (a+c)>b || (c+b)>a)
        return true;
        else
            return false;


    }


}//koniec klasy