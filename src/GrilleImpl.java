
/**
* Implementation d'une grille
*/
public class GrilleImpl implements Grille {
	private char[][] grille =new char[9][9];
	
	/**
	 * @param grille
	 */
	public GrilleImpl() {
		 grille =new char[9][9];
		 for(int i=0;i<9;i++)
			 for(int j=0;j<9;j++)
				 grille[i][j]=EMPTY;
	}

	@Override
	public int getDimension() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public void setValue(int x, int y, char value)
			throws IllegalArgumentException {
		if(possible(x,y,value)==true)
			grille[x][y]=value;
	}

	@Override
	public char getValue(int x, int y) throws IllegalArgumentException {
		if(x<0|x>8|y<0|y>8) throw new IllegalArgumentException();
		return grille[x][y];
	}

	@Override
	public boolean complete() {
		for(int i=0;i<9;i++)
			 for(int j=0;j<9;j++)
			 { if(grille[i][j]==EMPTY) return false;}
		return true;
	}

	@Override
	public boolean possible(int x, int y, char value) throws IllegalArgumentException {
		
		if(x<0|x>8|y<0|y>8) throw new IllegalArgumentException();
		if(value!='1'&value!='2'&value!='3'&value!='4'&value!='5'&value!='6'&value!='7'&value!='8'&value!='9')
			throw new IllegalArgumentException();
		/*
		 * verification sur la ligne
		 */
		for(int i=0;i<9;i++)
			if(grille[x][i]== value) return false;
		/*
		 * verification sur la colonne
		 */
		for(int i=0;i<9;i++)
			if(grille[i][y]== value) return false;
		/*
		 * verification dans le petit carré
		 */
		int dl=x/3;
		dl=dl*3;
		int dc=y/3;
		dc=dc*3;
		for(int i=dl;i<dl+3;i++)
			 for(int j=dc;j<dc+3;j++)
				 if(grille[i][j]==value) return false;
		
		
		
		return true;
	}

}
