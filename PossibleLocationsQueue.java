/**
 * 
 */
package project3;

/**
 * @author Dimitri chaber
 * @version 10/24/2017
 *
 */
public class PossibleLocationsQueue implements PossibleLocations {
	
	private Location [] elementData;
	private int size = 0;
	private int capacity;
	private int front = 0;
	private int back = -1;
	
	/**
	 * Constructs a queue with 1 capacity
	 */
	public PossibleLocationsQueue() {
		this(1);
	}
	
	/**
	 * Constructs a queue of specific capacity
	 *
	 * @param cap The capacity of the newly constructed queue
	 */
	public PossibleLocationsQueue(int cap) {
		elementData = new Location[cap];
		capacity = cap;
	}

	
	 
	/**
	 * Adds a location to the end of the queue
	 * @param s Location to be added
	 */
	@Override
	public void add(Location s) {
		//keep null from being added to array
		if(s == null)
			return;
		if(size == capacity)
			//if current array is full resize the array to make it larger
			makeLarger();
		//find next avaiable spot and add the new Location
		elementData[(back + 1) % capacity] = s;
		//move back backwards
		back++;
		size++;

	}

	/**
	 * Removes and returns the front Location in the array
	 * @return the front location or null if array is empty
	 */
	@Override
	public Location remove() {
		//return null if queue is empty
		if(isEmpty())
			return null;
		//hold front data in a temporary variable
		Location temp = elementData[front];
		//remove reference to data
		elementData[front] = null;
		// move front backwards
		front = (front + 1) % capacity;
		size--;
		return temp;
		
	}

	/**
	 * Checks to see if array is empty of any objects
	 * @return True if array is empty or False if it is not
	 */
	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * Makes the queue array larger when it reaches capacity
	 * 
	 */
	private void makeLarger() {
		Location[] tmp = new Location[2 * capacity];
		int count = 0;
		for(int i = front; i < elementData.length;i++) {
			tmp[count] = elementData[i];
			if(i == elementData.length) {
				i = 0;
			}
			if(i == back) {
				elementData = tmp;
				break;
			}
			count++;
		}
		
		
	}

}
