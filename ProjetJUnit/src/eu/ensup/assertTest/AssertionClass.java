package eu.ensup.assertTest;

public class AssertionClass {

	// methode utilis�e dans le test 1
	public int equalInt(int a,int b) {
		return a + b;
	}
	
	// m�thode du test deux
	public boolean shouldBeFalse(int c) {
		if (c >= 'A' && c <= 'Z') return true;
	    else return false;
	}
	
	
}
