import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        FillQueue fillQueue = new FillQueue();
        Queue<Command> queue = fillQueue.wypelnij(5);

        Consumer consumer = new Consumer();
        consumer.consumeQueue(queue);


    }
}