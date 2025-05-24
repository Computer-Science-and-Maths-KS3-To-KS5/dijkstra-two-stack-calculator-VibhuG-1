

public class Stack<T>
{

    private class Element<T>{

        protected Element<T> prev;
        protected Element<T> next;
        protected T value;

        public Element(Element<T> prev, Element<T> next, T value)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Element<T> front = null;
    private Element<T> tail = null;
    private int size = 0;

    public void push(T value)
    {
        if(size == 0)
        {
            front = tail = new Element<>(null, null, value);
        }
        else
        {
            tail.next = new Element<>(tail, null, value);
            tail = tail.next;
        }
        size++;
    }
    public T pop()
    {
        if(size == 0) return null;

        T value = null;
        if(size == 1)
        {
            value = tail.value;
            front = tail = null;
        }
        else
        {
            value = tail.value;
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return value;
    }
    public T peek()
    {
        if(size == 0) return null;
        return tail.value;
    }
    public int Size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }

}
