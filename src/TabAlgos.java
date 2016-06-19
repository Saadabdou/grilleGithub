

public class TabAlgos {
	/** Calcul la moyenne des valeurs d'un tableau. **/
	public static double moyenne(final int[] tab) { 
		double m=0;
		for(int i=0;i<tab.length;i++)
			m+=tab[i];
		m=m/tab.length;
		return m;
	}
	
	/** Renvoie la valeur la plus grande d'un tableau. **/
	public static int plusGrand(final int[] tab) { // TODO 
		int max=tab[0];
		for(int i=0;i<tab.length;i++)
			if(max<tab[i]) max=tab[i];
		return max;
	}

	/** Teste si 2 tableaux sont identiques (avec les elements dans le meme ordre) **/
	public static boolean egaux(final int[] tab1,final int[] tab2) { 
		if(tab1.length!=tab2.length) return false;
		else{
			for(int i=0;i<tab1.length;i++)
			{
				if(tab1[i]!=tab2[i])
					return false;
			}
			
		}return true;
	}
	public static boolean similaires(final int[] tab1,final int[] tab2) { 
		boolean tr=false;
		if(tab1.length!=tab2.length) return false;
		else{
			for(int i=0;i<tab1.length;i++)
			{
				int j=i;
				while(tr==false & j<tab1.length){
					if(tab1[i]==tab2[j])
					{
						tr=true;
						int tmp=tab2[i]; tab2[i]=tab2[j]; tab2[j]=tmp;
					}
					j++;
				}
				if(tr==false) return tr;
			}
			return true;
	}
	}
}
