public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {

        StringBuilder error = new StringBuilder();

        if (ulica==null){
            error.append("Ulica nie może być nullem. ");
        }
        if (numerDomu <= 0) {
            error.append("Numer domu musi być większy od 0. ");
        }
        if (kodPocztowy == null) {
            error.append("Kod pocztowy nie może być nullem. ");
        }
        if (miasto == null) {
            error.append("Miasto nie może być nullem. ");
        }

        if (error.length()>0){
            throw new NieprawidlowyAdresException(error.toString());
        }


        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;


    }

}
