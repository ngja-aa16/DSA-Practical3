
public interface StackInterface<T> {

    public static final int DEFAULT_SIZE = 5; //not encourage, because can be access by anyone(public)
    
    public void push(T newEntry);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public void clear();
}
