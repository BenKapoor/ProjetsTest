package eu.ensup.testexecutionorder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// Lance les test par ordre alphabetique 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecutionOrderTest {

	// Création de 3 tests
	@Test
    public void testA() {
        System.out.println("first");
    }
    @Test
    public void testB() {
        System.out.println("second");
    }
    @Test
    public void testC() {
        System.out.println("third");
    }
}
