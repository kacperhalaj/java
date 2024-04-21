public class negativeChecker {

    public void checkDouble(double liczba) throws IllegalArgumentException{
        if (liczba<0) throw new IllegalArgumentException("liczba jest ujemna");
    }


}
