import java.util.*;
import java.io.*;

public class ArrayQueue<E> {

    public static final int CAPACITY = 10;  // default queue capacity
    private E[] Q;                          // E array used to implement the queue  
    private int n;                          // actual capacity of queue
    private int front;                      // index for the top of queue
    private int rear;                       // rear of the queue
    private int size;                       // size of the queue
    
	
    public ArrayQueue(){this(CAPACITY);}

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
	n = capacity;
	Q = (E[]) new Object [n]; 
	front = rear = size = 0;
    }
	
	/**
	 * @return integer size of the ArrayQueue
	 */
    public int size(){return size;}
    
	/**
	 * @return boolean true if the ArrayQueue is empty otherwise false
	 */
    public boolean isEmpty(){return size==0;}

	/**
	 * @return generic type object that is at the front of the ArrayQueue
	 * @throws ArrayQueueException if the ArrayQueue is empty
	 */
    public E front() throws ArrayQueueException {
		if (size==0) throw new ArrayQueueException();
		return Q[front];
	}
    
	/**
	 * @param generic type object to be added to the rear of the ArrayQueue
	 * @throws ArrayQueueException if the ArrayQueue is full
	 */
    public void enqueue(E element) throws ArrayQueueException {
		if (size==n) throw new ArrayQueueException();
		if (!isEmpty()) rear = (rear+1)%n;
		Q[rear] = element;	
		size++;
	}
    
    /**
     * @return generic type object at the front of the ArrayQueue and removes it from the ArrayQueue
     * @throws ArrayQueueException if the ArrayQueue is empty
     */
    public E dequeue() throws ArrayQueueException{
		if (size==0) throw new ArrayQueueException();
		E item = Q[front];
		size--;
		if (!isEmpty()) front = (front+1)%n;
		return item;
    }
	
    /**
     * @return the ArrayQueue as a formatted String
     */
    @Override
    public String toString(){
    	String s = "[";
    	if (size != 0){
    		// Loops from the front to the rear of the ArrayQueue
    		// Rolls over when it reaches the end of the Array object
    		for (int i=front;i!=rear+1;i=(i+1)%n) {
    			s=s+Q[i];
    			if (i!=rear) s = s+",";
    		}
    	}
    	return s +"]";  	      
    }
}
	
