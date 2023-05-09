// Iki elementin yerini deyisen method
	public void ChangePosition(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
