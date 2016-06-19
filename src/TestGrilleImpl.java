
import junit.framework.TestCase;

public class TestGrilleImpl extends TestCase{
	
	public void testSetValue(){
		GrilleImpl g= new GrilleImpl(); 		
	try {
			
		g.setValue(2,9,'7');
		fail("l'exception pour x ou y sont hors bornes (0-8) aurait du être levée");
		} catch(IllegalArgumentException e) {
		// rien a faire, c'est normal qu'on ai l'exception
		}
		
		try {
			
			g.setValue(5,1,'F');
		fail("l'exception pour caractere non autorise aurait du être levée");
		} catch(IllegalArgumentException e) {
		// rien a faire, c'est normal qu'on ai l'exception
		}
		}
	public void testComplete(){
		GrilleImpl g= new GrilleImpl(); 
		g.setValue(2,3,'7');
		assertFalse(g.complete());
	}
	
	public void testPossible(){
		GrilleImpl g= new GrilleImpl(); 
		assertTrue(g.possible(2,3,'7'));
		g.setValue(2,3,'7');
		assertFalse(g.possible(4,3,'7'));//sur la meme colonne
		assertFalse(g.possible(2,6,'7'));//sur la meme ligne
		assertFalse(g.possible(1,4,'7'));//dans le meme petit carré
		try {
			
			g.possible(9,1,'6');
		fail("l'exception pour x ou y sont hors bornes (0-8) aurait du être levée");
		} catch(IllegalArgumentException e) {
		// rien a faire, c'est normal qu'on ai l'exception
		}
		
		try {
			
			g.possible(5,1,'F');
		fail("l'exception pour caractere non autorise aurait du être levée");
		} catch(IllegalArgumentException e) {
		// rien a faire, c'est normal qu'on ai l'exception
		}
	}
	
	public void testgetValue() {
		GrilleImpl g= new GrilleImpl(); 
		try {	
			g.getValue(9,1);
		fail("l'exception pour x ou y sont hors bornes (0-8) aurait du être levée");
		} catch(IllegalArgumentException e) {
		// rien a faire, c'est normal qu'on ai l'exception
		}
		}
	
}
