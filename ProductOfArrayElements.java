// Elementlerin Hasili
	public void Product(int [] array) {
		long product = 1;
		for(int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println("Product of array elements : " + product);
	}
