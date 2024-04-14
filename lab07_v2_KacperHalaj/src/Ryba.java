public abstract class Ryba extends Zwierze implements Plywanie {

    public void jedz(){
        System.out.println("ryba je ");
    }

    public void wynurz(){
        System.out.println("Ryba wynurza sie ");
    }

    public void zanurz(){
        System.out.println("Ryba zanurza sie ");
    }

    abstract void wydalaj();

}
