
public class Practical3 {
    
    public static void main(String[] args){
        StackInterface<Character> cStack = new ArrayStack();
        QueueInterface<Character> cQueue = new ArrayQueue();
        String s = "abcd";
        char c;
        
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            cStack.push(c);
        }
        
        System.out.print("Stack > ");
        while(!cStack.isEmpty()){
            System.out.print(cStack.pop());
        }
        
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            cQueue.enqueue(c);
        }
        
        System.out.println("");
        System.out.print("Queue > ");
        while(!cQueue.isEmpty()){
            System.out.print(cQueue.dequeue());
        }
    }
}
