
public class ArrayQueue<T> implements QueueInterface<T>{
    
    private T[] array;
    private int firstIndex = 0;
    private int lastIndex = -1;
    
    public ArrayQueue(){
        array = (T[])new Object[10];
    }
    
    public ArrayQueue(int n){
        array = (T[]) new Object[n];
    }
    
    private boolean isFull(){
        if(lastIndex+1 == array.length)
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
    public void enqueue(T newEntry) {
        lastIndex++;
        if(!isFull()){
            expandArray();
        }
        array[lastIndex] = newEntry;
    }

    @Override
    public T dequeue() {
        T item = null;
        
        if(!isEmpty()){
            item = array[firstIndex];
            firstIndex++;
        }
       
        return item;
    }

    @Override
    public T getFront() {
        T item = null;
        
        if(!isEmpty()){
            item = array[firstIndex];
        }
        
        return item;
    }

    @Override
    public boolean isEmpty() {
        if(lastIndex+1 == firstIndex)
            return true;
        else
            return false;
    }

    @Override
    public void clear() {
        for(int i=0; i<array.length; i++){
            array[i] = null;
        }
    }
    
}
