
public class ArrayStack<T> implements StackInterface<T> {

    private T[] array;
    private int lastIndex = -1;

    public ArrayStack() {
        array = (T[]) new Object[DEFAULT_SIZE];
        // or this(DEFAULT_SIZE);
    }

    public ArrayStack(int n) {
        array = (T[]) new Object[n];
    }

    private boolean isFull(){
        if(lastIndex == array.length)
            return true;
        else
            return false;
    }
    
    private void expandArray(){
        T[] oldArray = array;
        int size = oldArray.length;
        
        array = (T[]) new Object[size * 2];
        
        for(int i=0; i<size; i++){
            array[i] = oldArray[i];
        }
    }
    
    @Override
    public void push(T newEntry) {
        lastIndex++;
        
        if(isFull()){
            expandArray();
        }
        array[lastIndex] = newEntry;
    }

    @Override
    public T pop() {
        T item = null;
        
        if(!isEmpty()){
            item = array[lastIndex];
            array[lastIndex] = null;
            
            lastIndex--;
        }
        return item;
    }

    @Override
    public T peek() {
        T item = null;
        
        if(!isEmpty()){
            item = array[lastIndex];
        }
        
        return item;
    }

    @Override
    public boolean isEmpty() {
        if(lastIndex == -1)
            return true;
        else
            return false;
    }

    @Override
    public void clear() {
        for(int i=0; i<=lastIndex; i++){
            array[i] = null;
        }
    }

}
