public class Komedia extends Film{

    private final String typ = "Komedia";

    @Override
    public void info() {
        super.info();
        System.out.println("Typ: "+ typ);
    }

    public String getTyp(){
        return typ;
    }

    public Komedia(int czasTrwania, String tytul, boolean czObejrzany) {
        super(czasTrwania, tytul, czObejrzany);
    }
}
