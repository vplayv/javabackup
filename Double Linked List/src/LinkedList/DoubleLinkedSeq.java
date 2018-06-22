// File: DoubleLinkedSeq.java from the package edu.colorado.collections

// This is an assignment for students to complete after reading Chapter 4 of
// "Data Structures and Other Objects Using Java" by Michael Main.

// Check with your instructor to see whether you should put this class in
// a package. At the moment, it is declared as part of edu.colorado.collections:
//package edu.colorado.collections;
package LinkedList;
/******************************************************************************
* This class is a homework assignment;
* A DoubleLinkedSeq</CODE> is a collection of double</CODE> numbers.
* The sequence can have a special "current element," which is specified and 
* accessed through four methods that are not available in the sequence class 
* (start, getCurrent, advance and isCurrent).
*
* <dl><dt><b>Limitations:</b>
*   Beyond Int.MAX_VALUE</CODE> elements, the size</CODE> method
*   does not work.
*
* <dt><b>Note:</b><dd>
*   This file contains only blank implementations ("stubs")
*   because this is a Programming Project for my students.
*
* <dt><b>Outline of Java Source Code for this class:</b><dd>
*   <A HREF="../../../../edu/colorado/collections/DoubleLinkedSeq.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/collections/DoubleLinkedSeq.java
*   </A>
*   </dl>
*
* @version
*   Jan 24, 1999
******************************************************************************/
public class DoubleLinkedSeq implements Cloneable
{
	private DoubleNode headNode;
	private DoubleNode tailNode;
	private DoubleNode currentCursor;
	private DoubleNode preCursor;
	private int numberNode;
   /**
   * Initialize an empty sequence.
   * @param - none
   * <dt><b>Postcondition:</b><dd>
   *   This sequence is empty.
   **/   
public DoubleLinkedSeq()
   {
	headNode = null;
	tailNode = null;
	currentCursor = headNode;
	preCursor = headNode;
	numberNode = 0;
 // Implemented by student.
   }
   public boolean isCurrent(){
	   if(currentCursor != null)
		   return true;
	   return false;
   }
 
   /**
   * Add a new element to this sequence, after the current element. 
   * @param element</CODE>
   *   the new element that is being added
   * <dt><b>Postcondition:</b><dd>
   *   A new copy of the element has been added to this sequence. If there was
   *   a current element, then the new element is placed after the current
   *   element. If there was no current element, then the new element is placed
   *   at the end of the sequence. In all cases, the new element becomes the
   *   new current element of this sequence. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for a new node.
   **/
   public void addAfter(double element)
   {
	   if(isCurrent())
       {//if there is a current element, then add this element after
           currentCursor.addNodeAfter(element);//create new node
           preCursor = currentCursor;//move precursor
           currentCursor = currentCursor.getLink();//move cursor
        }
        else
        {
            if(tailNode == null)
            {//when there is not a tail reference, there's no head reference either
                tailNode = new DoubleNode(element, null);//create new node and point
                // tail to this new node
                currentCursor = tailNode;//move cursor to the new node
                preCursor = tailNode;//move precursor to tail
                headNode = tailNode;//move head to the same node as tail
            }
            else
            {//when tail is not null, there is a head, so do nothing there
                tailNode.addNodeAfter(element);//create new node and point tail to
                // this new node
                preCursor = tailNode;//point precurser to original tail
                tailNode = tailNode.getLink();//tail gets updated link to new node
                currentCursor = tailNode;//update cursor to the new node
            }
        }
   }


   /**
   * Add a new element to this sequence, before the current element. 
   * @param element</CODE>
   *   the new element that is being added
   * <dt><b>Postcondition:</b><dd>
   *   A new copy of the element has been added to this sequence. If there was
   *   a current element, then the new element is placed before the current
   *   element. If there was no current element, then the new element is placed
   *   at the start of the sequence. In all cases, the new element becomes the
   *   new current element of this sequence. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for a new node.
   **/
   public void addBefore(double element)
   {
		   DoubleNode newNode = new DoubleNode(element,null);
		   if(isCurrent()){
			   if(currentCursor==headNode){
			   preCursor.setData(element);
			   preCursor.setLink(currentCursor);
			   headNode = preCursor;
			   }
			   else{
				   preCursor.addNodeAfter(element);
	               currentCursor = preCursor.getLink();
			   }
		   }
		   else
		   {
			   if(headNode == null)
	            {
				    headNode = new DoubleNode(element, null);	                
				    currentCursor = headNode;
	                preCursor = headNode;
	                tailNode = headNode;
	            }
	            else{
	            	preCursor.addNodeAfter(element);
	            }
		   }
		   if(currentCursor == newNode)
			   throw new IllegalArgumentException("메모리가 적절치 않습니다."); 
   }
   
  
   /**
   * Place the contents of another sequence at the end of this sequence.
   * @param addend</CODE>
   *   a sequence whose contents will be placed at the end of this sequence
   * <dt><b>Precondition:</b><dd>
   *   The parameter, addend</CODE>, is not null. 
   * <dt><b>Postcondition:</b><dd>
   *   The elements from addend</CODE> have been placed at the end of 
   *   this sequence. The current element of this sequence remains where it 
   *   was, and the addend</CODE> is also unchanged.
   * @exception NullPointerException
   *   Indicates that addend</CODE> is null. 
   * @exception OutOfMemoryError
   *   Indicates insufficient memory to increase the size of this sequence.
   **/
   public void addAll(DoubleLinkedSeq addend)
   {
	   DoubleNode [] copy;
	   //DoubleNode addEndTailNode = addend.tailNode;
	   if(addend == null)
		   throw new IllegalArgumentException("add end가 널 입니다.");
	   if(addend.size()>0)
       {
           copy = DoubleNode.listCopyWithTail(addend.headNode);
           tailNode.getLink().setLink(copy[0]);
           copy[1].setLink(null);
           tailNode.setLink(copy[0]);
         //  manyNodes += addend.size();
       }   
   }   
   
   
   /**
   * Move forward, so that the current element is now the next element in
   * this sequence.
   * @param - none
   * <dt><b>Precondition:</b><dd>
   *   isCurrent()</CODE> returns true. 
   * <dt><b>Postcondition:</b><dd>
   *   If the current element was already the end element of this sequence 
   *   (with nothing after it), then there is no longer any current element. 
   *   Otherwise, the new element is the element immediately after the 
   *   original current element.
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   advance</CODE> may not be called.
   **/
   public void advance( )
   {
	  if(currentCursor == null)
		throw new IllegalStateException("현재 노드가 존재 하지 않습니다.");
	  if(!isCurrent()){
		  return;
	  }
	  preCursor = currentCursor;//move precursor to where cursor is
      currentCursor = currentCursor.getLink();//move cursor to the next link
   }
   
   
   /**
   * Generate a copy of this sequence.
   * @param - none
   * @return
   *   The return value is a copy of this sequence. Subsequent changes to the
   *   copy will not affect the original, nor vice versa. Note that the return
   *   value must be type cast to a DoubleLinkedSeq</CODE> before it can be used.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public Object clone( )
   {  // Clone a DoubleLinkedSeq object.
      // Student will replace this return statement with their own code:
	   DoubleLinkedSeq copy;
	   try{
		   copy = (DoubleLinkedSeq) super.clone();
	   }
	   catch(CloneNotSupportedException e){
		   throw new RuntimeException("이 클래스는 복제가 안됌");
	   }
	
	   copy.headNode = DoubleNode.listCopy(headNode);
	   return copy;
   }
   

   /**
   * Create a new sequence that contains all the elements from one sequence
   * followed by another.
   * @param s1</CODE>
   *   the first of two sequences
   * @param s2</CODE>
   *   the second of two sequences
   * <dt><b>Precondition:</b><dd>
   *   Neither s1 nor s2 is null.
   * @return
   *   a new sequence that has the elements of s1</CODE> followed by the
   *   elements of s2</CODE> (with no current element)
   * @exception NullPointerException.
   *   Indicates that one of the arguments is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new sequence.
   **/   
   public static DoubleLinkedSeq catenation(DoubleLinkedSeq s1, DoubleLinkedSeq s2)
   {
       if((s1 == null) || (s1 == null))
           throw new IllegalArgumentException
               ("concatenation:  one argument is null");
       DoubleLinkedSeq otherList = new DoubleLinkedSeq();
       otherList.addAll(s1);
       otherList.addAll(s2);
       return  otherList;
   }


   /**
   * Accessor method to get the current element of this sequence. 
   * @param - none
   * <dt><b>Precondition:</b><dd>
   *   isCurrent()</CODE> returns true.
   * @return
   *   the current capacity of this sequence
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   getCurrent</CODE> may not be called.
   **/
   public double getCurrent( )
   {
       if(!isCurrent())
           throw new IllegalStateException
               ("getCurrent: isCurrent() is null");
       return currentCursor.getData();
   }


   /**
   * Accessor method to determine whether this sequence has a specified 
   * current element that can be retrieved with the 
   * getCurrent</CODE> method. 
   * @param - none
   * @return
   *   true (there is a current element) or false (there is no current element at the moment)
   **/
              
   /**
   * Remove the current element from this sequence.
   * @param - none
   * <dt><b>Precondition:</b><dd>
   *   isCurrent()</CODE> returns true.
   * <dt><b>Postcondition:</b><dd>
   *   The current element has been removed from this sequence, and the 
   *   following element (if there is one) is now the new current element. 
   *   If there was no following element, then there is now no current 
   *   element.
   * @exception IllegalStateException
   *   Indicates that there is no current element, so 
   *   removeCurrent</CODE> may not be called. 
   **/
   public void removeCurrent( )
   {
	   if(!isCurrent())
           throw new IllegalStateException
               ("removeCurrent: isCurrent() is null");
       if(tailNode == headNode)//only one node case
       {
           headNode = null;
           tailNode = null;
           currentCursor = headNode;
           preCursor = headNode;
           numberNode--;//update invariant
           return;
       }
       
   }
                 
   
   /**
   * Determine the number of elements in this sequence.
   * @param - none
   * @return
   *   the number of elements in this sequence
   **/ 
   public int size()
   {
	   if(!isCurrent())
           throw new IllegalStateException
               ("removeCurrent: isCurrent() is null");
       if(tailNode == headNode)//only one node case
       {
           headNode = null;
           tailNode = null;
           currentCursor = headNode;
           preCursor = headNode;
           numberNode--;//update invariant
           return numberNode;
       }
       
       if(currentCursor == tailNode)//if cursor is at the last node
       {
           tailNode = preCursor;//remove last node
           tailNode.setLink(null);
           currentCursor = tailNode;//move cursor
           preCursor = headNode;//move precursor to beginning
           while(preCursor.getLink() != currentCursor)
           {//and search for a link for precursor
               if(preCursor.getLink() == null)
                   break;
               preCursor = preCursor.getLink();
           }
           numberNode--;//update invariant
           return numberNode;
       }
       
       if(currentCursor == headNode)//if cursor is at first node
       {
           headNode = headNode.getLink();
           currentCursor = headNode;
           preCursor = headNode;
           numberNode--;
           return numberNode;
       }
      
       currentCursor = currentCursor.getLink();
       preCursor.setLink(currentCursor);
      // manyNodes--;
	return numberNode;
   }
   
   
   /**
   * Set the current element at the front of this sequence.
   * @param - none
   * <dt><b>Postcondition:</b><dd>
   *   The front element of this sequence is now the current element (but 
   *   if this sequence has no elements at all, then there is no current 
   *   element).
   **/ 
   public void start( )
   {
	   if(headNode == null)//if there are no elements in the sequence
           currentCursor = null;//no cursor
       currentCursor = headNode;//move cursor to first node
       preCursor = headNode;
   }
}
