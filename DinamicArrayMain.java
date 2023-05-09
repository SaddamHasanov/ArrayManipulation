public class Array {
	
	public static void main(String [] args) {
		
		ArrayOperations arr = new ArrayOperations(10);
		
		arr.getArray();
		arr.assignAllElements(2);
		arr.getArray();
		arr.modifyArrayElements(0, 1);
		arr.modifyArrayElements(1, 2);
		arr.modifyArrayElements(2, 3);
		arr.modifyArrayElements(3, 4);
		arr.modifyArrayElements(4, 5);
		arr.modifyArrayElements(5, 6);
		arr.modifyArrayElements(6, 7);
		arr.modifyArrayElements(7, 8);
		arr.modifyArrayElements(8, 9);
		arr.modifyArrayElements(9, 10);
		arr.getArray();
		arr.reverseArray();
		arr.getArray();
		arr.findMin();
		arr.findMax();
		arr.addElementToEnd(0.1);
		arr.getArray();
		arr.addElementToEnd(0.2);
		arr.getArray();
		arr.reverseArray();
		arr.getArray();
		arr.findMin();
		arr.addElementToStart(15);
		arr.getArray();
		arr.addElementToStart(17);
		arr.getArray();
		arr.findMax();
		arr.reverseArray();
		arr.getArray();
		arr.insertElement(5, 20);
		arr.getArray();
		arr.insertElement(7, 30);
		arr.getArray();
		arr.removeElementFromEnd();
		arr.removeElementFromEnd();
		arr.getArray();
		arr.removeElementFromBack();
		arr.removeElementFromBack();
		arr.getArray();
		arr.removeSingleElement(5);
		arr.getArray();
		arr.removeSingleElement(6);
		arr.getArray();
		
		
	}
	
}
