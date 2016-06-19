

import junit.framework.TestCase;

public class TestTabAlgos extends TestCase {
public void testMoyenne(){
	int [] t={2,3,5,10};
	assertEquals(5.0,TabAlgos.moyenne(t));
}
public void testPlusGrand(){
	int [] t={2,3,5,10};
	assertEquals(10,TabAlgos.plusGrand(t));
}

public void testegaux(){
	int [] t={2,3,5,10};int [] u={10,3,5,2};
	assertTrue(TabAlgos.egaux(t,u));
}

public void testsimilaire(){
	int [] t={2,3,5,10};int [] u={10,3,5,2};
	assertTrue(TabAlgos.similaires(t, u));
}
}
