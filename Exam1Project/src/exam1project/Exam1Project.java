/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;
 
import jsjf.ArrayStack; 
import jsjf.LinkedStack;
import jsjf.exceptions.*;

/**
 *
 * @author jackjt
 */
public class Exam1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// 
	// TODO EXAM 1 - TAKEHOME
	// 1. Complete the ArrayStack and LinkedStack classes (all 6 methods)
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        arrayStack();
        linkedStack();
    }
    
    private static void arrayStack()
    {
        ArrayStack<String> arrayStack = new ArrayStack<>();
        
        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");
        arrayStack.push("4");
        arrayStack.push("5");
        
        System.out.println("The size of the arraystack is: " + arrayStack.size());
        System.out.println("This arraystack contains: " + arrayStack.toString());
        System.out.println("The top element of the arrayStack is: " + arrayStack.peek());
        
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        
        System.out.println("All the elements are popped out.");
        
        try
        {
            arrayStack.pop();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is the arraystack empty now? " + arrayStack.isEmpty());

    }
    
    private static void linkedStack()
    {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");
        linkedStack.push("5");
        
        System.out.println("The size of the linkedstack is: " + linkedStack.size());
        System.out.println("This linkedstack contains: " + linkedStack.toString());
        System.out.println("The top element of the linkedstack is: " + linkedStack.peek());
        
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop();
        
        System.out.println("All the elements are popped out.");
        
         try
        {
            linkedStack.pop();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is the linkedtack empty now? " + linkedStack.isEmpty());
    }
    
}
