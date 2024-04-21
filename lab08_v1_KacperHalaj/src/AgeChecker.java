public class AgeChecker {

    public void checkAge(int age) throws NotAdultException{
        if (age<18){
            throw new NotAdultException("Osoba nie jest pełnoletnia");
        }else {
            System.out.println("Osoba pełnoletnia");
        }

    }

}
