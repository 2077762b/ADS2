/** Singly linked list with just a head storing strings*/
public class StringList {

    private Node head;  //head node of the list
    private long size;  //number of nodes in the list
    
    /** Default constructor that creates an empty list */
    public StringList(){head=null; size=0;}

    /** add node to front of list containing the String s */
    public void addFront(String s){
	head = new Node(s,head);
	size++;
    }
	
    /** return the size of the list */
    public long size(){return size;}
	
    /** return the head of the list*/
    public Node getHead(){return head;}
	
    /**is the list empty?*/
    public boolean isEmpty(){return head == null;}	
	
    /** remove node from front of list */
    public void removeFirst() throws ListException {
	if (!isEmpty()){head = head.getNext(); size--;}
	else throw new ListException("attempted removal from an empty list");
    }
	
    /** is the string s in the list? */
    public boolean isPresent(String s){
	Node cursor = head;
	while(cursor != null){
	    if (cursor.getElement().equals(s)) return true;
	    cursor = cursor.getNext();
	}
	return false;
    }
	
    /** Add new value in non-decreasing order into list */
    public void insert(String s){                             // <0>
	if (head == null || head.compareTo(s) > 0)            // <1>
	    head = new Node(s,head);                          // <2>
	else {                                                // <3>
	    Node cursor = head;                               // <4>
	    Node next = cursor.getNext();                     // <5>
	    while (next != null && next.compareTo(s) <= 0 ){  // <6>
		cursor = next; next = next.getNext();         // <7>
	    }                                                 // <8>
	    cursor.setNext(new Node(s,next));                 // <9>
	}                                                     // <10>
	size++;                                               // <11>
    }
    //
    // <0> insert string in lex order into list
    // <1> consider empty list or s should be in 1st position
    // <3> non-empty list with s not in 1st position
    // <4> we use two pointers, cursor and next (next = cursor.getNext())
    // <6> we iterate until we hit end of list or encounter an element greater than s
    //     and then we need to insert s in that position
    // <9> we add a new element after the cursor, with next as new element's "tail"
    //<11> well, we did add a new element!!
    //
	
	
    /** remove all nodes containing element with a given value */
    public void remove(String s){
		Node cursor = head;
		Node prev   = null;
		while(cursor != null){
			if(cursor.compareTo(s) == 0){
				if (cursor == head) removeFirst();
				else {prev.setNext(cursor.getNext());size-=1;}}
			else prev = cursor;
	    cursor = cursor.getNext();
		}
    }
	
    /** String representation of list */
    public String toString(){
	Node cursor = head;
	String s = "(";
	while(cursor != null){
	    s = s + cursor;
	    cursor = cursor.getNext();
	    if (cursor != null) s = s + ",";
	}
	return s + ")";
    }

    //
    // Exercise 1 code below
    // Implement the following functions
    //
    //    - equal
    //    - reverse
    //    - count
    //    - get
    //    - last
    //    - append
    //    - indexOf
    //    - replace
    //

	/**
	@param StringList l
	@return boolean if l contains the same elements in the same order as this StringList
	*/
    public boolean equal(StringList l){
		if (size != l.size)	return false;
		Node cursor1 = this.head;
		Node cursor2 = l.head;
		while (cursor1 != null){
			if (!cursor1.getElement().equals(cursor2.getElement())) return false;
			cursor1 = cursor1.getNext();
			cursor2 = cursor2.getNext();
		}
		return true;
	}
		  
	/**
	@return StringList that has the the elements of this StringList in reverse order
	*/
    public StringList reverse(){
		StringList reverseStringList = new StringList();
		Node cursor = head;
		while (cursor != null){
			reverseStringList.addFront(cursor.getElement());
			reverseStringList.size++;
			cursor = cursor.getNext();
		}
		return reverseStringList;
	}
	
    /**
	@param Interger i
	@return String which is the element at index i of this StringList(starts at 0)
	@return "" if i is negative or i is greater than or equal to the sise of the StringList
	*/    
    public String get(int i){
		if (i<0 || i>=size) return "";
		Node cursor = head;
		for (int x=0;x<i;x++) cursor = cursor.getNext();
		return cursor.getElement();
	}
   
   /**
   @return the last node in this StringList
   */
    public Node last(){
		Node cursor = head;
		while (cursor.getNext() != null) cursor = cursor.getNext();
		return cursor;
	}
    
	/**
	@param StringList l 
	Appends stringList l to the end of this StringList
	*/
    public void append(StringList l){
		Node cursor = this.last();
		cursor.setNext(l.head);
		size+= l.size();
	}
		
	/**
	 * @param String s
	 * @return Integer number of times s occurs in this StringList
	 */
    public int count (String s){
    	int counter = 0;
    	Node cursor = head;
    	while (cursor != null){
    		if (cursor.compareTo(s) == 0) counter++;
    		cursor = cursor.getNext();
    	}
    	return counter;
	}
    
    /**
     * @param String s
     * @return Integer index of the first occurrence of s in the list
     * @return Integer -1 if String S is not contained within this StringList
     */
    public int indexOf(String s){
    	Node cursor = head;
    	int counter = 0;
    	while (cursor != null){
    		if (cursor.compareTo(s) == 0) return counter;
    		counter++;
    		cursor = cursor.getNext();
    	}
    	return -1;
    }

    /**
     * @param Sting s1 
     * @param String s2
     * Replace all occurrences of s1 with s2 in this StringList
     */
    public void replace(String s1,String s2){
    	Node cursor = head;
    	while (cursor != null){
    		if (cursor.compareTo(s1) == 0) cursor.setElement(s2);
    		cursor = cursor.getNext();
    	}
    }
}
