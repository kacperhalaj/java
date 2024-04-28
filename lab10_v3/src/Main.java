public class Main {

    public static void main(String[] args) {


        String wyrazenie = " +B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";

        Stos<Character> stos = new Stos<>();
        for (int i = 0; i < wyrazenie.length(); i++) {
            char znak = wyrazenie.charAt(i);
            if (znak=='+'){
                char litera = wyrazenie.charAt(++i);
                stos.push(litera);
            } else if (znak=='-') {
                if (!stos.empty()){
                    System.out.println(stos.pop());
                }
            }
        }


    }
}