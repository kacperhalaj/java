public class Command {

    private String ciag;

    public Command(String ciag) {
        this.ciag = ciag;
    }

    public void operation(){
        System.out.println("Wykonuje operacje: "+ ciag);
    }

    public String getCiag() {
        return ciag;
    }

    public void setCiag(String ciag) {
        this.ciag = ciag;
    }
}
