import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        ArrayList<Kangur> kangur = new ArrayList<>();
        for (int i=1; i <=10; i++) {
            kangur.add(new Kangur(i));
        }

        for (int i=0; i<kangur.size();i++) {
            kangur.get(i).skok();
        }

        System.out.println();
        Iterator<Kangur> iterator = kangur.iterator();
        while (iterator.hasNext()){
            iterator.next().skok();
        }
*/

        HashMap<String,Kangur> kangurMap = new HashMap<>();
        kangurMap.put("Jacek",new Kangur(1));
        kangurMap.put("Marta",new Kangur(2));
        kangurMap.put("Ewa",new Kangur(3));
        kangurMap.put("Jakub",new Kangur(4));
        kangurMap.put("Remek",new Kangur(5));

        Iterator<String> iterator = kangurMap.keySet().iterator();
        while (iterator.hasNext()){
            String imie = iterator.next();
            Kangur kangur = kangurMap.get(imie);
            System.out.println("Imie: "+imie+" "+ kangur.skok());

        }

        System.out.println();

        TreeSet<String> posortowanneKlucze = new TreeSet<>(kangurMap.keySet());
        LinkedHashMap<String,Kangur> posortowaneKangutyMap = new LinkedHashMap<>();
        for (String imie: posortowanneKlucze){
            posortowaneKangutyMap.put(imie,kangurMap.get(imie));
        }

        Iterator<String> iterator1 = posortowaneKangutyMap.keySet().iterator();
        while (iterator1.hasNext()){
            String imie = iterator1.next();
            Kangur kangur = posortowaneKangutyMap.get(imie);
            System.out.println("Imie: "+ imie+" "+kangur.skok());
        }



    }
}