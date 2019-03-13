package eu.ensup.assertTest;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class AssertTest {
	AssertionClass ac = new AssertionClass();
	@Test
	  public void testAssertArrayEquals() {
	    byte[] expected = "trial".getBytes();
	    byte[] actual = "trial".getBytes();
	    assertArrayEquals(expected, actual);
	  }

	  @Test
	  public void testAssertEquals() {
		// Comparaison entre la valeure attendu et reçu, elles doivent être égales
		assertEquals(5, ac.equalInt(0, 5));
	    
	  }

	  @Test
	  public void testAssertFalse() {
		// test la méthode utiliser qui doit retourner false
	    assertFalse(ac.shouldBeFalse(0));
	  }

	  @Test
	  public void testAssertNotNull() {
		  
		// Object obj = null;
		// assertNotNull(obj);
	    assertNotNull("should not be null", new Object());
	  }

	  @Test
	  public void testAssertNotSame() {
//		  Object obj1 = new Object();
//		  Object obj2 = new Object();
//		  assertNotSame(obj1, obj1);
	    assertNotSame("should not be same Object", new Object(), new Object());
	  }

	  @Test
	  public void testAssertNull() {
//		  Object obj = new Object();
//		  assertNull(obj);
		  assertNull("should be null", null);
	  }

	  @Test
	  public void testAssertSame() {
//		  Object obj1 = new Object();
//		  Object obj2 = new Object();
//		  assertSame(obj1, obj2);
	    Integer aNumber = Integer.valueOf(768);
	    assertSame("should be same", aNumber, aNumber);
	  }

	  // JUnit Matchers assertThat
	  @Test
	  public void testAssertThatBothContainsString() {
//		  String a = "azerty";
//		  assertThat(a, containsString("b"));
		assertThat("albumen", both(containsString("a")).and(containsString("b")));
	  }

	  @Test
	  public void testAssertThatHasItems() {
		//  assertThat(Arrays.asList("one", "two"), hasItems("one", "three"));
	    assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
	  }

	  @Test
	  public void testAssertThatEveryItemContainsString() {
		  // un lettre en commun pour chaque string du tableau
		 // assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("a")));
	     assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	  }

	  // Core Hamcrest Matchers with assertThat
	  @Test
	  public void testAssertThatHamcrestCoreMatchers() {
	    assertThat("good", allOf(equalTo("good"), startsWith("good")));
	    assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
	    assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
	    assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
	    assertThat(new Object(), not(sameInstance(new Object())));
	  }

	  @Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", true);
	  }
}
