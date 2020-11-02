
public class ExpandableArray {
	
	/*
	 * Practice assignment for week 6 Merit America. 
	 */
	
	private Object[] array;
	
	public ExpandableArray() {

		array = new Object[0]; /*Allows us to check length of array, 
		                         even when no elements exist.*/
		}
	
	/*
	 * Sets the element at the given index position to the specified
	 * value. If the internal array is not large enough to contain that
	 * element, the implementation expand the array to make room.
	 */
	
	public void set(int index, Object value) {
		if(index >= array.length) {
			
			Object[] newArray = new Object[index + 1]; //Create a new array that is large enough.
			
			for(int i = 0; i < array.length; i++) { //Copy all the existing elements into new array.
				newArray[i] = array[i];
			}
			
			array = newArray; //Keep track of the new array in place of the old array
		}
		array[index] = value;
		
	}
	
	/*
	 * Returns the element at the specified index position, or null if 
	 * no such element exists. Note that this method never throws an
	 * out-of-bounds exception; if the index is outside the bounds of 
	 * the array, the return value is simply null
	 */
	
	public Object get(int index) {
		if(index >= array.length) return null;
		return array[index];
	}
}
