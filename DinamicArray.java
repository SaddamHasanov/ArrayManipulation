import java.util.Arrays;

public class ArrayOperations {
	
	private int size;
	private double [] array;
	
	public ArrayOperations(int size) {
		this.size = size;
		array = new double [size];
	}
	
	public void assignAllElements(double element) {
		for(int i = 0; i < array.length; i++) {
			array[i] = element;
		}
	}
	
	public void modifyArrayElements(int index, double element) {
		array[index] = element;
	}
	
	public void addElementToEnd(double element) {
		double [] newArray = new double[array.length + 1];
		int i;
		for(i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		newArray[i] = element;
		array = new double [array.length + 1];
		
		array = newArray;
		
	}
	
	public void addElementToStart(double element) {
		double [] newArray = new double[array.length + 1];
		int i;
		for(i = 0; i < array.length; i++) {
			newArray[i+1] = array[i];
		}
		
		newArray[0] = element;
		array = new double [array.length + 1];
		
		array = newArray;
		
	}
	
	public void insertElement(int index, double element) {
		double [] newArray = new double[array.length + 1];
		int i;
		for(i = 0; i < array.length; i++) {
			if(i >= index) {
				newArray[i+1] = array[i];
			}else {
				newArray[i] = array[i];
			}
		}
		
		newArray[index] = element;
		array = new double [array.length + 1];
		
		array = newArray;
		
	}
	
	public void removeElementFromEnd() {
		double [] newArray = new double[array.length - 1];
		int i;
		for(i = 0; i < array.length - 1; i++) {
			newArray[i] = array[i];
		}
		
		array = new double [array.length - 1];
		
		array = newArray;
		
	}
	
	public void removeElementFromBack() {
		double [] newArray = new double[array.length - 1];
		int i;
		for(i = 1; i < array.length; i++) {
			newArray[i-1] = array[i];
		}
		
		array = new double [array.length - 1];
		
		array = newArray;
		
	}
	
	public void removeSingleElement(int index) {
		double [] newArray = new double[array.length - 1];
		int i;
		for(i = 0; i < array.length-1; i++) {
			if(i >= index) {
				newArray[i] = array[i+1];
			}else {
				newArray[i] = array[i];
			}
		}
		
		array = new double [array.length - 1];
		
		array = newArray;
		
	}
	
	public void reverseArray() {
		double temp = 0;
		
		for(int i = 0; i < array.length/2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
	
	public void findMin() {
		double min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Minimum element of array is : " + min);
	}
	
	public void findMax() {
		double max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Maximum element of array is : " + max);
	}
	
	public void getArray() {
			System.out.println(Arrays.toString(array) + '\n');
	}
	
}
