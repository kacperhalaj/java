import java.util.LinkedList;

public class FillQueue {

    public java.util.Queue<Command> wypelnij(int ilosc){
        java.util.Queue<Command> queue = new LinkedList<>();
        for (int i = 0; i < ilosc; i++) {
            Command command = new Command("Polecenie "+(i+1));
            queue.add(command);
        }
        return queue;
    }


}
