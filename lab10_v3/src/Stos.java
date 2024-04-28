import java.util.LinkedList;

public class Stos <T>{

    private LinkedList<T> stos;

    public Stos(){
        stos = new LinkedList<>();
    }

    public void push(T v){
        stos.addFirst(v);
    }

    public T peek(){
        return stos.peekFirst();
    }

    public T pop(){
        return stos.removeFirst();
    }

    public boolean empty(){
        return stos.isEmpty();
    }

    public String toString(){
        return stos.toString();
    }

}
