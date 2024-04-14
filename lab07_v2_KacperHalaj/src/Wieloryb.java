public class Wieloryb extends Ryba implements Latanie{
    @Override
    public void plyn() {
        System.out.println("wieloryb plywa ");
    }
    @Override
    void wydalaj() {
        System.out.println("wieloryb wydala ");
    }
    @Override
    public void lec() {
        System.out.println("wieloryb nie lata");
    }
    @Override
    public void wyladuj() {
        System.out.println("wieloryb nie ląduje");
    }


}
