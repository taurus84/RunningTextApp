package se.mah.ae2715.projektandroidapp;

/**
 * Class which stores and manipulates 
 * an integer array the length of 7 
 */
public class Array7 {
	private int[] array = new  int[7];

	/**
	 * Creates an object with an empty array
	 */
	public Array7(){

        array = new int[7];
	}

    /**
	 * Creates an object with provided array
	 * 
	 * @param array Array to be used. Has to be 7 long.
	 */
	public Array7(int[] array){

        for(int i = 0; i < 7; i++) {
            this.setElement(i, array[i]);
        }
	}
	
	/**
	 * Sets a value in specified position
	 * 
	 * @param pos Position in array to be changed
	 * @param value Value to be inserted
	 */
	public void setElement(int pos, int value){

        array[pos] = value;
	}
	
	/**
	 * Returns the value in specified element
	 * 
	 * @param pos Position where element exists
	 * @return Value in position
	 */
	public int getElement(int pos){

        return array[pos];
	}
	
	/**
	 * Returns the whole array
	 * 
	 * @return The array
	 */
	public int[] getArray(){

        return array;
	}
}
