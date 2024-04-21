public class Main {

    public static void main(String[] args) {


        try {
            Adres adres = new Adres(null,0,null,null);
            System.out.println("Utworzony adres: " +
                    adres.getUlica() + " " + adres.getNumerDomu() + ", " + adres.getKodPocztowy() + " "
                    + adres.getMiasto());
        }
        catch (NieprawidlowyAdresException e) {
            System.err.println("Błąd: "+ e.getMessage());
        }


    }
}