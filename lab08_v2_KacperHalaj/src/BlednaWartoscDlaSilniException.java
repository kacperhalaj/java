public class BlednaWartoscDlaSilniException extends Exception{
    public void Checker(int liczba) throws IllegalArgumentException{
        if (liczba<0) throw new IllegalArgumentException("nie można policzyć silni z liczby ujemnej");
    }
}
