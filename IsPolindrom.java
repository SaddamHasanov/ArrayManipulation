// Polindrom olub olmadigini yoxlayir
	public void IsPolindrom(int [] array) {
	boolean isPolindrom = true;
	for(int i = 0; i < array.length/2; i++) {
			if(array[i] != array[array.length - 1 - i]) {
				isPolindrom = false;
				break;
			}
		}
		System.out.println(isPolindrom);
	}
