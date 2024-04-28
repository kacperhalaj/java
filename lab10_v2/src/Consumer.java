import java.util.Queue;

public class Consumer {

    public void consumeQueue(Queue<Command> queue){
        while (!queue.isEmpty()){
            Command command = queue.poll();
            command.operation();
        }
    }
}
