import java.util.*;
public class Queue<T>
{
    private ArrayList <T> queue = null;
    public Queue()
    {
        queue = new ArrayList<>();
    }  
    public boolean isEmpty()
    {
        if (queue.get(0)==null)
        return true;
        return false;
    }
    public void push(T object) 
    {
		queue.add(object);
	}
    public T front()
    {
        return queue.get(0);
    }
    public void pop()
    {
        queue.remove(0);
    }
}
