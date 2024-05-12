public class Main {

    public static void main(String[] args) {


        Administrator administrator = new Administrator("admin","admin123");
        //administrator.addUser("user1","user123","Użytkownik");

        Uzytkownik user = new Uzytkownik("user1","user123");
        user.wplata(100.00);
        user.wyplata(50.00);
        user.zmianaPinu("newPin123");
        user.sprawdzenieWyciagu();

    }

}