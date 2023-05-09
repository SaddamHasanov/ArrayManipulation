// sifirlarin sayi
	public void CountZero() {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				counter++;
			}
		}
		System.out.println("\nNumber of elements in array : " + counter);
	}
