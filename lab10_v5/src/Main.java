import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer,Film> prywatnaKolekcja = new HashMap<>();
        prywatnaKolekcja.put(1,new Komedia(120,"Auta",true));
        prywatnaKolekcja.put(2,new Horror(120,"To",false));


        Iterator<Map.Entry<Integer,Film>> iterator = prywatnaKolekcja.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Film> entry = iterator.next();
            int numer = entry.getKey();
            Film film = entry.getValue();
            System.out.println("Nr " + numer + ", Tytuł: " + film.getTytul()
                    + ", Czas trwania: " + film.getCzasTrwania()
                    + " minut, Obejrzany: " + (film.isCzObejrzany() ? "tak" : "nie")
                    + ", Typ: " + film.getTyp());

        }

    }
}