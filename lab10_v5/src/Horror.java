public class Horror extends Film{

    private final String typ = "Horror";

    @Override
    public void info() {
        super.info();
        System.out.println("Typ: "+typ);
    }

    public String getTyp(){
        return typ;
    }

    public Horror(int czasTrwania, String tytul, boolean czObejrzany) {
        super(czasTrwania, tytul, czObejrzany);
    }
}
