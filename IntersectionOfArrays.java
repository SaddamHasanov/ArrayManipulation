// ortaq elementleri cixartmaq
	public void IntersectArrays(int [] array2) {
		int counter = 1;
		int a, b, i, j;
		
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array2.length; j++) {
				if(array[i] == array2[j]) {
					// Birinci arrayda tekrarlanan olub olmadigini yoxlayir
					for(a = i+1; a < array.length; a++) {
						if(array[i] == array[a]) {
							counter++;
							break;
						}
					}
					// Ikinci arrayda tekrarlanan olub olmadigini yoxlayir
					for(b = j+1; b < array2.length; b++) {
						if(array2[j] == array2[b]) {
							counter++;
							break;
						}
					}
					/* eger arraydaki element hec tekrarlanmirsa,
					 counterin qiymeti 1 qalir, demeli cap etmek olar */
					if(counter == 1) {
						System.out.print(array[i] + " ");
					}
					counter = 1;
				} 
			}
		}
		System.out.print("\n");
	}
