/**
 * 
 */
package project3;



/**
 * Linked list based Stack data structure that holds locations
 * @author Dimitri Chaber
 * @version 10/23/2017
 *
 */
public class PossibleLocationsStack implements PossibleLocations {

	private int size = 0;
	private Node top;
	
	

	/**
	 * Adds a new node containing a location to the front of the list
	 * @param s location to be added to list
	 */
	@Override
	public void add(Location s) {
		if( s != null) {
			// create new node to hold new data
			Node tempNode = new Node(s,top);
			// set new node as the top of the stack
			top = tempNode;
			size++;
		}

	}

	/**
	 * Removes and returns the last object added to the stack
	 * @return Location at the top of the stack or null if stack is empty
	 */
	@Override
	public Location remove() {
		if(isEmpty())
			return null;
		Location locTemp = top.element;
		top = top.next;
		size--;
		return locTemp;
		
	}

	/**
	 * Determines if set is empty or not
	 * @return true if stack is empty or false if not
	 */
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * Returns a string representation of the stack
	 * @return string representation of stack
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		Node temp; 
		temp = top;
		while(temp != null) {
			s.append(temp.element+", ");
			temp = temp.next;
		}
		return s.toString();
	}
	/**
	 * returns size
	 * @return size of stack
	 */
	public int getSize() {
		return size;
	}
	
	public Node getTop() {
		return top;
	}
	/**
	 * Nested node class. Implementation based on Data Structures and Algorithms
	 * textbook
	 * 
	 * @author Dimitri Chaber
	 *
	 * @param <E>
	 */
	public static class Node {
		private Location element;
		private Node next;

		/**
		 * node constructor
		 * 
		 * @param e
		 *            stored element
		 * @param n
		 *            next node
		 */
		public Node(Location e, Node n) {
			element = e;
			next = n;
		}

		/**
		 * returns element
		 * 
		 * @return element
		 */
		public Location getElement() {
			return element;
		}

		/**
		 * sets element to e
		 * 
		 * @param e
		 *            new element
		 */
		public void setElement(Location e) {
			element = e;
		}

		/**
		 * returns next node
		 * 
		 * @return next node
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * set next node
		 * 
		 * @param next
		 *            node
		 */
		public void setNext(Node n) {
			next = n;
		}
	}

}
