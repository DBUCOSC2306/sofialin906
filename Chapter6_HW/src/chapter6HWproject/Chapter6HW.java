package chapter6HWproject;
import jsjf.ArrayOrderedList;
import jsjf.ArrayUnorderedList;
import jsjf.LinkedOrderedList;
import jsjf.LinkedUnorderedList;
import jsjf.exceptions.*;
 
/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the incomplete classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
     
        arrayOrderedList();
        arrayUnorderedList();
        linkedOrderedList();
        linkedUnorderedList();
    }
    
    private static void arrayOrderedList()
    {
        ArrayOrderedList<String> arrayOrderedList = new ArrayOrderedList<>();
        
        arrayOrderedList.add("1");
        arrayOrderedList.add("2");
        arrayOrderedList.add("3");
        arrayOrderedList.add("4");
        arrayOrderedList.add("5");
        
        System.out.println("The first element of the arrayOrderedList is: " +  arrayOrderedList.first());
        System.out.println("The last element of the arrayOrderedList is: " + arrayOrderedList.last());
        System.out.println("The entire arrayOrderedList contains: " + arrayOrderedList.toString());
        
        System.out.println("Now remove the first element: " + arrayOrderedList.removeFirst());
        System.out.println("The rest of the arrayOrderedList contains: " + arrayOrderedList.toString());
        System.out.println("Now remove the last element: " + arrayOrderedList.removeLast());
        System.out.println("The rest of the arrayOrderedList contains: " + arrayOrderedList.toString());
     
        System.out.println("Now remove all elements.");
        arrayOrderedList.remove("2");
        arrayOrderedList.remove("3");
        arrayOrderedList.remove("4");
        
        try {
            arrayOrderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is the arrayOrderedList empty now? " + arrayOrderedList.isEmpty());
    }
    
    private static void arrayUnorderedList()
    {
        ArrayUnorderedList<String> arrayUnorderedList = new ArrayUnorderedList<>();
        
        arrayUnorderedList.addToFront("1");
        arrayUnorderedList.addToRear("5");
        arrayUnorderedList.addAfter("2", "1");
        arrayUnorderedList.addAfter("3", "2");
        arrayUnorderedList.addAfter("4", "3");
        
        System.out.println("The first element of the arrayUnorderedList is: " + arrayUnorderedList.first());
        System.out.println("The last element of the arrayUnorderedList is: " + arrayUnorderedList.last());
        System.out.println("The entire arrayUnorderedList contains: " + arrayUnorderedList.toString());
        
        System.out.println("Now remove the first element: " + arrayUnorderedList.removeFirst());
        System.out.println("The rest of the arrayUnorderedList contains: " + arrayUnorderedList.toString());
        System.out.println("Now remove the last element: " + arrayUnorderedList.removeLast());
        System.out.println("The rest of the arrayUnorderedList contains: " + arrayUnorderedList.toString());
        
        arrayUnorderedList.remove("2");
        arrayUnorderedList.remove("3");
        arrayUnorderedList.remove("4");
        
        try {
            arrayUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is the arrayUnorderedList empty now? " + arrayUnorderedList.isEmpty());
    }
    
    private static void linkedOrderedList()
    {
        LinkedOrderedList<String> linkedOrderedList = new LinkedOrderedList<>();
        
        linkedOrderedList.add("1");
        linkedOrderedList.add("2");
        linkedOrderedList.add("3");
        linkedOrderedList.add("4");
        linkedOrderedList.add("5");
        
        System.out.println("The first element of the linkedOrderedList is: " +  linkedOrderedList.first());
        System.out.println("The last element of the linkedOrderedList is: " + linkedOrderedList.last());
        System.out.println("The entire linkedOrderedList contains: " + linkedOrderedList.toString());
        
        System.out.println("Now remove the first element: " + linkedOrderedList.removeFirst());
        System.out.println("The rest of the linkedOrderedList contains: " + linkedOrderedList.toString());
        System.out.println("Now remove the last element: " + linkedOrderedList.removeLast());
        System.out.println("The rest of the linkedOrderedList contains: " + linkedOrderedList.toString());
     
        System.out.println("Now remove all elements.");
        linkedOrderedList.remove("2");
        linkedOrderedList.remove("3");
        linkedOrderedList.remove("4");
        
        try {
            linkedOrderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is the linkedOrderedList empty now? " + linkedOrderedList.isEmpty());
    }
    
    private static void linkedUnorderedList()
    {
        LinkedUnorderedList<String> linkedUnorderedList = new LinkedUnorderedList<>();
        
        linkedUnorderedList.addToFront("1");
        linkedUnorderedList.addToRear("5");
        linkedUnorderedList.addAfter("2", "1");
        linkedUnorderedList.addAfter("3", "2");
        linkedUnorderedList.addAfter("4", "3");
        
        System.out.println("The first element of the linkedUnorderedList is: " + linkedUnorderedList.first());
        System.out.println("The last element of the linkedUnorderedList is: " + linkedUnorderedList.last());
        System.out.println("The entire linkedUnorderedList contains: " + linkedUnorderedList.toString());
        
        System.out.println("Now remove the first element: " + linkedUnorderedList.removeFirst());
        System.out.println("The rest of the linkedUnorderedList contains: " + linkedUnorderedList.toString());
        System.out.println("Now remove the last element: " + linkedUnorderedList.removeLast());
        System.out.println("The rest of the linkedUnorderedList contains: " + linkedUnorderedList.toString());
        
        linkedUnorderedList.remove("2");
        linkedUnorderedList.remove("3");
        linkedUnorderedList.remove("4");
        
        try {
            linkedUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is the linkedUnorderedList empty now? " + linkedUnorderedList.isEmpty());
    }
}

































