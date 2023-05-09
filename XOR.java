	// ortaq olmayan elementleri cixartmaq (XOR emeliyyati)
	public void NotIntersect(int [] array, int [] array2) {
		boolean isEqual1 = false;
		boolean isEqual2 = false;
		boolean isEqual = false;
		
		// dongulerde istifade elediyim deyisenlerdir
		int i, j, a, b, c, d, e;
		int counter = 0;
		
		/* bu arrayin olcusunu her defe 1 vahid artiririq ve 
		   ortaq olmayan elementleri her defe buna menimesdirik */
		int [] newArray = null;
		
		/* temp ise komekci arraydi, menimsetmede istifade olunur ki, 
		   deyerleri itirmeyek, yadda qalsin */
		int [] temp = new int [1000000];
		
		// Her iki arrayda ortaq elementlerin olub olmadigini yoxlayir
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array2.length; j++) {
				/* birinci arrayla ikincini muqayise edir,
				   eger ortaq elemnet varsa isEqual1 TRUE olur */
				if(array[i] == array2[j]) {
					isEqual1 = true;
				}
				
				/* Ikinci arrayla birincini muqayise edir,
				   eger ortaq elemnet varsa isEqual2 TRUE olur */
				for(a = 0; a < array.length; a++) {
					if(array2[j] == array[a]) {
						isEqual2 = true;
						break;
					}
				}
				
				/* eger isEqual2 FALSE - dursa, demeli elementimiz
				   ortaq deyil ve onu yeni arraya atmaq olar */
				if(isEqual2 == false) {
					// yeni array yaradib ortaq olmayanlari onun icine atir
					newArray = new int[counter + 1];
					temp[counter] = array2[j];
					for(b = 0; b <= counter; b++) {
						newArray[b] = temp[b];
					}
					counter++;
				}
				isEqual2 = false;
			}
			
			/* eger isEqual1 FALSE - dursa, demeli yene de
			   elementimiz ortaq deyil ve onu yeni arraya atmaq olar */
			if(isEqual1 == false) {
				// yeni array yaradib ortaq olmayanlari onun icine atir
				newArray = new int[counter + 1];
				temp[counter] = array[i];
				for(c = 0; c <= counter; c++) {
					newArray[c] = temp[c];
				}
				counter++;
			}
			isEqual1 = false;
		}
		
		/* Yeni arrayda tekrarlanan elementlerden birini ve
		   diger tekrarlanmayan elementleri ekrana cixardir */
		for(d = 0; d < newArray.length; d++) {
			for(e = d+1; e < newArray.length; e++) {
				if(newArray[d] == newArray[e]) {
					isEqual = true;
					break;
				}
			}
			/* Eger isEqual FALSE - dursa demeli yeni arrayimizde hemin element
			   hec tekrarlanmiyib ve demeli onu cap etmek olar */
			if(isEqual == false) {
				System.out.print(newArray[d] + " ");
			}
			isEqual = false;
		}
		System.out.print("\n");
	}
