package chapter5HWproject;
import jsjf.CircularArrayQueue;
import jsjf.LinkedQueue;
import jsjf.exceptions.*;
 
/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the CirucularArrayQueue and LinkedQueue classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        circularArrayQueue();
        linkedQueue();
    }
    private static void circularArrayQueue()
    {
        CircularArrayQueue<String> circularArrayQueue = new CircularArrayQueue<>();
        
        circularArrayQueue.enqueue("1");
        circularArrayQueue.enqueue("2");
        circularArrayQueue.enqueue("3");
        circularArrayQueue.enqueue("4");
        circularArrayQueue.enqueue("5");
        
        System.out.println("The size of the circularArrayQueue is: " + circularArrayQueue.size() );
        System.out.println("The first element of the circularArrayQueue is: " + circularArrayQueue.first());
        System.out.println("The circularArrayQueue contains: " + circularArrayQueue.toString());
        
        System.out.println("Now empty the circularArrayQueue");
        
        circularArrayQueue.dequeue();
        circularArrayQueue.dequeue();
        circularArrayQueue.dequeue();
        circularArrayQueue.dequeue();
        circularArrayQueue.dequeue();
        
        try
        {
            circularArrayQueue.dequeue();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is the circularArrayQueue empty now? " + circularArrayQueue.isEmpty());
        
    }
    
    private static void linkedQueue()
    {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        
        linkedQueue.enqueue("1");
        linkedQueue.enqueue("2");
        linkedQueue.enqueue("3");
        linkedQueue.enqueue("4");
        linkedQueue.enqueue("5");
        
        System.out.println("The size of the linkedQueue is: " + linkedQueue.size() );
        System.out.println("The first element of the linkedQueue is: " + linkedQueue.first());
        System.out.println("The linkedQueue contains: " + linkedQueue.toString());
        
        System.out.println("Now empty the linkedQueue");
        
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        
        try
        {
            linkedQueue.dequeue();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is the linkedQueue empty now? " + linkedQueue.isEmpty());
    }
    
}

































